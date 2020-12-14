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
import org.springframework.web.bind.annotation.PathVariable;
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
            Bruger bruger = brugerService.findByEmail(login);
            model.addAttribute("bruger", bruger);
            List<Result> resultList = resultService.findResultForUser(bruger.getBruger_id());
            model.addAttribute("results", resultList);
            return "/brugerside";
        }else
            return "redirect:/";
    }
    @GetMapping("/takeTest/{bruger_id}")
    public String takeTest(@PathVariable("bruger_id") int id, Model model){
        ArrayList<Question> allQuestions = questionService.fetchAll();
        Bruger _bruger = brugerService.findById(id);
        Test test = new Test(allQuestions);
        model.addAttribute("bruger",_bruger);
        model.addAttribute("test",test);
        return "/takeTest";
    }

    @PostMapping("/submitTest/{bruger_id}")
    public String submitTest(@ModelAttribute Test test, @PathVariable("bruger_id") int id, Model model){
        Bruger _bruger = brugerService.findById(id);
        Result testResult = new Result(_bruger.getBruger_id());
        testResult.setResult_test_date(LocalDate.now().toString());
        testResult.calculateTestResult(test);
        testResult.setResult_test_languange("da");
        resultService.saveResult(testResult);
        model.addAttribute("result",testResult);
        model.addAttribute("bruger",_bruger);
        return "/testResults";
    }

    @GetMapping("/returnToBruger/{bruger_id}")
    public String returnToBruger(@PathVariable("bruger_id") int id, Model model){
        Bruger bruger = brugerService.findById(id);
        System.out.println(bruger);
        model.addAttribute(bruger);
        return "/brugerside";
    }




}
