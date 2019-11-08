package Estados;

import Clases.Aliado;
public class AliadoSuperPoderoso extends EstadoAliado {
	protected int dano;
	public AliadoSuperPoderoso(Aliado a) {
		super(a);
		dano=aliado.getDano();
	}

	@Override
	public void disminuirVida(int dano) {
		aliado.setEstado(new AliadoNormal(aliado));
		aliado.setDano(dano);
		aliado.atacarSuperPoderosoGrafico();
	}

	@Override
	public void aumentarDano(int d) {	}

	@Override
	public void atacar() {
		aliado.atacarSuperPoderosoGrafico();
	}

	@Override
	public void parar() {
		aliado.pararSuperPoderosoGrafico();
		
	}

}
