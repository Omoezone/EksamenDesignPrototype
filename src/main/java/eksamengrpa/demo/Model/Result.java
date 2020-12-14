package eksamengrpa.demo.Model;

public class Result {

    private int result_id;
    private int result_score;
    private int result_stress_level;
    private String levelQuote;
    private int bruger_id;
    private String result_test_date;
    private String result_test_languange;



    public Result() {
    }

    public Result(int bruger_id) {
        this.bruger_id = bruger_id;
    }

    public Result(int id, int calculatedResult) {
        this.result_id = id;
        this.result_score = calculatedResult;
    }

    public String getResult_test_date() {
        return result_test_date;
    }

    public void setResult_test_date(String result_test_date) {
        this.result_test_date = result_test_date;
    }

    public String getResult_test_languange() {
        return result_test_languange;
    }

    public void setResult_test_languange(String result_test_languange) {
        this.result_test_languange = result_test_languange;
    }

    public int getBruger_id() {
        return bruger_id;
    }

    public void setBruger_id(int bruger_id) {
        this.bruger_id = bruger_id;
    }

    public int getResult_id() {
        return result_id;
    }

    public void setResult_id(int result_id) {
        this.result_id = result_id;
    }

    public int getResult_score() {
        return result_score;
    }

    public void setResult_score(int result_score) {
        this.result_score = result_score;
    }

    public int getResult_stress_level() {
        return result_stress_level;
    }

    public void setResult_stress_level(int result_stress_level) {
        this.result_stress_level = result_stress_level;
    }

    public String getLevelQuote() {
        return levelQuote;
    }

    public void setLevelQuote(String levelQuote) {
        this.levelQuote = levelQuote;
    }

    public void calculateTestResult(Test test){

        for(int x = 0; x < test.getAnswers().size(); x++){
            this.result_score +=test.getAnswers().get(x);
        }

        if(this.result_score <= 30){
            this.result_stress_level = 1;
            this.levelQuote = "Du trives godt og har en god blance mellem krav of ressourcer.";
        }else if(this.result_score >= 31 && this.result_score <= 33){
            this.result_stress_level = 2;
            this.levelQuote = "Du trives godt og har en god blance mellem krav of ressourcer.";
        }else if(this.result_score >= 34 && this.result_score <= 36){
            this.result_stress_level = 3;
            this.levelQuote = "Du trives og har balance mellem krav og ressourcer";
        }else if(this.result_score >= 37 && this.result_score <= 40){
            this.result_stress_level = 4;
            this.levelQuote = "Ekstra udfordringer i en periode";
        }else if(this.result_score >= 41 && this.result_score <= 45){
            this.result_stress_level = 5;
            this.levelQuote = "Overbelsatning. Fokus: Ekstra søvn, planlæg fri/ferie/ro.";
        }else if(this.result_score >= 46 && this.result_score <= 56){
            this.result_stress_level = 6;
            this.levelQuote = "Massiv overbelastning. Fokus: Søvn, ro, prioriterer hårdt i krav/opgaver";
        }else if(this.result_score >= 57 && this.result_score <= 67){
            this.result_stress_level = 7;
            this.levelQuote = "Alvorlig stress. Fokus: Læge, søvn, ingen krav, professionel hjælp.";
        }else if(this.result_score >= 68 && this.result_score <= 78){
            this.result_stress_level = 8;
            this.levelQuote = "Alvorlig stress. Fokus: Læge, søvn, ingen krav, professionel hjælp.";
        }else if(this.result_score >= 79){
            this.result_stress_level = 9;
            this.levelQuote = "Meget sjælden!";
        }else{
            this.result_stress_level = 0;
            System.out.println("Something went wrong ");
        }
    }
}
