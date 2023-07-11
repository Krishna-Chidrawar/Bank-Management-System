
package Bank_Management_System;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.*;

public class SignupOne extends JFrame  //implements ActionListener                                                       
{
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField,pincodeTextField,stateTextField;
    JButton next;
    JRadioButton married,unmarried,male,female;
    JDateChooser datechooser;
    SignupOne()
    {
        //used to change the  default settings;
        setLayout(null);
        
        //  to generate random form no;
        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno =  new JLabel("APPLICATION FORM NO : " + random);
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails =  new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name =  new JLabel("Name : ");
        name.setFont(new Font("Raleway", Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname =  new JLabel("Father's Name : ");
        fname.setFont(new Font("Raleway", Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel  dob =  new JLabel("Date of Birth : ");
        dob.setFont(new Font("Raleway", Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(300,240,400,30);
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setFont(new Font("Raleway",Font.BOLD,20));
        add(datechooser);
        
        JLabel  gender =  new JLabel("Gender : ");
        gender.setFont(new Font("Raleway", Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        // For Radio buttons of male and femal selection
        male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel  email =  new JLabel("Email : ");
        email.setFont(new Font("Raleway", Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,20));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        
        JLabel  marstat =  new JLabel("Maratial Status : ");
        marstat.setFont(new Font("Raleway", Font.BOLD,22));
        marstat.setBounds(100,390,200,30);
        add(marstat);
        
        married = new JRadioButton("Married ");
        married .setBounds(300,390,100,30);
        married .setBackground(Color.WHITE);
        add(married );
        unmarried = new JRadioButton("Unmarried ");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup marstatgrp = new ButtonGroup();
        marstatgrp.add(married);
        marstatgrp.add(unmarried);
        
        JLabel  address =  new JLabel("Address : ");
        address.setFont(new Font("Raleway", Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,20));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel  city =  new JLabel("City : ");
        city.setFont(new Font("Raleway", Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city );
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,20));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel  state =  new JLabel("State : ");
        state.setFont(new Font("Raleway", Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,20));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel  pinncode =  new JLabel("Pincode : ");
        pinncode.setFont(new Font("Raleway", Font.BOLD,22));
        pinncode.setBounds(100,590,200,30);
        add(pinncode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,20));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        
        next= new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Raleway" , Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
//    public void actionPerformed (ActionEvent ae) 
//    {
//        String formno = "" +random; 
//        String name  = nameTextField.getText();
//        String fname = fnameTextField.getText ();
//        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
//        ~
////      String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText ();
//        
//        
//    }
    public static void main(String args[])
    {
        new SignupOne();
    }
}
