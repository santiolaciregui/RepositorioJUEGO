package Estados;

import Clases.Enemigo;

public abstract class Estado {
	protected Enemigo enemigo;
	
	public Estado(Enemigo e) {
		enemigo=e;
	}
	public abstract void disminuirVida(int dano);

}
