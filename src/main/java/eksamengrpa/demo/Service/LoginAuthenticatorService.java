package eksamengrpa.demo.Service;

import eksamengrpa.demo.Model.LoginAuthenticator;
import eksamengrpa.demo.Repository.LoginAuthenticatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticatorService {

    @Autowired
    LoginAuthenticatorRepo loginAuthenticatorRepo;

    public Boolean authenticate(LoginAuthenticator login){
        return loginAuthenticatorRepo.authenticate(login);
    }
}
