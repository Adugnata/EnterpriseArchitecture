package edu.miu.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ProductDAO implements IProductDAO {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void clearDB() {
        Map<String, Object> namedParameters = new HashMap<String, Object>();
        jdbcTemplate.update(SqlType.P_CLEAR.getValue(), namedParameters);
        jdbcTemplate.update(SqlType.S_CLEAR.getValue(), namedParameters);
    }

    public void save(Product product) {
        jdbcTemplate.update(SqlType.P_SAVE.getValue(), new BeanPropertySqlParameterSource(product));
        // save supplier
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", product.getSupplier().getName());
        params.put("phone", product.getSupplier().getPhone());
        params.put("productNumber", product.getProductNumber());
        jdbcTemplate.update(SqlType.S_SAVE.getValue(), params);
    }

    public Product findByProductNumber(String productNumber) {
        Product product = jdbcTemplate.queryForObject(
                SqlType.P_FINDBYNUMBER.getValue(),
                new MapSqlParameterSource("productNumber", productNumber),
                BeanPropertyRowMapper.newInstance(Product.class));
        Supplier supplier = getSupplierNumber(productNumber);
        assert product != null;
        product.setSupplier(supplier);
        return product;

    }
    @Override
    public Supplier getSupplierNumber(String productNumber){
        return jdbcTemplate.queryForObject(
                SqlType.S_FINDBYNUMBER.getValue(),
                new MapSqlParameterSource("productNumber", productNumber),
                BeanPropertyRowMapper.newInstance(Supplier.class));
    }



    public Product findByProductName(String name) {

        Map<String, Object> namedParameters = new HashMap<>();
        namedParameters.put("name", name);
        Product product = jdbcTemplate.queryForObject(
                SqlType.P_FINDBYNAME.getValue(),
                namedParameters,
                (rs, rowNum) -> new Product(
                        rs.getString("productNumber"),
                        rs.getString("name"),
                        rs.getDouble("price")));
        assert product != null;
        Supplier supplier = getSupplierNumber(product.getProductNumber());
        product.setSupplier(supplier);
        return product;

    }
    @Override
    public List<Product> getAllProducts() {

        List<Product> products = jdbcTemplate.query(
                SqlType.P_FINDALL.getValue(),
                new HashMap<String, Product>(),
                (rs, rowNum) -> new Product(
                        rs.getString("productNumber"),
                        rs.getString("name"),
                        rs.getDouble("price"))
        );
        return products.stream().peek(product -> {
            Supplier supplier = getSupplierNumber(product.getProductNumber());
            product.setSupplier(supplier);
        }).collect(Collectors.toList());
    }

    @Override
    public void removeProduct(String productNumber) {
        jdbcTemplate.update(SqlType.P_DELETE.getValue(), new MapSqlParameterSource("productNumber", productNumber));
        jdbcTemplate.update(SqlType.S_DELETE.getValue(), new MapSqlParameterSource("productNumber", productNumber));
    }
}
