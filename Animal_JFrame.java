package project1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import gui_calc_2tf.CalcJP;

public class Animal_JFrame extends JFrame{

	private String  title = "My Zoo";
	
	public Animal_JFrame() {
		JPanel mainJP = new JPanel();
		mainJP.setLayout(new BorderLayout());
		
		Animal_JP animalJP = new Animal_JP();
		mainJP.add(animalJP);
		add(mainJP);
		
		
		setTitle(title);
		setSize(600,600);
		setLocation(660, 240);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

}
