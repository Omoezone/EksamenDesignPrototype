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

    private Boolean authenticate(LoginAuthenticator login){
        String sql = "SELECT email, password FROM login WHERE email = ? AND password = ?";
/*
        RowMapper<LoginAuthenticator> rowMapper = new BeanPropertyRowMapper<>(LoginAuthenticator.class);
*/
        return template.query(sql, login.getEmail(), login.getPassword());

    }

}
