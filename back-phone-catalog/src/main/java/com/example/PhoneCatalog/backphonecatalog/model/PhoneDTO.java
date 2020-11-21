package com.example.PhoneCatalog.backphonecatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PhoneDTO {
    private int id;
    private String name;
    private String manufacturer;
    private String description;
    private String color;
    private double price;
    private String imageFileName;
    private String screen;
    private String processor;
    private int ram;
}