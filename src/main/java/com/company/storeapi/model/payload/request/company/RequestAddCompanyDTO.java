package com.company.storeapi.model.payload.request.company;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestAddCompanyDTO {

    @Schema(example = "12345")
    private String nit;
    @Schema(example = "Equi-Dog")
    private String name;
    @Schema(example = "3132456498")
    private String phone;
    @Schema(example = "Calle 41")
    private String address;
    @Schema(example = "http://localhost:8080/files/logo.png")
    private String logo;


}
