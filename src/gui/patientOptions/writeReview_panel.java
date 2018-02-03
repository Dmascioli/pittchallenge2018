package gui.patientOptions;

import javax.swing.JPanel;

import gui.patient_Frame;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class writeReview_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public writeReview_panel() {
		setLayout(null);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(0);
			}
		});
		btnBack.setBounds(12, 36, 97, 38);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Review.png"));
		lblBg.setBounds(0, -11, 631, 934);
		add(lblBg);

	}

}
