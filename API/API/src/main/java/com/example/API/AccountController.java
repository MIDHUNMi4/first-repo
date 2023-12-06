package com.example.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @GetMapping("/SelectAll")
    public String SelectAll(){
        return "SelectAll";
    }
    @GetMapping("/Select")
    public String Select(){
        return "Select";
    }
    @PostMapping("/Save")
    public String Save(){
        return "Save";
    }
    @PostMapping("/Delete")
    public String Delete(){
        return "Delete";
    }
}