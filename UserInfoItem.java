public class UserInfoItem {
    private final int userType;
    private final String username;
    private final String password;

    // Making the object
    public UserInfoItem(int userType, String username, String password){
        this.userType = userType;
        this.username = username;
        this.password = password;
    }

    public int getUserType(){

        return userType;
    }
    public String getUserName() {

        return username;
    } // Gets the username

    // Suppressing the warning because this function is never used
    @SuppressWarnings(value = "unused")
    public String getPassword() {

        return password;
    }
}


