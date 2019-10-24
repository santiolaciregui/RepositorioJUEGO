package Mapas;

import java.util.LinkedList;
import java.util.Random;
import Clases.Enemigo;
import Clases.GameObject;
import Clases.Juego;
import Enemigos.*;

public class Mapa2 extends Mapa {
	public Mapa2(Juego j) {
		super(j);
		vida=5;
		cantEnemigos=10;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Apu(1129,380);
		enemigos[1]= new BobPatino(1080,210);
		enemigos[2]= new Apu(1012,240);
		enemigos[3]= new BobPatino(1129,270);
		enemigos[4]= new Apu(1050,300);
		enemigos[5]= new BobPatino(1609,340);
		enemigos[6]= new BobPatino(1709,240);
		enemigos[7]= new Apu(1309,300);
		enemigos[8]= new BobPatino(1100,210);
		enemigos[9]= new Apu(1339,270);
	}
}

