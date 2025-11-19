package CuatroEnLinea.Logica;

public class jugadorPuntaje extends Jugador implements Comparable<jugadorPuntaje> {		//claase que implementa una interfas para poder ordenar los jugadores de mejor a peor
	private int tiempo;					//tiempo que tarda jugando 
	//EL ATRIBUTO NOMBRE LO HEREDA DE JUGADOR
	public jugadorPuntaje() {
	}
	public int getTiempo() {			//getters y setters de variables de clase
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	@Override
	public int compareTo(jugadorPuntaje o) {					//metodo implementado
		if(o.getTiempo()>this.tiempo) {					//comparaciones 
			return -1;
		}else if(o.getTiempo()>tiempo) {
			return 0;
		}else {
			return 0;
		}
		
	}

}
