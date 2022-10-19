import java.util.HashMap;
public class id_passwords {

    //create a hash map to store the ids and passwords as they store key value pairs

    HashMap<String,String> loginCred= new HashMap<String,String>();
    id_passwords(){
        loginCred.put("tutu","1111");
        loginCred.put("mimi","2222");
        loginCred.put("pepe","3333");

    }

    protected HashMap getLoginCred() {
        return loginCred;
    }

}