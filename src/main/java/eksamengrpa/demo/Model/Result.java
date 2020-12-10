package eksamengrpa.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Result {

    private int id;
    private int calculatedResult;

    public Result() {
    }

    public Result(int id, int calculatedResult) {
        this.id = id;
        this.calculatedResult = calculatedResult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalculatedResult() {
        return calculatedResult;
    }

    public void setCalculatedResult(int calculatedResult) {
        this.calculatedResult = calculatedResult;
    }
}
