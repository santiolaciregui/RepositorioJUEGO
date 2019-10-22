package Mapas;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;

import Clases.Juego;
import Clases.Enemigo;
import Clases.GameObject;

public abstract class Mapa {
	protected LinkedList<GameObject> entidades;
	protected int cantEnemigos, cantObstaculos;
	protected Juego juego;
	protected int cantFilas, altodelaFila, Hgrilla, Wgrilla;
	protected int vida;
	protected Enemigo[] enemigos;
	
	protected Mapa(Juego j) {
		juego=j;
		cantFilas=6;
		Hgrilla= 221;
		altodelaFila=(int)(Hgrilla/cantFilas);
		Wgrilla= 1250;
		entidades=juego.listaEntidades();
	}
	
	public abstract LinkedList<GameObject> crearEntidades();

	public void mapaSiguiente() {
		juego.iniciarEntidades();	
	}
	
	public boolean hayColisiones(GameObject nuevo) {
		boolean hayColision=false;
		Iterator<GameObject> it=entidades.iterator();
		while(it.hasNext() && !hayColision) {
			GameObject aux=it.next();
			if(nuevo!=aux)
				if(verificarColision(aux,nuevo)) 
					hayColision=true;
		}
		return hayColision;
	}
	
	public boolean verificarColision(GameObject aux,GameObject nuevo) {
		Rectangle r1= aux.getLabel().getBounds();r1.height=20;r1.width=40;
		Rectangle r2= nuevo.getLabel().getBounds(); r2.height=20; r2.width=40;
		return r1.intersects(r2);		
	}
	
	public void ubicacionDefinitiva(GameObject nuevo) {
		Rectangle rectangulo= nuevo.getLabel().getBounds();
		nuevo.setPos(rectangulo.x-rectangulo.width/2, (((int)(rectangulo.y/altodelaFila))*altodelaFila)-75);
	}
		
	
	private boolean fueraDeGrilla(GameObject elem) {
		return elem.getLabel().getBounds().y< 85;
	}

	public boolean puedoAgregar(GameObject nuevo, int x, int y) {
		nuevo.setPos(x, y);
		ubicacionDefinitiva(nuevo);
		boolean resul=false;
		if(!hayColisiones(nuevo) && !fueraDeGrilla(nuevo)) {
			resul=true;
			entidades.add(nuevo);
		}
		return resul;
	}
	
	public void eliminarEntidad(GameObject e) {
		entidades.remove(e);
	}
	
	public void moverEnemigos(){
		if(!entidades.isEmpty())
			for(GameObject e: entidades){
				if(!hayColisiones(e))
					e.mover();
			}
	}
	
	public void deboParar() {
		for(GameObject e: entidades) {
			if(hayColisiones(e))
				e.parar();
		}
	}
}
