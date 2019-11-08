package Clases;

import java.awt.Rectangle;
import java.util.LinkedList;
import GUI.*;
import Mapas.*;

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
		monedas = 4999;	
		puntaje=0;
		vida=3;
		iniciarEntidades();
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
		if(nuevo!=null) {
			nuevo.setPos(x, y);
			if(!mapa.hayColisionesConOtrosPersonajes(nuevo, entidades) && mapa.dentroDeGrilla(nuevo)) {
				mapa.ubicacionDefinitiva(nuevo);
				nuevo.setJuego(this);
				entidadesPendientes.addLast(nuevo);
				tienda.reset();
				monedas -= nuevo.getMonedas();
			}
		}
		
	}
	
	public void agregarObjetos(GameObject e) {
		entidadesPendientes.addLast(e);
		e.setJuego(this);
	}
	
	public LinkedList<GameObject> listaEntidades(){
		return entidades;
	}
	
	public LinkedList<GameObject> listaEntidadesPendientes(){
		return entidadesPendientes;
	}
	
	
	public void agregarEntidades() {
		for(GameObject e: entidadesPendientes) {
			entidades.addLast(e);
			gui.agregarObject(e.getLabel());
		}
		entidadesPendientes.clear();
	}
	
	
	public void eliminarEntidades() {
		for(GameObject e: entidades) {     
			if(e.getVida()<=0) {
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
				mapa.eliminarEnemigo(e);
				entidades.remove(e);
			}
			entidadesAeliminar.clear();
			gui.actualizarVidas();
			gui.actualizarMonedas();
			gui.actualizarBotones();
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
	
	public void limpiarLista() {
		for(GameObject e: entidades)
			entidadesAeliminar.add(e);
	}
	
	

	public void aumentarMonedas(int monedas) {
		this.monedas+=monedas;
	}
	public void disminuirMonedas(int monedas) {
		this.monedas -= monedas;
	}
	
	public int getMonedas() {
		return monedas;
	}
	
	
	public void colisionar() {
		for(int i=0; i<entidades.size();i++) {
			boolean collidedGeneral = false;
			GameObject e1= entidades.get(i);
			for(int j=0;j<entidades.size();j++) {
				GameObject e2=entidades.get(j);
				if(e1 != e2 && verificarColision(e1,e2)) {
					e1.colisionar(e2);
					collidedGeneral=true;
				}				
			}
			if(!collidedGeneral) {
				e1.mover();
			}
		}
	}
	private boolean verificarColision(GameObject e1, GameObject e2) {
		//el rectangulo es mas chico que el tamanio real de la entidad para que las colisiones parezcan mas reales
		Rectangle r1= e1.getLabel().getBounds();
		r1.height/=2.15;
		r1.width/=2;
		Rectangle r2= e2.getLabel().getBounds();
		r2.height/=2.15;
		r2.width/=2;
		return r1.intersects(r2);
	}
		
	public void verificarMapa() {
		if(mapa.listaEnemigos().size()==0) { 
			mapa.mapaSiguiente();
			if(mapa==null)
				gui.ganar();
		}
		if(vida<=0) {
			vida=0;
			limpiarLista();
			gui.gameOver();
			tiempo.finalizar();
		}
		
	}
	
	public void setMapa(Mapa m) {
		mapa= m;
	}
	public HiloTiempo getTiempo() {
		return tiempo;
	}
	public void setTiempo(HiloTiempo tiempo) {
		this.tiempo = tiempo;
	}
	
	public GUI getGui() {
		return gui;
	}
}