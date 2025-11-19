package CuatroEnLinea.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.JTabbedPane;

import CuatroEnLinea.Logica.Archivos4EnLinea;
import CuatroEnLinea.Logica.jugadorPuntaje;

public class InterfasScore extends JFrame {

	private JPanel contentPane;			//Creacion del panel del frame
	private int vezArchivo=1;			//Creacion de una variable que obtendra cuantas veces se ha jugado
	
	public InterfasScore(int x) {
		
	}
	
	public InterfasScore() {
		setTitle("SCORES");				//Titulo del frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Accion a realizar si se clickea Exit	
		setBounds(100, 100, 432, 322);				//tamaño del frame
		contentPane = new JPanel();					//se crea un panel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	//bordes del panel
		contentPane.setLayout(null);		//asignamos un layout al panel
		setContentPane(contentPane);		//se asigna un panel al frame
		
		JLabel n1 = new JLabel("SCORES");					//se crea un label 
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBounds(32, 49, 150, 27);						//tamaño del label
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("SCORES");					//se crea un label 
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBounds(32, 87, 150, 27);						//tamaño del label
		contentPane.add(n2);
		
		JLabel n3 = new JLabel("SCORES");					//se crea un label 
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setBounds(32, 125, 150, 27);						//tamaño del label
		contentPane.add(n3);
		
		JLabel n4 = new JLabel("SCORES");					//se crea un label 
		n4.setHorizontalAlignment(SwingConstants.CENTER);
		n4.setBounds(32, 163, 150, 27);						//tamaño del label
		contentPane.add(n4);
		
		JLabel n5 = new JLabel("SCORES");					//se crea un label 
		n5.setHorizontalAlignment(SwingConstants.CENTER);
		n5.setBounds(32, 201, 150, 27);						//tamaño del label
		contentPane.add(n5);
		
		JLabel t2 = new JLabel("SCORES");					//se crea un label 
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setBounds(223, 87, 150, 27);						//tamaño del label
		contentPane.add(t2);
		
		JLabel t3 = new JLabel("SCORES");					//se crea un label 
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setBounds(223, 125, 150, 27);					//tamaño del label
		contentPane.add(t3);
		
		JLabel t4 = new JLabel("SCORES");					//se crea un label 
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setBounds(223, 163, 150, 27);					//tamaño del label
		contentPane.add(t4);
		
		JLabel t5 = new JLabel("SCORES");					//se crea un label 
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setBounds(223, 201, 150, 27);					//tamaño del label
		contentPane.add(t5);
		
		JLabel t1 = new JLabel("SCORES");					//se crea un label 
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBounds(223, 49, 150, 27);						//tamaño del label
		contentPane.add(t1);
		
		JLabel lblNombre = new JLabel("NOMBRE");			//se crea un label 
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(39, 11, 150, 27);				//tamaño del label
		contentPane.add(lblNombre);
		
		JLabel lblTiempo = new JLabel("TIEMPO ");			//se crea un label 
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setBounds(223, 11, 150, 27);				//tamaño del label
		contentPane.add(lblTiempo);
		
		JLabel label_9 = new JLabel("1");					//se crea un label 
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(10, 49, 21, 27);					//tamaño del label
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("2");					//se crea un label 
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(10, 87, 21, 27);					//tamaño del label
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("3");					//se crea un label 
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(10, 125, 21, 27);				//tamaño del label
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("4");					//se crea un label 
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(10, 163, 21, 27);				//tamaño del label
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("5");					//se crea un label 
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(10, 201, 21, 27);				//tamaño del label
		contentPane.add(label_13);
		
		
		JButton btnObtenerScores = new JButton("OBTENER SCORES");	//creacion de un boton 
		btnObtenerScores.addActionListener(new ActionListener() {	//accionamiento del boton
			public void actionPerformed(ActionEvent e) {			//eventos a realizar cuando es oprimido el boton

				DataInputStream numArch = null;																	// se crea un objeto para poder abrir el archivo num
				try {
					numArch = new DataInputStream(new FileInputStream("src/CuatroEnLinea/Persistencia/num.txt"));				//se asigna un archivo al archivo anterior creado
					vezArchivo = numArch.readInt();																//se asigna un valor a vezArchivo que almacena el valor de veces que se jugo
					Archivos4EnLinea l = new Archivos4EnLinea();												//se crea un objeto para creacion y grabacion en archivo
					l.grabarArchivo(vezArchivo+1);															//se envia el numero de veces que se jugo para que la proxima que sea ejecutado el juego se asigne un valor siguiente	
				} catch (Exception e2) {
				}

				DataInputStream scores = null;																	//se crea un archivo de lectura de nuevo
				try {
					scores = new DataInputStream(new FileInputStream("src/CuatroEnLinea/Persistencia/score.txt"));			//se asigna un archivo al anterior creado
					ArrayList<jugadorPuntaje> listaJugadores = new ArrayList<>();										//creacion de un array list de jugadores

					for (int i = 0; i <vezArchivo; i++) {														//ciclo para asignar valores a los atributos de cada estudiante
						jugadorPuntaje jugadorArc = new jugadorPuntaje();	
						jugadorArc.setNombre(scores.readUTF());
						jugadorArc.setTiempo(scores.readInt());
						listaJugadores.add(jugadorArc);															//asignacion de cada jugador a cada posicion del arreglo
					}

					Collections.sort(listaJugadores);															//ordenamiento del array list 
					ArrayList<JLabel> nombres = new ArrayList<>();												//creacion de arraylist de jlabel
					nombres.add(n1);							//agregacion de label al arraylist
					nombres.add(n2);							//agregacion de label al arraylist
					nombres.add(n3);							//agregacion de label al arraylist
					nombres.add(n4);							//agregacion de label al arraylist
					nombres.add(n5);							//agregacion de label al arraylist
					ArrayList<JLabel> tiempos = new ArrayList<>();												//creacion de arraylist de jlabel
					tiempos.add(t1);							//agregacion de label al arraylist
					tiempos.add(t2);							//agregacion de label al arraylist
					tiempos.add(t3);							//agregacion de label al arraylist
					tiempos.add(t4);							//agregacion de label al arraylist
					tiempos.add(t5);							//agregacion de label al arraylist

					for (int i = 0; i < 5; i++) {
						System.out.println(listaJugadores.get(i).getNombre()+" --- "+listaJugadores.get(i).getTiempo());
						nombres.get(i).setText(listaJugadores.get(i).getNombre());					//se escribe en los label los no,bres de los jugadores
						tiempos.get(i).setText(Integer.toString(listaJugadores.get(i).getTiempo()));//se escribe en los label las puntuaciones 
					}
				} catch (Exception e2) {
				}
			}
		});
		btnObtenerScores.setBounds(39, 236, 175, 23);			//tamaño del boton 
		contentPane.add(btnObtenerScores);						//agrega boton al panel
		setVisible(true);										// se hace visible el boton
	}

	public int getVezArchivo() {								//getters y setters de veces que se ejecuta el jeugo
		return vezArchivo;
	}

	public void setVezArchivo(int vezArchivo) {
		this.vezArchivo = vezArchivo;
	}
	
	public int returnVezjugada() {
		return vezArchivo+1;
	}
}
