//package com.creative.webproject.service;
//
//import com.creative.webproject.domain.Member;
//import com.creative.webproject.repository.MemberRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Commit;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@Transactional
//public class MemberServiceIntegrationTest {
//
//    @Autowired MemberService memberService;
//    @Autowired MemberRepository memberRepository;
//
//    @Test
//    @Commit // DB에 반영되도록 TEST
//    void register() {
//        // given
//        Member member = new Member();
//        member.setName("spring");
//
//        // when
//        Long saveId = memberService.join(member);
//
//        // then
//        Member findMember = memberService.findOne(saveId).get();
//        assertThat(member.getName()).isEqualTo(findMember.getName());
//    }
//
//}
