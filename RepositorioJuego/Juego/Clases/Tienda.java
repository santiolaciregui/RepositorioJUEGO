package Clases;

import Mapas.Mapa;

public class Tienda {
	protected Juego juego;
	protected Aliado aAgregar;

	public Tienda(Juego j) {
		juego=j;
		aAgregar=null;
	}
	
	public void aAgregar(Aliado nuevo) {
		aAgregar=null;
		if(juego.getMonedas()>= nuevo.getMonedas())
			aAgregar=nuevo;
	}

	public GameObject getCompra() {
		if(aAgregar==null)
			return null;
		return aAgregar;
	}
	
	
}
