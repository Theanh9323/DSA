package com.example.JobApp;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class JobController {
    @GetMapping({"/","home"})
    public String home() {
        return "home";
    }
    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {


        return "success";
    }
}
