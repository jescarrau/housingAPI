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
@Document(collection = "requirement")

public class Requirement {

    @Schema(description = "Id del elemento", example = "1", required = false)
    @Id
    private String id;
    @Schema(description = "Indica si se aceptan fumadores", example = "true", required = true)
    private boolean smoke;
    @Schema(description = "Indica si se aceptan mascotas", example = "true", required = true)
    private boolean pet;
    @Schema(description = "Indica si es exclusivo de un género", example = "true", required = true)
    private boolean gender;
    @Schema(description = "Indica si es LGTBI-friendly", example = "true", required = true)
    private boolean LGTBI;
    @Schema(description = "Indica si está activo", example = "true", required = true)
    private boolean active;

}
