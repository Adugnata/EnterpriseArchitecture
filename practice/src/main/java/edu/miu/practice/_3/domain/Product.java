package edu.miu.practice._3.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String productNumber;
    private String name;
    private double price;
    private String category;
}
