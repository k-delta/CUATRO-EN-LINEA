package CuatroEnLinea.Logica;

public class Winner {
	//ATRIBUTOS
	private String uno = "";
	private String dos = "";
	private String tres = "";
	private String cuatro = "";
	private String cinco = "";
	private String seis = "";
	private String siete = "";
	private String Duno = "";
	private String Ddos = "";
	private String Dtres = "";
	private String Dcuatro = "";
	private String Dcinco = "";
	private String Dseis = "";
	private String Dsiete = "";
	private String Vuno = "";
	private String Vdos = "";
	private String Vtres = "";
	private String Vcuatro = "";
	private String Vcinco = "";
	private String Vseis = "";
	private String Vsiete = "";
	private String Tuno = "";
	private String Tdos = "";
	private String Ttres = "";
	private String Tcuatro = "";
	private String Tcinco = "";
	private String Tseis = "";
	private String Tsiete = "";
	private String Cuno = "";
	private String Cdos = "";
	private String Ctres = "";
	private String Ccuatro = "";
	private String Ccinco = "";
	private String Cseis = "";
	private String Csiete = "";
	private String Suno = "";
	private String Sdos = "";
	private String Stres = "";
	private String Scuatro = "";
	private String Scinco = "";
	private String Sseis = "";
	private String Ssiete = "";
	
	String Opciones[][] = new String[7][8];

