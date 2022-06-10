package com.joodang.repository;

import com.joodang.Constant.Gender;
import com.joodang.Constant.Role;
import com.joodang.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("회원 저장 테스트")
    public void createMemberTest() {
        System.out.println(memberRepository == null);
        Member member = new Member();

        member.setEmail("hq@joodang.com");
        member.setName("hq");
        member.setZipcode("02087");
        member.setAddress1("서울특별시 구로구 부일로 15길 29-13");
        member.setAddress2("201호");
        member.setRegion("서울특별시");
        member.setGender(Gender.MALE);
        member.setPhone("010-1234-5678");
        member.setRole(Role.HQ);

        Member savedMember = memberRepository.save(member);
        System.out.println(savedMember.toString());
    }
}
