package gui;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import gui.pharmacistOptions.*;

public class pharm_Frame {

	static JPanel contentPane;
	static JFrame pharmFrame = new JFrame("Pharmacist");
	
	public pharm_Frame() {
		pharmFrame.setVisible(true);
		pharmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pharmFrame.setBounds(100, 100, 600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		pharmFrame.setContentPane(contentPane);
		
		setPanel(0);
	}
	
	public static void setPanel(int panelNumber) {
		pharmFrame.getContentPane().removeAll();
		switch(panelNumber) {
		case 0: //pharm options
			pharmFrame.add(new pharmOptions_panel());
			break;
		case 1: //view patients
			pharmFrame.add(new patients_panel());
			break;
		case 2: //view pharmacies
			pharmFrame.add(new pharmList_panel());
			break;
		case 3: //reviews
			pharmFrame.add(new reviews_panel());
			break;
		case 4: //bio
			pharmFrame.add(new pharmInfo_panel());
			break;
		case 5: //pharm help
		}
		pharmFrame.revalidate();
		pharmFrame.repaint();
	}
	public static void clearFrame() {
		pharmFrame.dispose();
		pharmFrame.getContentPane().removeAll();
		new patient_Frame();
		System.out.println("cleared");
		
	}
}
