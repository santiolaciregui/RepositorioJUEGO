package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.Disparo;
import Disparos.DisparoAliado;

public class ColDisparoEnemigo extends Colisionador{
	protected Disparo disparo;

	public ColDisparoEnemigo(Disparo d) {
		disparo=d;
	}

	public void visitar(Aliado j) {
		disparo.golpearAliado(j);
	}
	public void visitar(Enemigo e) { }

	@Override
	public void visitarDisparo(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}


}
