package com.example.movrank.restcontroller;

import com.example.movrank.dto.BoardDto;
import com.example.movrank.dto.PageDto;
import com.example.movrank.service.BoardService;
import com.example.movrank.service.MemberService;
import com.example.movrank.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MycgvRestController {
    @Autowired
    MemberService memberService;

    @Autowired
    PageService pageService;

    @Autowired
    BoardService boardService;

    @GetMapping("idcheck/{id}")
    public String idcheck(@PathVariable String id){
        return String.valueOf(memberService.idcheck(id));
    }

    @GetMapping("board_update_json_data/{bid}")
    public String board_update_json_data(@PathVariable String bid){
        

        return "/board/board_list_json_data/{page}";
    }

    @GetMapping("board_content_json_data/{bid}")
    public BoardDto board_content_json_data(@PathVariable String bid){

        return boardService.content(bid);
    }

    @GetMapping("board_list_json_data/{page}")
    public Map board_list_json_data(@PathVariable String page){
        Map map = new HashMap();
        PageDto pageDto = pageService.getPageResult(new PageDto(page,"board"));
        List<BoardDto> list = boardService.list(pageDto);
        map.put("list",list);
        map.put("page",pageDto);

        return map;
    }
}
