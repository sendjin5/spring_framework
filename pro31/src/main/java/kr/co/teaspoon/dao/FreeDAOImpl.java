package kr.co.teaspoon.dao;

import kr.co.teaspoon.dto.Free;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class FreeDAOImpl implements FreeDAO{

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Free> freeList() throws Exception {
        return sqlSession.selectList("free/freeList");
    }

    @Transactional
    @Override
    public Free freeDetail(int bno) throws Exception {
        sqlSession.update("free.freeVisited", bno);
        return sqlSession.selectOne("free.freeDetail", bno);

    }

    @Override
    public void freeInsert(Free free) throws Exception {
        sqlSession.insert("free.freeInsert", free);

    }

    @Override
    public void freeUpdate(Free free) throws Exception {
        sqlSession.update("free.freeUpdate", free);

    }

    @Override
    public void freeDelete(int bno) throws Exception {
        sqlSession.delete("free.freeDelete", bno);

    }
}
