package security;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class WindowUI {

	private JFrame frame;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowUI window = new WindowUI();
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
	public WindowUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);

		JLabel lblLabel = new JLabel("" + SecurityUI.counter);
		lblLabel.setBounds(405, 242, 69, 20);
		layeredPane.add(lblLabel);
		
		JButton button = new JButton("< -1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblLabel.setText("" + SecurityUI.minus1());
			}
		});
		button.setBounds(245, 238, 115, 29);
		layeredPane.add(button);
		
		JButton button_1 = new JButton("+ 1 >");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		button_1.setBounds(502, 238, 115, 29);
		layeredPane.add(button_1);
		
		Panel panel = new Panel();
		panel.setBounds(310, 109, 196, 86);
		layeredPane.add(panel);
		
		JLabel lblLabel_1 = new JLabel("Label2");
		panel.add(lblLabel_1);
	}
}
