package CuatroEnLinea.Logica;

public class CondicionJugador {
	//CONSTRUCTOR DE LA CLASE
	public CondicionJugador(){
	}
	/**
	 * @return Retorna verdadero si juega el jugador 2
	 */
	//METODO QUE PERMITE EL INTERCAMBIO DE TURNOS DE LOS JUGADORES
	public boolean condicion(int n){
		if(n%2==1){
			return true;
		}else{
			return false;
		}
	}
}
