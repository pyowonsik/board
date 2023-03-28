package com.study.Board.controller;


import com.study.Board.entity.Member;
import com.study.Board.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/join")
    public void join(Member member){
        memberService.join(member);
    }

    @PostMapping("/delete")
    public  void delete(Member member){
        memberService.delete(member.getId());
    }

}
