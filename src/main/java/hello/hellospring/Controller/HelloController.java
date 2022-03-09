package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){

        model.addAttribute("data","hello");
        return "hello";
    }//hello

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }//hello

    @GetMapping("hello-string")
    @ResponseBody //http의 바디에 이 데이터를 직접 넣어 주겠다리
    public String helloString(@RequestParam(value = "name") String name){

        return "hello" + name;
    }//hello

    @GetMapping("helloApi")
    @ResponseBody
    public Hello helloApi(@RequestParam(value = "name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }//hello

    //객체만들기
    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }//class-hello


}//class





