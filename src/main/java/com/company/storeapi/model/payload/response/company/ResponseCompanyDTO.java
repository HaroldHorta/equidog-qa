package com.company.storeapi.model.payload.response.company;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCompanyDTO {

    private String id;
    private String nit;
    private String name;
    private String phone;
    private String address;
    private String logo;



}
