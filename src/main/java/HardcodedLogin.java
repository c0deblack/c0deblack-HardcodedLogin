import java.util.HashMap;
import java.util.Map;

public class HardcodedLogin {

    final private Map<String, String> auth_table = new HashMap<String,String>();

    HardcodedLogin()
    {
        this.auth_table.put("admin", "qwerty");
        this.auth_table.put("user", "password");
    }
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password){
        if (this.auth_table.containsKey(username))
        {
            if (this.auth_table.get(username) == password) return true;
        }
        return false;
    }
}
