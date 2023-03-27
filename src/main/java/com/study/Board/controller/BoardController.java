package com.study.Board.controller;


import com.study.Board.entity.Board;
import com.study.Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "Hello World";
    }


    // Get
    @GetMapping("/board/write")
    public String boardWriteForm(){
        return "boardwrite";
    }

    // Post
    @PostMapping("/board/writedo")
    public  String boardWritePro(Board board){
        System.out.println(board);
        boardService.write(board);
        return "boardwrite";
    }

}
