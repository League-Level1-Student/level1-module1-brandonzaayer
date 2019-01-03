import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static JTextField field = new JTextField(20);
	JLabel label = new JLabel();
	JButton button = new JButton();
	static BinaryConverter binary = new BinaryConverter();
	public static void main(String[] args) {
		binary.UI();
		
		
		}
	void UI() {
		
		panel.add(field);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		button.addMouseListener( this);
	}
	
	String convert(String input) {
	          if(input.length() != 8){
	               JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	               return "-";
	          }
	          String binary = "[0-1]+";    //must contain numbers in the given range
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
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String output;
		
		output=binary.convert(field.getText());
		label.setText(output);
		System.out.println(output);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

