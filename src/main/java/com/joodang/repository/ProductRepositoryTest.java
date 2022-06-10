package com.joodang.repository;

import com.joodang.entity.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @Test
    @DisplayName("상품 저장 테스트")
    public void createProductTest() {
        System.out.println(productRepository == null);
        Product product = new Product();

        product.setPrName("곰표막걸리");
        product.setPrBuyingPrice(1800);
        product.setPrStock(300);
        product.setPrRegDate(LocalDateTime.now());

        Product savedProduct = productRepository.save(product);
        System.out.println(savedProduct.toString());
    }
}
