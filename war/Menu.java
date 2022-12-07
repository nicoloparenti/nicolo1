package war;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame{
	
	JButton uno = new JButton("Barrett");
	JButton due = new JButton("AK47");
	JButton tre = new JButton("Pistola");
	
	
	public Menu() {
		super("Flow Layout");
		setLayout(new FlowLayout());
		add(uno);
		add(due);
		add(tre);
		setSize(300,100);
		setVisible(true);
		setLocation(1280, 720);
		getContentPane().setBackground(Color.ORANGE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

//public Menu() {
//	super("Flow Layout");
//	Container c = this.getContentPane();
//	c.setLayout(new FlowLayout());
//	c.add(uno);
//	c.add(due);
//	c.add(tre);
//	setSize(300,100);
//	setVisible(true);
//	setBackground(Color.ORANGE);
//}