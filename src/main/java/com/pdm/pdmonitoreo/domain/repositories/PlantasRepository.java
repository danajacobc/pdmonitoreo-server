package com.pdm.pdmonitoreo.domain.repositories;

import com.pdm.pdmonitoreo.domain.entities.PlantasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PlantasRepository extends CrudRepository<PlantasEntity, UUID> {
}
