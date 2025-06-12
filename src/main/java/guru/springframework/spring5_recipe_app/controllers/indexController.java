package guru.springframework.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){
        System.out.println("Some message to say.... 1234ss 444455555");
        return "index";
    }


}
