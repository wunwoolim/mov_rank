package com.example.movrank.controller;

import com.example.movrank.dto.MemberDto;
import com.example.movrank.dto.SessionDto;
import com.example.movrank.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("mypage")
    public String mypage(){
        return "/mypage/mypage";
    }
    @GetMapping("logout")
    public String logout(HttpSession session,Model model){
        SessionDto svo = (SessionDto) session.getAttribute("svo");
        if(svo != null){
            session.invalidate();
            model.addAttribute("logout_result","ok");
        }
        return "index";
    }

    @PostMapping("join")
    public String join_proc(MemberDto memberDto, Model model){
        int result = memberService.join(memberDto);

        if(result == 1){
            model.addAttribute("join_result","ok");
        }else {
            //실패 메시지 호출
        }

        return "/login/login";
    }

    @GetMapping("join")
    public String join(){
        return "/join/join";
    }

    @PostMapping("login")
    public String login_proc(MemberDto memberDto, Model model, HttpSession session) {
        SessionDto sessionDto = memberService.login(memberDto);
		/*
		 * if(sessionDto.getLoginresult() == 1){ session.setAttribute("svo",sessionDto);
		 * model.addAttribute("login_result","ok"); }
		 */
        return "index";
    }

    @GetMapping("login")
    public String login(){
        return "/login/login";
    }
}
