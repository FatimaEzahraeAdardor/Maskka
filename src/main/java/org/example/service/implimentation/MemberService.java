package org.example.service.implimentation;

import org.example.model.Member;
import org.example.repository.MemberRepository;
import org.example.service.Interface.MemberServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MemberService implements MemberServiceInterface {
    @Autowired
    private MemberRepository memberRepository;
    @Override
    public Member save(Member member) {
      return memberRepository.save(member);
    }

    @Override
    public Member update(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Optional<Member> findById(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }
}
