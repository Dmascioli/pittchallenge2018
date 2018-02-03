package gui.patientOptions;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.patient_Frame;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class patientOptions_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public patientOptions_panel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnViewYourProfile = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnViewYourProfile, 422, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnViewYourProfile, 63, SpringLayout.WEST, this);
		btnViewYourProfile.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\View-Profile.png"));
		btnViewYourProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(1);
			}
		});
		btnViewYourProfile.setOpaque(false);
		btnViewYourProfile.setContentAreaFilled(false);
		btnViewYourProfile.setBorderPainted(false);
		add(btnViewYourProfile);
		
		JButton btnFillPrescriptions = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnFillPrescriptions, 156, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnViewYourProfile, 0, SpringLayout.EAST, btnFillPrescriptions);
		springLayout.putConstraint(SpringLayout.WEST, btnFillPrescriptions, 63, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnFillPrescriptions, -67, SpringLayout.EAST, this);
		btnFillPrescriptions.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Fill-Prescription.png"));
		btnFillPrescriptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(3);
			}
		});
		btnFillPrescriptions.setOpaque(false);
		btnFillPrescriptions.setContentAreaFilled(false);
		btnFillPrescriptions.setBorderPainted(false);
		add(btnFillPrescriptions);
		
		JButton btnTakeSurvey = new JButton("Take Survey");
		springLayout.putConstraint(SpringLayout.SOUTH, btnViewYourProfile, -18, SpringLayout.NORTH, btnTakeSurvey);
		springLayout.putConstraint(SpringLayout.NORTH, btnTakeSurvey, 567, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnTakeSurvey, -230, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnTakeSurvey, 117, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnTakeSurvey, -131, SpringLayout.EAST, this);
		add(btnTakeSurvey);
		
		JButton btnViewLocalPharmacies = new JButton("");
		springLayout.putConstraint(SpringLayout.SOUTH, btnFillPrescriptions, -6, SpringLayout.NORTH, btnViewLocalPharmacies);
		springLayout.putConstraint(SpringLayout.NORTH, btnViewLocalPharmacies, 289, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnViewLocalPharmacies, 63, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnViewLocalPharmacies, -6, SpringLayout.NORTH, btnViewYourProfile);
		springLayout.putConstraint(SpringLayout.EAST, btnViewLocalPharmacies, 0, SpringLayout.EAST, btnViewYourProfile);
		btnViewLocalPharmacies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(2);
			}
		});
		btnViewLocalPharmacies.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\View-Pharmacies.png"));
		btnViewLocalPharmacies.setOpaque(false);
		btnViewLocalPharmacies.setContentAreaFilled(false);
		btnViewLocalPharmacies.setBorderPainted(false);
		add(btnViewLocalPharmacies);
		
		JButton btnHelp = new JButton("Help");
		springLayout.putConstraint(SpringLayout.SOUTH, btnHelp, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnHelp, -10, SpringLayout.EAST, this);
		add(btnHelp);

	}

}
