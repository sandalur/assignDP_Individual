import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
public class Facade {
	private final Scanner input = new Scanner(System.in);
	public int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	private UserInfoitem userInfoitem;

	public Facade(){
		System.out.println("Facade pattern is being implemented");
		facadeInitialization(); // Initializing the method

	}
	private void facadeInitialization(){
		System.out.println("FacadeInitialization Method has been called !!\n");
		boolean isLoginSuccessful = login(); // calls the login method
		if(!isLoginSuccessful){
			System.out.println("Login Unsuccessful\n");
			System.exit(0);
		}
		else {

			System.out.println("Enter 1 for MeatProductMenu: \nEnter 2 for ProduceProductMenu: \nEnter 3 to add products \nEnter 4 to view products");
			String selectedMenu = input.next();
			if (selectedMenu.equals("1")) {
				MeatProductMenu meat = new MeatProductMenu();
				try {
					meat.showMenu();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			} else if (selectedMenu.equals("2")) {
				ProduceProductMenu produce = new ProduceProductMenu();
				try {
					produce.showMenu();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else if (selectedMenu.equals("3")) {
				System.out.println("Do you want to add the products ");
				String ptype = input.next();
				System.out.println("Enter the product name:");
				String pname = input.next();
				Product pr = new Product();
				try {
					pr.addProduct(ptype, pname);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

		}
	}

	public boolean login() {
		Login loginObject = new Login(); // Creates the loginObject
		set_type_of_user(loginObject.userSelection()); // Sets the type of user selected from the input
		UserInfoitem user = loginObject.displayLoginForm(); // User gets created
		if(user == null){
			return false;
		}
		createUser(user);
		return true;
	}
	public void set_type_of_user(int type_of_user){

		this.userType = type_of_user;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() { // Visits the facade class
		Reminder reminder = new Reminder();
		reminder.visitFacade(this);
	}

	public void createUser(UserInfoitem userinfoitem) {

	}

	public void createProductList() {


	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
