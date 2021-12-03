package Authentication;

public class UserModel {
    String username;
    String password;
    String email;
    String SecurityQuestion;
    String SecurityAnswer;


    public UserModel(String username, String password, String email, String securityQuestion, String securityAnswer) {
        this.username = username;
        this.password = password;
        this.email = email;
        SecurityQuestion = securityQuestion;
        SecurityAnswer = securityAnswer;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSecurityQuestion(String securityQuestion) {
        SecurityQuestion = securityQuestion;
    }

    public void setSecurityAnswer(String securityAnswer) {
        SecurityAnswer = securityAnswer;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSecurityQuestion() {
        return SecurityQuestion;
    }

    public String getSecurityAnswer() {
        return SecurityAnswer;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", SecurityQuestion='" + SecurityQuestion + '\'' +
                ", SecurityAnswer='" + SecurityAnswer + '\'' +
                '}';
    }

}
