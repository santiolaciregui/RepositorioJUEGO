package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;
import Clases.ObjetoPrecioso;
import Clases.ObstaculoConVida;
import Clases.ObstaculoTemporal;
import Clases.PowerUp;
import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import ObstaculoConVida.Tambor;

public abstract class Colisionador extends Visitor {
	
	protected GameObject miEntidad;
}