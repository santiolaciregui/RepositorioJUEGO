package Mapas;

import java.util.LinkedList;

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
		// TODO Auto-generated method stub
		return null;
	}
}
