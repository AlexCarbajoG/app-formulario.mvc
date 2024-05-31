package pe.edu.idat.app_formulario.mvc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroler {
    @GetMapping("/Home")
    public String Home(){
        return "Home";
    }



}
