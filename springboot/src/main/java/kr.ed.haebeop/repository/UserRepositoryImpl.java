package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private SqlSession sqlsession;

    @Override
    public List<User> userList() throws Exception {
        return sqlsession.selectList("user.userList");
    }

//    @Override
//    public int userCount() throws Exception {
//        return sqlsession.Count("user.userCount");;
//    }

    @Override
    public User getUser(String id) throws Exception {
        return sqlsession.selectOne("user.getUser", id);
    }

    @Override
    public User sighIn(User user) throws Exception {
        return null;
    }

    @Override
    public User loginCheck(User user) throws Exception {
        return null;
    }

    @Override
    public User login(HttpServletRequest request) throws Exception {
        return null;
    }

    @Override
    public void userInsert(User user) throws Exception {
    }

    @Override
    public void userUpdate(User user) throws Exception {

    }

    @Override
    public void userDelete(String id) throws Exception {

    }
}
