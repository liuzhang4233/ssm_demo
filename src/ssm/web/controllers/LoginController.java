package ssm.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.po.User;


@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(User u){
        System.out.println(u.showUser());
        System.out.println("login...");
        return "main";
    }

}
