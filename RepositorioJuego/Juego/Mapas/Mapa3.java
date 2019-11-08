package Mapas;

import Clases.Enemigo;
import Clases.Juego;
import Clases.Obstaculo;
import Enemigos.*;
import ObstaculoConVida.AutoPolicia;
import ObstaculoTemporal.Llama;

public class Mapa3 extends Mapa {
	public Mapa3(Juego j) {
		super(j);
		cantEnemigos=15;
		cantObstaculos=3;
		enemigos= new Enemigo[cantEnemigos];
		obstaculos= new Obstaculo[cantObstaculos-1];
		enemigos[0]= new Burns(0,0);
		enemigos[1]= new BobPatino(0,0);
		obstaculos[0]= new AutoPolicia(0,0);
		obstaculos[1]= new Llama(0,0);
		distribucion=5000;
	}
	
	public void mapaSiguiente() {
		juego.limpiarLista();
		juego.setMapa(null);
	}
}
