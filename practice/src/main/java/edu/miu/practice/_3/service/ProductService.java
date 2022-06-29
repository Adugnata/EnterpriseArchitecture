package edu.miu.practice._3.service;

import edu.miu.practice._3.adapter.ProductAdapter;
import edu.miu.practice._3.dto.ProductDTO;
import edu.miu.practice._3.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public void addProduct(ProductDTO productDTO) {
        repo.save(ProductAdapter.getProduct(productDTO));
    }

    public List<ProductDTO> findByCategory(String category) {
        return ProductAdapter.getProductDTOList(repo.findByCategory(category));
    }

    public List<ProductDTO> findByPriceGreaterThan(double price) {
        return ProductAdapter.getProductDTOList(repo.findByPriceIsGreaterThan(price));
    }
}
