package Clases;

import java.util.LinkedList;
import GUI.*;
import Mapas.Mapa;
import Mapas.Mapa1;

public class Juego {
	private LinkedList<GameObject> entidades, entidadesAeliminar, entidadesPendientes;
	private GUI gui;
	private int puntaje, monedas, vida;
	private Tienda tienda;
	private HiloTiempo tiempo;
	private Mapa mapa;
	
	public Juego(GUI gui) {
		this.mapa=new Mapa1(this);
		this.gui=gui;
		entidades= new LinkedList<GameObject>();
		entidadesAeliminar= new LinkedList<GameObject>();
		entidadesPendientes= new LinkedList<GameObject>();
		tienda= new Tienda(this);
		iniciarEntidades();
		monedas=10000000;	
		puntaje=0;
		vida=3;
	}
	
	
	public void iniciarEntidades() {
		entidades= this.mapa.crearEntidades();
		for(GameObject e: entidades) {
			e.setJuego(this);
			gui.agregarObject(e.getLabel());
		}
	}
	
	
	public void agregarEntidad(int x, int y) {
		GameObject nuevo= tienda.getCompra();
		if(nuevo!=null)
			if(mapa.puedoAgregar(nuevo, x,y)) {
				gui.agregarObject(nuevo.getLabel());
				entidadesPendientes.addLast(nuevo);
			}
	}
	
	public void agregarEntidades() {
		synchronized (entidadesPendientes) {
			for(GameObject e: entidadesPendientes) {
				entidades.add(e);
				gui.agregarObject(e.getLabel());
			}
			entidadesPendientes.clear();
		}
	}
	
	
	
	public void eliminarEntidades() {
		if(entidades.size()==0)
			tiempo.finalizar();
		@SuppressWarnings("unchecked")
		LinkedList<GameObject> lista= (LinkedList<GameObject>) entidades.clone();
		for(GameObject e: lista) {     
			if(e.getVida()==0) {
				entidadesAeliminar.add(e);
			}
		}
		eliminarAux();
	}
	private void eliminarAux() {
		synchronized (entidadesPendientes) {
			LinkedList<GameObject> lista= entidadesAeliminar;
			entidadesAeliminar= new LinkedList<GameObject>();
			for(GameObject e: lista) {
				gui.eliminarEnemigo(e);
				gui.repaint();
				entidades.remove(e);

			}
			entidadesAeliminar.clear();
			gui.actualizarPuntajes();
		}
	}
	

	public Mapa getMapa() {
		return mapa;
	}


	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	public Tienda getTienda() {
		return tienda;
	}

	
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getVida() {
		return vida;
	}
	
	
	
	public void aumentarPuntaje(int p) {
		puntaje+=p;
	}
	public int getPuntaje() {
		return puntaje;
	}


	public void aumentarMonedas(int monedas) {
		this.monedas+=monedas;
	}
	public int getMonedas() {
		return monedas;
	}
	
	
	public void moverEnemigos(){
		if(!entidades.isEmpty())
			for(GameObject e: entidades){
				e.mover();
			}
	}
	
	public void pararEnemigosSiEsNecesario() {
		mapa.deboParar();
	}
	
	public boolean hayAlgoCerca(GameObject e) {
		boolean toReturn=false;
		if(mapa.hayColisiones(e)) {
			toReturn=true;
		}
		return toReturn;
	}
	
	
	public void verificarMapa() {
		if(entidades.size()==0) {
			mapa.mapaSiguiente();
		}
	}
	
	public void disparar() {
		for(GameObject e: entidades) 
			e.atacar();
	}
	
	
	public HiloTiempo getTiempo() {
		return tiempo;
	}
	public void setTiempo(HiloTiempo tiempo) {
		this.tiempo = tiempo;
	}

	
}