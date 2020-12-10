package eksamengrpa.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class Test {

    private int id;
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<Integer> answers = new ArrayList<>();

    public Test() {
    }

    public Test(int id, ArrayList<Question> questions, ArrayList<Integer> answers) {
        this.id = id;
        this.questions = questions;
        this.answers = answers;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Integer> answers) {
        this.answers = answers;
    }
}
