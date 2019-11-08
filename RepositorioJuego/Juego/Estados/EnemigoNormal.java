package Estados;

import Clases.Enemigo;

public class EnemigoNormal extends EstadoEnemigo{

	public EnemigoNormal(Enemigo e) {
		super(e);
	}
	@Override
	public void disminuirVida(int dano) {
		enemigo.reducirVida(dano);
	}

}
