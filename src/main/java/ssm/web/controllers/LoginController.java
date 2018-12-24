package ssm.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.mapper.User;
import ssm.service.UserService;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

//    @RequestBody
        @RequestMapping("/login")
        public User login(@RequestBody User u, HttpServletRequest request) {
            System.out.println(u);
//        System.out.println(u.showUser());
//        System.out.println("login...");
            System.out.println("用户名："+u.getUname()+ ",密码："+u.getUpwd());
            User user = userService.login(u);
            System.out.println(user);
            if (user != null) {
                request.setAttribute("msg", "login success");
                request.setAttribute("user", user);
            } else {
                request.setAttribute("msg", "name or password error,please login agin!");
            }
            return user;
    }
}
