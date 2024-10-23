package org.example.service.Interface;

import org.example.model.Member;

import java.util.List;
import java.util.Optional;

public interface MemberServiceInterface {
    Member save(Member member);
    Member update(Member member);
    Optional<Member> findById(Long id);
    List<Member> findAll();
    void delete(Long id);

}
