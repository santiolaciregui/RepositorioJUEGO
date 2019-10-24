package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Disparos.DisparoAliado;
import PowerUps.PowerUp;

public abstract class Colisionador {
	
	protected GameObject miEntidad;
	
	public abstract void visitar(Aliado a);
	public abstract void visitar(Enemigo e);
	public abstract void visitarDisparo(DisparoAliado d);
//	public abstract void visitarDisparo(DisparoEnemigo d);
	public abstract void afectarPowerUp(PowerUp p);
}