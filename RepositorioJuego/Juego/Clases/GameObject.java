package Clases;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class GameObject{
	protected int vida, dano;
	protected Point pos;
	protected int altura, ancho;
	protected int puntosDeMuerte;
	protected Icon imagen;

	public GameObject(int x, int y) {
		this.pos= new Point(x, y);
		imagen= new ImageIcon();
	}
}