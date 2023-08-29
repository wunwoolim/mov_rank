package com.example.movrank.repository;

import com.example.movrank.dto.MemberDto;
import com.example.movrank.dto.SessionDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int join(Object memberDto);
    int idcheck(String id);
    SessionDto login(MemberDto memberDto);
}
