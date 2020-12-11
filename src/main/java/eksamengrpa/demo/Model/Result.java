package eksamengrpa.demo.Model;

public class Result {

    private int result_id;
    private int calculatedResult;
    private int level;
    private String levelQuote;

    public Result() {
    }

    public Result(int id, int calculatedResult) {
        this.result_id = id;
        this.calculatedResult = calculatedResult;
    }

    public int getResult_id() {
        return result_id;
    }

    public void setResult_id(int result_id) {
        this.result_id = result_id;
    }

    public int getCalculatedResult() {
        return calculatedResult;
    }

    public void setCalculatedResult(int calculatedResult) {
        this.calculatedResult = calculatedResult;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevelQuote() {
        return levelQuote;
    }

    public void setLevelQuote(String levelQuote) {
        this.levelQuote = levelQuote;
    }

    public void calculateTestResult(Test test){

        for(int x = 0; x < test.getAnswers().size(); x++){
            this.calculatedResult +=test.getAnswers().get(x);
        }

        if(this.calculatedResult <= 30){
            this.level = 1;
            this.levelQuote = "Du trives godt og har en god blance mellem krav of ressourcer.";
        }else if(this.calculatedResult >= 31 && this.calculatedResult <= 33){
            this.level = 2;
            this.levelQuote = "Du trives godt og har en god blance mellem krav of ressourcer.";
        }else if(this.calculatedResult >= 34 && this.calculatedResult <= 36){
            this.level = 3;
            this.levelQuote = "Du trives og har balance mellem krav og ressourcer";
        }else if(this.calculatedResult >= 37 && this.calculatedResult <= 40){
            this.level = 4;
            this.levelQuote = "Ekstra udfordringer i en periode";
        }else if(this.calculatedResult >= 41 && this.calculatedResult <= 45){
            this.level = 5;
            this.levelQuote = "Overbelsatning. Fokus: Ekstra søvn, planlæg fri/ferie/ro.";
        }else if(this.calculatedResult >= 46 && this.calculatedResult <= 56){
            this.level = 6;
            this.levelQuote = "Massiv overbelastning. Fokus: Søvn, ro, prioriterer hårdt i krav/opgaver";
        }else if(this.calculatedResult >= 57 && this.calculatedResult <= 67){
            this.level = 7;
            this.levelQuote = "Alvorlig stress. Fokus: Læge, søvn, ingen krav, professionel hjælp.";
        }else if(this.calculatedResult >= 68 && this.calculatedResult <= 78){
            this.level = 8;
            this.levelQuote = "Alvorlig stress. Fokus: Læge, søvn, ingen krav, professionel hjælp.";
        }else if(this.calculatedResult >= 79){
            this.level = 9;
            this.levelQuote = "Meget sjælden!";
        }else{
            this.level = 0;
            System.out.println("Something went wrong ");
        }
    }
}
