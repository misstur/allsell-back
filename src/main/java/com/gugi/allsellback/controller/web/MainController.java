package com.gugi.allsellback.controller.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class MainController {

    public MainController() {

    }

    @GetMapping("/")
    public String index(Model model) {
        Map<String, Object> rtn = new HashMap<>();
        long currentTime = Instant.now().getEpochSecond();

        model.addAttribute("currentTime", currentTime);

        return "index";
    }
}
