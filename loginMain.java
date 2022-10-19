public class loginMain {

    public static void main(String[] args) {
        //creating an instance for id and passwords
        id_passwords id_and_passwords = new id_passwords();
        loginpage login= new loginpage(id_and_passwords.getLoginCred());


    }

}