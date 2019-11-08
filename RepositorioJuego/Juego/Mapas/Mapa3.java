package Mapas;

import Clases.Enemigo;
import Clases.Juego;
import Clases.Obstaculo;
import Enemigos.*;
import ObstaculoConVida.AutoPolicia;

public class Mapa3 extends Mapa {
	public Mapa3(Juego j) {
		super(j);
		vida=5;
		cantEnemigos=15;
		cantObstaculos=1;
		enemigos= new Enemigo[cantEnemigos];
		obstaculos= new Obstaculo[cantObstaculos];
		enemigos[0]= new Burns(0,0);
		enemigos[1]= new BobPatino(0,0);
		obstaculos[0]= new AutoPolicia(0,0);
	}
	
	public void mapaSiguiente() {
		juego.limpiarLista();
		juego.setMapa(null);
	}
}
