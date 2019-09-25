package GUI;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Clases.Aliado;
import Clases.GameObject;
import Clases.Juego;
import Enemigos.Flanders;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.plaf.basic.BasicButtonUI;

import Aliados.Abuelo;
import Aliados.Bart;
import Aliados.Homero;
import Aliados.Lisa;
import Aliados.Marge;

import java.awt.event.MouseMotionListener;

public class GUI extends JFrame{
	
	public static String titulo = "Los Simpsons";
	public static Dimension size = new Dimension(1250, 660);
	private JLayeredPane panelAbajo, panelGrilla, panelArriba, contentPane;
	private Juego juego;
	protected GameObject proximoAagregar, proximoAeliminar;
	private JButton botonHomero, botonMarge, botonLisa, botonBart, botonAbuelo, jugar, eliminar;
	
	public GUI() {
		
		iniciarContentPane();
		iniciarPanelArriba();
		iniciarPanelGrilla();
		iniciarPanelAbajo();
		
		iniciarBotones();

		juego=new Juego(this);
		setVisible(true);
		setTitle(titulo);
		setSize(size);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botonHomero.addMouseListener(new oyenteHomero());
		botonMarge.addMouseListener(new oyenteMarge());
		botonBart.addMouseListener(new oyenteBart());
		botonLisa.addMouseListener(new oyenteLisa());
		botonAbuelo.addMouseListener(new oyenteAbuelo());	
	}
	
	private void iniciarContentPane() {
		contentPane = new JLayeredPane();
		contentPane.setSize(size);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		this.setContentPane(contentPane);
	}
	
	private void iniciarPanelArriba() {
		panelArriba = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/PanelArribaoriginal.png")).getImage());
		panelArriba.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		contentPane.add(panelArriba);
	}
	
	private void iniciarPanelAbajo() {
		panelAbajo = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/PanelAbajo.png")).getImage());
		panelAbajo.setLayout(new FlowLayout());
		contentPane.add(panelAbajo);
	}
	
	private void iniciarPanelGrilla() {
		panelGrilla = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/FondoConGrillaoriginal.png")).getImage());
		panelGrilla.setLayout(null);
		contentPane.add(panelGrilla);
		panelGrilla.addMouseListener(new oyenteAgregarEntidad());
	}
		
	public void iniciarBotones() {
		jugar= new JButton("Jugar");
		jugar.setFont(new Font("Century Gothic",25, 20));
		eliminar = new JButton("Eliminar");
		eliminar.setFont(new Font("Century Gothic",25, 20));
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
		panelArriba.add(eliminar);
		jugar.setVisible(true);
		
		eliminar.addActionListener(new oyenteEliminar());
		jugar.addActionListener(new oyentejugar());
		repaint();
	}
		
	public void agregarObject(GameObject nuevo) {
		panelGrilla.add(nuevo);
		nuevo.setLocation(nuevo.getBounds().getLocation());
		repaint();
	}
	
	public void eliminarEnemigo(GameObject aEliminar) {
		panelGrilla.remove(aEliminar);
	}
	
	
	private class oyenteEliminar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			juego.eliminarEntidad();
			repaint();
		}
	}
	private class oyentejugar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Flanders flan= new Flanders(550,-44);
			proximoAagregar=flan;
		}
	}
		
	private class oyenteAgregarEntidad implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(proximoAagregar!=null) {
				int x=e.getX();
				int y=e.getY();
				proximoAagregar.setBounds(x-50,y-100, 95, 105);
				System.out.println(y);
				juego.agregarEntidad(proximoAagregar);
				proximoAagregar=null;
				repaint();
			}	
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private class oyenteHomero implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			Aliado homero= new Homero(21,56);
			homero.atacar();
			proximoAagregar=homero;
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
 		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private class oyenteMarge implements MouseListener{
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Aliado marge= new Marge(21,56);
			marge.atacar();
			proximoAagregar=marge;
		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	private class oyenteBart implements MouseListener{
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Aliado bart= new Bart(21,56);
			bart.atacar();
			proximoAagregar=bart;
		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	private class oyenteLisa implements MouseListener{
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Aliado lisa= new Lisa(21,56);
			lisa.atacar();
			proximoAagregar=lisa;
		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	private class oyenteAbuelo implements MouseListener{
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Aliado abuelo= new Abuelo(21,56);
			abuelo.atacar();
			proximoAagregar=abuelo;
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
