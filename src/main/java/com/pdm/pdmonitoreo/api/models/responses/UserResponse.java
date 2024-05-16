package com.pdm.pdmonitoreo.api.models.responses;

import com.pdm.pdmonitoreo.utils.Role;
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
public class UserResponse implements Serializable {

    private UUID id;
    private String username;
    private String lastname;
    private String email;
    //private String password;
    private Role role;

}
