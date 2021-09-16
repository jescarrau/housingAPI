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
@Document(collection = "match")

public class Match {

    @Schema(description = "Id del match", example = "1", required = true)
    @Id
    private String id;
    @Schema(description = "Id del usuario que solicita el match", example = "1", required = true)
    private String idUserSend;
    @Schema(description = "Id del usuario que recibe el match", example = "1", required = true)
    private String idUserReceived;
    @Schema(description = "Indica el estado de la petición (activa/inactiva).\nActiva = true | Inactiva = false", example = "true", required = true)
    private boolean petitionState;
    @Schema(description = "Indica si la petición está pendiente de respuesta.\nAceptada = true | Denegada = false", example = "true", required = true)
    private boolean petitionSend;

}