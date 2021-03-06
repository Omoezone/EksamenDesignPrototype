package eksamengrpa.demo.Repository;

import eksamengrpa.demo.Model.LoginAuthenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LoginAuthenticatorRepo {

    @Autowired
    JdbcTemplate template;

    public Boolean authenticate(LoginAuthenticator login){
        //midlertidig løsning til at godkende et login
        try{
            String sql = "SELECT login_email, login_password FROM login WHERE login_email = ? AND login_password = ?";
            RowMapper<LoginAuthenticator> rowMapper = new BeanPropertyRowMapper<>(LoginAuthenticator.class);
            template.queryForObject(sql,rowMapper,login.getEmail(),login.getPassword());
            return true;
        }catch (Exception exception){
            System.out.println("It didn't work");
            return false;
        }
    }
}
