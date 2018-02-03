package gui.patientOptions;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import gui.patient_Frame;
import gui.pharm_Frame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view_Profile extends JPanel {

	/**
	 * Create the panel.
	 */
	public view_Profile() {
setLayout(null);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(0);
			}
		});
		btnBack.setBounds(12, 33, 97, 40);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("lib/Patient-Profile.png"));
		lblNewLabel.setBounds(0, -13, 602, 939);
		add(lblNewLabel);

	}
}
