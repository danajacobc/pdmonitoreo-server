package com.pdm.pdmonitoreo.infraestructure.abstract_service;

import com.pdm.pdmonitoreo.api.models.request.PlantasRequest;
import com.pdm.pdmonitoreo.api.models.responses.PlantasResponse;

import java.util.List;
import java.util.UUID;

public interface IPlantasService extends CrudService<PlantasRequest, PlantasResponse, UUID>{
    List<PlantasResponse> getAll();
}
