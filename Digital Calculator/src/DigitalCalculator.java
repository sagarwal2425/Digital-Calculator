import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class DigitalCalculator extends JFrame{
	
	Container c = getContentPane();
	JFrame frame = new JFrame("Digital Calculator");
    JTextField textField1 = new JTextField(), textField2 = new JTextField(), textField3 = new JTextField();
	JLabel label, label1, label2, label3, label4;
	JRadioButton add, sub, multiply, divide;
	
	public static void main(String[] args){
		new DigitalCalculator().display();
	}
	
	public void display(){		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(535,190);
		frame.setLayout(null);
		
		textBoxes();
		label();
		radioButton();        
		
		frame.setVisible(true);		
	}
	
	//Method for Radio button functions
	public void radioButton() {
		
		//For Add radio button
		add = new JRadioButton("+");
		add.setBounds(155, 10, 40, 30);
		add.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	           try {
	        	   int num1 = Integer.parseInt(textField1.getText());
	        	   int num2 = Integer.parseInt(textField2.getText());
	        	   int ans = num1 + num2;
	        	   textField3.setText(Integer.toString(ans));			        
		       } 
	           catch (Exception e1) {
	        	   if(!textField1.getText().equalsIgnoreCase("")) {
	        		   try{
	        			   Integer.parseInt(textField1.getText());
	        			}catch (Exception e2) {
	        				JOptionPane.showMessageDialog (null, "Error: 1st Number cannot be a String");
	 		        	}
	        	   }else {
	        		   JOptionPane.showMessageDialog (null, "Error: 1st Number is Empty");
	        	   }		        	   
	        	   if(!textField2.getText().equalsIgnoreCase("")) {
	        		   try{
	        			   Integer.parseInt(textField2.getText());
	        			}catch (Exception e2) {
	        				JOptionPane.showMessageDialog (null, "Error: 2nd Number cannot be a String");
	 		        	}
	        	   }else {
	        		   JOptionPane.showMessageDialog (null, "Error: 2nd Number is Empty");
	        	   }		        	   
        	       System.exit(0);
	           }}
	    });
		
		//For Subtract radio button
		sub = new JRadioButton("-");
		sub.setBounds(155, 40, 40, 30);
		sub.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	           try {
	        	   int num1 = Integer.parseInt(textField1.getText());
	        	   int num2 = Integer.parseInt(textField2.getText());
	        	   int ans = num1 - num2;
	        	   textField3.setText(Integer.toString(ans));			        
		       } 
	           catch (Exception e1) {
	        	   if(!textField1.getText().equalsIgnoreCase("")) {
	        		   try{
	        			   Integer.parseInt(textField1.getText());
	        			}catch (Exception e2) {
	        				JOptionPane.showMessageDialog (null, "Error: 1st Number cannot be a String");
	 		        	}
	        	   }else {
	        		   JOptionPane.showMessageDialog (null, "Error: 1st Number is Empty");
	        	   }		        	   
	        	   if(!textField2.getText().equalsIgnoreCase("")) {
	        		   try{
	        			   Integer.parseInt(textField2.getText());
	        			}catch (Exception e2) {
	        				JOptionPane.showMessageDialog (null, "Error: 2nd Number cannot be a String");
	 		        	}
	        	   }else {
	        		   JOptionPane.showMessageDialog (null, "Error: 2nd Number is Empty");
	        	   }		        	   
        	       System.exit(0);
	           }}
	    });
		
		//For Multiple radio button
		multiply = new JRadioButton("*");
		multiply.setBounds(155, 70, 40, 30);
		multiply.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	           try {
	        	   int num1 = Integer.parseInt(textField1.getText());
	        	   int num2 = Integer.parseInt(textField2.getText());
	        	   int ans = num1 * num2;
	        	   textField3.setText(Integer.toString(ans));			        
		       } 
	           catch (Exception e1) {
	        	   if(!textField1.getText().equalsIgnoreCase("")) {
	        		   try{
	        			   Integer.parseInt(textField1.getText());
	        			}catch (Exception e2) {
	        				JOptionPane.showMessageDialog (null, "Error: 1st Number cannot be a String");
	 		        	}
	        	   }else {
	        		   JOptionPane.showMessageDialog (null, "Error: 1st Number is Empty");
	        	   }		        	   
	        	   if(!textField2.getText().equalsIgnoreCase("")) {
	        		   try{
	        			   Integer.parseInt(textField2.getText());
	        			}catch (Exception e2) {
	        				JOptionPane.showMessageDialog (null, "Error: 2nd Number cannot be a String");
	 		        	}
	        	   }else {
	        		   JOptionPane.showMessageDialog (null, "Error: 2nd Number is Empty");
	        	   }		        	   
        	       System.exit(0);
	           }}
	    });
		
		//For Divide radio button
		divide = new JRadioButton("/");
		divide.setBounds(155, 100, 40, 30);
		divide.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	           try {
	        	   int num1 = Integer.parseInt(textField1.getText());
	        	   int num2 = Integer.parseInt(textField2.getText());
	        	   if(num2 == 0) {
	        		   JOptionPane.showMessageDialog (null, "Error: Division by Zero is not Allowed");
	        		   System.exit(0);				           
	        	   }   
	        	   int ans = num1 / num2;
	        	   textField3.setText(Integer.toString(ans));			        
		       } 
	           catch (Exception e1) {
	        	   if(!textField1.getText().equalsIgnoreCase("")) {
	        		   try{
	        			   Integer.parseInt(textField1.getText());
	        			}catch (Exception e2) {
	        				JOptionPane.showMessageDialog (null, "Error: 1st Number cannot be a String");
	 		        	}
	        	   }else {
	        		   JOptionPane.showMessageDialog (null, "Error: 1st Number is Empty");
	        	   }		        	   
	        	   if(!textField2.getText().equalsIgnoreCase("")) {
	        		   try{
	        			   Integer.parseInt(textField2.getText());
	        			}catch (Exception e2) {
	        				JOptionPane.showMessageDialog (null, "Error: 2nd Number cannot be a String");
	 		        	}
	        	   }else {
	        		   JOptionPane.showMessageDialog (null, "Error: 2nd Number is Empty");
	        	   }		        	   
        	       System.exit(0);
	           }}
	    });
		
		ButtonGroup group = new ButtonGroup();
        group.add(add);
        group.add(sub);
        group.add(multiply);
        group.add(divide);	        
        
        frame.add(add);
        frame.add(sub);
        frame.add(multiply);
        frame.add(divide);	        
	}

	//Method for Textboxes display
	public void textBoxes() {		
		textField1.setBounds(20, 55, 120, 30);
		frame.add(textField1);
		
		textField2.setBounds(210, 55, 120, 30);
		frame.add(textField2);
		
		textField3.setBounds(380, 55, 120, 30);
		frame.add(textField3);		
	}
	
	//Method for Label display
	public void label() {
		label1 = new JLabel("Enter 1st Number");
		label1.setBounds(21, 28, 120, 30);
		frame.add(label1);
		
		label2 = new JLabel("Enter 2nd Number");
		label2.setBounds(211, 28, 120, 30);
		frame.add(label2);
		
		label3 = new JLabel("=");
		label3.setBounds(350, 10, 90, 120);
		frame.add(label3);
		
		label4 = new JLabel("Answer");
		label4.setBounds(381, 28, 120, 30);
		frame.add(label4);		
}
}