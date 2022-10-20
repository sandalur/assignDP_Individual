import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class sellerPage {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    sellerPage window = new sellerPage();
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
    public sellerPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel meatLabel = new JLabel("Select the Meat Product to sell");
        meatLabel.setBounds(77, 27, 321, 19);
        meatLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.getContentPane().add(meatLabel);
        String[] meatMenu = { "Beef", "Pork", "Mutton"};

        JComboBox<String> comboBox = new JComboBox<String>(meatMenu);
        comboBox.setBounds(105, 57, 161, 22);
        frame.getContentPane().add(comboBox);

        JLabel produceLabel = new JLabel("Select Produce Product to sell");
        produceLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        produceLabel.setBounds(85, 102, 246, 27);
        frame.getContentPane().add(produceLabel);
        String[] produceMenu = { "tomato", "onion"};

        JComboBox<String> comboBox_1 = new JComboBox<String>(produceMenu);
        comboBox_1.setBounds(105, 140, 161, 22);
        frame.getContentPane().add(comboBox_1);

        JButton submit = new JButton("Submit");
        submit.setBounds(139, 205, 89, 30);
        frame.getContentPane().add(submit);
        frame.setVisible(true);
    }

}