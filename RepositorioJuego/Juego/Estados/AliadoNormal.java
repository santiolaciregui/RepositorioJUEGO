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

	@Override
	public void aumentarDano(int d) {
		aliado.setDano(d);
		aliado.setEstado(new AliadoSuperPoderoso(aliado));
		aliado.cambiarLabel();
	}

}
