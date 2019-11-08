package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Clases.ObjetoPrecioso;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import ObstaculoConVida.ObstaculoConVida;
import ObstaculoConVida.Tambor;
import ObstaculoTemporal.ObstaculoTemporal;

public abstract class Colisionador extends Visitor {
	
	protected GameObject miEntidad;
}