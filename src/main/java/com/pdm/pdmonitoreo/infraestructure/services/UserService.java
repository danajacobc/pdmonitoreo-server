package com.pdm.pdmonitoreo.infraestructure.services;

import com.pdm.pdmonitoreo.api.models.request.UserRequest;
import com.pdm.pdmonitoreo.api.models.responses.PaisResponse;
import com.pdm.pdmonitoreo.api.models.responses.UserResponse;
import com.pdm.pdmonitoreo.domain.entities.PaisEntity;
import com.pdm.pdmonitoreo.domain.entities.UserEntity;
import com.pdm.pdmonitoreo.domain.repositories.UserRepository;
import com.pdm.pdmonitoreo.infraestructure.abstract_service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Service
@Slf4j
public class UserService implements IUserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse create(UserRequest request) {
        var userToPersist = UserEntity.builder()
                .id(UUID.randomUUID())
                .name(request.getName())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();

        var userPersisted = this.userRepository.save(userToPersist);

        log.info("User guardado con el id: {}", userPersisted.getId());

        return this.entityToResponse(userPersisted);
    }

    @Override
    public UserResponse read(UUID id) {
        var userFromDB = this.userRepository.findById(id).orElseThrow();

        return this.entityToResponse(userFromDB);
    }

    @Override
    public UserResponse update(UserRequest request, UUID uuid) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    private UserResponse entityToResponse(UserEntity entity) {
        var response = new UserResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }
}
