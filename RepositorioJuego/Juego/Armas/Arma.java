  package Armas;

import java.awt.Point;

import Disparos.DisparoAliado;

public abstract class Arma {
	
	public abstract DisparoAliado crearDisparo(Point pos);
	
}