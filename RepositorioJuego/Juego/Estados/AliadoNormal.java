package Estados;

import Clases.Aliado;
public class AliadoNormal extends EstadoAliado{

	public AliadoNormal(Aliado a) {
		super(a);
	}

	@Override
	public void disminuirVida(int dano) {
		aliado.reducirVida(dano);
	}

}
