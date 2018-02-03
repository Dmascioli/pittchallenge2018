package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JPanel{
  private JButton b1;
  private JLabel t1, t2;
  private JTextArea input;
  private String ID;
  //private String file;
  //private LoginInterface output;
  //private MyInterface output2;

  public LoginPanel()
  {
    panel();
  }
  public void panel(){                                        //this is the JPanel
    t1 = new JLabel("Please log into the site");              //creates all the variables necessary for the panel
    t2 = new JLabel("Voter ID: ");
    b1 = new JButton("Submit");
    input = new JTextArea();

    setLayout(new BorderLayout());
    ButtonListener listener = new ButtonListener();

    t1.setFont(new Font("Serif", Font.BOLD, 30));         //sets fonts to make the text look nicer
    t2.setFont(new Font("Serif", Font.BOLD, 25));
    input.setColumns(8);
    input.setFont(new Font("Serif", Font.BOLD, 25));
    b1.setFont(new Font("Serif", Font.BOLD, 25));
    b1.addActionListener(listener);

    add(t1, BorderLayout.NORTH);      //positions the objects
    add(t2, BorderLayout.WEST);
    add(input, BorderLayout.EAST);
    add(b1, BorderLayout.SOUTH);
  }

  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == b1){

      }
    }
  }
}
