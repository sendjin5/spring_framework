package kr.ed.haebeop.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @GetMapping("/")
    public String ajaxHonme(){
        return "/ajax/home";
    }

    @GetMapping("/test1")
    public String ajaxTest1(){
        return "/ajax/test1";
    }
    @GetMapping("/test1pro")
    public String ajaxTest1pro(){
        System.out.println("GET 전송 테스트");
        return "/ajax/test1";
    }

    @GetMapping("/test2")
    public String ajaxTest2(){
        return "/ajax/test2";
    }
    @PostMapping("/test2pro")
    public String ajaxTest2pro(){
        System.out.println("POST 전송 테스트");
        return "/ajax/test2";
    }

    @GetMapping("/test3")
    public String ajaxTest3(){
        return "/ajax/test3";
    }
    @GetMapping("/test3pro")
    public String ajaxTest3pro(){
        System.out.println("GET 전송 테스트");
        return "/ajax/test3";
    }

    @GetMapping("/test4")
    public String ajaxTest4(){
        return "/ajax/test4";
    }
    @GetMapping("/test4pro")
    public String ajaxTest4pro(){
        System.out.println("GET 전송 테스트");
        return "/ajax/test4";
    }
}
