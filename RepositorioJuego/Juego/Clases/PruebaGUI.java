package Clases;
import javax.swing.*;

import java.awt.*;

public class PruebaGUI extends JFrame{
	public static String titulo = "Prueba de juego";
	public static Dimension size = new Dimension(617,400);
	
	public PruebaGUI() {
		setTitle(titulo);
		setSize(size);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
	}
	
	public void init() {
		setLayout(new GridLayout(1,1,0,0));
		setVisible(true);
		
		this.setIconImage("/RepositorioJuego/Sprites/premio/krusty3.png");
	}
	
	public static void main (String [] args) {
		PruebaGUI p = new PruebaGUI();
		
	}
}
