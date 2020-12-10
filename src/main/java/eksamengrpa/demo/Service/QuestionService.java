package eksamengrpa.demo.Service;

import eksamengrpa.demo.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

}
