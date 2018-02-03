package gui.patientOptions;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.*;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fill_prescription extends JPanel {

	/**
	 * Create the panel.
	 */
	public fill_prescription() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblYourPrescriptions = new JLabel("Your Prescriptions");
		springLayout.putConstraint(SpringLayout.SOUTH, lblYourPrescriptions, -782, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblYourPrescriptions, -468, SpringLayout.EAST, this);
		add(lblYourPrescriptions);
		
		JButton btnBack = new JButton("Back");
		springLayout.putConstraint(SpringLayout.NORTH, lblYourPrescriptions, 63, SpringLayout.SOUTH, btnBack);
		springLayout.putConstraint(SpringLayout.WEST, lblYourPrescriptions, 0, SpringLayout.WEST, btnBack);
		springLayout.putConstraint(SpringLayout.NORTH, btnBack, 6, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: add back button function
				patient_Frame.setPanel(0);
			}
		});
		add(btnBack);

	}
}
