package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Vet Controller.
 * Created By:   ctoribio
 * Created Date: 8/9/2018 - 5:51 AM
 */
@Controller
public class VetController {

    VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(Model model){

        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
