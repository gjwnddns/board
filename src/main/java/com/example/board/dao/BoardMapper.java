package com.example.board.dao;

import com.example.board.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> getAllBoardList();

    void addBoard(Board board);
}
