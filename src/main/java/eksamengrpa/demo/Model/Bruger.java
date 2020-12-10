package eksamengrpa.demo.Model;

public class Bruger extends SuperBruger {
    private long telephone;
    private String gender; 
    private int age;
    private String country;
    private String department;
    private String funktion;
    private String education;

    public Bruger(String email, String firstName, String lastName, long telephone, String gender,
                  int age, String country, String department, String funktion, String education) {
        super(email, firstName, lastName);
        this.telephone = telephone;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.department = department;
        this.funktion = funktion;
        this.education = education;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFunktion() {
        return funktion;
    }

    public void setFunktion(String funktion) {
        this.funktion = funktion;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "telephone=" + telephone +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", department='" + department + '\'' +
                ", funktion='" + funktion + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
