package com.joodang.dto;

import com.joodang.Constant.Gender;
import com.joodang.Constant.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class MemberDto {
    private String email;
    private String phone;
    private Gender gender;
    private String region;
    private String zipcode;
    private String address1;
    private String address2;
    private Date joinDate;
    private int coupon;
    private int point;
    private String remark;
    private Role role;
}
