package Mapas;

import java.awt.Rectangle;
import java.util.LinkedList;

import Clases.Juego;
import Clases.GameObject;
import Clases.GameObjectGrafico;

public abstract class Mapa {
	protected LinkedList<GameObject> entidades;
	protected int cantEnemigos, cantObstaculos;
	protected Juego juego;
	protected int cantFilas, altodelaFila;
	protected int vida;
	
	protected Mapa(Juego j) {
		juego=j;
	}
	
	public abstract LinkedList<GameObject> crearEntidades();

	public void mapaSiguiente() {
		juego.iniciarEntidades();	
	}
	
	public void ubicacionDefinitiva(GameObjectGrafico nuevo) {
		int pos= (int) nuevo.getBounds().getY();
		Rectangle aux= nuevo.getBounds();
		if(pos>=85 && pos<115) 
			nuevo.setBounds(aux.x, 105, aux.width, aux.height);
		else
			if(pos>=117 && pos<=146)
				nuevo.setBounds(aux.x, 136, aux.width, aux.height);
			else
				if(pos>150 && pos<182)
					nuevo.setBounds(aux.x, 172, aux.width, aux.height);
				else
					if(pos>=182 && pos<=215)
						nuevo.setBounds(aux.x, 205, aux.width, aux.height);
					else
						if(pos>218 && pos<245)
							nuevo.setBounds(aux.x, 235, aux.width, aux.height);
						else
							if(pos>=248 && pos<=278)
								nuevo.setBounds(aux.x, 271, aux.width, aux.height);
							else
								if(pos>281 && pos<306)
									nuevo.setBounds(aux.x, 300, aux.width, aux.height);
	}
	
}
