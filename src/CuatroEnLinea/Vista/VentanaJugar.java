package CuatroEnLinea.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaJugar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaJugar frame = new VentanaJugar();
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
	public VentanaJugar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("4 En Linea");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(200, 0, 800, 800);
		Panel contentPane = new Panel("/images/fondoInicio.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		//CREA LOS COMPONENTES DEL JUEGO Y LOS POSICIONA EN EL FRAME
		JLabel Titulo = new JLabel("");
		Titulo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/TITULO.png")));
		Titulo.setBounds(98, 86, 600, 150);
		contentPane.add(Titulo);
		//BOTON QUE ME LLEVA AL JUEGO JUGADOR 1 VS JUGADOR 2
		JButton J1VsJ2 = new JButton("");
		J1VsJ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaJugadores v1 = new VentanaJugadores();
				v1.setVisible(true);
				setVisible(false);
			}
		});
		J1VsJ2.setIcon(new ImageIcon(VentanaJugar.class.getResource("/images/jug1vsjug2.jpg")));
		J1VsJ2.setBounds(247, 290, 300, 40);
		contentPane.add(J1VsJ2);
		//BOTON QUE ME LLEVA AL JUEGO JUGADOR 1 VS COMPUTADORA
		JButton J1VsCom = new JButton("");
		J1VsCom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaJugador v2 = new VentanaJugador();
				v2.setVisible(true);
				setVisible(false);
			}
		});
		J1VsCom.setIcon(new ImageIcon(VentanaJugar.class.getResource("/images/jug1vsCom.jpg")));
		J1VsCom.setBounds(247, 390, 300, 40);
		contentPane.add(J1VsCom);
	}

}
