package com.company.storeapi.model.payload.request.vaccination;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestAddVaccinationDTO {

    @Schema(example = "Parvo")
    private String description;
    private String lot;
    private String observation;


}
