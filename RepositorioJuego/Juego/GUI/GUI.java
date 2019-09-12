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
		botonHomero.addMouseListener(new oyenteHomero());
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
		panelGrilla.setLayout(new FlowLayout());
		contentPane.add(panelGrilla);
	}
	
	public void iniciarBotones() {
		botonHomero =  new RoundButton(54);
		botonMarge =  new RoundButton(54);
		botonBart =  new RoundButton(54);
		botonLisa =  new RoundButton(54);
		botonAbuelo =  new RoundButton(54);
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
		
	private class oyenteHomero implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			homer= new JLabel();
			homer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
			homer.setLocation(e.getLocationOnScreen());
			panelGrilla.add(homer);
			homer.setVisible(true);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			homer= new JLabel();
			homer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
			homer.setLocation(e.getLocationOnScreen());
			panelGrilla.add(homer);
			homer.setVisible(true);
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			homer= new JLabel();
			homer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
			homer.setLocation(e.getLocationOnScreen());
			panelGrilla.add(homer);
			homer.setVisible(true);
			repaint();
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			homer= new JLabel();
			homer.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
			homer.setLocation(e.getLocationOnScreen());
			panelGrilla.add(homer);
			homer.setVisible(true);
			repaint();
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

	public static void main (String [] args) {
		GUI p = new GUI();
	}

}
