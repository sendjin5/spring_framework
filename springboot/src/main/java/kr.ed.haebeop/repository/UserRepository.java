package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserRepository {
    public List<User> userList() throws Exception;
    public int userCount() throws Exception;
    public User getUser(String id) throws Exception;
    public User sighIn(User user) throws Exception;
    public User loginCheck(User user) throws Exception;
    public User login(HttpServletRequest request) throws Exception;
    public void userInsert(User user) throws Exception;
    public void userUpdate(User user) throws Exception;
    public void userDelete(String id) throws Exception;

}
