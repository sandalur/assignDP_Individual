import java.io.*;
public class ProduceProductMenu implements ProductMenu {

	public void showMenu() throws IOException {
		System.out.println("Factory Design Pattern Being implemented");
		System.out.println("Bridge Design pattern Being implemented");

		File file = new File(
				"TextFiles/ProductInfo.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String val;
		System.out.println("ProduceProductMenu: ");
		while ((val = br.readLine()) != null){
			String[] arrOfStr = val.split(":");
			String dbProduceName= arrOfStr[0];
			String dbProduceValue=arrOfStr[1];
			if(dbProduceName.equals("Produce"))
				System.out.println("Produce: " + dbProduceValue);
		}
	}
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
