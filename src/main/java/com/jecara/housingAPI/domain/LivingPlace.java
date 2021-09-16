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
@Document(collection = "living_place")

public class LivingPlace {

    @Schema(description = "Id del alojamiento", example = "1", required = true)
    @Id
    private String id;
    @Schema(description = "Nombre de la calle donde se encuentra el alojamiento.", example = "1", required = true)
    private String street;
    @Schema(description = "Ciudad donde se encuentra el alojamiento.", example = "Madrid", required = true)
    private String city;
    @Schema(description = "Número de la calle del alojamiento.", example = "1", required = true)
    private int number;
    @Schema(description = "Planta o altura del alojamiento (si se encuentra en un bloque).", example = "1", required = true)
    private int floor;
    @Schema(description = "Letra del alojamiento (si se encuentra en un bloque).", example = "A", required = true)
    private char suite;
    @Schema(description = "Coordenadas geográficas de la dirección del alojamiento (latitud - longitud).", example = "40.388537837536788, -3.629436491497271", required = true)
    private String coordinates;
    @Schema(description = "Lista de imágenes del alojamiento en formato base64.", example = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAABVY ...", required = true)
    private List<String> photos;
    @Schema(description = "Indica si el alojamiento está activo.", example = "true", required = true)
    private boolean active;

}
