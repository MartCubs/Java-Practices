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

public class Scalculator extends JFrame{

	public Scalculator() {
		
		//set valid keys
		String [] onlyValid = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "+", "-", "/", ".",};
		System.out.println(onlyValid[11]);
		setTitle("Simple Calculator");
		setSize(320,400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFocusable(true);

		JLabel jl = new JLabel("", SwingConstants.RIGHT);
		jl.setBounds(10,15,275,20);

		JTextField jt = new JTextField();
		jt.setPreferredSize( new Dimension( 200, 30 ) ); // sizing of TextField
		jt.setBounds(20,60,200,30);
		jt.setFont(new Font("SansSerif", Font.PLAIN, 20));
		jt.setHorizontalAlignment(SwingConstants.RIGHT);
		jt.setText("0");
		jt.setEnabled(false);
		jt.setDisabledTextColor(Color.BLACK);
		jt.setFocusable(false);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(20, 100, 50,35);
		btn7.setFocusable(false);
		btn7.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "7";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn8 = new JButton("8");
		btn8.setBounds(90, 100, 50,35); 	
		btn8.setFocusable(false);
		btn8.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "8";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn9 = new JButton("9");
		btn9.setBounds(160, 100, 50,35); 	
		btn9.setFocusable(false);
		btn9.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "9";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn4 = new JButton("4");
		btn4.setBounds(20, 150 ,50,35); 	
		btn4.setFocusable(false);
		btn4.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "4";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn5 = new JButton("5");
		btn5.setBounds(90, 150, 50,35); 	
		btn5.setFocusable(false);
		btn5.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "5";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn6 = new JButton("6");
		btn6.setFocusable(false);
		btn6.setBounds(160, 150, 50,35);
		btn6.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "6";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn1 = new JButton("1");
		btn1.setBounds(20, 200, 50,35); 	
		btn1.setFocusable(false);
		btn1.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "1";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn2 = new JButton("2");
		btn2.setBounds(90, 200 , 50,35); 	
		btn2.setFocusable(false);
		btn2.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "2";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn3 = new JButton("3");
		btn3.setFocusable(false);
		btn3.setBounds(160, 200, 50,35); 	
		btn3.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "3";
				String remZero = newString.replaceFirst("^0+(?!$)", "");
				jt.setText(remZero);
		}});
		JButton btn0 = new JButton("0");
		btn0.setFocusable(false);
		btn0.setBounds(20, 250, 120,35); 	
		btn0.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + "0";
				jt.setText(newString);
		}});
		JButton btndot = new JButton(".");
		btndot.setFocusable(false);
		btndot.setBounds(160, 250, 50,35); 
		btndot.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = jt.getText() + ".";
				jt.setText(newString);
		}});
		JButton btnadd = new JButton("+");
		btnadd.setFont(new Font("Arial", Font.BOLD, 16));
		btnadd.setFocusable(false);
		btnadd.setBounds(230, 100, 50,30); 	
		btnadd.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText(gjl + gjt + " + ");
				jt.setText("");
		}});
		JButton btnsub = new JButton("-");
		btnsub.setFont(new Font("Arial", Font.BOLD, 25));
		btnsub.setFocusable(false);
		btnsub.setBounds(230, 135, 50,30); 	
		btnsub.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText(gjl + gjt + " - ");
				jt.setText("");
		}});
		JButton btnmul = new JButton("*");
		btnmul.setFont(new Font("Arial", Font.BOLD, 25));
		btnmul.setFocusable(false);
		btnmul.setBounds(230, 170, 50,30); 	
		btnmul.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText(gjl + gjt + " * ");
				jt.setText("");
		}});
		JButton btndiv = new JButton("/");
		btndiv.setFont(new Font("Arial", Font.BOLD, 25));
		btndiv.setFocusable(false);
		btndiv.setBounds(230, 205, 50,30); 	
		btndiv.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText(gjl + gjt + " / ");
				jt.setText("");
	   	}});
		JButton btneq = new JButton("=");
		btneq.setFont(new Font("Arial", Font.BOLD, 15));
		btneq.setBounds(230, 240, 50,50);
		btneq.setFocusable(false);
		btneq.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gjl = jl.getText();
				String gjt = jt.getText();
				jl.setText("");
				jt.setText("");
		}});
		JButton btnclr = new JButton("CLR");
		btnclr.setFocusable(false);
		btnclr.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newString = "";
				jt.setText(newString);
				jl.setText(newString);
		}});
		btnclr.setMargin(new Insets(0,0,0,0));
		btnclr.setBounds(230, 60, 50,35);

		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setOpaque(true);
		jp.setBackground(Color.YELLOW);
		jp.setFocusable(false);
		
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

		addKeyListener(new java.awt.event.KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	    		String oPtr="";
	    		double firstNum=0.00;
	    		double secondNum=0.00;
	        	if(e.getKeyChar()=='1') {
	        		btn1.doClick(); }
	        	else if(e.getKeyChar()=='2') {
	        		btn2.doClick(); }
	        	else if(e.getKeyChar()=='3') {
	        		btn3.doClick(); }
	        	else if(e.getKeyChar()=='4') {
	        		btn4.doClick(); }
	        	else if(e.getKeyChar()=='5') {
	        		btn5.doClick(); }
	        	else if(e.getKeyChar()=='6') {
	        		btn6.doClick(); }
	        	else if(e.getKeyChar()=='7') {
	        		btn7.doClick(); }
	        	else if(e.getKeyChar()=='8') {
	        		btn8.doClick(); }
	        	else if(e.getKeyChar()=='9') {
	        		btn9.doClick(); }
	        	else if(e.getKeyChar()=='0') {
	        		btn0.doClick(); }
	        	else if(e.getKeyChar()=='+') {
					btndot.setEnabled(true);
	        		oPtr="+";
	        		btnadd.doClick(); }
	        	else if(e.getKeyChar()=='-') {
					btndot.setEnabled(true);
	        		oPtr="-";
	        		btnsub.doClick(); }
	        	else if(e.getKeyChar()=='*') {
					btndot.setEnabled(true);
	        		oPtr="*";
	        		btnmul.doClick(); }
	        	else if(e.getKeyChar()=='/') {
					btndot.setEnabled(true);
	        		oPtr="/";
	        		btndiv.doClick(); }
	        	else if(e.getKeyChar()=='.') {
	        		btndot.doClick();
					btndot.setEnabled(false);}
	        	else if(e.getKeyChar() == '\n') {
	        		System.out.println("First Number is :");
	        		btndot.setEnabled(true);
	        		oPtr="";
	        		btneq.doClick(); }
	        	else {
	        		System.out.println(e.getKeyChar());
	        		}}
	        @Override
	        public void keyPressed(KeyEvent e) { //null
	        }
	        @Override
	        public void keyReleased(KeyEvent e) {
	        }
		});
	}
		

///////*********************************************
    public static void main(String[] args) {
        new Scalculator();
    }
///////*********************************************

}