package JavaExercises.Domain;

public class PasswordValidator {
    private String password;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
        if (password.length() != 8){
            System.out.println("Your password needs 8 or more caracters");
            return;
        }


    }
}
