

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollBar;

public class registerform extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerform frame = new registerform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registerform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistrationForm = new JLabel("Registration Form");
		lblRegistrationForm.setBounds(61, 13, 157, 23);
		contentPane.add(lblRegistrationForm);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(35, 58, 56, 16);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(103, 49, 167, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 87, 167, 34);
		contentPane.add(textField_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(35, 96, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(35, 145, 56, 16);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(103, 139, 64, 25);
		contentPane.add(rdbtnMale);
		
		JRadioButton radioButton = new JRadioButton("Male");
		radioButton.setBounds(171, 139, 64, 25);
		contentPane.add(radioButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 175, 167, 34);
		contentPane.add(textField_2);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(35, 184, 56, 16);
		contentPane.add(lblAddress);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(103, 215, 167, 34);
		contentPane.add(textField_3);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(35, 224, 56, 16);
		contentPane.add(lblContact);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(35, 277, 107, 34);
		contentPane.add(btnExit);
		
		JButton button = new JButton("Exit");
		button.setBounds(35, 317, 107, 34);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(150, 277, 120, 34);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(150, 317, 120, 34);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(87, 356, 120, 34);
		contentPane.add(button_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(282, 13, 559, 377);
		contentPane.add(scrollBar);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(423, 403, 226, 25);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(282, 23, 559, 367);
		contentPane.add(panel);
	}
}
