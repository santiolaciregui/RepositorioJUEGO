package Estados;

import Clases.Enemigo;

public class Normal extends Estado{

	public Normal(Enemigo e) {
		super(e);
	}

	@Override
	public void disminuirVida(int dano) {
		enemigo.reducirVida(dano);
	}

}
