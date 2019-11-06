package Mapas;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import Clases.Juego;
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
		Random ran1 = new Random();
		Random ran2 = new Random();
		// Numero entero entre 25 y 75
		int x = ran1.nextInt(1400-1200+1)+1200;
		int y = ran2.nextInt(550-220+1)+220;
		int numeroX = (int)Math.floor(Math.random()*(1400-1200+1)+1600);
		int numeroY = (int)Math.floor(Math.random()*(550-220+1)+200);
		Point punto= new Point(x, y);
		return punto;
	}
	
	public Point posicionAleatoria1() {
		int numero;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
		    numero = (int) (Math.random() * 50 + 1);
		    if (numeros.contains(numero)) {
		        i--;
		    } else {
		        numeros.add(numero);
		    }
		}
		return null;
	}
}
