package gui.patientOptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.patient_Frame;

public class extended_prescription extends JPanel {

	/**
	 * Create the panel.
	 */
	public extended_prescription() {
		JButton btnBack = new JButton("");
		btnBack.setBounds(10, 6, 69, 47);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: add back button function
				patient_Frame.setPanel(0);
			}
		});
		setLayout(null);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
		
		JButton btnAmox = new JButton("");
		btnAmox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(3);
			}
		});
		btnAmox.setBounds(26, 136, 527, 250);
		btnAmox.setOpaque(false);
		btnAmox.setContentAreaFilled(false);
		btnAmox.setBorderPainted(false);
		add(btnAmox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\View Scripts Continued.png"));
		label.setBounds(-12, 0, 612, 870);
		add(label);

	}

}
