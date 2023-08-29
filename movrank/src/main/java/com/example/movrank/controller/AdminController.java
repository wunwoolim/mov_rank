package com.example.movrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/admin_index")
    public String admin_index(){
        return "/admin/admin_index";
    }

    @GetMapping("/admin_notice_list")
    public String admin_notice_list(){
        return "/admin/notice/admin_notice_list";
    }

    @GetMapping("/admin_member_list")
    public String admin_member_list(){
        return "/admin/member/admin_member_list";
    }
}
