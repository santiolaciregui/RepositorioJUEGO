package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;

public class ColisionadorAliado extends Colisionador {
	
	public ColisionadorAliado(Aliado a) {
		miPersonaje=a;
	}

	@Override
	public void visitar(Aliado a) {	
	}

	@Override
	public void visitar(Enemigo e) {
		miPersonaje.atacar(e);
	}
	
	@Override
	public void visitarDisparo(DisparoAliado d) {
		// TODO Auto-generated method stub
		
	}

}
