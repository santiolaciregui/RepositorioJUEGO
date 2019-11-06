package Clases;

import java.awt.Point;
import javax.swing.JLabel;
import Colisionadores.Colisionador;
public abstract class GameObject {
	protected int vida, dano;
	protected Juego juego;
	protected int monedas;
	protected JLabel label;
	protected Colisionador col;

	
	protected GameObject (int x, int y) {
		label= new JLabel();
		setPos(x, y);
	}
	
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getVida() {
		return vida;
	}
	
	
	public int getDano() {
		return dano;
	}
	
	public void setDano(int d) {
		dano+=d;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public JLabel getLabel() {
		return label;
	}
	
	
	public void setPos(int x, int y) {
		label.setLocation(x, y);
	}
	public Point getPos() {
		return label.getLocation();
	}	
	
	public void colisionar(GameObject e) {
		e.serColisionado(col);
	}
	
	public Colisionador getCol() {
		return col;
	}
	public void setCol(Colisionador col) {
		this.col = col;
	}
	
	
	
	public void disminuirVida(int dano) {
		vida-=dano;
		if(vida<0) {
			vida=0;
			this.morir();
		}
	}
	
	public  int getMonedas() {
		return monedas;
	}

	public void setJuego(Juego j) {
		juego=j;
	}
	
	public Juego getJuego() {
		return juego;
	}
	
	public void aumentarDano(int dano) {	}
	public void aumentarVida(int vida) {	}
	public abstract void serColisionado(Colisionador col);
	public abstract void atacar(GameObject e);
	public abstract void mover();
	public abstract void parar();
	public abstract void morir();
	
}