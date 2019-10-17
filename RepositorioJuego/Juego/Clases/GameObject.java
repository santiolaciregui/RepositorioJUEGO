package Clases;

import java.awt.Point;
import javax.swing.JLabel;

import Colisionadores.Colisionador;
import Inteligencias.Inteligencia;
public abstract class GameObject {
	protected int vida, dano;
	protected Juego juego;
	protected JLabel label;
	protected Colisionador col;
	protected Inteligencia inteligencia;

	
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
	
	public void setDano(int dano) {
		this.dano = dano;
	}	
	public int getDano() {
		return dano;	
	}	
	
	
	public Colisionador getCol() {
		return col;
	}
	public void setCol(Colisionador col) {
		this.col = col;
	}
	
	
	public Inteligencia getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(Inteligencia inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	
	public void aumentarVida(int vida ) {
		this.vida+=vida;
		if(vida>100)
			vida=100;
	}
	
	public void disminuirVida(int dano) {
		vida-=dano;
		if(vida<0)
			vida=0;
	}
	
	
	public void setJuego(Juego j) {
		juego=j;
	}
	
	public Juego getJuego() {
		return juego;
	}
	
	
	public abstract void atacar();
	public abstract void parar();
	public abstract void mover();
	public abstract void accionar();
	public abstract void golpearJugador(GameObject j);
	public abstract void golpearEnemigo(GameObject e);
	
	
}