package ssm.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liu_zhang on 2018/12/25.
 */
@Controller
public class BookController {

    @RequestMapping("/login")
    public String getbooks(String name, String pwd, HttpServletRequest request){
        System.out.println(name);
        System.out.println(pwd);
        request.setAttribute("name",name);
        request.setAttribute("pwd",pwd);
        return "main";
    }
}
