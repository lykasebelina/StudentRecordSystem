/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MJV Merida
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class UserLogin extends JFrame implements ActionListener{
        JFrame frame;
        JPanel header;
        JLabel lemail, lpassword, linfo, lheader;
        JTextField email;
        JPasswordField password;
        JButton button1;
        JCheckBox box;
        
        
UserLogin() {		
        
        //creating new frame
        frame = new JFrame();
        
        // setting the frame size
        frame.setSize(1500,1000);
        
        //Frame title
        frame.setTitle("PUPBC Student Record System");
        frame.setLocationRelativeTo(null);
        
        //using no layout
        frame.setLayout(null);
        
        //Setting the sizes and fonts   
        header = new JPanel();   
        header.setBounds(0, 0, 1700, 100);
        
        lheader = new JLabel("BSIT STUDENT RECORD SYSTEM");
        lheader.setPreferredSize(new Dimension(840, 90));
        lheader.setFont(new Font("Bookman Old Style", Font.BOLD, 38));
        
        button1 = new JButton("Login");
        button1.setFont(new Font("Arial Black", Font.BOLD, 14));
        button1.setBounds(520,520,450,60);
        
        lpassword = new JLabel("Password:");
        lpassword.setBounds(550, 280, 170, 80);
        lpassword.setFont(new Font("Arial Black", Font.BOLD, 13));
        
        linfo = new JLabel("LOGIN");
        linfo.setBounds(650, 120, 390, 90);
        linfo.setFont(new Font("Arial Black", Font.BOLD, 50));
        
        password = new JPasswordField();
        password.setBounds(650,300,300,40);
        
        email = new JTextField();
        email.setBounds(650,240,300,40);
        
        lemail = new JLabel("Email:");
        lemail.setBounds(550, 240, 250, 40);
        lemail.setFont(new Font("Arial Black", Font.BOLD, 13));
        
        
        box = new JCheckBox("Show Your Password");
        box.setFont(new Font("Arial Black", Font.BOLD, 12));
        box.setBounds(650,350,190,30);
        box.addActionListener(this);
        

        
        //Adding components to the frame and other components
        frame.add(button1);
        frame.add(lemail);
        frame.add(lpassword);
        frame.add(linfo);
        frame.add(password);
        frame.add(email);
        frame.add(box);
        frame.add(header, Integer.valueOf(2));
        header.add(lheader);
           
        //Setting colors
        frame.getContentPane().setBackground(new Color(255, 239, 213));
        box.setBackground(new Color(255, 239, 213));
        button1.setForeground(new Color(245, 245, 220));
        button1.setBackground(new Color(128, 0, 0));
        header.setBackground(new Color(128, 0, 0)); 
        lheader.setForeground(new Color(245, 245, 220));
        lheader.setForeground(Color.WHITE);
        
        //frame visible
        frame.setVisible(true);
        
        
        
    }

@Override
    public void actionPerformed(ActionEvent e) {
                 
        if(e.getSource() == box){
            if(box.isSelected()) {
            password.setEchoChar((char)0);
        }
            else{
            password.setEchoChar('•');
                    }
        }
        
    }
    
}
