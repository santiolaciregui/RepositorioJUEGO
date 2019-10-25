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
		enemigos[0]= new Flanders(1200,200);
		enemigos[1]= new Barney(1200,330);
		enemigos[2]= new Flanders(1200,450);
		enemigos[3]= new Barney(2000,380);
		enemigos[4]= new Flanders(2000,460);
		enemigos[5]= new Barney(2000,500);		
	}
}
