package Mapas;

import Clases.Enemigo;
import Clases.Juego;
import Enemigos.*;

public class Mapa2 extends Mapa {
	public Mapa2(Juego j) {
		super(j);
		vida=5;
		cantEnemigos=10;
		enemigos= new Enemigo[cantEnemigos];
		enemigos[0]= new Apu(0,0);
		enemigos[1]= new Moe(0,0);
	}
	
	public void mapaSiguiente() {
		juego.limpiarLista();
		juego.setMapa(new Mapa3(juego));
		juego.aumentarMonedas(25000);
		super.mapaSiguiente();
	}
}

