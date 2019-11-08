package Mapas;

import Clases.Enemigo;
import Clases.Juego;
import Clases.Obstaculo;
import Enemigos.*;
import ObstaculoConVida.Tambor;
import ObstaculoTemporal.Lava;

public class Mapa2 extends Mapa {
	public Mapa2(Juego j) {
		super(j);
		cantEnemigos=10;
		cantObstaculos=3;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Flanders(0,0);
		enemigos[1]= new Moe(0,0);
		obstaculos= new Obstaculo[cantObstaculos-1];
		obstaculos[0]= new Tambor(0,0);
		obstaculos[1]= new Lava(0,0);
		distribucion=3000;
	}
	
	public void mapaSiguiente() {
		juego.limpiarLista();
		juego.setMapa(new Mapa3(juego));
		juego.aumentarMonedas(25000);
		super.mapaSiguiente();
	}
}

