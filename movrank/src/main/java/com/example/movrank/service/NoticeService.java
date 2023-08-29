package com.example.movrank.service;

import com.example.movrank.dto.NoticeDto;
import com.example.movrank.dto.PageDto;
import com.example.movrank.repository.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    public void getUpdateHits(String nid){
        noticeMapper.UpdateHits(nid);
    }

    public NoticeDto content(String nid){

        return noticeMapper.content(nid);
    }

    public List<NoticeDto> list(PageDto pageDto){

        return noticeMapper.list(pageDto);
    }
}
