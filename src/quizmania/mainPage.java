/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizmania;

/**
 *
 * @author Harshika Chandvani
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class mainPage {

	JFrame frmQuizApplicationLogin;
	JTextField namefield;
	JCheckBox agree;
	String name;
	JLabel nameset;
	JLabel closed;
	int m=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage window = new mainPage();
					window.frmQuizApplicationLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public mainPage() {
		initialize();
	}

	void initialize() {
		
		frmQuizApplicationLogin = new JFrame();
		frmQuizApplicationLogin.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Are You Sure You want to Exit the Test", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
				if(a==JOptionPane.OK_OPTION) {
					frmQuizApplicationLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				}
				else {
					mainPage mp=new mainPage();
					mp.frmQuizApplicationLogin.setVisible(true);
				}
			}
			
		});
		frmQuizApplicationLogin.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmQuizApplicationLogin.getContentPane().setBackground(Color.WHITE);
		frmQuizApplicationLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Quiz Application");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 17));
		lblNewLabel.setBounds(89, 11, 276, 29);
		frmQuizApplicationLogin.getContentPane().add(lblNewLabel);
                
                JLabel lblNewLabel_1 = new JLabel("Enter Your Name :");
		lblNewLabel_1.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 99, 129, 17);
		frmQuizApplicationLogin.getContentPane().add(lblNewLabel_1);
		
		JCheckBox agree = new JCheckBox("I'm sure that i want to test my self by giving this test.");
		agree.setBackground(Color.WHITE);
		agree.setBounds(10, 136, 337, 23);
		frmQuizApplicationLogin.getContentPane().add(agree);
		
		JButton startbtn = new JButton("START");
		startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					name=namefield.getText();
		
				
					boolean check=agree.isSelected();
				
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Name");
					
				}
				else if(check==false){
					JOptionPane.showMessageDialog(null, "Please Select The Agreement");
					
				}
				else {
					startPage a=new startPage(name);
					a.setVisible(true);
					
					
					frmQuizApplicationLogin.dispose();
					
				}
				}
				catch(Exception e1) {e1.printStackTrace();}
			}
		});
		startbtn.setBackground(new Color(255, 182, 193));
		startbtn.setFont(new Font("Arial", Font.BOLD, 14));
		startbtn.setBounds(64, 206, 89, 29);
		frmQuizApplicationLogin.getContentPane().add(startbtn);
		
		JButton exitbtn = new JButton("EXIT");
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmQuizApplicationLogin.dispose();
				frmQuizApplicationLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		exitbtn.setBackground(new Color(255, 182, 193));
		exitbtn.setFont(new Font("Arial", Font.BOLD, 14));
		exitbtn.setBounds(254, 206, 89, 29);
		frmQuizApplicationLogin.getContentPane().add(exitbtn);
		
		namefield = new JTextField();
		namefield.setFont(new Font("Tahoma", Font.PLAIN, 13));
		namefield.setBounds(132, 86, 211, 29);
		frmQuizApplicationLogin.getContentPane().add(namefield);
		namefield.setColumns(10);
		
		closed = new JLabel();
		closed.setBounds(10, 45, 369, 14);
		frmQuizApplicationLogin.getContentPane().add(closed);
		frmQuizApplicationLogin.setTitle("Quiz Application Login");
		frmQuizApplicationLogin.setBackground(Color.WHITE);
		frmQuizApplicationLogin.setBounds(100, 100, 450, 300);
		
	}
	

}

