package Clases;

import java.awt.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;
import GUI.*;
import Mapas.Mapa;
import Mapas.Mapa1;

public class Juego {
	private LinkedList<GameObject> entidades;
	private GUI gui;
	private int puntaje=0;
	private int kills=0;
	private Mapa mapa;
	
	public Juego(GUI gui) {
		this.mapa=new Mapa1(this);
		this.gui=gui; 
		entidades= new LinkedList<GameObject>();
	}
	
	public void agregarEntidad(GameObject nuevo) {
		if(!hayColisiones(nuevo)) {
			gui.agregarAliado(nuevo);
			entidades.addLast(nuevo);
			System.out.println(entidades.size());
		}
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
		boolean colision=false;
		Rectangle r1= new Rectangle(aux.getBounds().width-50, aux.getBounds().height-50);
		Rectangle r2= new Rectangle(nuevo.getBounds().width, nuevo.getBounds().height);
		if(r1.intersects(r2))
			colision=true;
		return colision;
			
	}
	
//	public void verificarMapa() {
//		if(entidades.size()==0) {
//			mapa.mapaSiguiente();
//		}
//	}
}