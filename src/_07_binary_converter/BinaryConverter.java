package _07_binary_converter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BinaryConverter {
	public static void main(String[] args) {
		
		BinaryConverter bc = new BinaryConverter();
//		JFrame.getFrames()
		JFrame jf = new JFrame();
		JPanel jp = new JPanel(new BorderLayout());
		JTextField jtf = new JTextField(20);
		JButton jb = new JButton();
		jb.setSize(10, 10);
		JTextField answer = new JTextField(10);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String output = bc.convert(jtf.getText());
				answer.setText(output);
			}
		});
		jtf.setAlignmentX(5);
		jp.add(jtf, BorderLayout.PAGE_START);
		jp.add(jb, BorderLayout.CENTER);
		jp.add(answer, BorderLayout.PAGE_END);
		jp.setBounds(0,0,500,500);    
	    jp.setBackground(Color.gray);  
		jf.add(jp);
		 jf.setSize(500,500);    
         //jf.setLayout(null);   
		jf.setVisible(true);
		
	}

	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
}