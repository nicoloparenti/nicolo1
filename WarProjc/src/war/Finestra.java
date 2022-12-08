package war;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Finestra extends JFrame{
	
	JLabel label= new JLabel("Buona partita");
	
	Finestra() {
		super("Prima finestra");
		Container c = this.getContentPane();
		c.add(label);
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

	
}
