package com.pdm.pdmonitoreo.api.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaisResponse implements Serializable {

    private UUID id;
    private String name;
    private String img;

}
