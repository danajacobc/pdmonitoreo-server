package com.pdm.pdmonitoreo.api.models.request;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserRequest implements Serializable {

    private String name;
    private String lastname;
    private String email;
    private String password;

}
