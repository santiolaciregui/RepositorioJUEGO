package GUI;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
	
	public static String titulo = "Los Simpsons";
	public static Dimension size = new Dimension(1244,407);
	private JPanel contentPane;
	

	
	public GUI() {
		
		contentPane = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/fondo.png")).getImage());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(2,2,2,2));
		setTitle(titulo);
		setSize(size);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		init();
		
	}
	
	public void init() {
		setLayout(new GridLayout(15,1,0,0));
		setVisible(true);
		
	}
	
	public static void main (String [] args) {
		GUI p = new GUI();		
	}
	
}
