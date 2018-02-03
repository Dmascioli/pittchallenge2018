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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class localPharms_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public localPharms_panel() {
		setLayout(null);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Back-Button.png"));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patient_Frame.setPanel(0);
			}
		});
		btnBack.setBounds(12, 13, 97, 40);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
		
		JLabel lblNearbyPharmacies = new JLabel("Nearby Pharmacies");
		lblNearbyPharmacies.setFont(new Font("Microsoft JhengHei", Font.BOLD, 22));
		lblNearbyPharmacies.setBounds(12, 42, 225, 40);
		add(lblNearbyPharmacies);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(22, 81, 539, 332);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblMap = new JLabel("map");
		lblMap.setBounds(12, 13, 515, 306);
		lblMap.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\nearbyMap.PNG"));
		panel.add(lblMap);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 426, 587, 448);
		add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JButton btnForbes = new JButton("");
		btnForbes.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Forbes-Pharmacy.png"));
		btnForbes.setOpaque(false);
		btnForbes.setContentAreaFilled(false);
		btnForbes.setBorderPainted(false);
		
		
		JButton btnFalk = new JButton("");
		btnFalk.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\Falk-Pharmacy.png"));
		btnFalk.setOpaque(false);
		btnFalk.setContentAreaFilled(false);
		btnFalk.setBorderPainted(false);
		panel_1.add(btnFalk);
		panel_1.add(btnForbes);
	}
}
