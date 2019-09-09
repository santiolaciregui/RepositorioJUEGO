package Clases;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class GameObject{
	protected int vida, dano;
	protected Point pos;
	protected int altura, ancho;
	protected int puntosDeMuerte;
	protected Icon imagen;
	protected JLabel grafico;
	protected Juego juego;

	public GameObject(int x, int y) {
		this.pos= new Point(x, y);
		imagen= new ImageIcon();
		altura=70;
		ancho=40;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setPos(Point pos) {
		this.pos = pos;
	}

	public int getPuntosDeMuerte() {
		return puntosDeMuerte;
	}

	public void setPuntosDeMuerte(int puntosDeMuerte) {
		this.puntosDeMuerte = puntosDeMuerte;
	}

	public void disminuirVida(int dano ) {
		vida-=dano;
		if(vida<0)
			vida=0;
	}
	
	public void aumentarVida(int vida ) {
		this.vida+=vida;
		if(vida>100)
			vida=100;
	}
	
	public void setJuego(Juego j) {
		juego=j;
	}
	
	protected void actualizarGrafico(){
		if(this.grafico != null){
			this.grafico.setIcon(this.imagen);
			this.grafico.setBounds(this.pos.x, this.pos.y, ancho, altura);
		}
	}
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(imagen);
			this.grafico.setBounds(this.pos.x, this.pos.y, ancho, altura);
		}
		return this.grafico;
	}
	
	
}