import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;

import gui.*;


public class MainApp {
  private JButton patientButton,pharmacistButton;
  private JFrame mainWindow;
  private JLabel background;
  LoginPanel log;
  JPanel mainPanel;




public MainApp() throws IOException{
  mainWindow = new JFrame("Select User:");
  mainPanel = new JPanel();
  //pharmacistButton = new JButton();
  //patientButton = new JButton();

  mainWindow.setSize(600, 900);
  mainWindow.add(mainPanel);
  //background = new JLabel(new ImageIcon("lib/openScreen.png"));
  
  
  
  	
  	ImageIcon patientImg = new ImageIcon("lib/Patient-Button.png");
	Image patimg = patientImg.getImage() ;  
  	Image newpatimg = patimg.getScaledInstance( 400, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
  	patientImg = new ImageIcon( newpatimg );
	JButton patientButton = new JButton();
	patientButton.setIcon(patientImg);
	patientButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	patientButton.addActionListener(new ActionListener (){
		public void actionPerformed(ActionEvent e) {
			System.out.println("Patient");
			new patient_Frame();
			mainWindow.setVisible(false);
		}
	});
	//patientButton.setOpaque(false);
	//patientButton.setContentAreaFilled(false);
	//patientButton.setBorderPainted(false);
	patientButton.setPreferredSize(new Dimension(400, 100));
	
	
	ImageIcon pharmImage = new ImageIcon("lib/Pharmacist-Button.png");
	Image pharimg = pharmImage.getImage() ;  
  	Image newimg = pharimg.getScaledInstance( 400, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
  	patientImg = new ImageIcon( newimg );
	JButton pharmacistButton = new JButton();
	pharmacistButton.setIcon(patientImg);
	pharmacistButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	pharmacistButton.addActionListener(new ActionListener (){
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pharmacist button");
		}
	});
	//patientButton.setOpaque(false);
	//patientButton.setContentAreaFilled(false);
	//patientButton.setBorderPainted(false);
	
  pharmacistButton.setPreferredSize(new Dimension(400, 100));
  
  
  
  
  

  // pharmacistButton.setLocation(100, 300);
  // patientButton.setLocation(100, 700);

  
  

  // pharmacistButton.setOpaque(false);
  // pharmacistButton.setContentAreaFilled(false);
  // pharmacistButton.setBorderPainted(false);
  //
  // patientButton.setOpaque(false);
  // patientButton.setContentAreaFilled(false);
  // patientButton.setBorderPainted(false);

  //background.setLayout(new FlowLayout());
  mainPanel.add(pharmacistButton);
  mainPanel.add(patientButton);
  //mainPanel.add(pharmacistButton);




  //mainPanel.add(background);
  // mainPanel.add(pharmacistButton);
  // mainPanel.add(patientButton);






  mainWindow.setVisible(true);
  mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


public static void main(String[] args) throws IOException {
  new MainApp();
}





}
