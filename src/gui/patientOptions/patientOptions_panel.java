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
		
		JButton btnViewYourProfile = new JButton("");
		btnViewYourProfile.setBounds(63, 443, 469, 129);
		btnViewYourProfile.setIcon(new ImageIcon("lib/View-Profile.png"));
		btnViewYourProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(1);
			}
		});
		setLayout(null);
		btnViewYourProfile.setOpaque(false);
		btnViewYourProfile.setContentAreaFilled(false);
		btnViewYourProfile.setBorderPainted(false);
		add(btnViewYourProfile);
		
		JButton btnFillPrescriptions = new JButton("");
		btnFillPrescriptions.setBounds(63, 70, 469, 175);
		btnFillPrescriptions.setIcon(new ImageIcon("lib/Fill-Prescription.png"));
		btnFillPrescriptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(3);
			}
		});
		btnFillPrescriptions.setOpaque(false);
		btnFillPrescriptions.setContentAreaFilled(false);
		btnFillPrescriptions.setBorderPainted(false);
		add(btnFillPrescriptions);
		
		JButton btnTakeSurvey = new JButton("");
		btnTakeSurvey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(5);
			}
		});
		btnTakeSurvey.setBounds(63, 609, 457, 170);
		btnTakeSurvey.setIcon(new ImageIcon("lib/Write-Review.png"));
		btnTakeSurvey.setOpaque(false);
		btnTakeSurvey.setContentAreaFilled(false);
		btnTakeSurvey.setBorderPainted(false);
		add(btnTakeSurvey);
		
		JButton btnViewLocalPharmacies = new JButton("");
		btnViewLocalPharmacies.setBounds(63, 275, 469, 126);
		btnViewLocalPharmacies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(2);
			}
		});
		btnViewLocalPharmacies.setIcon(new ImageIcon("lib/View-Pharmacies.png"));
		btnViewLocalPharmacies.setOpaque(false);
		btnViewLocalPharmacies.setContentAreaFilled(false);
		btnViewLocalPharmacies.setBorderPainted(false);
		add(btnViewLocalPharmacies);

	}

}
