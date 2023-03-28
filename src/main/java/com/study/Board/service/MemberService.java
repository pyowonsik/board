package com.study.Board.service;

import com.study.Board.entity.Member;
import com.study.Board.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void join(Member member){
        memberRepository.save(member);
    }
    public  void delete(String id){
        memberRepository.deleteById(id);
    }
}
