package com.pdm.pdmonitoreo.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity(name = "plantas")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
@Setter
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

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private PaisEntity pais;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getLectures() {
        return lectures;
    }

    public Integer getRed_alert() {
        return red_alert;
    }

    public Integer getMedium_alert() {
        return medium_alert;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public PaisEntity getPais() {
        return pais;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLectures(Integer lectures) {
        this.lectures = lectures;
    }

    public void setRed_alert(Integer red_alert) {
        this.red_alert = red_alert;
    }

    public void setMedium_alert(Integer medium_alert) {
        this.medium_alert = medium_alert;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setPais(PaisEntity pais) {
        this.pais = pais;
    }
}
