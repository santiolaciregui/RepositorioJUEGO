package Mapas;

import java.util.LinkedList;
import java.util.Random;
import Clases.Enemigo;
import Clases.GameObject;
import Clases.Juego;
import Enemigos.*;

public class Mapa3 extends Mapa {
	public Mapa3(Juego j) {
		super(j);
		vida=5;
		cantEnemigos=15;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Burns(1129,380);
		enemigos[1]= new Moe(1080,210);
		enemigos[2]= new Burns(1012,240);
		enemigos[3]= new Moe(1129,270);
		enemigos[4]= new Burns(1050,300);
		enemigos[5]= new Moe(1609,340);
		enemigos[6]= new Moe(1709,240);
		enemigos[7]= new Burns(1309,300);
		enemigos[8]= new Moe(1100,210);
		enemigos[9]= new Burns(1339,270);
		enemigos[10]= new Moe(1709,240);
		enemigos[11]= new Burns(1309,300);
		enemigos[12]= new Moe(1100,210);
		enemigos[13]= new Burns(1339,270);
		enemigos[14]= new Moe(1709,240);
	}
}
