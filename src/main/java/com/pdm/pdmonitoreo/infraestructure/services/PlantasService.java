package com.pdm.pdmonitoreo.infraestructure.services;

import com.pdm.pdmonitoreo.api.models.request.PlantasRequest;
import com.pdm.pdmonitoreo.api.models.responses.PlantasResponse;
import com.pdm.pdmonitoreo.infraestructure.abstract_service.IPlantasService;

import java.util.UUID;

public class PlantasService implements IPlantasService {

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
}
