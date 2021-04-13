package com.creative.webproject.service;

import com.creative.webproject.domain.Member;
import com.creative.webproject.repository.MemberRepository;
import com.creative.webproject.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = new MemoryMemberRepository();
    }

    /**
     * 회원 가입
     */
    public Long join(Member member) {
        // Name 중복 없애기
        validateDuplicatedMemberName(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicatedMemberName(Member member) {
        Optional<Member> result = memberRepository.findByName(member.getName());
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    /**
     * 회원 검색
     */
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
