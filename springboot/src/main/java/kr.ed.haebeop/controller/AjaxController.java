package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.Human;
import kr.ed.haebeop.domain.TestVO;
import kr.ed.haebeop.service.TestService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @Autowired
    public TestService testService;

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


    @GetMapping("/test5")        //해당 넘버를 받고 페이지로 이동
    public String ajaxTest5() { return "/ajax/test5"; }
    @GetMapping("/test5pro")        //해당 넘버를 받고 페이지로 이동
    @ResponseBody
    public Human ajaxTest5Pro(@ModelAttribute("Human") Human human) {
        System.out.println(human.toString());
        return human;
    }

    @GetMapping("/test6")        //해당 넘버를 받고 페이지로 이동
    public String ajaxTest6() { return "/ajax/test6";  }
    @PostMapping("/test6pro")        //해당 넘버를 받고 페이지로 이동
    @ResponseBody
    public Human ajaxTest6Pro(@ModelAttribute("Human") Human human) {
        System.out.println(human.toString());
        return human;
    }


    @GetMapping("/test7")        //해당 넘버를 받고 페이지로 이동
    public String ajaxTest7() { return "/ajax/test7";  }
    @PostMapping("/test7pro")        //해당 넘버를 받고 페이지로 이동
    @ResponseBody
    public Human ajaxTest7Pro(@RequestBody Human human) {
        System.out.println(human.toString());
        return human;
    }


    @GetMapping("/test8")        //해당 넘버를 받고 페이지로 이동
    public String ajaxTest8() { return "/ajax/test8";  }
    @PostMapping("/test8pro")        //해당 넘버를 받고 페이지로 이동
    @ResponseBody
    public List<TestVO> ajaxTest8Pro(@RequestBody TestVO test) throws Exception{
        System.out.println(test.toString());
        testService.testInsert(test);
        List<TestVO> tList = testService.testList();
        return tList;
    }
}
