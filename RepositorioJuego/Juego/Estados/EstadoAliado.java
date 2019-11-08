package Estados;

import Clases.Aliado;
public abstract class EstadoAliado extends Estado {
	protected Aliado aliado;
	
	public EstadoAliado(Aliado a) {
		aliado=a;
	}

}
