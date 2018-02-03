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
  private JLabel label;
  private JButton btnPatient;
  private JButton btnPharm;




public MainApp() throws IOException{
  mainWindow = new JFrame("Select User:");
  mainPanel = new JPanel();
  //pharmacistButton = new JButton();
  //patientButton = new JButton();

  mainWindow.setSize(600, 900);
  mainWindow.getContentPane().add(mainPanel);
  mainPanel.setLayout(null);
  
  label = new JLabel("");
  label.setBounds(24, 13, 558, 451);
  label.setIcon(new ImageIcon("C:\\Users\\dmasc_000\\workspace\\Pitt Challenge 2018\\lib\\ConnectRx.png"));
  mainPanel.add(label);
  
 
  //background = new JLabel(new ImageIcon("lib/openScreen.png"));
  
  
  
  	
  	ImageIcon patientImg = new ImageIcon("lib/Patient-Button.png");
	Image patimg = patientImg.getImage() ;  
  	Image newpatimg = patimg.getScaledInstance( 400, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
  	patientImg = new ImageIcon( newpatimg );
  	 btnPatient = new JButton("");
  	  btnPatient.setIcon(patientImg);
  	  btnPatient.setBounds(54, 490, 463, 109);
  	btnPatient.setOpaque(false);
  	btnPatient.setContentAreaFilled(false);
  	btnPatient.setBorderPainted(false);
  	btnPatient.addActionListener(new ActionListener (){
		public void actionPerformed(ActionEvent e) {
			System.out.println("Patient");
			new patient_Frame();
			mainWindow.setVisible(false);
		}
	});
  	  mainPanel.add(btnPatient);

	ImageIcon pharmImage = new ImageIcon("lib/Pharmacist-Button.png");
	Image pharimg = pharmImage.getImage() ;  
  	Image newimg = pharimg.getScaledInstance( 400, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
  	pharmImage = new ImageIcon( newimg );
  	btnPharm = new JButton("");
  	btnPharm.setIcon(pharmImage);
	  btnPharm.setBounds(54, 612, 463, 103);
	  btnPharm.setOpaque(false);
	  btnPharm.setContentAreaFilled(false);
	  btnPharm.setBorderPainted(false);
	  btnPharm.addActionListener(new ActionListener (){
				public void actionPerformed(ActionEvent e) {
					System.out.println("Pharmacist button");
					new pharm_Frame();
					mainWindow.setVisible(false);
				}
			});
	  mainPanel.add(btnPharm);
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
