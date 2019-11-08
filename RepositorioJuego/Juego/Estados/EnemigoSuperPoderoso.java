package Estados;

import Clases.Enemigo;

public class EnemigoSuperPoderoso extends EstadoEnemigo {
	
	public EnemigoSuperPoderoso(Enemigo e) {
		super(e);
	}

	@Override
	public void disminuirVida(int dano) {
		enemigo.reducirVida(dano/2);
		if(enemigo.getVida()<=2000) {
			enemigo.setEstado(new EnemigoNormal(enemigo));
			enemigo.cambiarLabel();
		}
	}

}
