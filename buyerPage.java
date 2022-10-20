
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;




public class buyerPage {

    private JFrame frame;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    buyerPage window = new buyerPage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    /**
     * Create the application.
     */
    public buyerPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel meatLabel = new JLabel("Select the Meat Product to buy");
        meatLabel.setBounds(77, 27, 321, 19);
        meatLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.getContentPane().add(meatLabel);
        String[] meatMenu = { "Beef", "Pork", "Mutton"};

        JComboBox<String> comboBox = new JComboBox<String>(meatMenu);
        comboBox.setBounds(105, 57, 161, 22);
        frame.getContentPane().add(comboBox);

        JLabel produceLabel = new JLabel("Select Produce Product to buy");
        produceLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        produceLabel.setBounds(85, 102, 246, 27);
        frame.getContentPane().add(produceLabel);
        String[] produceMenu = { "tomato", "onion"};

        JComboBox<String> comboBox_1 = new JComboBox<String>(produceMenu);
        comboBox_1.setBounds(105, 140, 161, 22);
        frame.getContentPane().add(comboBox_1);

        JButton addCart = new JButton("Add to Cart");
        addCart.setBounds(139, 205, 89, 30);
        frame.getContentPane().add(addCart);
        frame.setVisible(true);
    }

}
