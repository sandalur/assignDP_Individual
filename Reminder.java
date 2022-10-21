public class Reminder {
    private final NodeVisitor nodeVisitor;
    public Reminder(){
        nodeVisitor = new ReminderVisitor(); // Implements the visitor patter
        System.out.println("Visitor Pattern is being implemented");
    }
    public void visitFacade(Facade facade) {

        nodeVisitor.visitFacade(facade);
    }

    @SuppressWarnings("unused")
    public void visitProduct(Product product) {

        product.accept(nodeVisitor);
    }

    @SuppressWarnings("unused")
    public void visitTrading(Trading trading) {

        trading.accept(nodeVisitor);
    }
}