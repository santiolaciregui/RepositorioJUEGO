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
			ubicacionDefinitiva(nuevo);
			gui.agregarObject(nuevo);
			entidades.addLast(nuevo);
			System.out.println(nuevo.getBounds().getX()+50 +"       " + nuevo.getBounds().getY());
		}
	}
	
	private void ubicacionDefinitiva(GameObject nuevo) {
		int pos= (int) nuevo.getBounds().getY();
		Rectangle aux= nuevo.getBounds();
		if(pos>=-90 && pos<-65)
			nuevo.setBounds(aux.x, -65, aux.width, aux.height);
		else
		if(pos>=-65 && pos<-32)
			nuevo.setBounds(aux.x, -65, aux.width, aux.height);
		else
			if(pos>=-32 && pos<=5)
				nuevo.setBounds(aux.x, 3, aux.width, aux.height);
			else
				if(pos>5 && pos<40)
					nuevo.setBounds(aux.x, 38, aux.width, aux.height);
				else
					if(pos>=40 && pos<=72)
						nuevo.setBounds(aux.x, 69, aux.width, aux.height);
					else
						if(pos>72 && pos<110)
							nuevo.setBounds(aux.x, 105, aux.width, aux.height);
			
		
		
	}
	
	public void eliminarEntidad(GameObject aEliminar) {
		puntaje+=aEliminar.puntosDeMuerte;
		entidades.remove(buscarEntidad(aEliminar));
		gui.eliminarEnemigo(aEliminar);
		System.out.println(puntaje);
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
		Rectangle r1= aux.getBounds();r1.height=40;r1.width=70;
		Rectangle r2= nuevo.getBounds(); r2.height=40; r2.width=70;
		return r1.intersects(r2);
			
	}
	
//	public void actualizarGrafico() {
//		for(GameObject e : entidades) {
//			if(e.getLocation().)
//		}
//	}
	
//	public void verificarMapa() {
//		if(entidades.size()==0) {
//			mapa.mapaSiguiente();
//		}
//	}
}