package eksamengrpa.demo.Model;

public class LoginAuthenticator {

    private String email;
    private String password;
    private String type;

    public LoginAuthenticator(String email, String password, String type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public LoginAuthenticator() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LoginAuthenticator{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
