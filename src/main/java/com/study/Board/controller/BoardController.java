package com.study.Board.controller;


import com.study.Board.entity.Board;
import com.study.Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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


    @GetMapping("/board/write")
    public String boardWriteForm(){
        return "boardwrite";
    }

    // 데이터를 조작할때 Post 사용
    @PostMapping("/board/writedo")
    public  String boardWritePro(Board board){
        boardService.write(board);
        return "boardwrite";
    }

    @GetMapping("/board/list")
    public String boardlist(Model model){ // 데이터를 담아 페이지로 보내기 위해 Model 자료형을 인자로
//        System.out.println(boardService.boardList());
        model.addAttribute("list", boardService.boardList()); // boardService에서 생성한 boardlist메소드를 통해 list가 반환되는데 해당 list를 "list"라는 이름으로 넘겨주겠다는 것(html에 나올 수 있게)
        return "boardlist";
    }

    @GetMapping("/board/view")
    public String boardview(Model model,Integer id){
        model.addAttribute("board",boardService.boardview(id));
        return "boardview";
    }






}
