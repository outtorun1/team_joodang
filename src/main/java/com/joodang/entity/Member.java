package com.joodang.entity;

import com.joodang.Constant.Gender;
import com.joodang.Constant.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "members")
@Getter @Setter
@ToString
public class Member {
    @Id
    @Column(name = "email")
    private String email;

    private String password;
    private String name;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String region;
    private String zipcode;
    private String address1;
    private String address2;

    // columnDefinition = "date default sysdate"
    @Column(nullable = false, columnDefinition = "date default sysdate")
    private Date joinDate;

    @Column(nullable = false)
    private int coupon;

    @Column(nullable = false)
    @ColumnDefault("0")
    private int point;


    private String remark;

    @Enumerated(EnumType.STRING)
    private Role role;


}
