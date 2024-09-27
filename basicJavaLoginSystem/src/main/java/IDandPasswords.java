import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords(){

        logininfo.put("USERNAME", "PASSWORD");
        logininfo.put("USERNAME", "PASSWORD");
        logininfo.put("USERNAME", "PASSWORD");
        logininfo.put("USERNAME", "PASSWORD");
//you can change the usernames and passwords, and it shouldnt affect the code.
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
