package com.jecara.housingAPI.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "role")

public class Role {

    @Schema(description = "Id del rol", example = "1", required = true)
    @Id
    private String id;
    @Schema(description = "Tipo de rol", example = "anfitrión, huesped...", required = true)
    private String role;
    @Schema(description = "Estado de la cuenta de usuario", example = "true/false", required = true)
    private boolean active;

}
