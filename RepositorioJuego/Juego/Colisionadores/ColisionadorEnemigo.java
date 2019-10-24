package Colisionadores;

import Clases.Aliado;
import Clases.Enemigo;
import Disparos.DisparoAliado;

public class ColisionadorEnemigo extends Colisionador{
	
	public ColisionadorEnemigo(Enemigo a) {
		miEntidad=a;
	}
	@Override
	public void visitar(Aliado a) {
		miEntidad.atacar(a);
	}
	@Override
	public void visitar(Enemigo e) {}
		
	@Override
	public void visitarDisparo(DisparoAliado d) {
		// TODO Auto-generated method stub	
	}
}