	/**
	 * 
	 */
	//METODO CONSTRUCTOR
	public Winner() {
	}
	//METODO QUE PERMITE ENCONTRAR TODAS LAS POSIBLES OPCIONES PARA GANAR CON CUALQUIERA DE LOS JUGADORES
	public boolean Ganador() {
		//GUARDA LOS DATOS DE LAS JUGADAS EN UN ARREGLO, RESPECTIVAMENTE EN SU POSICION
		Opciones[0][1] = getUno();
		Opciones[0][2] = getDos();
		Opciones[0][3] = getTres();
		Opciones[0][4] = getCuatro();
		Opciones[0][5] = getCinco();
		Opciones[0][6] = getSeis();
		Opciones[0][7] = getSiete();
		Opciones[1][1] = getDuno();
		Opciones[1][2] = getDdos();
		Opciones[1][3] = getDtres();
		Opciones[1][4] = getDcuatro();
		Opciones[1][5] = getDcinco();
		Opciones[1][6] = getDseis();
		Opciones[1][7] = getDsiete();
		Opciones[2][1] = getVuno();
		Opciones[2][2] = getVdos();
		Opciones[2][3] = getVtres();
		Opciones[2][4] = getVcuatro();
		Opciones[2][5] = getVcinco();
		Opciones[2][6] = getVseis();
		Opciones[2][7] = getVsiete();
		Opciones[3][1] = getTuno();
		Opciones[3][2] = getTdos();
		Opciones[3][3] = getTtres();
		Opciones[3][4] = getTcuatro();
		Opciones[3][5] = getTcinco();
		Opciones[3][6] = getTseis();
		Opciones[3][7] = getTsiete();
		Opciones[4][1] = getCuno();
		Opciones[4][2] = getCdos();
		Opciones[4][3] = getCtres();
		Opciones[4][4] = getCcuatro();
		Opciones[4][5] = getCcinco();
		Opciones[4][6] = getCseis();
		Opciones[4][7] = getCsiete();
		Opciones[5][1] = getSuno();
		Opciones[5][2] = getSdos();
		Opciones[5][3] = getStres();
		Opciones[5][4] = getScuatro();
		Opciones[5][5] = getScinco();
		Opciones[5][6] = getSseis();
		Opciones[5][7] = getSsiete();
		/**
		 * @see Se Usan todas las condiciones para ganar en cada juego
		 */
		//COMPARA LAS DIFERENTES JUGADAS CON LAS POSIBLES OPCIONES Y DETERMINA GANA LA PARTIDA O NO.
		if (!Opciones[0][1].equals("") && !Opciones[0][2].equals("") && !Opciones[0][3].equals("")) {
			if (Opciones[0][1].equals(Opciones[0][2]) && Opciones[0][2].equals(Opciones[0][3])&& Opciones[0][3].equals(Opciones[0][4])) {
				return true;
			}
		}
		if (!Opciones[0][2].equals("") && !Opciones[0][3].equals("") && !Opciones[0][4].equals("")) {
			if (Opciones[0][2].equals(Opciones[0][3]) && Opciones[0][3].equals(Opciones[0][4])&& Opciones[0][4].equals(Opciones[0][5])) {
				return true;
			}
		}
		if (!Opciones[0][3].equals("") && !Opciones[0][4].equals("") && !Opciones[0][5].equals("")) {
			if (Opciones[0][3].equals(Opciones[0][4]) && Opciones[0][4].equals(Opciones[0][5])&& Opciones[0][5].equals(Opciones[0][6])) {
				return true;
			}
		}
		if (!Opciones[0][4].equals("") && !Opciones[0][5].equals("") && !Opciones[0][6].equals("")) {
			if (Opciones[0][4].equals(Opciones[0][5]) && Opciones[0][5].equals(Opciones[0][6])&& Opciones[0][6].equals(Opciones[0][7])) {
				return true;
			}
		}
		if (!Opciones[1][1].equals("") && !Opciones[1][2].equals("") && !Opciones[1][3].equals("")) {
			if (Opciones[1][1].equals(Opciones[1][2]) && Opciones[1][2].equals(Opciones[1][3])&& Opciones[1][3].equals(Opciones[1][4])) {
				return true;
			}
		}
		if (!Opciones[1][2].equals("") && !Opciones[1][3].equals("") && !Opciones[1][4].equals("")) {
			if (Opciones[1][2].equals(Opciones[1][3]) && Opciones[1][3].equals(Opciones[1][4])&& Opciones[1][4].equals(Opciones[1][5])) {
				return true;
			}
		}
		if (!Opciones[1][3].equals("") && !Opciones[1][4].equals("") && !Opciones[1][5].equals("")) {
			if (Opciones[1][3].equals(Opciones[1][4]) && Opciones[1][4].equals(Opciones[1][5])&& Opciones[1][5].equals(Opciones[1][6])) {
				return true;
			}
		}
		if (!Opciones[1][4].equals("") && !Opciones[1][5].equals("") && !Opciones[1][6].equals("")) {
			if (Opciones[1][4].equals(Opciones[1][5]) && Opciones[1][5].equals(Opciones[1][6])&& Opciones[1][6].equals(Opciones[1][7])) {
				return true;
			}
		}
		if (!Opciones[2][1].equals("") && !Opciones[2][2].equals("") && !Opciones[2][3].equals("")) {
			if (Opciones[2][1].equals(Opciones[2][2]) && Opciones[2][2].equals(Opciones[2][3])&& Opciones[2][3].equals(Opciones[2][4])) {
				return true;
			}
		}
		if (!Opciones[2][2].equals("") && !Opciones[2][3].equals("") && !Opciones[2][4].equals("")) {
			if (Opciones[2][2].equals(Opciones[2][3]) && Opciones[2][3].equals(Opciones[2][4])&& Opciones[2][4].equals(Opciones[2][5])) {
				return true;
			}
		}
		if (!Opciones[2][3].equals("") && !Opciones[2][4].equals("") && !Opciones[2][5].equals("")) {
			if (Opciones[2][3].equals(Opciones[2][4]) && Opciones[2][4].equals(Opciones[2][5])&& Opciones[2][5].equals(Opciones[2][6])) {
				return true;
			}
		}
		if (!Opciones[2][4].equals("") && !Opciones[2][5].equals("") && !Opciones[2][6].equals("")) {
			if (Opciones[2][4].equals(Opciones[2][5]) && Opciones[2][5].equals(Opciones[2][6])&& Opciones[2][6].equals(Opciones[2][7])) {
				return true;
			}
		}
		if (!Opciones[3][1].equals("") && !Opciones[3][2].equals("") && !Opciones[3][3].equals("")) {
			if (Opciones[3][1].equals(Opciones[3][2]) && Opciones[3][2].equals(Opciones[3][3])&& Opciones[3][3].equals(Opciones[3][4])) {
				return true;
			}
		}
		if (!Opciones[3][2].equals("") && !Opciones[3][3].equals("") && !Opciones[3][4].equals("")) {
			if (Opciones[3][2].equals(Opciones[3][3]) && Opciones[3][3].equals(Opciones[3][4])&& Opciones[3][4].equals(Opciones[3][5])) {
				return true;
			}
		}
		if (!Opciones[3][3].equals("") && !Opciones[3][4].equals("") && !Opciones[3][5].equals("")) {
			if (Opciones[3][3].equals(Opciones[3][4]) && Opciones[3][4].equals(Opciones[3][5])&& Opciones[3][5].equals(Opciones[3][6])) {
				return true;
			}
		}
		if (!Opciones[3][4].equals("") && !Opciones[3][5].equals("") && !Opciones[3][6].equals("")) {
			if (Opciones[3][4].equals(Opciones[3][5]) && Opciones[3][5].equals(Opciones[3][6])&& Opciones[3][6].equals(Opciones[3][7])) {
				return true;
			}
		}
		if (!Opciones[4][1].equals("") && !Opciones[4][2].equals("") && !Opciones[4][3].equals("")) {
			if (Opciones[4][1].equals(Opciones[4][2]) && Opciones[4][2].equals(Opciones[4][3])&& Opciones[4][3].equals(Opciones[4][4])) {
				return true;
			}
		}
		if (!Opciones[4][2].equals("") && !Opciones[4][3].equals("") && !Opciones[4][4].equals("")) {
			if (Opciones[4][2].equals(Opciones[4][3]) && Opciones[4][3].equals(Opciones[4][4])&& Opciones[4][4].equals(Opciones[4][5])) {
				return true;
			}
		}
		if (!Opciones[4][3].equals("") && !Opciones[4][4].equals("") && !Opciones[4][5].equals("")) {
			if (Opciones[4][3].equals(Opciones[4][4]) && Opciones[4][4].equals(Opciones[4][5])&& Opciones[4][5].equals(Opciones[4][6])) {
				return true;
			}
		}
		if (!Opciones[4][4].equals("") && !Opciones[4][5].equals("") && !Opciones[4][6].equals("")) {
			if (Opciones[4][4].equals(Opciones[4][5]) && Opciones[4][5].equals(Opciones[4][6])&& Opciones[4][6].equals(Opciones[4][7])) {
				return true;
			}
		}
		if (!Opciones[5][1].equals("") && !Opciones[5][2].equals("") && !Opciones[5][3].equals("")) {
			if (Opciones[5][1].equals(Opciones[5][2]) && Opciones[5][2].equals(Opciones[5][3])&& Opciones[5][3].equals(Opciones[5][4])) {
				return true;
			}
		}
		if (!Opciones[5][2].equals("") && !Opciones[5][3].equals("") && !Opciones[5][4].equals("")) {
			if (Opciones[5][2].equals(Opciones[5][3]) && Opciones[5][3].equals(Opciones[5][4])&& Opciones[5][4].equals(Opciones[5][5])) {
				return true;
			}
		}
		if (!Opciones[5][3].equals("") && !Opciones[5][4].equals("") && !Opciones[5][5].equals("")) {
			if (Opciones[5][3].equals(Opciones[5][4]) && Opciones[5][4].equals(Opciones[5][5])&& Opciones[5][5].equals(Opciones[5][6])) {
				return true;
			}
		}
		if (!Opciones[5][4].equals("") && !Opciones[5][5].equals("") && !Opciones[5][6].equals("")) {
			if (Opciones[5][4].equals(Opciones[5][5]) && Opciones[5][5].equals(Opciones[5][6])&& Opciones[5][6].equals(Opciones[5][7])) {
				return true;
			}
		}
		if (!Opciones[0][1].equals("") && !Opciones[1][1].equals("") && !Opciones[2][1].equals("")) {
			if (Opciones[0][1].equals(Opciones[1][1]) && Opciones[1][1].equals(Opciones[2][1])&& Opciones[2][1].equals(Opciones[3][1])) {
				return true;
			}
		}
		if (!Opciones[1][1].equals("") && !Opciones[2][1].equals("") && !Opciones[3][1].equals("")) {
			if (Opciones[1][1].equals(Opciones[2][1]) && Opciones[2][1].equals(Opciones[3][1])&& Opciones[3][1].equals(Opciones[4][1])) {
				return true;
			}
		}
		if (!Opciones[2][1].equals("") && !Opciones[3][1].equals("") && !Opciones[4][1].equals("")) {
			if (Opciones[2][1].equals(Opciones[3][1]) && Opciones[3][1].equals(Opciones[4][1])&& Opciones[4][1].equals(Opciones[5][1])) {
				return true;
			}
		}
		if (!Opciones[0][2].equals("") && !Opciones[1][2].equals("") && !Opciones[2][2].equals("")) {
			if (Opciones[0][2].equals(Opciones[1][2]) && Opciones[1][2].equals(Opciones[2][2])&& Opciones[2][2].equals(Opciones[3][2])) {
				return true;
			}
		}
		if (!Opciones[1][2].equals("") && !Opciones[2][2].equals("") && !Opciones[3][2].equals("")) {
			if (Opciones[1][2].equals(Opciones[2][2]) && Opciones[2][2].equals(Opciones[3][2])&& Opciones[3][2].equals(Opciones[4][2])) {
				return true;
			}
		}
		if (!Opciones[2][2].equals("") && !Opciones[3][2].equals("") && !Opciones[4][2].equals("")) {
			if (Opciones[2][2].equals(Opciones[3][2]) && Opciones[3][2].equals(Opciones[4][2])&& Opciones[4][2].equals(Opciones[5][2])) {
				return true;
			}
		}
		if (!Opciones[0][3].equals("") && !Opciones[1][3].equals("") && !Opciones[2][3].equals("")) {
			if (Opciones[0][3].equals(Opciones[1][3]) && Opciones[1][3].equals(Opciones[2][3])&& Opciones[2][3].equals(Opciones[3][3])) {
				return true;
			}
		}
		if (!Opciones[1][3].equals("") && !Opciones[2][3].equals("") && !Opciones[3][3].equals("")) {
			if (Opciones[1][3].equals(Opciones[2][3]) && Opciones[2][3].equals(Opciones[3][3])&& Opciones[3][3].equals(Opciones[4][3])) {
				return true;
			}
		}
		if (!Opciones[2][3].equals("") && !Opciones[3][3].equals("") && !Opciones[4][3].equals("")) {
			if (Opciones[2][3].equals(Opciones[3][3]) && Opciones[3][3].equals(Opciones[4][3])&& Opciones[4][3].equals(Opciones[5][3])) {
				return true;
			}
		}
		if (!Opciones[0][4].equals("") && !Opciones[1][4].equals("") && !Opciones[2][4].equals("")) {
			if (Opciones[0][4].equals(Opciones[1][4]) && Opciones[1][4].equals(Opciones[2][4])&& Opciones[2][4].equals(Opciones[3][4])) {
				return true;
			}
		}
		if (!Opciones[1][4].equals("") && !Opciones[2][4].equals("") && !Opciones[3][4].equals("")) {
			if (Opciones[1][4].equals(Opciones[2][4]) && Opciones[2][4].equals(Opciones[3][4])&& Opciones[3][4].equals(Opciones[4][4])) {
				return true;
			}
		}
		if (!Opciones[2][4].equals("") && !Opciones[3][4].equals("") && !Opciones[4][4].equals("")) {
			if (Opciones[2][4].equals(Opciones[3][4]) && Opciones[3][4].equals(Opciones[4][4])&& Opciones[4][4].equals(Opciones[5][4])) {
				return true;
			}
		}
		if (!Opciones[0][5].equals("") && !Opciones[1][5].equals("") && !Opciones[2][5].equals("")) {
			if (Opciones[0][5].equals(Opciones[1][5]) && Opciones[1][5].equals(Opciones[2][5])&& Opciones[2][5].equals(Opciones[3][5])) {
				return true;
			}
		}
		if (!Opciones[1][5].equals("") && !Opciones[2][5].equals("") && !Opciones[3][5].equals("")) {
			if (Opciones[1][5].equals(Opciones[2][5]) && Opciones[2][5].equals(Opciones[3][5])&& Opciones[3][5].equals(Opciones[4][5])) {
				return true;
			}
		}
		if (!Opciones[2][5].equals("") && !Opciones[3][5].equals("") && !Opciones[4][5].equals("")) {
			if (Opciones[2][5].equals(Opciones[3][5]) && Opciones[3][5].equals(Opciones[4][5])&& Opciones[4][5].equals(Opciones[5][1])) {
				return true;
			}
		}
		if (!Opciones[0][6].equals("") && !Opciones[1][6].equals("") && !Opciones[2][6].equals("")) {
			if (Opciones[0][6].equals(Opciones[1][6]) && Opciones[1][6].equals(Opciones[2][6])&& Opciones[2][6].equals(Opciones[3][6])) {
				return true;
			}
		}
		if (!Opciones[1][6].equals("") && !Opciones[2][6].equals("") && !Opciones[3][6].equals("")) {
			if (Opciones[1][6].equals(Opciones[2][6]) && Opciones[2][6].equals(Opciones[3][6])&& Opciones[3][6].equals(Opciones[4][6])) {
				return true;
			}
		}
		if (!Opciones[2][6].equals("") && !Opciones[3][6].equals("") && !Opciones[4][6].equals("")) {
			if (Opciones[2][6].equals(Opciones[3][6]) && Opciones[3][6].equals(Opciones[4][6])&& Opciones[4][6].equals(Opciones[5][6])) {
				return true;
			}
		}
		if (!Opciones[0][7].equals("") && !Opciones[1][7].equals("") && !Opciones[2][7].equals("")) {
			if (Opciones[0][7].equals(Opciones[1][7]) && Opciones[1][7].equals(Opciones[2][7]) && Opciones[2][7].equals(Opciones[3][7])) {
				return true;
			}
		}
		if (!Opciones[1][7].equals("") && !Opciones[2][7].equals("") && !Opciones[3][7].equals("")) {
			if (Opciones[1][7].equals(Opciones[2][7]) && Opciones[2][7].equals(Opciones[3][7])&& Opciones[3][7].equals(Opciones[4][7])) {
				return true;
			}
		}
		if (!Opciones[2][7].equals("") && !Opciones[3][7].equals("") && !Opciones[4][7].equals("")) {
			if (Opciones[2][7].equals(Opciones[3][7]) && Opciones[3][7].equals(Opciones[4][7])&& Opciones[4][7].equals(Opciones[5][7])) {
				return true;
			}
		}
		if (!Opciones[2][1].equals("") && !Opciones[3][2].equals("") && !Opciones[4][3].equals("")) {
			if (Opciones[2][1].equals(Opciones[3][2]) && Opciones[3][2].equals(Opciones[4][3])&& Opciones[4][3].equals(Opciones[5][4])) {
				return true;
			}
		}
		if (!Opciones[1][1].equals("") && !Opciones[2][2].equals("") && !Opciones[3][3].equals("")) {
			if (Opciones[1][1].equals(Opciones[2][2]) && Opciones[2][2].equals(Opciones[3][3])&& Opciones[3][3].equals(Opciones[4][4])) {
				return true;
			}
		}
		if (!Opciones[2][2].equals("") && !Opciones[3][3].equals("") && !Opciones[4][4].equals("")) {
			if (Opciones[2][2].equals(Opciones[3][3]) && Opciones[3][3].equals(Opciones[4][4])&& Opciones[4][4].equals(Opciones[5][5])) {
				return true;
			}
		}
		if (!Opciones[0][1].equals("") && !Opciones[1][2].equals("") && !Opciones[2][3].equals("")) {
			if (Opciones[0][1].equals(Opciones[1][2]) && Opciones[1][2].equals(Opciones[2][3])&& Opciones[2][3].equals(Opciones[3][4])) {
				return true;
			}
		}
		if (!Opciones[1][2].equals("") && !Opciones[2][3].equals("") && !Opciones[3][4].equals("")) {
			if (Opciones[1][2].equals(Opciones[2][3]) && Opciones[2][3].equals(Opciones[3][4])&& Opciones[3][4].equals(Opciones[4][5])) {
				return true;
			}
		}
		if (!Opciones[2][3].equals("") && !Opciones[3][4].equals("") && !Opciones[4][5].equals("")) {
			if (Opciones[2][3].equals(Opciones[3][4]) && Opciones[3][4].equals(Opciones[4][5])&& Opciones[4][5].equals(Opciones[5][6])) {
				return true;
			}
		}
		if (!Opciones[0][2].equals("") && !Opciones[1][3].equals("") && !Opciones[2][4].equals("")) {
			if (Opciones[0][2].equals(Opciones[1][3]) && Opciones[1][3].equals(Opciones[2][4])&& Opciones[2][4].equals(Opciones[3][5])) {
				return true;
			}
		}
		if (!Opciones[1][3].equals("") && !Opciones[2][4].equals("") && !Opciones[3][5].equals("")) {
			if (Opciones[1][3].equals(Opciones[2][4]) && Opciones[2][4].equals(Opciones[3][5])&& Opciones[3][5].equals(Opciones[4][6])) {
				return true;
			}
		}
		if (!Opciones[2][4].equals("") && !Opciones[3][5].equals("") && !Opciones[4][6].equals("")) {
			if (Opciones[2][4].equals(Opciones[3][5]) && Opciones[3][5].equals(Opciones[4][6])&& Opciones[4][6].equals(Opciones[5][7])) {
				return true;
			}
		}
		if (!Opciones[0][3].equals("") && !Opciones[1][4].equals("") && !Opciones[2][5].equals("")) {
			if (Opciones[0][3].equals(Opciones[1][4]) && Opciones[1][4].equals(Opciones[2][5])&& Opciones[2][5].equals(Opciones[3][6])) {
				return true;
			}
		}
		if (!Opciones[1][4].equals("") && !Opciones[2][5].equals("") && !Opciones[3][6].equals("")) {
			if (Opciones[1][4].equals(Opciones[2][5]) && Opciones[2][5].equals(Opciones[3][6])&& Opciones[3][6].equals(Opciones[4][7])) {
				return true;
			}
		}
		if (!Opciones[0][4].equals("") && !Opciones[1][5].equals("") && !Opciones[2][6].equals("")) {
			if (Opciones[0][4].equals(Opciones[1][5]) && Opciones[1][5].equals(Opciones[2][6])&& Opciones[2][6].equals(Opciones[3][7])) {
				return true;
			}
		}
		if (!Opciones[3][1].equals("") && !Opciones[2][2].equals("") && !Opciones[1][3].equals("")) {
			if (Opciones[3][1].equals(Opciones[2][2]) && Opciones[2][2].equals(Opciones[1][3])&& Opciones[1][3].equals(Opciones[0][4])) {
				return true;
			}
		}
		if (!Opciones[4][1].equals("") && !Opciones[3][2].equals("") && !Opciones[2][3].equals("")) {
			if (Opciones[4][1].equals(Opciones[3][2]) && Opciones[3][2].equals(Opciones[2][3])&& Opciones[2][3].equals(Opciones[1][4])) {
				return true;
			}
		}
		if (!Opciones[5][1].equals("") && !Opciones[4][2].equals("") && !Opciones[3][3].equals("")) {
			if (Opciones[5][1].equals(Opciones[4][2]) && Opciones[4][2].equals(Opciones[3][3])&& Opciones[3][3].equals(Opciones[2][4])) {
				return true;
			}
		}
		if (!Opciones[4][2].equals("") && !Opciones[3][3].equals("") && !Opciones[2][4].equals("")) {
			if (Opciones[4][2].equals(Opciones[3][3]) && Opciones[3][3].equals(Opciones[2][4])&& Opciones[2][4].equals(Opciones[1][5])) {
				return true;
			}
		}
		if (!Opciones[3][3].equals("") && !Opciones[2][4].equals("") && !Opciones[1][5].equals("")) {
			if (Opciones[3][3].equals(Opciones[2][4]) && Opciones[2][4].equals(Opciones[1][5])&& Opciones[1][5].equals(Opciones[0][6])) {
				return true;
			}
		}
		if (!Opciones[5][2].equals("") && !Opciones[4][3].equals("") && !Opciones[3][4].equals("")) {
			if (Opciones[5][2].equals(Opciones[4][3]) && Opciones[4][3].equals(Opciones[3][4])&& Opciones[3][4].equals(Opciones[2][5])) {
				return true;
			}
		}
		if (!Opciones[4][3].equals("") && !Opciones[3][4].equals("") && !Opciones[2][5].equals("")) {
			if (Opciones[4][3].equals(Opciones[3][4]) && Opciones[3][4].equals(Opciones[2][5])&& Opciones[2][5].equals(Opciones[1][6])) {
				return true;
			}
		}
		if (!Opciones[3][4].equals("") && !Opciones[2][5].equals("") && !Opciones[1][6].equals("")) {
			if (Opciones[3][4].equals(Opciones[2][5]) && Opciones[2][5].equals(Opciones[1][6])&& Opciones[1][6].equals(Opciones[0][7])) {
				return true;
			}
		}
		if (!Opciones[5][3].equals("") && !Opciones[4][4].equals("") && !Opciones[3][5].equals("")) {
			if (Opciones[5][3].equals(Opciones[4][4]) && Opciones[4][4].equals(Opciones[3][5])&& Opciones[3][5].equals(Opciones[2][6])) {
				return true;
			}
		}
		if (!Opciones[4][4].equals("") && !Opciones[3][5].equals("") && !Opciones[2][6].equals("")) {
			if (Opciones[4][4].equals(Opciones[3][5]) && Opciones[3][5].equals(Opciones[2][6])&& Opciones[2][6].equals(Opciones[1][7])) {
				return true;
			}
		}
		if (!Opciones[5][4].equals("") && !Opciones[4][5].equals("") && !Opciones[3][6].equals("")) {
			if (Opciones[5][4].equals(Opciones[4][5]) && Opciones[4][5].equals(Opciones[3][6])&& Opciones[3][6].equals(Opciones[2][7])) {
				return true;
			}
		}
		return false;
	}
	//METODOS SETTERS AND GETTERS
	public String getUno() {
		return uno;
	}

