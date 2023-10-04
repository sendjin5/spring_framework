package kr.ed.haebeop.controller;

import kr.ed.haebeop.test.Check;
import kr.ed.haebeop.test.CheckVO;
import kr.ed.haebeop.test.CheckValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/check/")
public class CheckController {

    @GetMapping("check1")
    public String check1(Model model){
        return "WEB-INF/testid.jsp";
    }

    @PostMapping("/check1")
    public String check1Pro(HttpServletRequest req, Model model){
        model.addAttribute("id", req.getParameter("id"));
        model.addAttribute("pw", req.getParameter("pw"));
        return "/check1";
    }


    @GetMapping("/check3")
    public String check3(HttpServletRequest req, Model model) {
        return "/check/check3";
    }
    @GetMapping("/check3pro")
    public String check3pro(HttpServletRequest req, Model model){
        model.addAttribute("id", req.getParameter("id"));
        model.addAttribute("pw", req.getParameter("pw"));
        return "/check/check3_result";
    }


    @GetMapping("/check4")
    public String check4(HttpServletRequest req, Model model) {
        return "/check/check4";
    }
    @PostMapping("/check4")
    public String check4pro(@ModelAttribute("check") Check check , Model model, BindingResult result){      //result 결과 페이지
        String page ="/check/check4_result";
        CheckValidator ckVal = new CheckValidator();
        ckVal.validate(check, result);      //같이 넣어줌
        if(result.hasErrors()){
            page = "/check/error4";
        }
        return page;
    }



    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.setValidator(new CheckValidator());
    }

    @GetMapping("/check5")
    public String check5(HttpServletRequest req, Model model) {
        return "/check/check5";
    }
    @PostMapping("/check5")
    public String check5pro(@ModelAttribute("check") @Valid Check check , Model model, BindingResult result){      //result 결과 페이지
        String page ="/check/check5_result";
        if(result.hasErrors()){
            page = "/check/error5";
        }
        return page;
    }


    @GetMapping("/check6")
    public String check6(HttpServletRequest req, Model model) {
        model.addAttribute("chk", new CheckVO());
        return "/check/check6";
    }

    @PostMapping("/check6")
    public String check6pro(@ModelAttribute("chk") CheckVO check , Model model){      //result 결과 페이지
        String page ="/check/check6_result";
        model.addAttribute("chk", check);
        return page;
    }
}
