package com.pdm.pdmonitoreo.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity(name = "pais")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaisEntity implements Serializable {

    @Id
    private UUID id;

    @Column(nullable = false, length = 50)
    public String name;

    @Column(nullable = false)
    public String img;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "pais"
    )
    private Set<PlantasEntity> plantas;
}
