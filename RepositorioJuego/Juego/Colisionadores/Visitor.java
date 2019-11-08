package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.ObjetoPrecioso;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import ObstaculoConVida.ObstaculoConVida;
import ObstaculoTemporal.ObstaculoTemporal;

public abstract class Visitor {
	public abstract void visitar(Aliado a);
	public abstract void visitar(Enemigo e);
	public abstract void visitar(DisparoAliado d);
	public abstract void visitar(DisparoEnemigo d);
	public abstract void visitar(PowerUp p);
	public abstract void visitar(ObstaculoConVida o);
	public abstract void visitar(ObstaculoTemporal o);
	public abstract void visitar(ObjetoPrecioso o);
}
