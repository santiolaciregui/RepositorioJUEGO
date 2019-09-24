package Inteligencias;

import java.awt.Point;

import Clases.Juego;

public abstract class Inteligencia {
	protected int velocidad;
	protected Point pos;
	protected Juego juego;
	
	public abstract void mover();
	
	
	
	public void verificarInteligencia() {
	}
	
	public void setJuego(Juego j) {
		juego=j;
	}
}
