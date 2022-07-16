package Junsu.yup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class yupcontroller {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "fine !");
        return "hello";
    };
    @GetMapping("hi")
    public String hi(Model model){
        model.addAttribute("data", "I love U");
        return "hello";
    };
}
