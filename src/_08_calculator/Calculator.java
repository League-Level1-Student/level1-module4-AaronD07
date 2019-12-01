package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton mult = new JButton("multiply");
	JButton divide = new JButton("divide");

void add(int i, int x) {
	int y = x+i;
	JOptionPane.showMessageDialog(null, y);
}
void subtract(int i, int x) {
	int y = i-x;
	JOptionPane.showMessageDialog(null, y);
}
void multiply(int i, int x) {
	int y = i*x;
	JOptionPane.showMessageDialog(null, y);
}
void divide(int i, int x) {
	int y = i/x;
	JOptionPane.showMessageDialog(null, y);
}
public void createUI() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	text1.setPreferredSize(new Dimension(200, 25));
	text2.setPreferredSize(new Dimension(200, 25));
	add.addActionListener(this);

	subtract.addActionListener(this);
	
	mult.addActionListener(this);
	
	divide.addActionListener(this);
	panel.add(text1);
	panel.add(text2);
	panel.add(add);
	panel.add(subtract);
	panel.add(mult);
	panel.add(divide);
	frame.add(panel);
	frame.pack();
	
		
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	int i = Integer.parseInt(text1.getText());
	int x = Integer.parseInt(text2.getText());
	if (e.getSource() == add) {
		add(i, x);
	}
	if (e.getSource() == subtract) {
		subtract(i, x);
	}
	if (e.getSource() == mult) {
		multiply(i, x);
	}
	if (e.getSource() == divide) {
		divide(i, x);
	}
	
}
}
