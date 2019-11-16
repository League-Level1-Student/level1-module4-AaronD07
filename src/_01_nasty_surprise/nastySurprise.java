package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();

	public static void main(String[] args) {
		nastySurprise ns = new nastySurprise();
		ns.run();

	}

	public void run() {
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		button.addActionListener(this);
		button2.addActionListener(this);
		button.setText("Trick");
		button2.setText("Treat");
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(button)) {
showPicture("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7sjnenfSOkD5l3dCZBRT86B431qEXB06WCIjtcZmbfH4FTzG4gQ&s");
		}

		else if (e.getSource().equals(button2)) {
			showPicture("http://static-23.sinclairstoryline.com/resources/media/d60d4f1c-9fcc-4ae4-8058-05e885080e19-large16x9_momo2.PNG?1551379953599");
		}
	}

	private static void showPicture(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
