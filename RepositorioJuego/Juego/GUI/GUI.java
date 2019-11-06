package GUI;
import javax.swing.*;
import Clases.GameObject;
import Clases.Juego;
import Enemigos.Flanders;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Botones.ColeccionBotones;

@SuppressWarnings("serial")
public class GUI extends JFrame{
	
	public static String titulo = "Los Simpsons";
	public static Dimension size = new Dimension(1250, 790);
	private JPanel panelAbajo, panelGrilla, panelArriba, contentPane;
	private Juego juego;
	protected GameObject proximoAagregar, proximoAeliminar;
	@SuppressWarnings("unused")
	private ColeccionBotones botones;
	private JLabel etiquetaPuntaje, etiquetaVida, etiquetaMonedas, gameOver, ganar;
	private boolean lock = false;
	private HiloTiempo tiempo;
	private int direction = -1;
	
	public GUI() {
		inicializarTodo();
	}
	
	private void iniciarContentPane() {
		contentPane = new JPanel();
		contentPane.setSize(size);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		this.setContentPane(contentPane);
	}
	
	private void iniciarPanelArriba() {
		panelArriba = new JPanelConFondo(new ImageIcon(getClass().getResource("/Imagenes/PanelArribaoriginal.png")).getImage());
		panelArriba.setLayout(new FlowLayout());
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
		botones= new ColeccionBotones(panelAbajo, juego.getTienda());		
		repaint();
	}
	
	public JPanel panel() {
		return panelGrilla;
	}
		
	public void agregarObject(JLabel nuevo) {
		panelGrilla.add(nuevo);
		nuevo.setLocation(nuevo.getBounds().getLocation());
		panelGrilla.setComponentZOrder(nuevo, 0);
		repaint();
	}
	public void eliminarEnemigo(GameObject aEliminar) {
		panelGrilla.remove(aEliminar.getLabel());
		repaint();
	}
	
	public void gameOver() {
		gameOver= new JLabel();
		gameOver.setBounds(0,0,1280,550);
		gameOver.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/perder2.png")));
		terminarJuego(gameOver);
	}
	public void ganar() {
		ganar= new JLabel();
		ganar.setBounds(0,0,1280,485);
		ganar.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/ganar.png")));
		terminarJuego(ganar);
	}
	private void terminarJuego(JLabel label) {
		JButton volverAJugar= new JButton();
		volverAJugar.setBounds(580, 360, 461, 29);
		volverAJugar.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/volverAJugar.png")));
		volverAJugar.setOpaque(false);
		volverAJugar.setBackground(new Color(0,0,0));
		volverAJugar.setBorderPainted(false);
		volverAJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
				inicializarTodo();
				requestFocus();
			}
		});
		
		JButton salir= new JButton();
		salir.setBounds(580, 350, 401, 129);
		salir.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/salir.png")));
		salir.setOpaque(false);
		salir.setBackground(new Color(0,0,0));
		salir.setBorderPainted(false);
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		});
		
		panelGrilla.removeAll();
		panelGrilla.add(label);
		panelGrilla.add(volverAJugar);
		panelGrilla.add(salir);
		this.repaint();
	}
	
	public void inicializarTodo() {
		iniciarContentPane();
		iniciarPanelArriba();
		iniciarPanelGrilla();
		iniciarPanelAbajo();
		
		//ETIQUETA VIDA
		etiquetaVida= new JLabel("VIDA: ");
		etiquetaVida.setForeground(Color.BLACK);
		etiquetaVida.setFont(new Font("Font.PLAIN", 3, 24));
		panelArriba.add(etiquetaVida);
		//ETIQUETA MONEDAS
		etiquetaMonedas = new JLabel("MONEDAS: ");
		etiquetaMonedas.setForeground(Color.BLACK);
		etiquetaMonedas.setFont(new Font("Font.PLAIN", 3, 18));
		panelArriba.add(etiquetaMonedas);

		juego = new Juego(this);
		
		iniciarBotones();
		
		tiempo = new HiloTiempo(juego);
		juego.setTiempo(tiempo);
		tiempo.start();
		setVisible(true);
		setTitle(titulo);
		setSize(size);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void cartelMonedasInsuficientes() {
		JOptionPane.showMessageDialog(null,"Monedas insuficientes","Fondos insuficientes para comprar este personaje",JOptionPane.ERROR_MESSAGE);
	}
	
	public boolean getLock(){
		return this.lock;
	}
	
	public void toggleLock(){
		this.lock = !this.lock;
	}
	
	public int getDirection(){
		return this.direction;
	}
	
	
	private class oyenteAgregarEntidad implements MouseListener{
		public void mouseClicked(MouseEvent e) {
				int x=e.getX();
				int y=e.getY();
				juego.agregarEntidad(x,y);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
		}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	
	
	public static void main (String [] args) {
		new GUI();
	}

	public void actualizarPuntajes() {
		etiquetaPuntaje.setText("PUNTAJE: "+juego.getPuntaje()+" ");		
	}
	
	public void actualizarVidas() {
		etiquetaVida.setText(""+juego.getVida());
		etiquetaVida.setLocation(410, 13);
	}
	public void actualizarMonedas() {
		etiquetaMonedas.setText("MONEDAS: "+juego.getMonedas()+" ");
		etiquetaMonedas.setLocation(740, 17);
	}
	
	public void actualizarBotones() {
		botones.actualizar();
	}
	

}
