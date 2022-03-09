import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;

public class WelcomeWindow extends JFrame{
	WelcomeWindow(){
		//label block
		JLabel label = new JLabel();
		ImageIcon comLogo = new ImageIcon("company_logo.jpg");
		Border border = BorderFactory.createLineBorder(Color.black,3);

		
		label.setText("Thanks for using this app.");
		label.setIcon(comLogo);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setFont(new Font("Serif", Font.BOLD, 18));
		label.setForeground(Color.white);
		label.setIconTextGap(50);
		label.setBackground(new Color(75,0,130));
		label.setOpaque(true);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(100,0,400,400);//x,y,width,hight
		label.setBorder(border);

		//settings of main window
		this.setTitle("Dictionary");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);
		this.add(label);

		ImageIcon image = new ImageIcon("logo.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(255,255,255));

	}
}
