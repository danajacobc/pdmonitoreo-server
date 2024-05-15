package com.pdm.pdmonitoreo.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
@Entity(name = "plantas")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlantasEntity implements Serializable{

    @Id
    private UUID id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column
    private Integer lectures;

    @Column
    private Integer red_alert;

    @Column
    private Integer medium_alert;

    @Column
    private Boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pais_id")
    private PaisEntity pais;

}
