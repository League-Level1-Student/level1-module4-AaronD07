package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
public static void main(String[] args) {

ChuckleClicker clicker = new ChuckleClicker();
clicker.makeButtons();
}

private void makeButtons() {
	JOptionPane.showMessageDialog(null, "Make Buttons");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.add(panel);
	panel.add(button2);
	panel.add(button1);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "hi");
if(e.getSource() == button2) {
		JOptionPane.showMessageDialog(null, "What did Jay-Z call his girlfriend before they got married?");
	}
if (e.getSource() == button1) {
	JOptionPane.showMessageDialog(null, "Feyoncé.");


}
}
}

