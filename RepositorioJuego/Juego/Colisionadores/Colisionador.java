package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Obstaculos.ObstaculoConVida;
import Obstaculos.ObstaculoTemporal;
import Obstaculos.Tambor;
import PowerUps.PowerUp;

public abstract class Colisionador {
	
	protected GameObject miEntidad;
	
	public abstract void visitar(Aliado a);
	public abstract void visitar(Enemigo e);
	public abstract void visitar(DisparoAliado d);
	public abstract void visitar(DisparoEnemigo d);
	public abstract void visitar(PowerUp p);
	public abstract void visitar(ObstaculoConVida o);
	public abstract void visitar(ObstaculoTemporal o);
}