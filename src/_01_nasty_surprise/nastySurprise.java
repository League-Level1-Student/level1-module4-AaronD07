package _01_nasty_surprise;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
public static void main(String[] args) {
	

showPicture("https://www.google.com/search?q=cute+doggy&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiWyuCGh9zlAhVFMawKHZToAmQQ_AUIEigB&biw=1920&bih=852#imgrc=OZunU8ySS-sYsM:");

	
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
