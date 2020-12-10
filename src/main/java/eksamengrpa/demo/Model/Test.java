package eksamengrpa.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class Test {
    @Autowired
    JdbcTemplate template;

    private ArrayList<Question> questions = new ArrayList<>();


}