	public void setUno(String uno) {
		this.uno = uno;
	}

	public String getDos() {
		return dos;
	}

	public void setDos(String dos) {
		this.dos = dos;
	}

	public String getTres() {
		return tres;
	}

	public void setTres(String tres) {
		this.tres = tres;
	}

	public String getCuatro() {
		return cuatro;
	}

	public void setCuatro(String cuatro) {
		this.cuatro = cuatro;
	}

	public String getCinco() {
		return cinco;
	}

	public void setCinco(String cinco) {
		this.cinco = cinco;
	}

	public String getSeis() {
		return seis;
	}

	public void setSeis(String seis) {
		this.seis = seis;
	}

	public String getSiete() {
		return siete;
	}

	public void setSiete(String siete) {
		this.siete = siete;
	}

	public String getDuno() {
		return Duno;
	}

	public void setDuno(String duno) {
		Duno = duno;
	}

	public String getDdos() {
		return Ddos;
	}

	public void setDdos(String ddos) {
		Ddos = ddos;
	}

	public String getDtres() {
		return Dtres;
	}

	public void setDtres(String dtres) {
		Dtres = dtres;
	}

	public String getDcuatro() {
		return Dcuatro;
	}

	public void setDcuatro(String dcuatro) {
		Dcuatro = dcuatro;
	}

