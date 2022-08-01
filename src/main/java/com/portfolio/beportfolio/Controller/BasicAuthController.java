package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.bean.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BasicAuthController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean portfolioBean() {
        return new AuthenticationBean("Sesión iniciada");
    }
}
