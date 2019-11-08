package Armas;

import java.awt.Point;

import javax.swing.ImageIcon;

import Disparos.Disparo;
import Disparos.DisparoEnemigo;

public class ArmaBurns extends Arma{

	@Override
	public Disparo crearDisparo(Point pos, int dano) {
		DisparoEnemigo disparo= new DisparoEnemigo(dano, pos.x-50, pos.y+50);
		disparo.getLabel().setIcon(new ImageIcon(getClass().getResource("/Imagenes/FuegoInvertidoGif.gif")));
		disparo.getLabel().setBounds(disparo.getPos().x, disparo.getPos().y, 30, 30);
		return disparo;
	}

}