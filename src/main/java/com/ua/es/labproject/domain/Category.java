package com.ua.es.labproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
public class Category {

    private String street;
    private String suite;
    private String city;
    private String zipcode;

    public Category() {}
}
