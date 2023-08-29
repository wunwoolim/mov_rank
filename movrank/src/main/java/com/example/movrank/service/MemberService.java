package com.example.movrank.service;

import com.example.movrank.dto.MemberDto;
import com.example.movrank.dto.SessionDto;
import com.example.movrank.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberMapper memberMapper;

    //회원가입
    public int join(MemberDto memberDto){
        return memberMapper.join(memberDto);
    }

    //id 중복 체크
    public int idcheck(String id){
        return memberMapper.idcheck(id);
    }

    public SessionDto login(MemberDto memberDto){
        return memberMapper.login(memberDto);
    }
}
