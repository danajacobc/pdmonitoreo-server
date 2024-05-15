package com.pdm.pdmonitoreo.infraestructure.abstract_service;

import com.pdm.pdmonitoreo.api.models.request.PaisRequest;
import com.pdm.pdmonitoreo.api.models.responses.PaisResponse;

import java.util.UUID;

public interface IPaisService extends CrudService<PaisRequest, PaisResponse, UUID>{
}
