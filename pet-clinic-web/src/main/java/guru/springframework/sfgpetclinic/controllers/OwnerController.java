package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Pets Owner List Controller
 * Created By:   ctoribio
 * Created Date: 8/9/2018 - 6:00 AM
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {
    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
