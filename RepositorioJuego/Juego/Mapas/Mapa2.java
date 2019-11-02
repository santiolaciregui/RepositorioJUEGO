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
		enemigos[0]= new Apu(1129,380);
		enemigos[1]= new BobPatino(1080,210);
	}
	
	public void mapaSiguiente() {
		juego.limpiarLista();
		juego.setMapa(new Mapa3(juego));
		super.mapaSiguiente();
	}
}

