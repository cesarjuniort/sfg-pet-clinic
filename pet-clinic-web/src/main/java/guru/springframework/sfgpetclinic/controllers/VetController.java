package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Vet Controller.
 * Created By:   ctoribio
 * Created Date: 8/9/2018 - 5:51 AM
 */
@Controller
public class VetController {
    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
