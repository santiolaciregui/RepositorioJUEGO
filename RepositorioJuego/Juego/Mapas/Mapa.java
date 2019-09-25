package Mapas;

import java.util.LinkedList;

import Clases.Juego;
import Clases.GameObject;

public abstract class Mapa {
	protected LinkedList<GameObject> entidades;
	protected int cantEnemigos, cantObstaculos;
	protected Juego juego;
	protected int vida;
	
	protected Mapa(Juego j) {
		juego=j;
	}
	
	public abstract LinkedList<GameObject> crearEntidades();

	public void mapaSiguiente() {
		juego.iniciarEntidades();	
	}
	
}
