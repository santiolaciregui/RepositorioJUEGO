package Armas;

import java.awt.Point;

import javax.swing.ImageIcon;

import Disparos.DisparoAliado;

public class ArmaAbuelo extends Arma {
	
	public DisparoAliado crearDisparo(Point pos) {
		DisparoAliado disparo= new DisparoAliado(800, pos.x, pos.y+50);
		disparo.getLabel().setIcon(new ImageIcon(getClass().getResource("/Imagenes/FuegoAbuelitoGif.gif")));
		disparo.getLabel().setBounds(disparo.getPos().x, disparo.getPos().y, 60, 80);
		return disparo;
	}
	
	public int getCadencia() {
		return 15;
	}
}
