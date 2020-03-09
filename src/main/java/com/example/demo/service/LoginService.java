package com.example.demo.service;

import com.example.demo.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
    public boolean validateUser(String user, String password) {
        DemoApplication.LOGGER.error("****** {} ********", user.equals(password));
        return user.equals(password);
    }
}
