package kr.co.teaspoon.dao;

import kr.co.teaspoon.dto.Board;

import java.util.List;

public interface BoardDAO {

    public List<Board> boardList() throws Exception;
    public Board boardDetail(int seq) throws Exception;
    public void boardInsert(Board board) throws Exception;
    public void boardUpdate(Board board) throws Exception;
    public void boardDelete(int seq) throws Exception;

}
