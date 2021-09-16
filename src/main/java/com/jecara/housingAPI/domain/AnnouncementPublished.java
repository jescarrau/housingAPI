package com.jecara.housingAPI.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "announcement_published")

public class AnnouncementPublished {

    @Schema(description = "Id de la oferta publicada.", example = "1", required = true)
    @Id
    private String id;
    @Schema(description = "Id del alojamiento relacionado con la publicación.", example = "1", required = true)
    private String idLivingPlace;
    @Schema(description = "Id del usuario que realiza la publicación de la oferta.", example = "1", required = true)
    private String idUser;
    @Schema(description = "Fecha en la que se publica la oferta.", example = "2021-10-10", required = true)
    private LocalDate date;
    @Schema(description = "Indica si la oferta está activa.", example = "true", required = true)
    private boolean active;
    @Schema(description = "Indica si la oferta es visible.", example = "true", required = true)
    private boolean visible;

}
