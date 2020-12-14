package eksamengrpa.demo.Repository;

import eksamengrpa.demo.Model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ResultRepo {

    @Autowired
    JdbcTemplate template;

    public void saveResult(Result result){
        String sql = "INSERT INTO result (bruger_id, result_test_date, result_test_languange, result_score, result_stress_level) " +
                "VALUES(?,?,?,?,?)";
        template.update(sql,result.getBruger_id(),result.getResult_test_date(),result.getResult_test_languange(),result.getResult_score(),result.getResult_stress_level());
    }

    public Result findResultForUser(int bruger_id){
        String sql = "SELECT (result_id, bruger_id, result_test_date, result_test_languange, result_score, result_stress_level) FROM result r JOIN bruger b ON r.bruger_id = b.bruger_id WHERE r.bruger_id = ?;";
        RowMapper<Result> rowMapper = new BeanPropertyRowMapper<>(Result.class);
        return template.queryForObject(sql,rowMapper,bruger_id);

    }
}
