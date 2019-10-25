package Armas;

import java.awt.Point;

import javax.swing.ImageIcon;

import Disparos.DisparoAliado;

public class ArmaHomero extends Arma {
	
	public DisparoAliado crearDisparo(Point pos) {
		DisparoAliado disparo= new DisparoAliado(800, pos.x+120, pos.y+50);
		disparo.getLabel().setIcon(new ImageIcon(getClass().getResource("/Imagenes/BoloGif.gif")));
		disparo.getLabel().setBounds(disparo.getPos().x, disparo.getPos().y, 15, 15);
		return disparo;
	}
	
	public int getCadencia() {
		return 15;
	}
}