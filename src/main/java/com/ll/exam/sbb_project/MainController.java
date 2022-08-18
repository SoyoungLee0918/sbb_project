package com.ll.exam.sbb_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/sbb")
    public void index(){
        System.out.println("index");
    }

}
