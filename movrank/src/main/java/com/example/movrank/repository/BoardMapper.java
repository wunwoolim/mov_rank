package com.example.movrank.repository;

import com.example.movrank.dto.BoardDto;
import com.example.movrank.dto.PageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void updateHits(String bid);
    List<BoardDto> list(PageDto pageDto);
    BoardDto content(String bid);

}
