package eksamengrpa.demo.Controller;

import eksamengrpa.demo.Model.LoginAuthenticator;
import eksamengrpa.demo.Model.Question;
import eksamengrpa.demo.Model.Result;
import eksamengrpa.demo.Model.Test;
import eksamengrpa.demo.Service.QuestionService;
import eksamengrpa.demo.Service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import eksamengrpa.demo.Service.LoginAuthenticatorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.ArrayList;

@Controller
public class HomeController {

    @Autowired
    QuestionService questionService;

    @Autowired
    LoginAuthenticatorService loginService;

    @Autowired
    ResultService resultService;


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
        testResult.setResult_test_date(LocalDate.now().toString());
        testResult.calculateTestResult(test);
        testResult.setResult_test_languange("da");
        resultService.saveResult(testResult);
        model.addAttribute("result",testResult);
        return "/testResults";
    }


}
