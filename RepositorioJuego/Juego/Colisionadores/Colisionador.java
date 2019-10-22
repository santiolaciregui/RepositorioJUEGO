package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Disparos.DisparoAliado;

public abstract class Colisionador {
	
	protected GameObject miPersonaje;
	
	public abstract void visitar(Aliado a);
	public abstract void visitar(Enemigo e);
	public abstract void visitarDisparo(DisparoAliado d);
//	public abstract void visitarDisparo(DisparoEnemigo d);
}