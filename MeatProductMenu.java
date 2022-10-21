import java.io.*;
public class MeatProductMenu implements ProductMenu {

	public void showMenu() throws IOException {
		System.out.println("Factory Design Pattern Being implemented");
		System.out.println("Bridge Design pattern Being implemented");
		File file = new File(
				"Textfiles/ProductInfo.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String val;
		System.out.println("MeatProductMenu: ");
		while ((val = br.readLine()) != null){
			String[] arrOfStr = val.split(":");
			String dbMeatName= arrOfStr[0];
			String dbMeatValue=arrOfStr[1];
			if(dbMeatName.equals("Meat"))
				System.out.println("Meat: " + dbMeatValue);
		}}
	public void showAddButton() {
		System.out.println("Add Product");

	}

	public void showRadioButton() {
		System.out.println("Radio Button");


	}

	public void showLabels() {
		System.out.println("Show Labels");


	}

	public void showViewButton() {
		System.out.println("View Button");

	}

	public void showComboxes() {
		System.out.println("Comboxes");

	}
}
