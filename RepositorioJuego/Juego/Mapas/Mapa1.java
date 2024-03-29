package Mapas;

import Clases.Enemigo;
import Clases.Juego;
import Clases.Obstaculo;
import Enemigos.Apu;
import Enemigos.Barney;
import ObstaculoTemporal.Llama;

public class Mapa1 extends Mapa {
	public Mapa1(Juego j) {
		super(j);
		cantEnemigos=6;
		cantObstaculos=2;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Apu(0,0);
		enemigos[1]= new Barney(0,0);
		obstaculos = new Obstaculo[cantObstaculos];
		obstaculos[0] = new Llama(0,0);
		distribucion=2000;
	}
	
	public void mapaSiguiente() {
		juego.limpiarLista();
		juego.setMapa(new Mapa2(juego));
		juego.aumentarMonedas(15000);
		super.mapaSiguiente();
	}
}
