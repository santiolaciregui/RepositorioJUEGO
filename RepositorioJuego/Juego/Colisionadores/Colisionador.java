package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Disparos.DisparoAliado;

public abstract class Colisionador {
	
	protected GameObject entidad;
	
	public abstract void afectarJugador(Aliado a);
	public abstract void afectarEnemigo(Enemigo e);
	public abstract void afectarDisparoAliado(DisparoAliado d);
	public abstract void afectarDisparoEnemigo(DisparoAliado d);
}