package PowerUps;

import javax.swing.ImageIcon;

import Clases.PowerUp;

public class PowerBomba extends PowerUp {

	public PowerBomba(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PremioKrusty.gif")));
	}

	@Override
	public void realizarAccion() {		
		juego.getTienda().activarBomba();
	}
}
