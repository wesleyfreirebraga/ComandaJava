package face;
import javax.swing.*;
public class Front extends JFrame {
	  /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1, label2, label3, label4;
	private JButton imprimit;
	    private JTextField textField1, textField2, textField3, textField4;
	    private JPanel panel;


	public Front() {
		  super("Comanda");

	        // Create labels
	        label1 = new JLabel("contato:");
	        label2 = new JLabel("pedido:");
	        label3 = new JLabel("endereço:");
	        label4 = new JLabel("forma de pagamento:");
	        imprimit= new JButton("imprimir");

	        // Create text fields
	        textField1 = new JTextField(20);
	        textField2 = new JTextField(20);
	        textField3 = new JTextField(20);
	        textField4 = new JTextField(20);

	        // Create panel and add components
	        panel = new JPanel();
	        panel.add(label1);
	        panel.add(textField1);
	        panel.add(label2);
	        panel.add(textField2);
	        panel.add(label3);
	        panel.add(textField3);
	        panel.add(label4);
	        panel.add(textField4);
	        panel.add(imprimit);

	        // Set layout
	        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

	        // Add panel to the frame
	        add(panel);

	        // Set frame properties
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 200); // Set size
	        setLocationRelativeTo(null); // Center the frame
	        setVisible(true); // Make the frame visible
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new Front();
	            }
	        });
	}

		public JButton getImprimit() {
			return imprimit;
			
		}

		public void setImprimit(JButton imprimit) {
			this.imprimit = imprimit;
			
		}

}
