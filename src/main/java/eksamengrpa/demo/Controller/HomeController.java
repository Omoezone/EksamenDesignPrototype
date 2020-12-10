package eksamengrpa.demo.Controller;

import eksamengrpa.demo.Model.LoginAuthenticator;
import eksamengrpa.demo.Service.LoginAuthenticatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    LoginAuthenticatorService loginService;


    @GetMapping("/")
    public String index(){
        return "frontPage";
    }

    @PostMapping("/frontPage")
    public String login(@ModelAttribute LoginAuthenticator login){
        System.out.println(login);
        Boolean test = loginService.authenticate(login);
        System.out.println(test);
        if(test){
            return "/brugerside";
        }else
            return "redirect:/";
    }

}
