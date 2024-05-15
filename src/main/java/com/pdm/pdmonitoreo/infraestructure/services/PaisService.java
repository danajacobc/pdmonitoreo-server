package com.pdm.pdmonitoreo.infraestructure.services;

import com.pdm.pdmonitoreo.api.models.request.PaisRequest;
import com.pdm.pdmonitoreo.api.models.responses.PaisResponse;
import com.pdm.pdmonitoreo.api.models.responses.PlantasResponse;
import com.pdm.pdmonitoreo.domain.entities.PaisEntity;
import com.pdm.pdmonitoreo.domain.repositories.PaisRepository;
import com.pdm.pdmonitoreo.infraestructure.abstract_service.IPaisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Service
@Slf4j
public class PaisService implements IPaisService {

    private final PaisRepository paisRepository;


    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }


    @Override
    public PaisResponse create(PaisRequest request) {
        var paisToPersist = PaisEntity.builder()
                .id(UUID.randomUUID())
                .name(request.getName())
                .img(request.getImg())
                .build();
        
        var paisPersisted = this.paisRepository.save(paisToPersist);

        log.info("País guardado con el id: {}", paisPersisted.getId());

        return this.entityToResponse(paisPersisted);
    }

    @Override
    public PaisResponse read(UUID id) {
        var paisFromDB = this.paisRepository.findById(id).orElseThrow();

        return this.entityToResponse(paisFromDB);
    }

    @Override
    public PaisResponse update(PaisRequest request, UUID uuid) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    private PaisResponse entityToResponse(PaisEntity entity) {
        var response = new PaisResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }
}
