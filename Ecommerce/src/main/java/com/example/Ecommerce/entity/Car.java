package com.example.Ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {
    @Id
    @GeneratedValue
    private int carId;
    private String carName;
    private int manufacturingYear;
    @ElementCollection
    private List<String> colours;
    private String model;
    @ElementCollection
    private List<String> accessories;
    private double price;
    @ElementCollection
    private List<String> payments;
    @ElementCollection
    private List<String> deliveryCities;




}
