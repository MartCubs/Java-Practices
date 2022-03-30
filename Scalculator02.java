import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Scalculator02 extends JFrame{

	public Scalculator02() {

		setTitle("Simple Calculator");
		setSize(320,400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setOpaque(true);
		jp.setBackground(Color.YELLOW);

		JLabel jl = new JLabel("", SwingConstants.RIGHT);
		jl.setBounds(10,15,275,20);

		JTextField jt = new JTextField();
		jt.setPreferredSize( new Dimension( 200, 30 ) ); // sizing of TextField
		jt.setBounds(20,60,200,30);
		jt.setFont(new Font("SansSerif", Font.PLAIN, 20));
		jt.setHorizontalAlignment(SwingConstants.RIGHT);
		jt.addKeyListener(( new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) { // Blank
			}
			@Override
			public void keyPressed(KeyEvent e) {  // Blank
			}
			@Override
			public void keyReleased(KeyEvent e) {
				char c=e.getKeyChar();
				String typeString = jt.getText()+c;
				int validLen = typeString.length();
				if(!Character.isDigit(c) && c!='.' && c!='+' && c!='-' && c!='*' && c!='/' && validLen>1) {
					String newString = typeString.substring(0,validLen-2);
					jt.setText(newString);
				}
				typeString = jt.getText();
				String clearString = typeString.replaceAll("[^\\d]", "" ); // clear all non numeric
				jt.setText(clearString);
			}
		}));

		JButton btn7 = new JButton("7");
		btn7.setBounds(20, 100, 50,35);
		btn7.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "7";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn8 = new JButton("8");
		btn8.setBounds(90, 100, 50,35); 	
		btn8.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "8";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn9 = new JButton("9");
		btn9.setBounds(160, 100, 50,35); 	
		btn9.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "9";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn4 = new JButton("4");
		btn4.setBounds(20, 150 ,50,35); 	
		btn4.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "4";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn5 = new JButton("5");
		btn5.setBounds(90, 150, 50,35); 	
		btn5.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "5";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn6 = new JButton("6");
		btn6.setBounds(160, 150, 50,35);
		btn6.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "6";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn1 = new JButton("1");
		btn1.setBounds(20, 200, 50,35); 	
		btn1.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "1";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn2 = new JButton("2");
		btn2.setBounds(90, 200 , 50,35); 	
		btn2.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "2";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn3 = new JButton("3");
		btn3.setBounds(160, 200, 50,35); 	
		btn3.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "3";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btn0 = new JButton("0");
		btn0.setBounds(20, 250, 120,35); 	
		btn0.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "0";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btndot = new JButton(".");
		btndot.setBounds(160, 250, 50,35); 	
		btndot.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + ".";
				jt.setText(newString);
				jt.grabFocus();
		}});
		JButton btnadd = new JButton("+");
		btnadd.setFont(new Font("Arial", Font.BOLD, 16));
		btnadd.setBounds(230, 100, 50,30); 	
		btnadd.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText(gjl + gjt + " + ");
				jt.setText("");
				jt.grabFocus();
		}});
		JButton btnsub = new JButton("-");
		btnsub.setFont(new Font("Arial", Font.BOLD, 25));
		btnsub.setBounds(230, 135, 50,30); 	
		btnsub.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText(gjl + gjt + " - ");
				jt.setText("");
				jt.grabFocus();
		}});
		JButton btnmul = new JButton("*");
		btnmul.setFont(new Font("Arial", Font.BOLD, 25));
		btnmul.setBounds(230, 170, 50,30); 	
		btnmul.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText(gjl + gjt + " * ");
				jt.setText("");
				jt.grabFocus();
		}});
		JButton btndiv = new JButton("/");
		btndiv.setFont(new Font("Arial", Font.BOLD, 25));
		btndiv.setBounds(230, 205, 50,30); 	
		btndiv.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText(gjl + gjt + " / ");
				jt.setText("");
				jt.grabFocus();
	   	}});
		JButton btneq = new JButton("=");
		btneq.setFont(new Font("Arial", Font.BOLD, 15));
		btneq.setBounds(230, 240, 50,50);
		btneq.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = "";
				jt.setText(newString);
				jl.setText(newString);
				jt.grabFocus();
		}});
		JButton btnclr = new JButton("CLR");
		btnclr.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = "";
				jt.setText(newString);
				jl.setText(newString);
				jt.grabFocus();
		}});
		btnclr.setMargin(new Insets(0,0,0,0));
		btnclr.setBounds(230, 60, 50,35);

		jp.add(jl);
		jp.add(jt);
		jp.add(btn1);
		jp.add(btn2);
		jp.add(btn3);
		jp.add(btn4);
		jp.add(btn5);
		jp.add(btn6);
		jp.add(btn7);
		jp.add(btn8);
		jp.add(btn9);
		jp.add(btn0);
		jp.add(btndot);
		jp.add(btnadd);
		jp.add(btnsub);
		jp.add(btnmul);
		jp.add(btndiv);
		jp.add(btneq);
		jp.add(btnclr);

		add(jp);
		setVisible(true);
	}
		

///////*********************************************
    public static void main(String[] args) {
        new Scalculator02();
    }
///////*********************************************

}