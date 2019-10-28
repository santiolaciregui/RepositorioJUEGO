package Clases;

import Mapas.Mapa;

public class Tienda {
	protected Juego juego;
	protected GameObject aAgregar;

	public Tienda(Juego j) {
		juego=j;
		aAgregar=null;
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
}
