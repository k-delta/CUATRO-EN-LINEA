package CuatroEnLinea.Logica;

import java.net.URL;

import CuatroEnLinea.Vista.Resultados;

public class SelectorImagen {
	/**
	 * @see El arreglo de imagenes se usa en los frames de juego
	 */
	//ATRIBUTOS CON LAS IMAGENES PARA CADA JUGADOR
	String urlJ1 = "src/images/imJ1.jpg";
	String urlJ2 = "src/images/imJ2.jpg";
	String Imagen[] = new String[2];
	//CONSTRUCTOR DE LA CLASE QUE ME GUARDA LAS IMAGENES EN UN ARREGLO
	public SelectorImagen(){
		Imagen[0]=urlJ1;
		Imagen[1]=urlJ2;
	}
	//METODOS SETTER AND GETTER
	public String[] getImagen() {
		return Imagen;
	}

	public void setImagen(String[] imagen) {
		Imagen = imagen;
	}
	
}
