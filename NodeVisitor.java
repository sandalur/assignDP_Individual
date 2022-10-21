public class NodeVisitor {

	public void visitProduct(Product product) {
		System.out.println("visitor mode activated. Visiting products");

	}

	public void visitTrading(Trading trading) {
		System.out.println("Trading mode activated. ");

	}

	public void visitFacade(Facade facadeObject) {
		System.out.println("Facade object is being visited ");


	}

}
