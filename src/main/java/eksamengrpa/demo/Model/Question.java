package eksamengrpa.demo.Model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Question {
    @Autowired
    JdbcTemplate template;

    private int id;
    private String text;

    public Question() {
    }

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
