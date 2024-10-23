package org.example.controller;

import org.example.model.Member;
import org.example.service.implimentation.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    public String getMembers(Model model) {
        List<Member> members = memberService.findAll();
        model.addAttribute("members", members);
        return "members"; // This will resolve to /WEB-INF/views/members.jsp
    }
}