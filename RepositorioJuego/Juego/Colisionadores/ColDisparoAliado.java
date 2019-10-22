package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.Disparo;
import Disparos.DisparoAliado;

public class ColDisparoAliado extends Colisionador{
	protected Disparo disparo;
	
	public ColDisparoAliado(Disparo d) {
		disparo=d;
	}
	
	public void visitar(Aliado j) {	}
	
	public void visitar(Enemigo e) {
		disparo.golpearEnemigo(e);
	}

	@Override
	public void visitarDisparo(DisparoAliado d) {  }

}
