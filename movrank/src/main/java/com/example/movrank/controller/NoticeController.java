package com.example.movrank.controller;

import com.example.movrank.dto.NoticeDto;
import com.example.movrank.dto.PageDto;
import com.example.movrank.service.NoticeService;
import com.example.movrank.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class NoticeController {
    @Autowired
    NoticeService noticeService;
    @Autowired
    PageService pageService;


    @GetMapping("notice_content/{nid}/{page}")
    public String notice_content(Model model,@PathVariable String nid,@PathVariable String page){
        NoticeDto noticeDto = noticeService.content(nid);
        if(noticeDto != null){
            noticeService.getUpdateHits(nid);
        }
        model.addAttribute("noticeDto",noticeDto);
        model.addAttribute("page",page);
        return "/notice/notice_content";
    }

    @GetMapping("notice_list/{page}")
    public String notice_list(@PathVariable String page, Model model){
        //List<NoticeDto> list = noticeService.list();
        /*pageDto.setPage(page);
        pageDto.setServiceName("notice");*/
        //PageDto pageDto = new PageDto(page,"notice");
        PageDto pageDto = pageService.getPageResult(new PageDto(page,"notice"));

        model.addAttribute("list",noticeService.list(pageDto));
        model.addAttribute("page",pageDto);
        return "/notice/notice_list";
    }
}
