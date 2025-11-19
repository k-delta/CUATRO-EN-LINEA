package CuatroEnLinea.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JButton;

import CuatroEnLinea.Logica.Archivos4EnLinea;
import CuatroEnLinea.Logica.jugadorPuntaje;
import CuatroEnLinea.Vista.InterfasScore;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;

public class ResultadosV2 extends JFrame {
	//ATRIBUTOS
	private String NombreJ;
	private JPanel contentPane;
	private int Puntaje;
	private int vezjuego;

	public void puntaje(int punt) {
		this.Puntaje=punt;
	}
	
	public ResultadosV2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("4 En Linea");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(600, 0, 800, 740);
		Panel contentPane = new Panel("/images/FondoResultados.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		//CREA Y POSICIONA LOS COMPONENTES EN EL FRAME
		JLabel Img = new JLabel("");
		Img.setBounds(177, 233, 437, 343);
		ImageIcon imageIcon = new ImageIcon(ResultadosV2.class.getResource("/images/Gana.gif"));
		Img.setIcon(imageIcon);
		imageIcon.setImageObserver(Img);  
		contentPane.add(Img);
		
		JLabel Score = new JLabel("");
		Score.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Score.setBounds(441, 141, 148, 54);
		contentPane.add(Score);
		
		JLabel lblGanaste = new JLabel("Ganaste!!!");
		lblGanaste.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 60));
		lblGanaste.setBounds(227, 61, 331, 72);
		contentPane.add(lblGanaste);
		
		JLabel Nombre = new JLabel("");
		Nombre.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		Nombre.setBounds(185, 144, 220, 51);
		contentPane.add(Nombre);
		//BOTON QUE PERMITE JUGAR OTRA PARTIDA
		JButton JugarOtra = new JButton("");
		JugarOtra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaJugadores V2 = new VentanaJugadores();
				V2.setVisible(true);
				V2.setAlwaysOnTop(true);
				setVisible(false);
			}
		});
		JugarOtra.setIcon(new ImageIcon(ResultadosV2.class.getResource("/images/resultadoJugar.jpg")));
		JugarOtra.setBounds(104, 642, 160, 30);
		contentPane.add(JugarOtra);
		//BOTON QUE PERMITE VOLVER A LA VENTANA DE INICIO
		JButton VentanaInicio = new JButton("");
		VentanaInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaInicio V1 = new VentanaInicio();
				V1.setVisible(true);
				V1.setAlwaysOnTop(true);
				setVisible(false);
			}
		});
		VentanaInicio.setIcon(new ImageIcon(ResultadosV2.class.getResource("/images/resultadoSalir.jpg")));
		VentanaInicio.setBounds(302, 642, 160, 30);
		contentPane.add(VentanaInicio);
		
		
		//ENVIA AL FRAME DE PUNTAJES
		JButton Puntajes = new JButton("");
		Puntajes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfasScore score=new InterfasScore();
				vezjuego=score.getVezArchivo();
				score.setVisible(true);
				setVisible(false);
				Nombre.setText(NombreJ);
				jugadorPuntaje jugadorwin=new jugadorPuntaje();
				jugadorwin.setNombre(NombreJ);
				jugadorwin.setTiempo(Puntaje);
				Score.setText(String.valueOf(Puntaje));
				Archivos4EnLinea l=new Archivos4EnLinea();
				DataInputStream numArch = null;																	// se crea un objeto para poder abrir el archivo num
				l.grabarArchivo(vezjuego);
				l.grabarArchivo(jugadorwin);
				System.out.println(jugadorwin.getNombre());
			}
		});
		Puntajes.setIcon(new ImageIcon(ResultadosV2.class.getResource("/images/Botonpuntuaciones.jpg")));
		Puntajes.setBounds(500, 642, 160, 30);
		contentPane.add(Puntajes);
		
		
		//MUESTRA LOS DATOS DEL GANADOR
		JButton Mostrar = new JButton("");
		Mostrar.setIcon(new ImageIcon(ResultadosV2.class.getResource("/images/botonMostrar.jpg")));
		Mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Nombre.setText(NombreJ);
				jugadorPuntaje jugadorwin=new jugadorPuntaje();
				jugadorwin.setNombre(NombreJ);
				jugadorwin.setTiempo(Puntaje);
				Score.setText(String.valueOf(Puntaje));
				
			}
		});
		Mostrar.setBounds(53, 157, 120, 30);
		contentPane.add(Mostrar);
		
		
	}
	//METODOS SETTERS AND GETTERS
	public String getNombreJ() {
		return NombreJ;
	}

	public void setNombreJ(String nombre) {
		NombreJ = nombre;
	}

	public int getPuntaje() {
		return Puntaje;
	}

	public void setPuntaje(int puntaje) {
		Puntaje = puntaje;
	}
	
}
