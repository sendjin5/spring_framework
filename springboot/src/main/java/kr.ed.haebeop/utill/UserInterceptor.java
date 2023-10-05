package kr.ed.haebeop.utill;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;
        HttpSession session = request.getSession(false);        //자동 로그인이 안되게 false 기입
        if(session.getAttribute("user")!=null && session!=null){
            flag = true;
            System.out.println("인터셉터 통과 : 요청주소" +request.getRequestURI());
        }else{
            flag = false;
            System.out.println("인터셉터 실패");
            response.sendRedirect("/user/LoginForm");
        }
        return flag;
    }
}
