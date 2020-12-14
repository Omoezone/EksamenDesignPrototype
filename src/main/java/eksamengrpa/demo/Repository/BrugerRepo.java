package eksamengrpa.demo.Repository;

import eksamengrpa.demo.Model.Bruger;
import eksamengrpa.demo.Model.LoginAuthenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BrugerRepo {

    @Autowired
    JdbcTemplate template;
    // Tror det er fordi vi ikke har lavet entity og id annotationer, så kan den ikke finde ud af det, men ikkke sikker og super bruger drillede da jeg prøvede det .c
    public List<Bruger> findByEmail(LoginAuthenticator l){
        String sql = "SELECT bruger_firstName AS firstName, bruger_lastName AS lastName, bruger_email AS email, bruger_telephone AS telephone, bruger_gender AS gender, bruger_age AS age, bruger_country AS country FROM bruger WHERE bruger_email = ?";
        RowMapper<Bruger> rowMapper = new BeanPropertyRowMapper<>(Bruger.class);
        return template.query(sql, rowMapper, l.getEmail());
    }

}

