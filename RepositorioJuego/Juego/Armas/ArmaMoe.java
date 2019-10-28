package Armas;

import java.awt.Point;

import javax.swing.ImageIcon;

import Disparos.*;

public class ArmaMoe extends Arma{

	@Override
	public Disparo crearDisparo(Point pos, int dano) {
		DisparoEnemigo disparo= new DisparoEnemigo(500, pos.x, pos.y+50);
		disparo.getLabel().setIcon(new ImageIcon(getClass().getResource("/Imagenes/FuegoInvertidoGif.gif")));
		disparo.getLabel().setBounds(disparo.getPos().x-100, disparo.getPos().y, 30, 30);
		return disparo;
	}

}
