package GUI;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Clases.Juego;
import Enemigos.Flanders;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.plaf.basic.BasicButtonUI;

import Aliados.Homero;

import java.awt.event.MouseMotionListener;

public class GUI extends JFrame{
	
	public static String titulo = "Los Simpsons";
	public static Dimension size = new Dimension(1250, 660);
	private JLayeredPane panelAbajo, panelGrilla, panelArriba, contentPane;
	private Juego juego;
	private JButton botonHomero, botonMarge, botonLisa, botonBart, botonAbuelo,jugar;
	
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
		oyenteHomero oyente= new oyenteHomero();
		botonHomero.addMouseListener(new oyenteHomero());
		
	}
	private void iniciarContentPane() {
		contentPane = new JLayeredPane();
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
		panelGrilla.setLayout(null);
		contentPane.add(panelGrilla);
		
	}
	
	
	public void iniciarBotones() {
		jugar= new JButton("Jugar");
		jugar.setFont(new Font("Century Gothic",25, 20));
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
		panelArriba.add(jugar);
		jugar.setVisible(true);
		
		jugar.addActionListener(new oyentejugar());
		repaint();
	}
	
	private class oyentejugar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Flanders flan= new Flanders(550,-44);
			flan.setBounds(600, 170,115 , 108);
			jugar.setVisible(false);
			panelGrilla.add(flan);
			flan.setVisible(true);
			repaint();
		}
	}
		
	private class oyenteHomero implements MouseListener{
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Homero homero= new Homero(21,56);
			if(homero.obtenercant()<3)
				homero.parar();
			else
				if(homero.obtenercant()<6)
					homero.atacar();
			homero.setLocation(e.getXOnScreen()-100, e.getYOnScreen()-335);
			panelGrilla.add(homero);
			homero.setFocusable(true);
			homero.setVisible(true);
			repaint();	
		}

		@Override
		public void mouseEntered(MouseEvent e) {

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
