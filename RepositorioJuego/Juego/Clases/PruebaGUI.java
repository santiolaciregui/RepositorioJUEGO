package Clases;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class PruebaGUI extends JFrame{
	
	public static String titulo = "Los Simpsons";
	public static Dimension size = new Dimension(800,600);
	private JButton jugar;
	private JButton salir;
	private JPanel contentPane;

	
	public PruebaGUI() {
		
		contentPane = new JPanelConFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setTitle(titulo);
		setSize(size);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		
		inicializarJugar();
		inicializarSalir();
		
		init();
		
	}
	
	public void init() {
		setLayout(new GridLayout(15,1,0,0));
		setVisible(true);
	}
	
	private void inicializarJugar() {
		ImageIcon icono = new ImageIcon(this.getClass().getResource("/Imagenes/jugar.png"));
		jugar = new JButton("Jugar ",icono);
		jugar.setForeground(Color.BLACK);
		jugar.setFont(new java.awt.Font("Tahoma", 1, 18));
		jugar.setBounds(1, 5, 120, 25);
//		jugar.setBackground(Color.YELLOW);
		contentPane.add(jugar,null);
		jugar.setVisible(true);
	}
	
	private void inicializarSalir() {
		salir = new JButton("Salir ");
		salir.setForeground(Color.BLACK);
		salir.setFont(new java.awt.Font("Tahoma", 1, 18));
		salir.setBounds(1, 5, 120, 25);
		salir.setBackground(Color.YELLOW);
		contentPane.add(salir);
	}
	
	public static void main (String [] args) {
		PruebaGUI p = new PruebaGUI();		
	}
}
