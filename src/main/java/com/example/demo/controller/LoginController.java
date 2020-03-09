package com.example.demo;

import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.DemoApplication;

@Controller
public class LoginController {

    @Autowired
    private LoginService service;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginMessage() {
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String handleLogin(ModelMap model, @RequestParam String name, @RequestParam String password) {

        boolean isPasswordSame = service.validateUser(name, password);

        if (!isPasswordSame) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        } else {
            model.put("errorMessage", "user name and password are same!");
            return "login";
        }
    }
}
