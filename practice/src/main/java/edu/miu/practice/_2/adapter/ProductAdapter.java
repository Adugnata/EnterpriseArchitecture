package edu.miu.practice._2.adapter;

import edu.miu.practice._2.dto.ProductDTO;
import edu.miu.practice._2.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductAdapter {
    public static ProductDTO getProductDTO(Product p) {
        return new ProductDTO(p.getProductNumber(), p.getName(), p.getPrice(), p.getCategory());
    }

    public static Product getProduct(ProductDTO dto) {
        return new Product(dto.getProductNumber(), dto.getName(), dto.getPrice(), dto.getCategory());
    }

    public static List<ProductDTO> getProductDTOList(List<Product> products) {
        return products.stream().map(ProductAdapter::getProductDTO).collect(Collectors.toList());
    }
}
