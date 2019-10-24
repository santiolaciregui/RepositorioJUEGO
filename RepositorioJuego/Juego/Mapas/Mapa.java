package Mapas;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;

import Clases.Juego;
import Clases.Enemigo;
import Clases.GameObject;

public abstract class Mapa {
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
	}
	
	public abstract LinkedList<GameObject> crearEntidades();

	public void mapaSiguiente() {
		juego.iniciarEntidades();	
	}
	
	
	public void ubicacionDefinitiva(GameObject nuevo) {
		Rectangle rectangulo= nuevo.getLabel().getBounds();
		nuevo.setPos(rectangulo.x-rectangulo.width/2, (((int)(rectangulo.y/altodelaFila))*altodelaFila)-75);
	}
		
	private boolean fueraDeGrilla(GameObject elem) {
		return elem.getLabel().getBounds().y< 85;
	}

	public boolean hayColisionesConOtrosPersonajes(GameObject nuevo) {	
		boolean hayColision=false;
		Iterator<GameObject> it=juego.listaEntidades().iterator();
		Rectangle rNuevo=nuevo.getLabel().getBounds();
		rNuevo.height=30;
		rNuevo.width=80;
		Rectangle rIterador= new Rectangle();
		while(it.hasNext() && !hayColision) {
			GameObject aux=it.next();
			rIterador=aux.getLabel().getBounds();
			rIterador.height=20; 
			rIterador.width=80;
			if(nuevo!=aux) 
				if(rNuevo.intersects(rIterador)) {
					hayColision=true;
				}
		}
		return hayColision;
	}
}
