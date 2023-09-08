package kr.co.teaspoon.dao;

import kr.co.teaspoon.dto.Board;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{

    @Autowired
    public SqlSession sqlsession;

    @Override
    public List<Board> boardList() throws Exception {
        return sqlsession.selectList("board.boardList");
    }

    @Override
    public Board boardDetail(int seq) throws Exception {
        return sqlsession.selectOne("board.boardDetail",seq);
    }

    @Override
    public void boardInsert(Board board) throws Exception {
        sqlsession.insert("board.boardInsert", board);
    }

    @Override
    public void boardUpdate(Board board) throws Exception {
        sqlsession.update("board.boardUpdate", board);
    }

    @Override
    public void boardDelete(int seq) throws Exception {
        sqlsession.delete("board.boardDelete", seq);

    }

    {



    }
}
