package kr.ed.haebeop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/check/")
public class CheckController {
    @GetMapping("check1")
    public String check1(Model model){
        return "WEB-INF/testid.jsp";
    }
    @PostMapping("check1")
    public String check1Pro(@RequestParam String id, @RequestParam String pw, Model model){

        return
    }

}
