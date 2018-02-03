package gui.pharmacistOptions;

import javax.swing.JPanel;

import gui.pharm_Frame;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pharmOptions_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public pharmOptions_panel() {
		setLayout(null);
		
		JButton btnProfile = new JButton("");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharm_Frame.setPanel(4);
			}
		});
		btnProfile.setBounds(87, 665, 422, 104);
		btnProfile.setOpaque(false);
		btnProfile.setContentAreaFilled(false);
		btnProfile.setBorderPainted(false);
		add(btnProfile);
		
		JButton btnReviews = new JButton("");
		btnReviews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharm_Frame.setPanel(3);
			}
		});
		btnReviews.setBounds(87, 532, 422, 104);
		btnReviews.setOpaque(false);
		btnReviews.setContentAreaFilled(false);
		btnReviews.setBorderPainted(false);
		add(btnReviews);
		
		JButton btnPharms = new JButton("");
		btnPharms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharm_Frame.setPanel(2);
			}
		});
		btnPharms.setBounds(87, 398, 422, 104);
		btnPharms.setOpaque(false);
		btnPharms.setContentAreaFilled(false);
		btnPharms.setBorderPainted(false);
		add(btnPharms);
		
		JButton btnPatients = new JButton("");
		btnPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharm_Frame.setPanel(1);
			}
		});
		btnPatients.setBounds(87, 263, 422, 104);
		btnPatients.setOpaque(false);
		btnPatients.setContentAreaFilled(false);
		btnPatients.setBorderPainted(false);
		add(btnPatients);
		
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Pharmacist.png"));
		lblBG.setBounds(0, -14, 597, 939);
		add(lblBG);

	}

}
