package com.pdm.pdmonitoreo.domain.repositories;

import com.pdm.pdmonitoreo.domain.entities.PlantasEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface PlantasRepository extends CrudRepository<PlantasEntity, UUID> {

    @Query("select p from plantas p where p.name = :name")
    Set<PlantasEntity> selectNamePlanta(String name);

    @Query("select p from plantas p join fetch p.pais pais where p.id = :id")
    Optional<PlantasEntity> selectPlanta(UUID id);
}
