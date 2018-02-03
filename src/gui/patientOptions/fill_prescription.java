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
				patient_Frame.setPanel(4);
			}
		});
		btnAmox.setBounds(26, 136, 527, 277);
		btnAmox.setOpaque(false);
		btnAmox.setContentAreaFilled(false);
		btnAmox.setBorderPainted(false);
		add(btnAmox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("lib/View Scripts.png"));
		label.setBounds(-12, 0, 612, 870);
		add(label);

	}
}
