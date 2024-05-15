package com.pdm.pdmonitoreo.api.models.request;

import com.pdm.pdmonitoreo.api.models.responses.PaisResponse;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PlantasRequest implements Serializable {

    private String name;
    private Integer lectures;
    private Integer red_alert;
    private Integer medium_alert;
    private Boolean enabled;
    private String pais;

}
