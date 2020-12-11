package eksamengrpa.demo.Controller;

import eksamengrpa.demo.Model.LoginAuthenticator;
import eksamengrpa.demo.Model.Question;
import eksamengrpa.demo.Model.Result;
import eksamengrpa.demo.Model.Test;
import eksamengrpa.demo.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import eksamengrpa.demo.Service.LoginAuthenticatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @Autowired
    QuestionService questionService;

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
    @GetMapping("/takeTest")
    public String takeTest(Model model){
        ArrayList<Question> allQuestions = questionService.fetchAll();
        Test test = new Test(allQuestions);
        int i = 0;
        for (Question q: test.getQuestions()) {
            System.out.println(test.getQuestions().get(i));
            i++;
        }
        model.addAttribute("test",test);

        return "/takeTest";
    }

    @PostMapping("/submitTest")
    public String submitTest(@ModelAttribute Test test, Model model){
        Result testResult = new Result();
        testResult.calculateTestResult(test);
        System.out.println(testResult.getLevel());
        model.addAttribute("result",testResult);
        return "/testResults";
    }


}
