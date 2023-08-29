package com.example.movrank.service;

import com.example.movrank.dto.BoardDto;
import com.example.movrank.dto.PageDto;
import com.example.movrank.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    BoardMapper boardMapper;

    public void updateHits(String bid){
        boardMapper.updateHits(bid);
    }

    public BoardDto content(String bid){
        return  boardMapper.content(bid);
    }

    public List<BoardDto> list(PageDto pageDto){
        return boardMapper.list(pageDto);
    }
}
