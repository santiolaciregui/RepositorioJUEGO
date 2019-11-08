package Clases;

public class Tienda {
	protected Juego juego;
	protected GameObject aAgregar;
	protected boolean hayBomba;

	public Tienda(Juego j) {
		juego=j;
		aAgregar=null;
		hayBomba=false;
	}
	
	public void aAgregar(GameObject nuevo) {
		aAgregar=null;
		if(juego.getMonedas() >= nuevo.getMonedas()) {
			aAgregar=nuevo;
		}
		else
			juego.getGui().cartelMonedasInsuficientes();
	}

	public GameObject getCompra() {
		if(aAgregar==null)
			return null;
		return aAgregar;
	}
	
	public void reset() {
		aAgregar=null;
	}
	public Juego getJuego() {
		return juego;
	}
	
	public void activarBomba() {
		hayBomba=true;
	}
	public void desactivarBomba() {
		hayBomba=false;
	}

	public boolean hayBomba() {
		return hayBomba;
	}
}
