package PowerUps;

import Clases.PowerUp;

public class PowerBomba extends PowerUp {

	public PowerBomba(int x, int y) {
		super(x, y);
	}

	@Override
	public void realizarAccion() {		
		juego.getTienda().activarBomba();
	}

	@Override
	public void parar() {
	}

}
