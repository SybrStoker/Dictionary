import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MainWindow extends JFrame{
	MainWindow(){

		//settings of main window
		this.setTitle("Dictionary");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		ImageIcon image = new ImageIcon("logo.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(216, 177, 37));
	}
}
