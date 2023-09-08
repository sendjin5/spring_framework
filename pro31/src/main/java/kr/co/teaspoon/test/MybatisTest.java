package kr.co.teaspoon.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class MybatisTest {
    private static final Logger logger = LoggerFactory.getLogger(MybatisTest.class);
    @Inject
    private SqlSessionFactory sqlFactoty;
    @Test
    public void testFactory() { logger.info("sqlFactory : " + sqlFactoty);}
    @Test
    public void testSession() throws Exception{
        try(SqlSession session = sqlFactoty.openSession()){
            logger.info("Mybatis Connection success! session : " + session);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
