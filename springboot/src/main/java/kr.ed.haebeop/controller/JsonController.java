package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.Human;
import kr.ed.haebeop.domain.TestVO;
import kr.ed.haebeop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Json/")
public class JsonController {

    @Autowired
    public TestService testService;
//
//    @GetMapping("getTest/{num}")        //해당 넘버를 받고 페이지로 이동
//    @ResponseBody
//    public TestVO viewTest(@PathVariable int num) throws Exception{
//        TestVO test = testService.getTest();
//        return test;
//    }


}
