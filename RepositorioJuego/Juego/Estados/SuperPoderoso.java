package Estados;

import Clases.Enemigo;

public class SuperPoderoso extends Estado {
	
	public SuperPoderoso(Enemigo e) {
		super(e);
	}

	@Override
	public void disminuirVida(int dano) {
		enemigo.reducirVida(dano/2);
		if(enemigo.getVida()<1500) {
			enemigo.setEstado(new Normal(enemigo));
			enemigo.cambiarLabel();
		}
	}

}
