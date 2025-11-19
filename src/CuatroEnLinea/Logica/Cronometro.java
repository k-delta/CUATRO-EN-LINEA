package CuatroEnLinea.Logica;

public class Cronometro {
	private int segundos;		//atrubutos de una clase cronometro
	
	public Cronometro() {			//constructor clase cronometro
		for (segundos = 0; segundos < 900; segundos++) {
			try {
				Thread.sleep(1000);				//retardo de ejecucion de 1000 milesgundos
			} catch (Exception e) {

			}
		}

	}

	public int getSegundos() {						//getters y setters del atrubuto segundo de clase
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	

}