	public String getDcinco() {
		return Dcinco;
	}

	public void setDcinco(String dcinco) {
		Dcinco = dcinco;
	}

	public String getDseis() {
		return Dseis;
	}

	public void setDseis(String dseis) {
		Dseis = dseis;
	}

	public String getDsiete() {
		return Dsiete;
	}

	public void setDsiete(String dsiete) {
		Dsiete = dsiete;
	}

	public String getVuno() {
		return Vuno;
	}

	public void setVuno(String vuno) {
		Vuno = vuno;
	}

	public String getVdos() {
		return Vdos;
	}

	public void setVdos(String vdos) {
		Vdos = vdos;
	}

	public String getVtres() {
		return Vtres;
	}

	public void setVtres(String vtres) {
		Vtres = vtres;
	}

	public String getVcuatro() {
		return Vcuatro;
	}

	public void setVcuatro(String vcuatro) {
		Vcuatro = vcuatro;
	}

	public String getVcinco() {
		return Vcinco;
	}

	public void setVcinco(String vcinco) {
		Vcinco = vcinco;
	}

	public String getVseis() {
		return Vseis;
	}

	public void setVseis(String vseis) {
		Vseis = vseis;
	}

	public String getVsiete() {
		return Vsiete;
	}

	public void setVsiete(String vsiete) {
		Vsiete = vsiete;
	}

