package com.pdm.pdmonitoreo.api.models.responses;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
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

}
