package Estados;

import Clases.Aliado;
public class AliadoSuperPoderoso extends EstadoAliado {
	
	public AliadoSuperPoderoso(Aliado a) {
		super(a);
	}

	@Override
	public void disminuirVida(int dano) {
		aliado.reducirVida(dano/2);
		if(aliado.getVida()<=2000) {
			aliado.setEstado(new AliadoNormal(aliado));
			aliado.cambiarLabel();
		}
	}

}
