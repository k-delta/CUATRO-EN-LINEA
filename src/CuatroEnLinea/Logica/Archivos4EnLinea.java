package CuatroEnLinea.Logica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Archivos4EnLinea {							//clase que creara y grabara los archivos del juego
	jugadorPuntaje puntaje=null;
	
	
	public void grabarArchivo(jugadorPuntaje puntaje) {
		this.puntaje=puntaje;
		System.out.println(this.puntaje.getNombre()+" ---- "+this.puntaje.getTiempo());
		DataOutputStream score=null;					//creacion de un objeto tipo archivo
		
		
		
		try {
			score=new DataOutputStream(new FileOutputStream("src/CuatroEnLinea/Persistencia/score.txt", true));			//se creara un archivo en el que se puede volver a guardar datos
			
			score.writeUTF(this.puntaje.getNombre());				//se graban los datos en un archivo score, guardando ambos jugadores de la partida
			score.writeInt(this.puntaje.getTiempo());						
			score.close();								//se cierra la grabacion en el archivo para que sea sastisfactorio el cargue
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void grabarArchivo(int num) {
		DataOutputStream numArc=null;					//creacion de un objeto tipo archivo
		try {
			numArc=new DataOutputStream(new FileOutputStream("src/CuatroEnLinea/Persistencia/num.txt"));
			numArc.writeInt(num);						//se graba en un archivo num un valor entero que indicara cuantas veces se ejecuto el archivo
			numArc.close();								//cerramos la grabacion en el archivo
		} catch (Exception e) {
		}
	}
}
