package kr.ed.haebeop.utill;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();  
       String sid = (String) session.getAttribute("sid");
       if(session.getAttribute("sid")==null){       //로그인 안했을 경우
           response.sendRedirect("/");
           return false;
       }
       if(sid.equals("admin")){
           return true;
       }else {
           response.sendRedirect("/");
           return false;
       }
    }
}
