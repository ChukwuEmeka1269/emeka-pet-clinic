package com.javastriker.emekapetclinic.controllers;

import com.javastriker.emekapetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/all-vets", "list-of-vets"})
    public String getVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vet/vets";
    }
}
