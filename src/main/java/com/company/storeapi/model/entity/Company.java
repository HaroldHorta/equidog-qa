package com.company.storeapi.model.entity;

import com.company.storeapi.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    private String id;
    private String nit;
    private String name;
    private Status status;
    private String phone;
    private String address;
    private String logo;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date createAt;
}
