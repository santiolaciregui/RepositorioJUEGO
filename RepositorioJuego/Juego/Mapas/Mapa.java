package Mapas;

import java.awt.Rectangle;
import java.util.Iterator;
import java.util.LinkedList;

import Clases.Juego;
import Clases.Enemigo;
import Clases.GameObject;
import Clases.GameObjectGrafico;

public abstract class Mapa {
	protected LinkedList<GameObject> entidades;
	protected int cantEnemigos, cantObstaculos;
	protected Juego juego;
	protected int cantFilas, altodelaFila;
	protected int vida;
	protected Enemigo[] enemigos;
	
	protected Mapa(Juego j) {
		juego=j;
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
			if(verificarColision(aux,nuevo))
				hayColision=true;
		}
		return hayColision;
	}
	
	private boolean verificarColision(GameObject aux,GameObject nuevo) {
		Rectangle r1= aux.getLabel().getBounds();r1.height=20;r1.width=60;
		Rectangle r2= nuevo.getLabel().getBounds(); r2.height=20; r2.width=60;
		return r1.intersects(r2);
			
	}
	
	public void ubicacionDefinitiva(GameObjectGrafico nuevo) {
		int pos= (int) nuevo.getLabel().getBounds().getY();
		Rectangle aux= nuevo.getLabel().getBounds();
		if(pos>=85 && pos<115) 
			nuevo.getLabel().setBounds(aux.x, 105, aux.width, aux.height);
		else
			if(pos>=117 && pos<=146)
				nuevo.getLabel().setBounds(aux.x, 136, aux.width, aux.height);
			else
				if(pos>150 && pos<182)
					nuevo.getLabel().setBounds(aux.x, 172, aux.width, aux.height);
				else
					if(pos>=182 && pos<=215)
						nuevo.getLabel().setBounds(aux.x, 205, aux.width, aux.height);
					else
						if(pos>218 && pos<245)
							nuevo.getLabel().setBounds(aux.x, 235, aux.width, aux.height);
						else
							if(pos>=248 && pos<=278)
								nuevo.getLabel().setBounds(aux.x, 271, aux.width, aux.height);
							else
								if(pos>281 && pos<306)
									nuevo.getLabel().setBounds(aux.x, 300, aux.width, aux.height);
	}
	
	
	private boolean fueraDeGrilla(GameObject elem) {
		return elem.getLabel().getBounds().y< 85;
	}

	public boolean agregarEntidad(GameObject nuevo, int x, int y) {
		nuevo.getLabel().setBounds(x, y, nuevo.getLabel().getBounds().width, nuevo.getLabel().getBounds().height);
		boolean resul=false;
		if(!hayColisiones(nuevo) && !fueraDeGrilla(nuevo)) {
			resul=true;
		}
		return resul;
	}
	
}
