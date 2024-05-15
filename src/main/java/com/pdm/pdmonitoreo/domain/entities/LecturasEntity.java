package com.pdm.pdmonitoreo.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity(name = "lecturas")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class LecturasEntity implements Serializable {

    @Id
    private UUID id;

}
