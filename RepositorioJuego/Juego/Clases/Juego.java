package Clases;

import java.util.LinkedList;
import GUI.*;
import Mapas.Mapa;
import Mapas.Mapa1;

public class Juego {
	private LinkedList<GameObject> entidades;
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
		tienda= new Tienda(this);
		iniciarEntidades();
		monedas=10000000;	
	}
	
	
	public void iniciarEntidades() {
		entidades= this.mapa.crearEntidades();
		for(GameObject e: entidades) {
			e.setJuego(this);
			gui.agregarObject(e.getLabel());
		}
	}
	
	public void eliminarEntidad() {
		LinkedList<GameObject> clonada= (LinkedList<GameObject>) entidades.clone();
		GameObject aEliminar = entidades.isEmpty()? null: entidades.getFirst();
		if(aEliminar != null) {
			puntaje += aEliminar.puntosDeMuerte;
			entidades.remove(aEliminar);
			kills++;
			gui.eliminarEnemigo(aEliminar);
		}
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
	public void moverEnemigos(){
		if(!entidades.isEmpty())
			for(GameObject e: entidades){
				e.mover();
			}
	}
	
	public void pararEnemigosSiEsNecesario() {
		mapa.deboParar();
	}
	
	public boolean hayAlgoCerca(GameObject e) {
		boolean toReturn=false;
		if(mapa.hayColisiones(e)) {
			toReturn=true;
		}
		return toReturn;
	}
	
	public Tienda getTienda() {
		return tienda;
	}
	
	public void verificarMapa() {
		if(entidades.size()==0) {
			mapa.mapaSiguiente();
		}
	}


	public void clickEnMapa(int x, int y) {
		GameObject nuevo= tienda.getCompra();
		if(nuevo!=null)
			if(mapa.puedoAgregar(nuevo, x,y)) {
				gui.agregarObject(nuevo.getLabel());
				entidades.addLast(nuevo);
			}
	}
	
	public void disparar() {
		for(GameObject e: entidades) 
			e.atacar();
	}
	
}