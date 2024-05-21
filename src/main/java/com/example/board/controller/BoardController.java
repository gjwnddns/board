package com.example.board.controller;

import com.example.board.dto.Board;
import com.example.board.service.BoardService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        model.addAttribute("boardList", boardService.getAllBoardList());
        return "boardList";
    }

    @PostMapping("/addBoard")
    public String addBoard(@RequestBody Board board, Model model) {
        boardService.addBoard(board);
        model.addAttribute("boardList", boardService.getAllBoardList());
        return "boardList";
    }

}