package CuatroEnLinea.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window.Type;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Instrucciones extends JFrame {
	//ATRIBUTOS
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Instrucciones frame = new Instrucciones();
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
	public Instrucciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("4 En Linea");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(200, 0, 800, 800);
		Panel contentPane = new Panel("/images/fondoInicio.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		//GENERA Y ORGANIZA LOS COMPONENTES EN EL FRAME
		JLabel Titulo = new JLabel("");
		Titulo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/TITULO.png")));
		Titulo.setBounds(98, 86, 600, 150);
		contentPane.add(Titulo);
		
		JLabel lbl1 = new JLabel("1. Seleccionar el tipo de Juego");
		lbl1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl1.setBounds(133, 320, 534, 33);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("2. Ingrese Su Nickname y Seleccione \"Siguiente\"");
		lbl2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl2.setBounds(133, 360, 534, 33);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("3. Seleccione \"Iniciar\" en la Ventana de Juego");
		lbl3.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl3.setBounds(133, 400, 534, 33);
		contentPane.add(lbl3);
		
		JLabel lblDisfruteEl = new JLabel("4. Disfrute el Juego");
		lblDisfruteEl.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lblDisfruteEl.setBounds(133, 440, 534, 33);
		contentPane.add(lblDisfruteEl);
		
		JLabel lbl4 = new JLabel("La Puntuaci\u00F3n se Genera de acuerdo a la cantidad");
		lbl4.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl4.setBounds(108, 500, 590, 33);
		contentPane.add(lbl4);
		
		JLabel lbl41 = new JLabel("de movimientos necesarios para Ganar, entre m\u00E1s ");
		lbl41.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl41.setBounds(108, 530, 590, 33);
		contentPane.add(lbl41);
		
		JLabel lbl42 = new JLabel("movimientos realices la puntuaci\u00F3n ser\u00E1 menor.");
		lbl42.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl42.setBounds(108, 560, 590, 33);
		contentPane.add(lbl42);
		//CON ESTE BOTON REGRESA A LA VENTANA INICIAL
		JButton Volver = new JButton("");
		Volver.setIcon(new ImageIcon(Instrucciones.class.getResource("/images/imgBotonVolver.jpg")));
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInicio volver = new VentanaInicio();
				volver.setVisible(true);
				setVisible(false);
			}
		});
		Volver.setBounds(240, 642, 300, 40);
		contentPane.add(Volver);
	}
}
