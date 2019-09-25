package Mapas;

import java.util.LinkedList;

import Clases.Enemigo;
import Clases.GameObject;
import Clases.Juego;

public class Mapa1 extends Mapa {

	public Mapa1(Juego j) {
		super(j);
		vida=5;
		cantEnemigos=4;
	}

	@Override
	public LinkedList<GameObject> crearEntidades() {
		entidades= new LinkedList<GameObject>();
		for(int i=0;i<cantEnemigos;i++) {
			Enemigo nuevo= new Enemigo(10,2);
			nuevo.setBounds(600, 300, 103, 110);
			entidades.add(nuevo);
		}
		return entidades;
	}
}
