package com.pdm.pdmonitoreo.domain.entities;

import jakarta.persistence.*;
import lombok.*;

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

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            mappedBy = "pais"
    )
    private Set<PlantasEntity> plantas;
}
