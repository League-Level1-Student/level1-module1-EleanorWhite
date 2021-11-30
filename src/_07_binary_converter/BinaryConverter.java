package _07_binary_converter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BinaryConverter {
	public static void main(String[] args) {
		
//		JFrame.getFrames()
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		JTextField jtf = new JTextField(20);
		jtf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				convert(jtf.getText());
			}
		});
		jp.add(jtf);
		jp.setBounds(40,80,200,200);    
	    jp.setBackground(Color.gray);  
		jf.add(jp);
		 jf.setSize(400,400);    
         jf.setLayout(null);   
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