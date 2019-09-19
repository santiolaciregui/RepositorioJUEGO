package Clases;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class GameObject extends JLabel{
	protected int vida, dano;
	protected Point posicion;
	protected int altura, ancho;
	protected int puntosDeMuerte;
	protected Juego juego;

	public GameObject(int x, int y) {
		this.posicion= new Point(x, y);
		altura=70;
		ancho=40;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setPos(Point pos) {
		this.posicion = pos;
	}

	public int getPuntosDeMuerte() {
		return puntosDeMuerte;
	}

	public void setPuntosDeMuerte(int puntosDeMuerte) {
		this.puntosDeMuerte = puntosDeMuerte;
	}

	public void disminuirVida(int dano ) {
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
	
	public abstract void atacar();
	public abstract void parar();
	
	
}