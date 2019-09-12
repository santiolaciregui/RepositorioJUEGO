package Clases;

import java.util.LinkedList;
import GUI.*;
import Mapas.Mapa;
import Mapas.Mapa1;

public class Juego {
	private Aliado jugador;
	private LinkedList<GameObject> entidades;
	private GUI gui;
	private int puntaje=0;
	private int kills=0;
	private Mapa mapa;
	
	public Juego(GUI gui) {
		this.mapa=new Mapa1(this);
		this.gui=gui; 
		iniciarJugador();
		iniciarEntidades();
	}
	
	public void iniciarJugador() {
		gui.add(jugador.getGrafico());
	}
	
	public void iniciarEntidades() {
		entidades= this.mapa.crearEntidades();
		for(GameObject e: entidades) {
			gui.add(e.getGrafico());
			e.setJuego(this);
		}
	}
	
	public void verificarMapa() {
		if(entidades.size()==0) {
			mapa.mapaSiguiente();
		}
	}
}