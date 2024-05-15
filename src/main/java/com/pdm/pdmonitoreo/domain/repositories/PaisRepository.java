package com.pdm.pdmonitoreo.domain.repositories;

import com.pdm.pdmonitoreo.domain.entities.PaisEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PaisRepository extends CrudRepository<PaisEntity, UUID> {
}
