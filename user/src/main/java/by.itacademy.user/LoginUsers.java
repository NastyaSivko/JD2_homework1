package by.itacademy.user;

import java.util.HashMap;
import java.util.Map;

public class LoginUsers {

    private String name;
    private String login;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static LoginUsers findUser(String login){
        if(users.get(login) != null) {
            LoginUsers userAuth = new LoginUsers((String)usersName.get(login), login, (String)users.get(login));
        return userAuth;
        } else {
            return null;}
    }

    public LoginUsers( String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public static boolean addUser(Users user){
        boolean result = false;
        if ((!users.containsKey(user.getLogin()))&&(user.getPassword()!= null)&&(!"".equals(user.getPassword()))){
            users.put(user.getLogin(),user.getPassword());
            usersName.put(user.getLogin(),user.getName());
            result = true;
        }
        return result;
    }

    private static Map users = new HashMap();
    private static Map usersName = new HashMap();
}
