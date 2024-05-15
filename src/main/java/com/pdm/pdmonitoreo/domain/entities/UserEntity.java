package com.pdm.pdmonitoreo.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.UUID;

@Entity(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Validated
public class UserEntity implements Serializable {

    @Id
    private UUID id;

    @Column(nullable = false, length = 50)
    public String name;

    @Column(nullable = false, length = 50)
    public String lastname;

    @Column(nullable = false, unique = true, length = 50)
    public String email;

    @Column(nullable = false)
    @Size(min = 8, message = "Ingrese una contraseña con 8 caracteres como mínimo.")
    public String password;

}
