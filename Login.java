import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Login {
    public int type_of_user; //buyer-0  seller-1
    private final Scanner input = new Scanner(System.in);
    private boolean auth(String username, String password){
        File fileReader;
        if(type_of_user == 1){
            fileReader = new File("TextFiles/SellerInfo.txt");
        }
        else {
            fileReader = new File("TextFiles/BuyerInfo.txt");
        }
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(fileReader));
            String lineReader; // read each line from the file
            while ((lineReader = buffer.readLine()) != null)
            {
                String[] userCredentials = lineReader.split(":",2);
                if(username.equals(userCredentials[0])) {
                    if(password.equals(userCredentials[1])) {
                        return true;
                    }
                    break;
                }
            }
        } catch (Exception exception) { // Exceptions while file reading
            System.out.println("An Exception occurred");
            exception.printStackTrace();
        }
        System.out.println("Invalid Credentials. try again!");
        return false;
    }
    protected UserInfoitem displayLoginForm() { // Displays the login form
        switch (type_of_user) {
            case 1 -> System.out.println("Seller Login Form");
            case 0 -> System.out.println("Buyer Login Form");
        }

        UserInfoitem userObject = giveCredentials(); // takes the credentials from the user
        if(userObject == null){ // if incorrect user then null object will be returned
            System.out.println("Invalid");
            return null;
        }
        System.out.println("Login successful " + userObject.getUserName()); // If correct user then login successful
        return userObject;
    }
    public int userSelection() {
        boolean validInput = false; // initializing valid input flag

        while (!validInput) { // runs till we don't get a valid input
            System.out.println("select from the following : \n0 : Buyer\n1 : Seller");
            type_of_user = input.nextInt();
            if (type_of_user == 0 || type_of_user == 1) {
                validInput = true;
            }
        }
        return type_of_user;
    }
    private UserInfoitem giveCredentials() { // Takes the credentials from the user
        while(true){
            System.out.println("Please enter your username : ");
            String scannedUsername = input.next();
            System.out.println("Please enter your password : ");
            String scannedPassword = input.next();
            if(auth(scannedUsername, scannedPassword)){
                return new UserInfoitem(type_of_user, scannedUsername, scannedPassword);
            }
        }
    }


}
