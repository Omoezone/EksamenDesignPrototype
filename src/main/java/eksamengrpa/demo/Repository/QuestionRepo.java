package eksamengrpa.demo.Repository;

import eksamengrpa.demo.Model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionRepo {
    @Autowired
    JdbcTemplate template;

    public ArrayList<Question> fetchAll(){
        String sql = "SELECT * FROM question";
        RowMapper<Question> rowMapper = new BeanPropertyRowMapper<>(Question.class);
        return (ArrayList<Question>)template.query(sql,rowMapper);
    }

}
