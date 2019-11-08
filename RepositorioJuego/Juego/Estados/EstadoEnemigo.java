package Estados;

import Clases.Enemigo;

public abstract class EstadoEnemigo extends Estado {
	protected Enemigo enemigo;
	
	public EstadoEnemigo(Enemigo e) {
		enemigo=e;
	}
	

}
