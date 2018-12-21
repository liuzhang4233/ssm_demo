package ssm.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.po.User;
import ssm.service.UserService;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User u){
        System.out.println(u.showUser());
        System.out.println("login...");
        return "main";
    }
}
