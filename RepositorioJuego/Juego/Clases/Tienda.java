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
		System.out.println("wpaaaa");
		if(juego.getMonedas()>= nuevo.getMonedas())
			aAgregar=nuevo;
	}

	public GameObject getCompra() {
		if(aAgregar!=null)
			return aAgregar;
		return null;
		
	}
	
	
}
