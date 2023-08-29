package com.example.movrank.repository;

import com.example.movrank.dto.PageDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PageMapper {
    int totalRowCount(PageDto pageDto);
}
