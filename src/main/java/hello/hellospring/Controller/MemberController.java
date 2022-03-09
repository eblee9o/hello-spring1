package hello.hellospring.Controller;

import hello.hellospring.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import hello.hellospring.service.MemberService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    //객체를 new하지않고 스프링 컨테이너에 등록 후 사용
    @Autowired //스프링컨테이너로 Autowired로 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }//MemberController

    @GetMapping("/members/new")
    public String createForm(){
        return "/members/createMemberForm";
    }
    @PostMapping("/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members",members);
        return "members/memberList";

    }
}//class
