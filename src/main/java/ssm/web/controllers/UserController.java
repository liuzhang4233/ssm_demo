package ssm.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.mapper.User;

/**
 * Created by liu_zhang on 2018/12/24.
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String userl(User u){
        System.out.println(u);
        return "main";
    }
}
