package eksamengrpa.demo.Service;

import eksamengrpa.demo.Model.Bruger;
import eksamengrpa.demo.Model.LoginAuthenticator;
import eksamengrpa.demo.Repository.BrugerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrugerService {

    @Autowired
    BrugerRepo brugerRepo;

    public List<Bruger> findByEmail(LoginAuthenticator l){
        return brugerRepo.findByEmail(l);
    }
}
