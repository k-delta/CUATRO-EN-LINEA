package CuatroEnLinea.Vista;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {
	//ATRIBUTOS
	ImageIcon imagen;
	String nombre;
	//CONSTRUCTOR
	public Panel(String nombre){
		this.nombre=nombre;
	}
	//GENERA UN PANEL PERSONALIZADO
	public void paint(Graphics g){
		Dimension tamanio= getSize();
		imagen = new ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagen.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paint(g);
	}
}
