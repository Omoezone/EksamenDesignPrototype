package eksamengrpa.demo.Service;

import eksamengrpa.demo.Model.Question;
import eksamengrpa.demo.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public ArrayList<Question> fetchAll(){
        return questionRepo.fetchAll();
    }
}
