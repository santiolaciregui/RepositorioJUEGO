package Mapas;

import Clases.Enemigo;
import Clases.Juego;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Enemigos.Barney;
import Enemigos.Flanders;
import ObstaculoConVida.AutoPolicia;
import ObstaculoConVida.Tambor;

public class Mapa1 extends Mapa {
	public Mapa1(Juego j) {
		super(j);
		vida=5;
		cantEnemigos=6;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Flanders(0,0);
		enemigos[1]= new Barney(0,0);
		obstaculos = new ObstaculoConVida[3];
		obstaculos[0] = new Tambor(0,0);
		obstaculos[1] = new Tambor(0,0);
		obstaculos[2] = new Tambor(0,0);
	}
	
	public void mapaSiguiente() {
		juego.limpiarLista();
		juego.setMapa(new Mapa2(juego));
		juego.aumentarMonedas(15000);
		super.mapaSiguiente();
	}
}
