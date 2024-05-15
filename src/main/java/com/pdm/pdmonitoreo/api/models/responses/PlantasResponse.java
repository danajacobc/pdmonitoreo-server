package com.pdm.pdmonitoreo.api.models.responses;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlantasResponse implements Serializable {

    private UUID id;
    private String name;
    private Integer lectures;
    private Integer red_alert;
    private Integer medium_alert;
    private Boolean enabled;
    private PaisResponse pais;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLectures() {
        return lectures;
    }

    public void setLectures(Integer lectures) {
        this.lectures = lectures;
    }

    public Integer getRed_alert() {
        return red_alert;
    }

    public void setRed_alert(Integer red_alert) {
        this.red_alert = red_alert;
    }

    public Integer getMedium_alert() {
        return medium_alert;
    }

    public void setMedium_alert(Integer medium_alert) {
        this.medium_alert = medium_alert;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PaisResponse getPais() {
        return pais;
    }

    public void setPais(PaisResponse pais) {
        this.pais = pais;
    }
}
