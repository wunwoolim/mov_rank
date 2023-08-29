package com.example.movrank.repository;

import com.example.movrank.dto.NoticeDto;
import com.example.movrank.dto.PageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface NoticeMapper {
    void UpdateHits(String nid);
    NoticeDto content(String nid);
    List<NoticeDto> list(PageDto pageDto);
}
