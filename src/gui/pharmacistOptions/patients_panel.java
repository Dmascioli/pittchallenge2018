package gui.pharmacistOptions;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.pharm_Frame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class patients_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public patients_panel() {
		setLayout(null);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharm_Frame.setPanel(0);
			}
		});
		btnBack.setBounds(12, 33, 97, 40);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Patients.png"));
		lblNewLabel.setBounds(0, -13, 602, 939);
		add(lblNewLabel);
	}

}
