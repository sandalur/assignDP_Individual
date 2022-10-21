public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("Visiting Product class");

	}

	public void visitTrading(Trading trading) {
		System.out.println("Visiting trading class");

	}

	public void visitFacade(Facade facade) {
		System.out.println("Visiting Facade class");

	}

}
