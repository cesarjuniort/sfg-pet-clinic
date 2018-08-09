package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Index Controller
 * Created By:   ctoribio
 * Created Date: 8/8/2018 - 11:21 PM
 */

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
}
