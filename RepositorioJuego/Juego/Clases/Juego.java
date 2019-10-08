package Clases;

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
			
			if(mapa.agregarEntidad(e, e.getPos().x,e.getPos().y)) {
				System.out.println("aca: "+e.getPos().x+"   :   "+e.getPos().y);
				gui.agregarObject(e.getLabel());
				enemigos.addLast((Enemigo) e);
			}
		}
	}
	
	public void eliminarEntidad() {
		GameObject aEliminar = entidades.isEmpty()? null: entidades.getFirst();
		if(aEliminar != null) {
			puntaje += aEliminar.puntosDeMuerte;
			entidades.remove();
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