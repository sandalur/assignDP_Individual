import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ClassProductList {
	List<Product> productList; // List of objects type of Product
	public ClassProductList(){
		productList = new ArrayList<>();
	} // initializing the list

	public void readProductList(){
		try{
			File file = new File("TextFiles/ProductInfo.txt"); // Reading the list of products from the given file
			BufferedReader bufferReader= new BufferedReader(new FileReader(file));
		}
		catch (Exception exception){
			exception.printStackTrace();
		}
	}


	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private ProductIterator productIterator;

	public void accept(NodeVisitor visitor) {

	}

}
