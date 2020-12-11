package eksamengrpa.demo.Model;

public class Question {

    private int question_id;
    private String question_text;
    private int question_type;

    public Question() {
    }

    public Question(int id, String text, int type) {
        this.question_id = id;
        this.question_text = text;
        this.question_type = type;
    }

    public int getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(int question_type) {
        this.question_type = question_type;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + question_id +
                ", text='" + question_text + '\'' +
                '}';
    }
}
