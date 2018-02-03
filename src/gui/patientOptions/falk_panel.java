package gui.patientOptions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.*;


public class falk_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public falk_panel() {
		setLayout(null);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(2);
				pharm_Frame.setPanel(2);
			}
		});
		btnBack.setBounds(12, 33, 97, 40);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Falk-Info.png"));
		lblNewLabel.setBounds(0, -26, 602, 939);
		add(lblNewLabel);
	}

}
