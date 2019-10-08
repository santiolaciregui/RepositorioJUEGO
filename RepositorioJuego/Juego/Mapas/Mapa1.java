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
		cantEnemigos=4;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Flanders(1129,100);
		enemigos[1]= new Barney(1080,160);
		enemigos[2]= new Flanders(1012,230);
		enemigos[3]= new Barney(1129,500);

		
	}

	@Override
	public LinkedList<GameObject> crearEntidades() {
		entidades= new LinkedList<GameObject>();
		int y=85;
		int x=1000;
		Random ran= new Random(2);
		int aux= ran.nextInt();
		for(int i=0;i<cantEnemigos;i++) {
			GameObject nuevo=enemigos[i];
			nuevo.getLabel().setBounds(x-=50, y+=40, 110, 100);
			entidades.addFirst(nuevo);
		}
		return entidades;
	}
}