	public String getTuno() {
		return Tuno;
	}

	public void setTuno(String tuno) {
		Tuno = tuno;
	}

	public String getTdos() {
		return Tdos;
	}

	public void setTdos(String tdos) {
		Tdos = tdos;
	}

	public String getTtres() {
		return Ttres;
	}

	public void setTtres(String ttres) {
		Ttres = ttres;
	}

	public String getTcuatro() {
		return Tcuatro;
	}

	public void setTcuatro(String tcuatro) {
		Tcuatro = tcuatro;
	}

	public String getTcinco() {
		return Tcinco;
	}

	public void setTcinco(String tcinco) {
		Tcinco = tcinco;
	}

	public String getTseis() {
		return Tseis;
	}

	public void setTseis(String tseis) {
		Tseis = tseis;
	}

	public String getTsiete() {
		return Tsiete;
	}

	public void setTsiete(String tsiete) {
		Tsiete = tsiete;
	}

	public String getCuno() {
		return Cuno;
	}

	public void setCuno(String cuno) {
		Cuno = cuno;
	}

	public String getCdos() {
		return Cdos;
	}

	public void setCdos(String cdos) {
		Cdos = cdos;
	}

	public String getCtres() {
		return Ctres;
	}

	public void setCtres(String ctres) {
		Ctres = ctres;
	}

