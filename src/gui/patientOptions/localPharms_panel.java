package gui.patientOptions;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;

import gui.patient_Frame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class localPharms_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public localPharms_panel() {
		setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(0);
			}
		});
		btnBack.setBounds(12, 13, 97, 25);
		add(btnBack);
		
		JLabel lblNearbyPharmacies = new JLabel("Nearby Pharmacies");
		lblNearbyPharmacies.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblNearbyPharmacies.setBounds(12, 54, 225, 40);
		add(lblNearbyPharmacies);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(22, 107, 539, 468);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblMap = new JLabel("map");
		lblMap.setBounds(12, 13, 515, 442);
		lblMap.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\nearbyMap.PNG"));
		panel.add(lblMap);

	}
}
