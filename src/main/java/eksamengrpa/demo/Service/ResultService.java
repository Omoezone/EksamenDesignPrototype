package eksamengrpa.demo.Service;

import eksamengrpa.demo.Model.Result;
import eksamengrpa.demo.Repository.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    ResultRepo resultRepo;

    public void saveResult(Result result){
        resultRepo.saveResult(result);
    }

    public List<Result> findResultForUser(int bruger_id){
        return resultRepo.findResultForUser(bruger_id);
    }

}
