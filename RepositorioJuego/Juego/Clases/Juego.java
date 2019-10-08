package Clases;

import java.awt.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;
import GUI.*;
import Mapas.Mapa;
import Mapas.Mapa1;

public class Juego {
	private LinkedList<GameObject> entidades;
	private LinkedList<Enemigo> enemigos;
	private GUI gui;
	private int puntaje = 0;
	private int kills = 0;
	private int monedas;
	private Tienda tienda;
	private Mapa mapa;
	
	public Juego(GUI gui) {
		this.mapa=new Mapa1(this);
		this.gui=gui;
		entidades= new LinkedList<GameObject>();
		enemigos = new LinkedList<Enemigo>();
		iniciarEntidades();
	}
	
	
	public void iniciarEntidades() {
		entidades= this.mapa.crearEntidades();
		for(GameObject e: entidades) {
			e.setJuego(this);
			enemigos.addLast((Enemigo) e);
			gui.agregarObject(e.getLabel());
		}
	}
	
	public void eliminarEntidad() {
		GameObject aEliminar = entidades.isEmpty()? null: entidades.getFirst();
		if(aEliminar != null) {
			puntaje += aEliminar.puntosDeMuerte;
			entidades.remove();
			gui.eliminarEnemigo(aEliminar);
		}
	}
	
	private int buscarEntidad(GameObject elem) {
		int index=0;
		Iterator<GameObject> it = entidades.iterator();
		GameObject aux= it.hasNext()? it.next() : null;
		while(aux!=null && aux!=elem) {
			index++;
			aux= it.next();
		}
		return index;
	}
	
	public void aumentarPuntaje(int p) {
		puntaje=p;
	}
	
	
	public int getMonedas() {
		return monedas;
	}
	public int getPuntaje() {
		return puntaje;
	}
	
//	public void disparar() {
//		for(GameObject e: entidades) {
//			e.disparar();
//		}
//	}
	public void moverEnemigo(){
		for(Enemigo e: enemigos){
			e.mover();
		}
	}
	
	public void verificarMapa() {
		if(entidades.size()==0) {
			mapa.mapaSiguiente();
		}
	}


	public void clickEnMapa(int x, int y) {
		GameObject nuevo= tienda.getCompra();
		if(nuevo!=null)
			if(mapa.agregarEntidad(nuevo, x,y))
				gui.agregarObject(nuevo.getLabel());
				
	}
	
}