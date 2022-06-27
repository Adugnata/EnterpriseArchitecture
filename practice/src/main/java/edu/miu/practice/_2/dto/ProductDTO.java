package edu.miu.practice._2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String productNumber;
    private String name;
    private double price;
    private String category;
}
