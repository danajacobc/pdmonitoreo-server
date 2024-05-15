package com.pdm.pdmonitoreo.infraestructure.abstract_service;

import com.pdm.pdmonitoreo.api.models.request.UserRequest;
import com.pdm.pdmonitoreo.api.models.responses.UserResponse;
import com.pdm.pdmonitoreo.domain.entities.UserEntity;

import java.util.UUID;

public interface IUserService extends CrudService<UserRequest, UserResponse, UUID> {
}
