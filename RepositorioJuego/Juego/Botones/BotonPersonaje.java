package Botones;

import Clases.Tienda;

public abstract class BotonPersonaje extends RoundButton {
	protected int valor;
	public BotonPersonaje(Tienda tien) {
		super(tien);
	}
	
	public void checkActive() {
		if(this.tienda.getJuego().getMonedas() >= this.crear().getMonedas()) {
			this.activar();
		}else {
			this.desactivar();
		}
	}
}
	

