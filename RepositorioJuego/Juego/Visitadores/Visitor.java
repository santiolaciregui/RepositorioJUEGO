package Visitadores;

import Clases.Aliado;
import Clases.Enemigo;
import Clases.GameObject;

public abstract class Visitor {
	protected GameObject entidad;
	
	
	public abstract void visitAliado(Aliado a);
	public abstract void visitEnemigo(Enemigo e);

}
