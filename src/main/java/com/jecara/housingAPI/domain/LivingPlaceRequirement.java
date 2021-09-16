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
@Document(collection = "living_place_requirement")

public class LivingPlaceRequirement {

    @Schema(description = "Id de la solicitud de un alojamiento.", example = "1", required = true)
    @Id
    private String id;
    @Schema(description = "Id del alojamiento solicitado.", example = "1", required = true)
    private String idLivingPlace;
    @Schema(description = "Id del usuario que realiza la solicitud del alojamiento.", example = "1", required = true)
    private String idUser;
    @Schema(description = "Indica si la solicitud está activa.", example = "true", required = true)
    private boolean active;

}
