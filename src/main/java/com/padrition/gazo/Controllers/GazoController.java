package com.padrition.gazo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GazoController {

    @GetMapping("/")
    public String getIndex (){
        return "index";
    }

}