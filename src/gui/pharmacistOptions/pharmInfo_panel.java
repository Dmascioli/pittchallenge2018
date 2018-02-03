package gui.pharmacistOptions;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import gui.pharm_Frame;

public class pharmInfo_panel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public pharmInfo_panel() {
		setLayout(null);
		
		JButton btnEdit = new JButton("");
		btnEdit.setOpaque(false);
		btnEdit.setContentAreaFilled(false);
		btnEdit.setBorderPainted(false);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Edit");
			}
		});
		
		textField = new JTextField();
		textField.setToolTipText("Enter your specialization");
		textField.setBounds(88, 274, 427, 192);
		add(textField);
		textField.setColumns(10);
		btnEdit.setBounds(358, 796, 195, 85);
		add(btnEdit);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharm_Frame.setPanel(0);
			}
		});
		btnBack.setIcon(new ImageIcon("lib/Back-Button.png"));
		btnBack.setBounds(12, 13, 97, 45);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 5, 600, 876);
		label.setIcon(new ImageIcon("lib/Pharmacist-Info.png"));
		add(label);

	}

	 protected void paintComponent(Graphics g) {
		 Image background = Toolkit.getDefaultToolkit().createImage("Background.png");
		    super.paintComponent(g);
		        g.drawImage(background, 0, 0, null);
		}
}
