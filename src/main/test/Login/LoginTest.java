package Login;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    Login login;

    @BeforeEach
    void setUp() {
        login = new Login();
    }

    @AfterEach
    void tearDown() {
        login = null;
    }

    @Test
    void testValidate() { //tests the previously mapped logins and passwords match
        assertTrue(login.validate("20106969@wit.ie", "12345"));
        assertTrue(login.validate("20104200@wit.ie", "corneliaSt23"));
        assertTrue(login.validate("20100904@wit.ie", "taylorlaunterlover098"));
        assertTrue(login.validate("20105320@wit.ie", "runnningoutofideas"));
    }

    @Test
    void testInvalid() { //tests that if the passswords dont match, it is invalid
        assertFalse(login.validate("20106969@wit.ie", "wrongpassword"));
        assertFalse(login.validate("20104200@wit.ie", "incorrectpass"));
        assertFalse(login.validate("20100904@wit.ie", "wrongpass"));
        assertFalse(login.validate("20105320@wit.ie", "invalidpassword"));
    }

    @Test
    void testNonexistentLogin() {
        assertFalse(login.validate("fakemail@wit.ie", "notreal")); //tests for a login that doesnt exist
    }


}

