package Clases;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Inteligencias.Inteligencia;
import Visitadores.Visitor;

public abstract class GameObject {
	protected int vida, dano;
	protected int puntosDeMuerte;
	protected Juego juego;
	protected GameObjectGrafico label;
	protected Visitor visitor;
	protected Inteligencia inteligencia;

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public JLabel getLabel() {
		return label.getLabel();
	}
	
	public Point getPos() {
		return label.getLabel().getLocation();
	}
	
	public void setPos(int x, int y) {
		label.setPosicion(x, y);
	}

	public int getPuntosDeMuerte() {
		return puntosDeMuerte;
	}

	public void setPuntosDeMuerte(int puntosDeMuerte) {
		this.puntosDeMuerte = puntosDeMuerte;
	}
	
	public int getDano() {
		return dano;	
	}	

	public void disminuirVida(int dano) {
		vida-=dano;
		if(vida<0)
			vida=0;
	}
	
	public void aumentarVida(int vida ) {
		this.vida+=vida;
		if(vida>100)
			vida=100;
	}
	
	public void setJuego(Juego j) {
		juego=j;
	}
	
	
	public abstract void accept(Visitor v);
	public abstract void atacar();
	public abstract void parar();
	public abstract void accionar();
	public abstract void golpearJugador(GameObject j);
	public abstract void golpearEnemigo(GameObject e);
	
	
}