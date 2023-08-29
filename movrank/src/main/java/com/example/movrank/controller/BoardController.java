package com.example.movrank.controller;

import com.example.movrank.dto.BoardDto;
import com.example.movrank.dto.PageDto;
import com.example.movrank.service.BoardService;
import com.example.movrank.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {
    @Autowired
    BoardService boardService;
    @Autowired
    PageService pageService;

    @GetMapping("board_delete")
    public String board_delete(){
        return "board/board_delete";
    }

    @GetMapping("board_update")
    public String board_update(){
        return "/board/board_update";
    }

    @GetMapping("board_list_json")
    public String board_list_json(){
        return "/board/board_list_json";
    }

    @GetMapping("board_content/{bid}/{page}")
    public String board_content(Model model, @PathVariable String bid, @PathVariable String page){
        BoardDto boardDto = boardService.content(bid);
        if(boardDto != null){
            boardService.updateHits(bid);
        }
        model.addAttribute("boardDto", boardDto);
        model.addAttribute("page",page);

        return "/board/board_content";
    }


    @GetMapping("board_list/{page}")
    public String board_list(Model model,@PathVariable String page){
        PageDto pageDto = pageService.getPageResult(new PageDto(page,"board"));
        model.addAttribute("list",boardService.list(pageDto));
        model.addAttribute("page",pageDto);

        return "/board/board_list";
    }
}
