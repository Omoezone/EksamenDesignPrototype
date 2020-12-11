package eksamengrpa.demo.Controller;

import eksamengrpa.demo.Model.Question;
import eksamengrpa.demo.Model.Test;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "frontPage";
    }

    @GetMapping("/takeTest")
    public String takeTest(Model model){
        Question question = new Question();
        question.setText("Har du tit ondt i maven?");
        Question question1 = new Question();
        question1.setText("Har du tit ondt i hovedet?");
        Question question2 = new Question();
        question2.setText("Har du svært ved at sove?");
        Question question3 = new Question();
        question3.setText("Er du tit udmattet?");

        Test test = new Test();
        test.getQuestions().add(question);
        test.getQuestions().add(question1);
        test.getQuestions().add(question2);
        test.getQuestions().add(question3);
        int i = 0;
        for (Question q: test.getQuestions()) {
            System.out.println(test.getQuestions().get(i));
            i++;
        }
        model.addAttribute("test",test);
        return "/takeTest";
    }

    @PostMapping("/submitTest")
    public String submitTest(@ModelAttribute Test test){
        int i = 0;
        for (Integer x: test.getAnswers()) {
            System.out.println(test.getAnswers().get(i));
            i++;
        }
        return "redirect:/";
    }


}
