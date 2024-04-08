package com.fvelasquez.prueba.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private Double price;

    public Product(String s, double v) {

    }
}
