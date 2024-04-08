package Login;
import java.util.HashMap;
import java.util.Map;
public class Login {

    static Map<String, String> emailToPassword = new HashMap<String, String>(); //hash map that maps two strings to each other

    Login(){
        emailToPassword.put("20106969@wit.ie", "12345"); //maps 20106969@wit.ie to 12345 and so on
        emailToPassword.put("20104200@wit.ie", "corneliaSt23");
        emailToPassword.put("20100904@wit.ie", "taylorlaunterlover098");
        emailToPassword.put("20105320@wit.ie", "runnningoutofideas");
    }

    public boolean validate(String email, String password){
        return password == emailToPassword.get(email); //retrieves the corresponding password to the email
    }

}
