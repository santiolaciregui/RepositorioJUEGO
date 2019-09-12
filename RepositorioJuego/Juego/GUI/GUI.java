package GUI;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Clases.Juego;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.event.MouseMotionListener;

public class GUI extends JFrame{
	
	public static String titulo = "Los Simpsons";
	public static Dimension size = new Dimension(1250, 660);
	private JPanel panelAbajo, panelGrilla, panelArriba, contentPane;
	private Juego juego;
	private JLabel homer,krusty;
	private JLabel puntaje;
	private JButton botonHomero, botonMarge, botonLisa, botonBart, botonAbuelo, boton [];
	
	public GUI() {
		
		iniciarContentPane();
		iniciarPanelArriba();
		iniciarPanelGrilla();
		iniciarPanelAbajo();
		iniciarBotones();

		
		setVisible(true);
		setTitle(titulo);
		setSize(size);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botonHomero.addMouseMotionListener(new oyenteHomero());
	}
	private void iniciarContentPane() {
		contentPane = new JPanel();
		contentPane.setSize(size);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		this.setContentPane(contentPane);
	}
	
	private void iniciarPanelArriba() {
		panelArriba = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/PanelArriba.png")).getImage());
		panelArriba.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		contentPane.add(panelArriba);
	}
	
	private void iniciarPanelAbajo() {
		panelAbajo = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/PanelAbajo.png")).getImage());
		panelAbajo.setLayout(new FlowLayout());
		contentPane.add(panelAbajo);
	}
	
	private void iniciarPanelGrilla() {
		panelGrilla = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/FondoConGrilla.png")).getImage());
		panelGrilla.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		contentPane.add(panelGrilla);
	}
	
	public void iniciarBotones() {
		botonHomero =  new RoundButton(54);
		botonMarge =  new RoundButton(54);
		botonBart =  new RoundButton(54);
		botonLisa =  new RoundButton(54);
		botonAbuelo =  new RoundButton(54);
		botonHomero.setBounds(1, 3, 40, 40);
		botonAbuelo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoAbuelo.png")));
		botonHomero.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoHomero.png")));
		botonMarge.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoMarge.png")));
		botonBart.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoBart.png")));
		botonLisa.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLisa.png")));		
		panelAbajo.add(botonHomero);
		panelAbajo.add(botonMarge);
		panelAbajo.add(botonBart);
		panelAbajo.add(botonLisa);
		panelAbajo.add(botonAbuelo);
		
		repaint();
	}
		
	private class oyenteHomero implements MouseMotionListener{
		@Override
		public void mouseDragged(MouseEvent e) {
			int x=0;
			int y=0;
			moviendoListener(e,x,y);
			homer= new JLabel();
			homer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
			panelGrilla.add(homer);
			homer.setLocation(x-(homer.getWidth() / 2),y - (homer.getHeight() / 2));
			homer.setVisible(true);
			
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		private void moviendoListener(MouseEvent evt, int x, int y) {
//			homer.setVisible(true);
			repaint();
			x=evt.getX();
			y=evt.getY();
					
	        
	        System.out.println(evt.getX()+", "+evt.getY());
	    }
	}

	public static void main (String [] args) {
		GUI p = new GUI();
	}

}
