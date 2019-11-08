package Mapas;

import Clases.Enemigo;
import Clases.Juego;
import Enemigos.*;

public class Mapa3 extends Mapa {
	public Mapa3(Juego j) {
		super(j);
		vida=5;
		cantEnemigos=15;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Burns(0,0);
		enemigos[1]= new BobPatino(0,0);
	}
}
