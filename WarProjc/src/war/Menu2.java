package war;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu2 extends JFrame{
	
	/*
	 dichiariamo tutte le parti del menu:
	 tre pannelli (nord, centro, sud), in cui aggiungeremo successivamente
	 una label (Selezionare:)
	 checkbox (opz1, opz2)
	 pulsanti (ok, annulla)
	*/
	
	private JPanel nordPnl = new JPanel();
	private JPanel centroPnl = new JPanel();
	private JPanel sudPnl = new JPanel();
	private JLabel infoLbl = new JLabel("Selezionare:");
	private JCheckBox opz1Chk = new JCheckBox("Opz1");
	private JCheckBox opz2Chk = new JCheckBox("Opz2");
	private JButton okBtn = new JButton("OK");
	private JButton cancBtn = new JButton("Annulla");
	
	/*
	 aggiungiamo i vari oggetti ad ogni pannello
	 e dichiariamo ogni pannello in che parte della finestra dev'essere
	 (nordPnl a NORTH, centroPnl al CENTER e sudPnl a SOUTH)
	*/
	
	public Menu2() {
		super("Esempio");
		centroPnl.setLayout(new GridLayout(2,1));
		centroPnl.add(opz1Chk);
		centroPnl.add(opz2Chk);
		nordPnl.add(infoLbl);
		sudPnl.add(okBtn);
		sudPnl.add(cancBtn);
		getContentPane().add(nordPnl, BorderLayout.NORTH);
		getContentPane().add(centroPnl, BorderLayout.CENTER);
		getContentPane().add(sudPnl, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		pack();
//		Dimension dim;
//		Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(1280, 720);
//		setLocation((dim.getWidth()-this.getWidth())/2,
//				(dim.getHeight()-this.getHeight())/2);
		setSize(350,150);
		setVisible(true);
		nordPnl.setBackground(Color.ORANGE);
		sudPnl.setBackground(Color.YELLOW);
	}
	
	
	
}
		
