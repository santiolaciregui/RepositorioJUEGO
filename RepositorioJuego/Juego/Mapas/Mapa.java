package Mapas;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import Clases.Juego;
import Clases.Obstaculo;
import Clases.Enemigo;
import Clases.GameObject;

public abstract class Mapa {
	protected int cantEnemigos, cantObstaculos;
	protected Juego juego;
	protected int cantFilas, altodelaFila, Hgrilla, Wgrilla;
	protected int distribucion;
	protected int vida;
	protected LinkedList<GameObject> listaEnemigos, listaObstaculos;
	protected Enemigo[] enemigos;
	protected Obstaculo[] obstaculos;
	
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
			nuevo=enemigos[aux].clonar();
			Point lugar=posicionAleatoriaEnemigos();
			nuevo.setPos(lugar.x, lugar.y);
			ubicacionDefinitiva(nuevo);
			if(!hayColisionesConOtrosPersonajes(nuevo, entidades)) {
				listaEnemigos.addLast(nuevo);
				entidades.addLast(nuevo);
			}
			else {
				i--;
				nuevo=null;
			}
		}
		for(int i=0; i<cantObstaculos; i++) {
			GameObject nuevo;
			nuevo=obstaculos[i];
			Point lugar=posicionAleatoriaObstaculos();
			nuevo.setPos(lugar.x, lugar.y);
			ubicacionDefinitiva(nuevo);
			if(!hayColisionesConOtrosPersonajes(nuevo, entidades)) {
				entidades.addLast(nuevo);
			}
			else {
				i--;
				nuevo=null;
			}
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
		return elem.getPos().y>180 && elem.getPos().y<515 ;
	}

	public boolean hayColisionesConOtrosPersonajes(GameObject nuevo, LinkedList<GameObject> lista) {	
		boolean hayColision=false;
		Iterator<GameObject> it=lista.iterator();
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
	
	public Point posicionAleatoriaEnemigos() {
		Random ranx = new Random();
		Random rany = new Random();
		// Numero entero entre 25 y 75
		int x = ranx.nextInt(distribucion-1200+1)+1200;
		int y = rany.nextInt(550-220+1)+220;
		Point punto= new Point(x, y);
		return punto;
	}
	
	public Point posicionAleatoriaObstaculos() {
		Random ranx1 = new Random();
		Random rany1 = new Random();
		// Numero entero entre 25 y 75
		int x = ranx1.nextInt(900-800+1)+800;
		int y = rany1.nextInt(450-250+1)+220;
		Point punto= new Point(x, y);
		return punto;
	}
}