	public String getCcuatro() {
		return Ccuatro;
	}

	public void setCcuatro(String ccuatro) {
		Ccuatro = ccuatro;
	}

	public String getCcinco() {
		return Ccinco;
	}

	public void setCcinco(String ccinco) {
		Ccinco = ccinco;
	}

	public String getCseis() {
		return Cseis;
	}

	public void setCseis(String cseis) {
		Cseis = cseis;
	}

	public String getCsiete() {
		return Csiete;
	}

	public void setCsiete(String csiete) {
		Csiete = csiete;
	}

	public String getSuno() {
		return Suno;
	}

	public void setSuno(String suno) {
		Suno = suno;
	}

	public String getSdos() {
		return Sdos;
	}

	public void setSdos(String sdos) {
		Sdos = sdos;
	}

	public String getStres() {
		return Stres;
	}

	public void setStres(String stres) {
		Stres = stres;
	}

	public String getScuatro() {
		return Scuatro;
	}

	public void setScuatro(String scuatro) {
		Scuatro = scuatro;
	}

	public String getScinco() {
		return Scinco;
	}

	public void setScinco(String scinco) {
		Scinco = scinco;
	}

	public String getSseis() {
		return Sseis;
	}

	public void setSseis(String sseis) {
		Sseis = sseis;
	}

	public String getSsiete() {
		return Ssiete;
	}

	public void setSsiete(String ssiete) {
		Ssiete = ssiete;
	}

	public String[][] getOpciones() {
		return Opciones;
	}

	public void setOpciones(String[][] opciones) {
		Opciones = opciones;
	}
	
}