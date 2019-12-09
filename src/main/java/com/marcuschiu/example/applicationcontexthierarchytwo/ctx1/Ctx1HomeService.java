package com.marcuschiu.example.applicationcontexthierarchytwo.ctx1;

import com.marcuschiu.example.applicationcontexthierarchytwo.parent.IHomeService;
import org.springframework.stereotype.Service;

@Service
public class Ctx1HomeService implements IHomeService {
    public String getGreeting() {
        return "This is Ctx1HomeService.java";
    }
}