package Clases;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public abstract class Entidad {
	protected int vida, damage;
	protected Point pos;
	protected int width, height;
	protected int puntosDeMuerte;
	protected JLabel grafico;
	protected Icon imagen;
	
	public Entidad(int x, int y) {
		this.pos= new Point(x, y);
		imagen= new ImageIcon();
	}
	
	
}
