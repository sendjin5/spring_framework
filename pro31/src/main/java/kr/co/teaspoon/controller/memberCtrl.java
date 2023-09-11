package kr.co.teaspoon.controller;

import kr.co.teaspoon.dto.Member;
import kr.co.teaspoon.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/member/*")
public class memberCtrl {

    @Autowired
    private MemberService memberService;

    @Autowired
    HttpSession session;

    @RequestMapping(value = "List.do", method = RequestMethod.GET)
    public String memberList(Model model) throws Exception{
        List<Member> memberList = memberService.memberList();
        model.addAttribute("memberList", memberList);
        model.addAttribute("title", "회원목록");
        return "/member/memberList";
    }

    @GetMapping(value = "Get.do")
    public String memberGet(@RequestParam String id, Model model) throws Exception{
        Member member = memberService.memberGet(id);
        model.addAttribute("member", member);
        return "/member/memberGet";
    }

}
