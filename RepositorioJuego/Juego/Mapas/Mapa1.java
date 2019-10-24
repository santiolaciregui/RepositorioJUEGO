package Mapas;

import java.util.LinkedList;
import java.util.Random;

import Clases.Enemigo;
import Clases.GameObject;
import Clases.Juego;
import Enemigos.Barney;
import Enemigos.Flanders;

public class Mapa1 extends Mapa {
	public Mapa1(Juego j) {
		super(j);
		vida=5;
		cantEnemigos=6;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Flanders(1300,200);
		enemigos[1]= new Barney(1300,330);
		enemigos[2]= new Flanders(1300,480);
		enemigos[3]= new Barney(2000,330);
		enemigos[4]= new Flanders(2000,480);
		enemigos[5]= new Barney(2000,600);

		
	}

	@Override
	public LinkedList<GameObject> crearEntidades() {
		LinkedList<GameObject> entidades= new LinkedList<GameObject>();
		Random ran= new Random(2);
		int aux= ran.nextInt();
		for(int i=0;i<cantEnemigos;i++) {
			ubicacionDefinitiva(enemigos[i]);
			GameObject nuevo=enemigos[i];
			entidades.addLast(nuevo);
		}
		return entidades;
	}
}
