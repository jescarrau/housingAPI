package com.jecara.housingAPI.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {

    @Schema(description = "Id del elemento", example = "1", required = false)
    @Id
    private String id;
    @Schema(description = "Nombre del usuario", example = "Carlos", required = true)
    private String name;
    @Schema(description = "Apellidos del usuario", example = "Palomino Campos", required = true)
    private String lastName;
    @Schema(description = "Nick del usuario", example = "carlosPC", required = true)
    private String username;
    @Schema(description = "Correo del usuario", example = "carlos@example.com", required = true)
    private String mail;
    @Schema(description = "Contraseña del usuario", example = "1234_qwerty", required = true)
    private String password;
    @Schema(description = "Estado de la cuenta de usuario", example = "true/false", required = true)
    private boolean active;
    @Schema(description = "Listado de roles del usuario", example = "anfitrión, huesped...", required = true)
    private List<Role> roles;

}
