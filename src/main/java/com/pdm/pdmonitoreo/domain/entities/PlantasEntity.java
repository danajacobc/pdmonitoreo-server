package com.pdm.pdmonitoreo.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity(name = "plantas")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlantasEntity implements Serializable{

    @Id
    private UUID id;

    @Column(nullable = false, length = 50)
    public String name;

    @Column
    public Integer lectures;

    @Column
    public Integer red_alert;

    @Column
    public Integer medium_alert;

    @Column
    private Boolean enabled;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private PaisEntity pais;

}
