package com.company.storeapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "countingGeneral")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountingGeneral {
    @Id
    private String id;
    private int quantityOfOrdersInCancelledState;
    private int quantityOfOrdersInOpenState;
    private int quantityOfOrdersInPendingState;
    private int quantityOfOrdersInPayedState;
    private int quantityOfCustomer;
    private int quantityOfProduct;
}
