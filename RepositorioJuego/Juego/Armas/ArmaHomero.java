package Armas;

import java.awt.Point;

import Disparos.DisparoAliado;

public class ArmaHomero extends Arma {
	
	public DisparoAliado crearDisparo(Point pos) {
		DisparoAliado disparo= new DisparoAliado(800, pos.x+40, pos.y+25);
		return disparo;
	}
	
	public int getCadencia() {
		return 15;
	}
}