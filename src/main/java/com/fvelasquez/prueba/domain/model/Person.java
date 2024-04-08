package com.fvelasquez.prueba.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "people")
@Data
public class Person {

    @Id
    private String id;
    private String dni;
    private String nombre;
    private String apellidos;
}
