package com.pdm.pdmonitoreo.infraestructure.services;

import com.pdm.pdmonitoreo.api.models.request.PlantasRequest;
import com.pdm.pdmonitoreo.api.models.responses.PaisResponse;
import com.pdm.pdmonitoreo.api.models.responses.PlantasResponse;
import com.pdm.pdmonitoreo.domain.entities.PlantasEntity;
import com.pdm.pdmonitoreo.domain.repositories.PaisRepository;
import com.pdm.pdmonitoreo.domain.repositories.PlantasRepository;
import com.pdm.pdmonitoreo.infraestructure.abstract_service.IPlantasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Transactional
@Service
@Slf4j
public class PlantasService implements IPlantasService {

    private final PaisRepository paisRepository;
    private final PlantasRepository plantasRepository;

    public PlantasService(PaisRepository paisRepository, PlantasRepository plantasRepository) {
        this.paisRepository = paisRepository;
        this.plantasRepository = plantasRepository;
    }

    @Override
    public PlantasResponse create(PlantasRequest request) {
       var pais = paisRepository.findById(UUID.fromString(request.getPais())).orElseThrow();

       var plantaToPersist = PlantasEntity.builder()
               .id(UUID.randomUUID())
               .pais(pais)
               .name(request.getName())
               .lectures(request.getLectures())
               .medium_alert(request.getMedium_alert())
               .red_alert(request.getRed_alert())
               .enabled(true)
               .build();

       var plantaPersisted = this.plantasRepository.save(plantaToPersist);

       log.info("Planta guardada con el id: {}", plantaPersisted.getId());

       return this.entityToResponse(plantaPersisted);
    }

    @Override
    public PlantasResponse read(UUID id) {
        var plantaFromDB = this.plantasRepository.findById(id).orElseThrow();

        return this.entityToResponse(plantaFromDB);
    }



    @Override
    public PlantasResponse update(PlantasRequest request, UUID id) {
        var plantaToUpdate = plantasRepository.findById(id).orElseThrow();
        var pais = paisRepository.findById(UUID.fromString(request.getPais())).orElseThrow();

        plantaToUpdate.setPais(pais);
        plantaToUpdate.setName(request.getName());
        plantaToUpdate.setLectures(request.getLectures());
        plantaToUpdate.setMedium_alert(request.getMedium_alert());
        plantaToUpdate.setRed_alert(request.getRed_alert());
        plantaToUpdate.setEnabled(request.getEnabled());

        var plantaUpdated = this.plantasRepository.save(plantaToUpdate);

        log.info("Planta actualizada con el id: {}", plantaUpdated.getId());

        return this.entityToResponse(plantaUpdated);
    }

    @Override
    public void delete(UUID id) {
        var plantaToDelete = plantasRepository.findById(id).orElseThrow();
        this.plantasRepository.delete(plantaToDelete);
    }

    @Override
    public List<PlantasResponse> getAll() {
        List<PlantasEntity> plantasFromDB = (List<PlantasEntity>) plantasRepository.findAll();
        return plantasFromDB.stream()
                .map(entity -> entityToResponse(entity))
                .collect(Collectors.toList());
    }

    private PlantasResponse entityToResponse(PlantasEntity entity) {
        var response = new PlantasResponse();
        BeanUtils.copyProperties(entity, response);
        var paisResponse = new PaisResponse();
        BeanUtils.copyProperties(entity.getPais(), paisResponse);
        response.setPais(paisResponse);
        return response;
    }
}
