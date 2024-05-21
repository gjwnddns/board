package com.example.board.service;

import com.example.board.dao.BoardMapper;
import com.example.board.dto.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<Board> getAllBoardList() {
        return boardMapper.getAllBoardList();
    }

    public void addBoard(Board board) {
        boardMapper.addBoard(board);
    }

}
