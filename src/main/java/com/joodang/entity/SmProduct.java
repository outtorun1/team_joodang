package com.joodang.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SmProduct {
    private Long smProductId;
    private String smProductImg;
    private String smCategory;
    private String smAlcohol;
    private String smInfo;
    private String smPlaceName;
    private String smPrice;
}
