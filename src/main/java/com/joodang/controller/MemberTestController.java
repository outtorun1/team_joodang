package com.joodang.controller;

import com.joodang.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberTestController {
//    private String email;
//    private String password;
//    private String name;
//    private String phone;
//    private String gender;
//    private String region;
//    private String zipcode;
//    private String address1;
//    private String address2;
//    private String joinDate;
//    private int coupon;
//    private int point;
//    private String remark;

    @GetMapping(value = "/member")
    public Member test() {
        Member bean = new Member();

        bean.setEmail("hq@joodang.com");
        bean.setPassword("1234");
        bean.setName("본사_관리자");
        bean.setPhone("02-1111-1111");
        bean.setRegion("본사");
        bean.setZipcode("00278");
        bean.setAddress1("서울시 금천구 가산동");
        bean.setAddress2("상세 주소");
        bean.setRemark("본사 관리자 아이디 등록");

        return bean;
    }
}
