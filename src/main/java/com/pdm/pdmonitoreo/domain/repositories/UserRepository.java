package com.pdm.pdmonitoreo.domain.repositories;

import com.pdm.pdmonitoreo.domain.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {

    Optional<UserEntity> findByEmail(String email);
}
