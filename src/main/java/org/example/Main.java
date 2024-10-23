package org.example;

import org.example.model.Member;
import org.example.service.implimentation.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

        // Get the MemberService bean from the context
        MemberService memberService = context.getBean(MemberService.class);

        // Create a new member object to save
        Member member = new Member();
        member.setMembershipNumber("12345");
        member.setLastName("Doe");
        member.setFirstName("John");
        member.setIdentificationDocument("Passport");
        member.setNationality("American");
        member.setMembershipDate(LocalDate.now());
        member.setLicenseExpirationDate(LocalDate.of(2025, 12, 31));

        // Save the member
        memberService.save(member);

        System.out.println("Member saved successfully!");
    }
}