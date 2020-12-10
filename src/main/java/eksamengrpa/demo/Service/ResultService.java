package eksamengrpa.demo.Service;

import eksamengrpa.demo.Repository.ResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    @Autowired
    ResultRepo resultRepo;

}
