package gui.pharmacistOptions;

import javax.swing.JPanel;

import gui.pharm_Frame;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class pharmList_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public pharmList_panel() {
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
		
		JButton btnFalk = new JButton("");
		btnFalk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharm_Frame.setPanel(5);
			}
		});
		btnFalk.setOpaque(false);
		btnFalk.setContentAreaFilled(false);
		btnFalk.setBorderPainted(false);
		btnFalk.setBounds(48, 434, 512, 269);
		add(btnFalk);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Pharmacies List.png"));
		lblNewLabel.setBounds(0, -13, 602, 939);
		add(lblNewLabel);

	}

}
