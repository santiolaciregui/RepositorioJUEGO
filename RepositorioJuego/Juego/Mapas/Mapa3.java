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
		enemigos[0]= new Burns(1270,220);
		enemigos[1]= new Moe(1270,330);
		enemigos[2]= new Burns(1270,450);
		enemigos[3]= new Moe(1800,190);
		enemigos[4]= new Burns(1800,350);
		enemigos[5]= new Moe(1800,450);
		enemigos[6]= new Moe(1800,240);
		enemigos[7]= new Burns(1800,300);
		enemigos[8]= new Moe(2100,210);
		enemigos[9]= new Burns(2100,270);
		enemigos[10]= new Moe(2100,240);
		enemigos[11]= new Burns(2100,300);
		enemigos[12]= new Moe(2100,210);
		enemigos[13]= new Burns(2100,270);
		enemigos[14]= new Moe(2100,240);
	}
}
