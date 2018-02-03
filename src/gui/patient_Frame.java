package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.patientOptions.*;

public class patient_Frame{

	static JPanel contentPane;
	static JFrame patientFrame = new JFrame("Patient");

	/**
	 * Create the frame.
	 */
	public patient_Frame() {
		patientFrame.setVisible(true);
		patientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		patientFrame.setBounds(100, 100, 600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		patientFrame.setContentPane(contentPane);
		
		setPanel(0);
	}
	
	public static void setPanel(int panelNumber) {
		patientFrame.getContentPane().removeAll();
		switch(panelNumber) {
		case 0: //patient options
			patientFrame.add(new patientOptions_panel());
			break;
		case 1: //view profile
			patientFrame.add(new view_Profile());
			break;
		case 2: //view pharmacies
			patientFrame.add(new localPharms_panel());
			break;
		case 3: //fill prescriptions
			patientFrame.add(new fill_prescription());
			break;
		case 4: //more options
			patientFrame.add(new extended_prescription());
			break;
		case 5: //write review
			patientFrame.add(new writeReview_panel());
			break;
		case 6: //falk info
			patientFrame.add(new falk_panel());
			break;
		}
		patientFrame.revalidate();
		patientFrame.repaint();
	}
	public static void clearFrame() {
		patientFrame.dispose();
		patientFrame.getContentPane().removeAll();
		new patient_Frame();
		System.out.println("cleared");
		
	}
}
