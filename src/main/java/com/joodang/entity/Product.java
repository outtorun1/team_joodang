package com.joodang.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Getter
@Setter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long prId;  // 상품 코드 (기본키)

    @Column(nullable = false, length = 128)
    private String prName;  // 상품명

    @Column(nullable = false, name = "buying")
    private int prBuyingPrice;

    @Column(nullable = false)
    private int prStock;
    private LocalDateTime prRegDate;
}


