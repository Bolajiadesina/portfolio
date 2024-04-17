package com.bolaji.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolaji.portfolio.entity.PersonalDetails;

@Controller
@RequestMapping(value = "/bolaji")
public class PortFolioController {

    
    private PersonalDetails personalDetails;

    public void portFolioController(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
       
    }



        @GetMapping(value = "/home")
        public String homeController(Model model){
            System.out.println("Getting here");
            model.addAttribute("firstName", personalDetails.getFirstName());
            model.addAttribute("lastName", personalDetails.getLastName());
            model.addAttribute("address", personalDetails.getAddress());
            model.addAttribute("experience", personalDetails.getExperience());
            model.addAttribute("profession", personalDetails.getProfession());

            
            
            return "bolaji";
        }



    
}
