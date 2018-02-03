package gui.patientOptions;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import gui.patient_Frame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view_Profile extends JPanel {

	/**
	 * Create the panel.
	 */
	public view_Profile() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblYourCurrentPrescriptions = new JLabel("Your Current Prescriptions:");
		springLayout.putConstraint(SpringLayout.WEST, lblYourCurrentPrescriptions, 28, SpringLayout.WEST, this);
		add(lblYourCurrentPrescriptions);
		
		JLabel lblNewLabel = new JLabel("Recent Pharmacy Visits");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -335, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblYourCurrentPrescriptions, 0, SpringLayout.NORTH, lblNewLabel);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 82, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 28, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -57, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, -455, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblYourCurrentPrescriptions, 0, SpringLayout.EAST, panel);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 82, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 231, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 172, SpringLayout.EAST, panel);
		add(panel_1);
		
		JLabel lblMedicalInformation = new JLabel("Medical Information");
		springLayout.putConstraint(SpringLayout.NORTH, lblMedicalInformation, 0, SpringLayout.NORTH, lblYourCurrentPrescriptions);
		springLayout.putConstraint(SpringLayout.WEST, lblMedicalInformation, 72, SpringLayout.EAST, lblNewLabel);
		add(lblMedicalInformation);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 79, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 72, SpringLayout.EAST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -57, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -86, SpringLayout.EAST, this);
		add(panel_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(0);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnBack, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		add(btnBack);

	}
}
