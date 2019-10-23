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
	
	public boolean hayColisiones(GameObject nuevo) {
		boolean hayColision=false;
		Iterator<GameObject> it=juego.listaEntidades().iterator();
		while(it.hasNext() && !hayColision) {
			GameObject aux=it.next();
			if(nuevo!=aux)
				if(verificarColision(aux,nuevo)) {
					hayColision=true;
					
				}
		}
		return hayColision;
	}
	
	public boolean verificarColision(GameObject aux,GameObject nuevo) {
		Rectangle r1= aux.getLabel().getBounds();
		r1.height=20;r1.width=40;
		Rectangle r2= nuevo.getLabel().getBounds(); r2.height=20; r2.width=40;
		return r1.intersects(r2);		
	}
	
//	public void colisionar(GameObject jugador) {
//		for(int i=0; i<juego.listaEntidades().size();i++) {
//			GameObject e1= juego.listaEntidades().get(i);
//			verificarColision(e1,jugador);
//			for(int j=i+1;j<juego.listaEntidades().size();j++) {
//				GameObject e2=juego.listaEntidades().get(j);
//				verificarColision(e1,e2);
//			}
//		}
//	}
//	private void verificarColision(GameObject e1, GameObject e2) {
//		//el rectangulo es mas chico que el tamanio real de la entidad para que las colisiones parezcan mas reales
//		Rectangle r1= new Rectangle(e1.getPos().x+2, e1.getPos().y+2, e1.getLabel().getWidth()-2, e1.getLabel().getHeight()-2);
//		Rectangle r2= new Rectangle(e2.getPos().x+2, e2.getPos().y+2, e2.getLabel().getWidth()-2, e2.getLabel().getHeight()-2);
//		if(r1.intersects(r2)) {
//			colisionar(e2);
//			colisionar(e1);
//		}
//	}
	
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
		}
		return resul;
	}
	
	
	public void mover(){
		if(!juego.listaEntidades().isEmpty())
			for(GameObject e: juego.listaEntidades()){
				if(!hayColisiones(e))
					e.mover();
			}
	}
	
	public void deboParar() {
		for(GameObject e: juego.listaEntidades()) {
			if(hayColisiones(e))
				e.parar();
		}
	}
}
