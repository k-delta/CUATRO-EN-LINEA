package CuatroEnLinea.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

public class VentanaJugador extends JFrame {
	//ATRIBUTOS
	private JPanel contentPane;
	private JTextField TxtNombre;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaJugador frame = new VentanaJugador();
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
	public VentanaJugador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("4 En Linea");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(200, 0, 800, 800);
		Panel contentPane = new Panel("/images/fondoInicio.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		//CREA Y POSICIONA LOS COMPONENTES DEL FRAME
		JLabel Titulo = new JLabel("");
		Titulo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/TITULO.png")));
		Titulo.setBounds(98, 86, 600, 150);
		contentPane.add(Titulo);
		
		TxtNombre = new JTextField();
		TxtNombre.setBounds(246, 311, 300, 40);
		contentPane.add(TxtNombre);
		TxtNombre.setColumns(10);
		
		JLabel lblNickname = new JLabel("Digite Su Nickname");
		lblNickname.setFont(new Font("Agency FB", Font.BOLD, 20));
		lblNickname.setBounds(246, 260, 300, 40);
		contentPane.add(lblNickname);
		
		//BOTON QUE CAPTURA LOS DATOS DEL USUARIO Y LOS LLEVA A LA VENTANA DEL JUEGO
		JButton Siguiente = new JButton("");
		Siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!TxtNombre.getText().equals("")){//DEBE HABER UN NOMBRE DE USUARIO Y ESTO LO CONDICIONA
					Game g = new Game();
					g.setNombre(TxtNombre.getText());
					g.setVisible(true);
					setVisible(false);
				}else{
					JOptionPane.showMessageDialog(null, "Debe Digitar un Nickname", "WARNING", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		Siguiente.setIcon(new ImageIcon(VentanaJugador.class.getResource("/images/ContinuarV3.jpg")));
		Siguiente.setBounds(246, 380, 300, 40);
		contentPane.add(Siguiente);
	}
}