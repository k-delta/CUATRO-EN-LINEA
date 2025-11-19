package CuatroEnLinea.Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import CuatroEnLinea.Logica.jugadorPuntaje;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaInicio frame = new VentanaInicio();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	

	/**
	 * Create the frame.
	 */
	public VentanaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("4 En Linea");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(200, 0, 800, 800);
		Panel contentPane = new Panel("/images/fondoInicio.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		//CREA Y POSICIONA LOS COMPONENTES EN EL FRAME
		JLabel Titulo = new JLabel("");
		Titulo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/TITULO.png")));
		Titulo.setBounds(98, 86, 600, 150);
		contentPane.add(Titulo);
		//BOTON QUE PERMITE IR A LAS OPCIONES DE JUEGO
		JButton Jugar = new JButton("");
		Jugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaJugar v2 = new VentanaJugar();
				v2.setVisible(true);
				setVisible(false);
			}
		});
		Jugar.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/ImgBotonIniciarV1.jpg")));
		Jugar.setBounds(247, 290, 300, 40);
		contentPane.add(Jugar);
		
		//DIRIGE AL FRAME DE INSTRUCCIONES
		JButton Instrucciones = new JButton("");
		Instrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucciones leer = new Instrucciones();
				leer.setVisible(true);
				setVisible(false);
			}
		});
		Instrucciones.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/ImgInstruccionesV1.jpg")));
		Instrucciones.setBounds(247, 440, 300, 40);
		contentPane.add(Instrucciones);
		
		//DIRIGE AL FRAME DE PUNTUACION
//		JButton Puntuacion = new JButton("");
//		Puntuacion.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				InterfasScore score=new InterfasScore();
//				score.setVisible(true);
//				setVisible(false);
//			}
//		});
//		Puntuacion.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/ImgPuntuacionesV1.jpg")));
//		Puntuacion.setBounds(247, 490, 300, 40);
//		contentPane.add(Puntuacion);
		
		//CIERRA EL PROGRAMA EN SU TOTALIDAD
		JButton Salir = new JButton("");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				System.exit(-1);
			}
		});
		Salir.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/ImgSalirV1.jpg")));
		Salir.setBounds(247, 590, 300, 40);
		contentPane.add(Salir);
		
	}
}
