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
		Rectangle r1= aux.getLabel().getBounds();r1.height=1;r1.width=1;
		Rectangle r2= nuevo.getLabel().getBounds(); r2.height=1; r2.width=1;
		return r1.intersects(r2);
			
	}
	
	public void ubicacionDefinitiva(GameObject nuevo) {
		int posEnY= (int) nuevo.getPos().y;
		if(posEnY>=85 && posEnY<115) 
			nuevo.setPos(nuevo.getPos().x, 105);
		else
			if(posEnY>=117 && posEnY<=146)
				nuevo.setPos(nuevo.getPos().x, 136);
			else
				if(posEnY>150 && posEnY<182)
					nuevo.setPos(nuevo.getPos().x, 172);
				else
					if(posEnY>=182 && posEnY<=215)
						nuevo.setPos(nuevo.getPos().x, 205);
					else
						if(posEnY>218 && posEnY<245)
							nuevo.setPos(nuevo.getPos().x, 235);
						else
							if(posEnY>=248 && posEnY<=278)
								nuevo.setPos(nuevo.getPos().x, 271);
							else
								if(posEnY>281 && posEnY<306)
									nuevo.setPos(nuevo.getPos().x, 300);
	}
	
	
	private boolean fueraDeGrilla(GameObject elem) {
		return elem.getLabel().getBounds().y< 85;
	}

	public boolean agregarEntidad(GameObject nuevo, int x, int y) {
		nuevo.getLabel().setBounds(x, y, nuevo.getLabel().getBounds().width, nuevo.getLabel().getBounds().height);
		ubicacionDefinitiva(nuevo);
		System.out.println(nuevo.getPos().x+"    :    "+ nuevo.getPos().y);
		boolean resul=false;
		if(!hayColisiones(nuevo) && !fueraDeGrilla(nuevo)) {
			resul=true;
		}
		return resul;
	}
	
}
