package com.javastriker.emekapetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"owners", "owners/owner", "owners.html"})
    public String getOwnersList(){
        return "owner/owners";
    }
}
