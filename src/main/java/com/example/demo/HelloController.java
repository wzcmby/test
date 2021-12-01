package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        String cookiesString = "";
        if(cookies != null ){
            for (Cookie c:cookies ) {
                cookiesString =  c.getName()+"--"+c.getValue();
            }
        }

        System.out.println(System.currentTimeMillis());
        return System.currentTimeMillis()+":::hello:"+cookiesString;
    }
}
