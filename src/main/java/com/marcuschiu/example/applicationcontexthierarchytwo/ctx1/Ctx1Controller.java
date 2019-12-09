package com.marcuschiu.example.applicationcontexthierarchytwo.ctx1;

import com.marcuschiu.example.applicationcontexthierarchytwo.parent.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctx1Controller {

    @Autowired
    private IHomeService homeService;

    @GetMapping("/controller")
    public String getGreeting() {
        return homeService.getGreeting();
    }
}