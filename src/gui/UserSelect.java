package gui;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class UserSelect {
	static JFrame sel = new JFrame("Select User");
	
	public UserSelect() throws IOException {
		
		JPanel mainPanel = new JPanel();
		
		BufferedImage buttonIcon = ImageIO.read(new File("lib/patButton.jpg"));
		JButton patientSelect = new JButton(new ImageIcon(buttonIcon));
		patientSelect.setAlignmentX(Component.CENTER_ALIGNMENT);
		patientSelect.setOpaque(false);
		patientSelect.setContentAreaFilled(false);
		patientSelect.setBorderPainted(false);
		
		
		
		
		JButton doctorSelect = new JButton("Doctor");
		doctorSelect.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton pharSelect = new JButton("Pharmacist");
		pharSelect.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(patientSelect);
		mainPanel.add(doctorSelect);
		mainPanel.add(pharSelect);
		
		sel.add(mainPanel);
		
		sel.setVisible(true);
		sel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sel.setSize(200, 400);
		
	}
}
