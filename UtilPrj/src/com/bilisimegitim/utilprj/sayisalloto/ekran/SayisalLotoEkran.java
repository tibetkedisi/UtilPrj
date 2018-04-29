package com.bilisimegitim.utilprj.sayisalloto.ekran;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bilisimegitim.utilprj.sayisalloto.SayisalLoto;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SayisalLotoEkran extends JFrame {

	private JPanel contentPane;
	private JTextField tf6;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SayisalLotoEkran frame = new SayisalLotoEkran();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SayisalLotoEkran() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SAYISAL LOTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(80, 24, 277, 14);
		contentPane.add(lblNewLabel);
		
		tf6 = new JTextField();
		tf6.setFont(new Font("Tahoma", Font.BOLD, 11));
		tf6.setBounds(331, 81, 45, 20);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Tahoma", Font.BOLD, 11));
		tf1.setColumns(10);
		tf1.setBounds(50, 81, 45, 20);
		contentPane.add(tf1);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("Tahoma", Font.BOLD, 11));
		tf2.setColumns(10);
		tf2.setBounds(111, 81, 45, 20);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setFont(new Font("Tahoma", Font.BOLD, 11));
		tf3.setColumns(10);
		tf3.setBounds(166, 81, 45, 20);
		contentPane.add(tf3);
		
		tf4 = new JTextField();
		tf4.setFont(new Font("Tahoma", Font.BOLD, 11));
		tf4.setColumns(10);
		tf4.setBounds(221, 81, 45, 20);
		contentPane.add(tf4);
		
		tf5 = new JTextField();
		tf5.setFont(new Font("Tahoma", Font.BOLD, 11));
		tf5.setColumns(10);
		tf5.setBounds(276, 81, 45, 20);
		contentPane.add(tf5);
		
		JButton btnNewButton = new JButton("ÇEVİR");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 SayisalLoto loto = new SayisalLoto();
				
				
				int[]sayilar = loto.arrayOlustur();
				
				tf1.setText(String.valueOf(sayilar[0]));
				tf2.setText(String.valueOf(sayilar[1]));
				tf3.setText(String.valueOf(sayilar[2]));
				tf4.setText(String.valueOf(sayilar[3]));
				tf5.setText(String.valueOf(sayilar[4]));
				tf6.setText(String.valueOf(sayilar[5]));
				
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(177, 144, 99, 28);
		contentPane.add(btnNewButton);
	}
}
