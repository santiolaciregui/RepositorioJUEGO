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
			if(!hayColisiones(e))
				gui.agregarObject(e.label());
		}
	}
	public void agregarEntidad(GameObject nuevo) {
		if(!hayColisiones(nuevo) && !fueraDeGrilla(nuevo)) {
			gui.agregarObject(nuevo.label());
			
			entidades.addLast(nuevo);
//			System.out.println(nuevo.getBounds().getX()+50 +"       " + nuevo.getBounds().getY());
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
	
	private boolean fueraDeGrilla(GameObject elem) {
		return elem.label().getBounds().y< 85;
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
	
	
	public boolean hayColisiones(GameObject nuevo) {
		boolean hayColision=false;
		Iterator<GameObject> it=entidades.iterator();
		while(it.hasNext() && !hayColision) {
			GameObject aux=it.next();
			if(verificarColision(aux,nuevo))
				hayColision=true;
		}
		return hayColision;
	}
	
	private boolean verificarColision(GameObject aux,GameObject nuevo) {
		Rectangle r1= aux.label().getBounds();r1.height=20;r1.width=60;
		Rectangle r2= nuevo.label().getBounds(); r2.height=20; r2.width=60;
		return r1.intersects(r2);
			
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
			e.mover(1);
		}
	}
	
	public void verificarMapa() {
		if(entidades.size()==0) {
			mapa.mapaSiguiente();
		}
	}


	public void clickEnMapa(int x, int y) {
		GameObject nuevo= tienda.getCompra(x,y);
		if(nuevo!=null)
			nuevo.setPos(x-50,y-100);
	}
	
}