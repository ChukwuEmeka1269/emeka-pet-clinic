package com.javastriker.emekapetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/all-vets", "list-of-vets"})
    public String getVets(){
        return "vet/vets";
    }
}
