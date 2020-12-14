package eksamengrpa.demo.Controller;

import eksamengrpa.demo.Model.*;
import eksamengrpa.demo.Repository.BrugerRepo;
import eksamengrpa.demo.Service.BrugerService;
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
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    QuestionService questionService;

    @Autowired
    LoginAuthenticatorService loginService;

    @Autowired
    ResultService resultService;

    @Autowired
    BrugerService brugerService;


    @GetMapping("/")
    public String index(){
        return "frontPage";
    }

    @PostMapping("/frontPage")
    public String login(@ModelAttribute LoginAuthenticator login, Model model){
        System.out.println(login);
        Boolean test = loginService.authenticate(login);
        System.out.println(test);
        if(test){
            List<Bruger> brugerList = brugerService.findByEmail(login);
            model.addAttribute("brugere", brugerList);
           /* brugerService.findByEmail(login);*/
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
