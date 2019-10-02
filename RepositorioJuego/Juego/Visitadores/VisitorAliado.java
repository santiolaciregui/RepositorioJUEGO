package Visitadores;

import Clases.Aliado;
import Clases.Enemigo;

public class VisitorAliado extends Visitor{

	
	public VisitorAliado(Aliado aliado) {
		entidad=aliado;
	}
	@Override
	public void visitAliado(Aliado a) {
	}

	@Override
	public void visitEnemigo(Enemigo e) {
		e.disminuirVida(entidad.getDano());
	}

}
