package kr.co.teaspoon.dao;

import kr.co.teaspoon.dto.Sample;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //mapper 클래스, mybatis와 연동시켜주는 것
public class SampleDAOImpl implements SampleDAO{

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Sample> sampleList() throws Exception {
        return sqlSession.selectList("sample.sampleList");
    }
    @Override
    public Sample sampleDetail(int no) throws Exception {
        return sqlSession.selectOne("sample.sampleDetail", no);
    }
    @Override
    public int sampleCount() throws Exception {
        return sqlSession.selectOne("sample.sampleCount");
    }
    @Override
    public void sampleInsert(Sample sample) throws Exception {
        sqlSession.insert("sample.sampleInsert", sample);
    }
    @Override
    public void sampleUpdate(Sample sample) throws Exception {
        sqlSession.update("sample.sampleInsert", sample);

    }
    @Override
    public void sampleDelete(int no) throws Exception {
        sqlSession.delete("sample.sampleInsert", no);

    }
}
