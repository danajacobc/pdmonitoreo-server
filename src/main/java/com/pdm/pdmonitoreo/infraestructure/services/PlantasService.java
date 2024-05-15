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

import java.util.UUID;

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
        return null;
    }

    @Override
    public PlantasResponse read(UUID uuid) {
        return null;
    }

    @Override
    public PlantasResponse update(PlantasRequest request, UUID uuid) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

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
