package Mapas;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import Clases.Juego;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import ObstaculoConVida.Tambor;
import ObstaculoTemporal.Llama;
import Clases.Enemigo;
import Clases.GameObject;

public abstract class Mapa {
	protected int cantEnemigos, cantObstaculos;
	protected Juego juego;
	protected int cantFilas, altodelaFila, Hgrilla, Wgrilla;
	protected int vida;
	protected LinkedList<GameObject> listaEnemigos;
	protected Enemigo[] enemigos;
	
	public Mapa(Juego j) {
		juego=j;
		cantFilas=4;
		Hgrilla= 250;
		altodelaFila=(int)(Hgrilla/cantFilas);
		Wgrilla= 1250;
		listaEnemigos= new LinkedList<GameObject>();
	}
	
	public LinkedList<GameObject> crearEntidades() {
		LinkedList<GameObject> entidades= new LinkedList<GameObject>();
		Random ran= new Random(2);
		int aux;
		for(int i=0; i<cantEnemigos; i++) {
			aux= ran.nextInt(2);
			GameObject nuevo;
			nuevo=enemigos[aux].crear();
			nuevo.setPos(posicionAleatoria().x, posicionAleatoria().y);
			ubicacionDefinitiva(nuevo);
			System.out.println(nuevo.getPos());
			listaEnemigos.addLast(nuevo);
			entidades.addLast(nuevo);
		}
		return entidades;
	}
	public void mapaSiguiente() {
		juego.iniciarEntidades();
	}
	
	public void eliminarEnemigo(GameObject aEliminar) {
		listaEnemigos.remove(aEliminar);
	}
	
	public LinkedList<GameObject> listaEnemigos(){
		return listaEnemigos;
	}
	public void ubicacionDefinitiva(GameObject nuevo) {
		Rectangle rectangulo= nuevo.getLabel().getBounds();
		nuevo.setPos(rectangulo.x-rectangulo.width/2, (((int)(rectangulo.y/altodelaFila))*altodelaFila)-85);
	}
		
	public boolean dentroDeGrilla(GameObject elem) {
		return elem.getPos().y>170 && elem.getPos().y<515 ;
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
	
	public Point posicionAleatoria() {
		int numeroX = (int)Math.floor(Math.random()*(1400-1200+1)+1600);
		int numeroY = (int)Math.floor(Math.random()*(550-220+1)+200);
		Point punto= new Point(numeroX, numeroY);
		return punto;
	}
}
