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
		
		this.gui=gui;
		entidades= new LinkedList<GameObject>();
		entidadesAeliminar= new LinkedList<GameObject>();
		entidadesPendientes= new LinkedList<GameObject>();
		this.mapa=new Mapa1(this);
		tienda= new Tienda(this);
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
				nuevo.setJuego(this);
				entidadesPendientes.addLast(nuevo);
				System.out.println(entidades.size());
			}
	}
	
	public void agregarDisparo(GameObject e) {
		entidadesPendientes.addLast(e);
		System.out.println("dadad");
		e.setJuego(this);
	}
	
	public LinkedList<GameObject> listaEntidades(){
		return entidades;
	}
	public void agregarEntidades() {
		for(GameObject e: entidadesPendientes) {
			entidades.addLast(e);
			gui.agregarObject(e.getLabel());
		}
		entidadesPendientes.clear();
	}
	
	public void eliminarEntidades() {
//		if(entidades.size()==0)
//			tiempo.finalizar();
		for(GameObject e: entidades) {     
			if(e.getVida()==0) {
				entidadesAeliminar.add(e);
			}
		}
		eliminarAux(entidadesAeliminar);
	}
	private void eliminarAux(LinkedList<GameObject> lista) {
			LinkedList<GameObject> aux= (LinkedList<GameObject>) entidadesAeliminar.clone();
			entidadesAeliminar= new LinkedList<GameObject>();
			for(GameObject e: aux) {
				gui.eliminarEnemigo(e);
				entidades.remove(e);
			}
			entidadesAeliminar.clear();
			gui.actualizarPuntajes();
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

	
	public void disminuirVida(int vida) {
		this.vida -= vida;
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
	
	
	public void mover() {
		mapa.mover();
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
		if(entidades.size()==0) 
			mapa.mapaSiguiente();
	}
	
	public void atacar() {
		for(GameObject e: entidades) 
			e.atacar(null);
	}
	
	
	public HiloTiempo getTiempo() {
		return tiempo;
	}
	public void setTiempo(HiloTiempo tiempo) {
		this.tiempo = tiempo;
	}

	
}