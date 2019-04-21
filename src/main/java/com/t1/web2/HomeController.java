package com.t1.web2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Davi
 */
@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String home(){
        return "Welcome to Spring";
    }
}
