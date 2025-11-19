package CuatroEnLinea.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import CuatroEnLinea.Logica.CondicionJugador;
import CuatroEnLinea.Logica.SelectorImagen;
import CuatroEnLinea.Logica.TerminarGame;
import CuatroEnLinea.Logica.Winner;

public class Game extends JFrame {
	// ATRIBUTOS E INSTANCIAS PARA LA CLASE
	SelectorImagen imgn = new SelectorImagen();
	CondicionJugador condicion = new CondicionJugador(); // constructor vacio
	TerminarGame terminar = new TerminarGame();
	private int juega = 0;
	private String nombre;
	private int jugadaJ1;
	String[] selector = new String[3];
	String urlRevers = "src/images/revers.jpg";
	Winner winner = new Winner();
	private boolean ocupado[][];
	private boolean bloqueo[][];
	private boolean color[][];
	// SE CREAN LOS BOTONES
	JButton A1 = new JButton("");
	JButton A2 = new JButton("");
	JButton A3 = new JButton("");
	JButton A4 = new JButton("");
	JButton A5 = new JButton("");
	JButton A6 = new JButton("");
	JButton A7 = new JButton("");

	JButton B1 = new JButton("");
	JButton B2 = new JButton("");
	JButton B3 = new JButton("");
	JButton B4 = new JButton("");
	JButton B5 = new JButton("");
	JButton B6 = new JButton("");
	JButton B7 = new JButton("");

	JButton C1 = new JButton("");
	JButton C2 = new JButton("");
	JButton C3 = new JButton("");
	JButton C4 = new JButton("");
	JButton C5 = new JButton("");
	JButton C6 = new JButton("");
	JButton C7 = new JButton("");

	JButton D1 = new JButton("");
	JButton D2 = new JButton("");
	JButton D3 = new JButton("");
	JButton D4 = new JButton("");
	JButton D5 = new JButton("");
	JButton D6 = new JButton("");
	JButton D7 = new JButton("");

	JButton E1 = new JButton("");
	JButton E2 = new JButton("");
	JButton E3 = new JButton("");
	JButton E4 = new JButton("");
	JButton E5 = new JButton("");
	JButton E6 = new JButton("");
	JButton E7 = new JButton("");

	JButton F1 = new JButton("");
	JButton F2 = new JButton("");
	JButton F3 = new JButton("");
	JButton F4 = new JButton("");
	JButton F5 = new JButton("");
	JButton F6 = new JButton("");
	JButton F7 = new JButton("");

	JRadioButton rdbtnJ1 = new JRadioButton("Jugando...");
	JRadioButton rdbtnJC = new JRadioButton("Jugando...");

	boolean p1 = true;
	boolean p2 = true;
	boolean p3 = true;
	boolean p4 = true;
	boolean p5 = true;
	boolean p6 = true;
	boolean p7 = true;
	boolean O1 = true;
	boolean O2 = true;
	boolean O3 = true;
	boolean O4 = true;
	boolean O5 = true;
	boolean O6 = true;
	boolean O7 = true;
	boolean U1 = true;
	boolean U2 = true;
	boolean U3 = true;
	boolean U4 = true;
	boolean U5 = true;
	boolean U6 = true;
	boolean U7 = true;
	boolean Y1 = true;
	boolean Y2 = true;
	boolean Y3 = true;
	boolean Y4 = true;
	boolean Y5 = true;
	boolean Y6 = true;
	boolean Y7 = true;
	boolean T1 = true;
	boolean T2 = true;
	boolean T3 = true;
	boolean T4 = true;
	boolean T5 = true;
	boolean T6 = true;
	boolean T7 = true;
	boolean R1 = true;
	boolean R2 = true;
	boolean R3 = true;
	boolean R4 = true;
	boolean R5 = true;
	boolean R6 = true;
	boolean R7 = true;

	JLabel lbNombreComp = new JLabel("Destructor");

	// METODO QUE PERMITE VACIAR LAS OPCIONES DE LA MAQUINA
	public void vaciar() { // al iniciar finalizar vital
		ocupado = new boolean[6][7];
		color = new boolean[6][7];
		bloqueo = new boolean[6][7];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				bloqueo[i][j] = true;
				ocupado[i][j] = false;
				color[i][j] = false;
				bloqueo[0][j] = false; // primera fila
			}
		}
	}

	// DIBUJA
	public void dibujar(int i, int j) {
		if (!(bloqueo[i][j])) {
			if (!(ocupado[i][j])) {
				if (i != 5) {
					bloqueo[i + 1][j] = false;
				}
				color[i][j] = true;
				ocupado[i][j] = true;
				logica(i, j);
				perdedor();
			}
		}
	}

	// EJECUTA LAS OPCIONES DE MOVIMIENTO PARA LA COMP
	public boolean pc(int i, int j) {

		color[i][j] = false;
		ocupado[i][j] = true;
		if (i != 5) {
			bloqueo[i + 1][j] = false;
		}
		if (i == 0 & j == 0) {
			A1.setIcon(new ImageIcon(imgn.getImagen()[1]));
			A1.setToolTipText(lbNombreComp.getText());
			p1 = false;
			juega++;
			winner.setUno(A1.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 0 & j == 1) {
			A2.setIcon(new ImageIcon(imgn.getImagen()[0]));
			A2.setToolTipText(lbNombreComp.getText());
			p2 = false;
			juega++;
			winner.setDos(A2.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 0 & j == 2) {
			A3.setIcon(new ImageIcon(imgn.getImagen()[0]));
			A3.setToolTipText(lbNombreComp.getText());
			p3 = false;
			juega++;
			winner.setTres(A3.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 0 & j == 3) {
			A4.setIcon(new ImageIcon(imgn.getImagen()[0]));
			A4.setToolTipText(lbNombreComp.getText());
			p4 = false;
			juega++;
			winner.setCuatro(A4.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);

		}
		if (i == 0 & j == 4) {
			A5.setIcon(new ImageIcon(imgn.getImagen()[0]));
			A5.setToolTipText(lbNombreComp.getText());
			p5 = false;
			juega++;
			winner.setCinco(A5.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 0 & j == 5) {
			A6.setIcon(new ImageIcon(imgn.getImagen()[0]));
			A6.setToolTipText(lbNombreComp.getText());
			p6 = false;
			juega++;
			winner.setSeis(A6.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 0 & j == 6) {
			A7.setIcon(new ImageIcon(imgn.getImagen()[0]));
			A7.setToolTipText(lbNombreComp.getText());
			p7 = false;
			juega++;
			winner.setSiete(A7.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 1 & j == 0) {
			B1.setIcon(new ImageIcon(imgn.getImagen()[0]));
			B1.setToolTipText(lbNombreComp.getText());
			O1 = false;
			juega++;
			winner.setDuno(B1.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 1 & j == 1) {
			B2.setIcon(new ImageIcon(imgn.getImagen()[0]));
			B2.setToolTipText(lbNombreComp.getText());
			O2 = false;
			juega++;
			winner.setDdos(B2.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 1 & j == 2) {
			B3.setIcon(new ImageIcon(imgn.getImagen()[0]));
			B3.setToolTipText(lbNombreComp.getText());
			O3 = false;
			juega++;
			winner.setDtres(B3.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 1 & j == 3) {
			B4.setIcon(new ImageIcon(imgn.getImagen()[0]));
			B4.setToolTipText(lbNombreComp.getText());
			O4 = false;
			juega++;
			winner.setCinco(B4.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 1 & j == 4) {
			B5.setIcon(new ImageIcon(imgn.getImagen()[0]));
			B5.setToolTipText(lbNombreComp.getText());
			O5 = false;
			juega++;
			winner.setCinco(B5.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 1 & j == 5) {
			B6.setIcon(new ImageIcon(imgn.getImagen()[0]));
			B6.setToolTipText(lbNombreComp.getText());
			O6 = false;
			juega++;
			winner.setCinco(B6.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 1 & j == 6) {
			B7.setIcon(new ImageIcon(imgn.getImagen()[0]));
			B7.setToolTipText(lbNombreComp.getText());
			O7 = false;
			juega++;
			winner.setCinco(B7.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 2 & j == 0) {
			C1.setIcon(new ImageIcon(imgn.getImagen()[0]));
			C1.setToolTipText(lbNombreComp.getText());
			U1 = false;
			juega++;
			winner.setCinco(C1.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 2 & j == 1) {
			C2.setIcon(new ImageIcon(imgn.getImagen()[0]));
			C2.setToolTipText(lbNombreComp.getText());
			U2 = false;
			juega++;
			winner.setCinco(C2.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 2 & j == 2) {
			C3.setIcon(new ImageIcon(imgn.getImagen()[0]));
			C3.setToolTipText(lbNombreComp.getText());
			U3 = false;
			juega++;
			winner.setCinco(C3.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 2 & j == 3) {
			C4.setIcon(new ImageIcon(imgn.getImagen()[0]));
			C4.setToolTipText(lbNombreComp.getText());
			U4 = false;
			juega++;
			winner.setCinco(C4.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 2 & j == 4) {
			C5.setIcon(new ImageIcon(imgn.getImagen()[0]));
			C5.setToolTipText(lbNombreComp.getText());
			U5 = false;
			juega++;
			winner.setCinco(C5.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 2 & j == 5) {
			C6.setIcon(new ImageIcon(imgn.getImagen()[0]));
			C6.setToolTipText(lbNombreComp.getText());
			U6 = false;
			juega++;
			winner.setCinco(C6.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 2 & j == 6) {
			C7.setIcon(new ImageIcon(imgn.getImagen()[0]));
			C7.setToolTipText(lbNombreComp.getText());
			U7 = false;
			juega++;
			winner.setCinco(C7.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 3 & j == 0) {
			D1.setIcon(new ImageIcon(imgn.getImagen()[0]));
			D1.setToolTipText(lbNombreComp.getText());
			Y1 = false;
			juega++;
			winner.setCinco(D1.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 3 & j == 1) {
			D2.setIcon(new ImageIcon(imgn.getImagen()[0]));
			D2.setToolTipText(lbNombreComp.getText());
			Y2 = false;
			juega++;
			winner.setCinco(D2.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 3 & j == 2) {
			D3.setIcon(new ImageIcon(imgn.getImagen()[0]));
			D3.setToolTipText(lbNombreComp.getText());
			Y3 = false;
			juega++;
			winner.setCinco(D3.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 3 & j == 3) {
			D4.setIcon(new ImageIcon(imgn.getImagen()[0]));
			D4.setToolTipText(lbNombreComp.getText());
			Y4 = false;
			juega++;
			winner.setCinco(D4.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 3 & j == 4) {
			D5.setIcon(new ImageIcon(imgn.getImagen()[0]));
			D5.setToolTipText(lbNombreComp.getText());
			Y5 = false;
			juega++;
			winner.setCinco(D5.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 3 & j == 5) {
			D6.setIcon(new ImageIcon(imgn.getImagen()[0]));
			D6.setToolTipText(lbNombreComp.getText());
			Y6 = false;
			juega++;
			winner.setCinco(D6.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 3 & j == 6) {
			D7.setIcon(new ImageIcon(imgn.getImagen()[0]));
			D7.setToolTipText(lbNombreComp.getText());
			Y7 = false;
			juega++;
			winner.setCinco(D7.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 4 & j == 0) {
			E1.setIcon(new ImageIcon(imgn.getImagen()[0]));
			E1.setToolTipText(lbNombreComp.getText());
			T1 = false;
			juega++;
			winner.setCinco(E1.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 4 & j == 1) {
			E2.setIcon(new ImageIcon(imgn.getImagen()[0]));
			E2.setToolTipText(lbNombreComp.getText());
			T2 = false;
			juega++;
			winner.setCinco(E2.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 4 & j == 2) {
			E3.setIcon(new ImageIcon(imgn.getImagen()[0]));
			E3.setToolTipText(lbNombreComp.getText());
			T3 = false;
			juega++;
			winner.setCinco(E3.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 4 & j == 3) {
			E4.setIcon(new ImageIcon(imgn.getImagen()[0]));
			E4.setToolTipText(lbNombreComp.getText());
			T4 = false;
			juega++;
			winner.setCinco(E4.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 4 & j == 4) {
			E5.setIcon(new ImageIcon(imgn.getImagen()[0]));
			E5.setToolTipText(lbNombreComp.getText());
			T5 = false;
			juega++;
			winner.setCinco(E5.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 4 & j == 5) {
			E6.setIcon(new ImageIcon(imgn.getImagen()[0]));
			E6.setToolTipText(lbNombreComp.getText());
			T6 = false;
			juega++;
			winner.setCinco(E6.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 4 & j == 6) {
			E7.setIcon(new ImageIcon(imgn.getImagen()[0]));
			E7.setToolTipText(lbNombreComp.getText());
			T7 = false;
			juega++;
			winner.setCinco(E7.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 5 & j == 0) {
			F1.setIcon(new ImageIcon(imgn.getImagen()[0]));
			F1.setToolTipText(lbNombreComp.getText());
			R1 = false;
			juega++;
			winner.setCinco(F1.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 5 & j == 1) {
			F2.setIcon(new ImageIcon(imgn.getImagen()[0]));
			F2.setToolTipText(lbNombreComp.getText());
			R2 = false;
			juega++;
			winner.setCinco(F2.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 5 & j == 2) {
			F3.setIcon(new ImageIcon(imgn.getImagen()[0]));
			F3.setToolTipText(lbNombreComp.getText());
			R3 = false;
			juega++;
			winner.setCinco(F3.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 5 & j == 3) {
			F4.setIcon(new ImageIcon(imgn.getImagen()[0]));
			F4.setToolTipText(lbNombreComp.getText());
			R4 = false;
			juega++;
			winner.setCinco(F4.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 5 & j == 4) {
			F5.setIcon(new ImageIcon(imgn.getImagen()[0]));
			F5.setToolTipText(lbNombreComp.getText());
			R5 = false;
			juega++;
			winner.setCinco(F5.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 5 & j == 5) {
			F6.setIcon(new ImageIcon(imgn.getImagen()[0]));
			F6.setToolTipText(lbNombreComp.getText());
			R6 = false;
			juega++;
			winner.setCinco(F6.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		if (i == 5 & j == 6) {
			F7.setIcon(new ImageIcon(imgn.getImagen()[0]));
			F7.setToolTipText(lbNombreComp.getText());
			R7 = false;
			juega++;
			winner.setCinco(F7.getToolTipText());
			rdbtnJC.setVisible(true);
			rdbtnJ1.setVisible(false);
		}
		return true;
	}

	// EURISTICA PARA LA COMPUTADORA
	public boolean pensar() {
		boolean a = false;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (!a) {
					if (j < 4) { // lado derecha-izquierda
						if (ocupado[i][j] & ocupado[i][j + 1]
								& ocupado[i][j + 2]) {
							if (!color[i][j] & !color[i][j + 1]
									& !color[i][j + 2]) {
								if (!ocupado[i][j + 3] & !bloqueo[i][j + 3]) {
									a = pc(i, j + 3);
								}
							}
						}
					}

					if (j > 2) {// lado izquierda-derecha
						if (ocupado[i][j] & ocupado[i][j - 1]
								& ocupado[i][j - 2]) {
							if ((!color[i][j]) & (!color[i][j - 1])
									& (!color[i][j - 2])) { // 3 falses seguidos
								if (!ocupado[i][j - 3] & !bloqueo[i][j - 3]) {
									a = pc(i, j - 3);
								}
							}
						}
					}
					if (i >= 2) { // arriba
						if (ocupado[i][j] & ocupado[i - 1][j]
								& ocupado[i - 2][j]) {
							if ((!color[i][j]) & (!color[i - 1][j])
									& (!color[i - 2][j])) { // 3 falses seguidos
								if (!ocupado[i + 1][j] & !bloqueo[i + 1][j]) {
									a = pc(i + 1, j);
								}
							}
						}
					}
					if (i < 5 & i > 1 & j < 6 & j > 1) {
						if (ocupado[i][j] & ocupado[i - 1][j - 1]
								& ocupado[i - 2][j - 2]) { // diagonal winner
							if ((!color[i][j]) & (!color[i - 1][j - 1])
									& (!color[i - 2][j - 2])) { // 3 falses
																// seguidos
								if (!ocupado[i + 1][j + 1]
										& !bloqueo[i + 1][j + 1]) {
									a = pc(i + 1, j + 1);
								}
							}
						}
					}
					if (i < 5 & i > 1 & j > 0 & j < 5) {
						if (ocupado[i][j] & ocupado[i - 1][j + 1]
								& ocupado[i - 2][j + 2]) { // diagonal winner
							if ((!color[i][j]) & (!color[i - 1][j + 1])
									& (!color[i - 2][j + 2])) { // 3 falses
																// seguidos
								if (!ocupado[i + 1][j - 1]
										& !bloqueo[i + 1][j - 1]) {
									a = pc(i + 1, j - 1);
								}
							}
						}
					}
				}
			}
		}
		return a;
	}

	public boolean pensar(int i, int j) {
		boolean a = false;
		a = pensar();
		if (!a) {
			if (j <= 5 & j >= 2 & !a) {
				if (ocupado[i][j] & ocupado[i][j - 1] & ocupado[i][j - 2]) { // winer
																				// en
																				// lateral
																				// izquierda-derecha
					if (color[i][j] & color[i][j - 1] & color[i][j - 2]) { // 3
																			// trues
																			// seguidos
						if (!ocupado[i][j + 1] & !bloqueo[i][j + 1]) {
							a = pc(i, j + 1);
						}
					}
				}
			}
			if (j >= 1 & j <= 4 & !a) {
				if (ocupado[i][j] & ocupado[i][j + 1] & ocupado[i][j + 2]) { // winer
																				// en
																				// lateral
																				// derecha-izquierda
					if ((color[i][j]) & (color[i][j + 1]) & (color[i][j + 2])) { // 3
																					// trues
																					// seguidos
						if (!ocupado[i][j - 1] & !bloqueo[i][j - 1]) {
							a = pc(i, j - 1);
						}
					}
				}
			}
			if (i >= 2 & !a) {
				if (ocupado[i][j] & ocupado[i - 1][j] & ocupado[i - 2][j]) { // winner
																				// abajo-arriba
					if ((color[i][j]) & (color[i - 1][j]) & (color[i - 2][j])) { // 3
																					// trues
																					// seguidos
						if (!ocupado[i + 1][j] & !bloqueo[i + 1][j]) {
							a = pc(i + 1, j);
						}
					}
				}
			}
			if (i < 5 & i > 1 & j < 6 & j > 1 & !a) {
				if (ocupado[i][j] & ocupado[i - 1][j - 1]
						& ocupado[i - 2][j - 2]) { // diagonal winner
					if ((color[i][j]) & (color[i - 1][j - 1])
							& (color[i - 2][j - 2])) { // 3 trues seguidos
						if (!ocupado[i + 1][j + 1] & !bloqueo[i + 1][j + 1]) {
							a = pc(i + 1, j + 1);
						}
					}
				}
			}
			if (i < 5 & i > 1 & j > 0 & j < 5 & !a) {
				if (ocupado[i][j] & ocupado[i - 1][j + 1]
						& ocupado[i - 2][j + 2]) { // diagonal winner
					if ((color[i][j]) & (color[i - 1][j + 1])
							& (color[i - 2][j + 2])) { // 3 trues seguidos
						if (!ocupado[i + 1][j - 1] & !bloqueo[i + 1][j - 1]) {
							a = pc(i + 1, j - 1);
						}
					}
				}
			}
		}
		return a;
	}

	public void logica(int i, int j) {
		boolean a = false;
		int fila = i;
		int columna = j;
		a = pensar(i, j);

		while (!a) {
			i = fila;
			j = columna;
			int random;
			if (i % 2 == 0 & j % 3 == 0) {
				random = (int) (Math.random() * 5);
			} else {
				random = (int) (Math.random() * 5 + 1);
			}

			if (random == 0 & !a) {
				if (i != 5) {
					if (!bloqueo[i + 1][j] & !ocupado[i + 1][j]) {
						a = pc(i + 1, j);
					}
				}
			}

			if (random == 1 & !a) {
				int temp[], temp2[];
				temp = new int[8]; // filas
				temp2 = new int[8]; // columnas
				int posi = 0;

				for (int f = 0; f < 6; f++) {
					for (int c = 0; c < 7; c++) {
						if (!bloqueo[f][c] & !ocupado[f][c]) {// guarda el i y
																// el j
							temp[posi] = f;
							temp2[posi] = c;
							posi++;
						}
					}
				}
				int randomi = (int) (Math.random() * posi);
				a = pc(temp[randomi], temp2[randomi]);
			}

			if (random == 2 & !a) {
				if (j < 6 & j > 0) {
					if (!bloqueo[i][j - 1] & !ocupado[i][j - 1]) {
						a = pc(i, j - 1);// actualiza dato y dibuja
					} else {
						random = 3;
					}
				}
				if (j == 6) {
					if (!bloqueo[i][j - 1] & !ocupado[i][j - 1]) {
						a = pc(i, j - 1);
					} else {
						random = 3;
					}
				}
			}

			if (random == 3 & !a) {
				if (j < 6 & j > 0) {
					if (!bloqueo[i][j + 1] & !ocupado[i][j + 1]) {
						a = pc(i, j + 1);
					} else {
						random = 4;
					}
				}
				if (j == 0) {
					if (!bloqueo[i][j + 1] & !ocupado[i][j + 1]) {
						a = pc(i, j + 1);
					}
				} else {
					random = 4;
				}
			}

			if (random == 4 & !a) {
				if (i != 5 & j != 0) {
					if (ocupado[i][j - 1]) {
						if (!bloqueo[i + 1][j - 1] & !ocupado[i + 1][j - 1]) {
							a = pc(i + 1, j - 1);
						} else {
							random = 5;
						}
					}
				} else {
					random = 5;
				}
			}

			if (random == 5 & !a) {
				if (i != 5 & j != 6) {
					if (ocupado[i][j + 1]) {
						if (!bloqueo[i + 1][j + 1] & !ocupado[i + 1][j + 1]) {
							a = pc(i + 1, j + 1);
						}
					}
				}
			}
		}
	}

	public void perdedor() {
		boolean b = true;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (j < 4 & b) {
					if (ocupado[i][j] & ocupado[i][j + 1] & ocupado[i][j + 2]
							& ocupado[i][j + 3]) { // winer en lateral
													// izquierda-derecha
						if ((!color[i][j]) & (!color[i][j + 1])
								& (!color[i][j + 2]) & (!color[i][j + 3])) { // 4
																				// falses
																				// seguidos
							b = false;
							terminar.Botones();
							Resultados vr = new Resultados();
							vr.setNombreJ("Destructor");
							vr.setAlwaysOnTop(true);
							vr.setVisible(true);
							setVisible(false);
						}
					}
				}
				if (j > 2 & b) {
					if (ocupado[i][j] & ocupado[i][j - 1] & ocupado[i][j - 2]
							& ocupado[i][j - 3]) { // winer en lateral
													// derecha-izquierda
						if ((!color[i][j]) & (!color[i][j - 1])
								& (!color[i][j - 2]) & (!color[i][j - 3])) { // 4
																				// falses
																				// seguidos
							terminar.Botones();
							b = false;
							Resultados vr = new Resultados();
							vr.setNombreJ("Destructor");
							vr.setAlwaysOnTop(true);
							vr.setVisible(true);
							setVisible(false);
						}
					}
				}

				if (i < 3 & b) {
					if (ocupado[i][j] & ocupado[i + 1][j] & ocupado[i + 2][j]
							& ocupado[i + 3][j]) { // winner arriba de
													// abajo-arriba
						if ((!color[i][j]) & (!color[i + 1][j])
								& (!color[i + 2][j]) & (!color[i + 3][j])) { // 4
																				// falses
																				// seguidos
							terminar.Botones();
							b = false;
							Resultados vr = new Resultados();
							vr.setNombreJ("Destructor");
							vr.setAlwaysOnTop(true);
							vr.setVisible(true);
							setVisible(false);
						}
					}
				}

				if (i > 3 & b) {
					if (ocupado[i][j] & ocupado[i - 1][j] & ocupado[i - 2][j]
							& ocupado[i - 3][j]) { // winner arriba de
													// arriba-abajo
						if ((!color[i][j]) & (!color[i - 1][j])
								& (!color[i - 2][j]) & (!color[i - 3][j])) { // 4
																				// falses
																				// seguidos
							b = false;
							terminar.Botones();
							Resultados vr = new Resultados();
							vr.setNombreJ("Destructor");
							vr.setAlwaysOnTop(true);
							vr.setVisible(true);
							setVisible(false);
						}
					}
				}
				if (i < 3 & j < 4 & b) {
					if (ocupado[i][j] & ocupado[i + 1][j + 1]
							& ocupado[i + 2][j + 2] & ocupado[i + 3][j + 3]) { // diagonal
																				// winner
						if ((!color[i][j]) & (!color[i + 1][j + 1])
								& (!color[i + 2][j + 2])
								& (!color[i + 3][j + 3])) { // 4 falses seguidos
							terminar.Botones();
							b = false;
							Resultados vr = new Resultados();
							vr.setNombreJ("Destructor");
							vr.setAlwaysOnTop(true);
							vr.setVisible(true);
							setVisible(false);
						}
					}
				}
				if (i < 3 & j > 2 & b) {
					if (ocupado[i][j] & ocupado[i + 1][j - 1]
							& ocupado[i + 2][j - 2] & ocupado[i + 3][j - 3]) { // diagonal
																				// winner
						if ((!color[i][j]) & (!color[i + 1][j - 1])
								& (!color[i + 2][j - 2])
								& (!color[i + 3][j - 3])) { // 4 falses seguidos
							terminar.Botones();
							b = false;
							Resultados vr = new Resultados();
							vr.setNombreJ("Destructor");
							vr.setAlwaysOnTop(true);
							vr.setVisible(true);
							setVisible(false);
						}
					}
				}
				if (i > 2 & j > 2 & b) {
					if (ocupado[i][j] & ocupado[i - 1][j - 1]
							& ocupado[i - 2][j - 2] & ocupado[i - 3][j - 3]) { // diagonal
																				// winner
						if ((!color[i][j]) & (!color[i - 1][j - 1])
								& (!color[i - 2][j - 2])
								& (!color[i - 3][j - 3])) { // 4 falses seguidos
							terminar.Botones();
							b = false;
							Resultados vr = new Resultados();
							vr.setNombreJ("Destructor");
							vr.setAlwaysOnTop(true);
							vr.setVisible(true);
							setVisible(false);
						}
					}
				}
				if (i > 2 & j < 4 & b) {
					if (ocupado[i][j] & ocupado[i - 1][j + 1]
							& ocupado[i - 2][j + 2] & ocupado[i - 3][j + 3]) { // diagonal
																				// winner
						if ((!color[i][j]) & (!color[i - 1][j + 1])
								& (!color[i - 2][j + 2])
								& (!color[i - 3][j + 3])) { // 4 falses seguidos
							terminar.Botones();
							b = false;
							Resultados vr = new Resultados();
							vr.setNombreJ("Destructor");
							vr.setAlwaysOnTop(true);
							vr.setVisible(true);
							setVisible(false);
						}
					}
				}
			}
		}
	}

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Game frame = new Game();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	// METODO CONSTRUCTOR
	public Game() {
		// CREA EL FRAME Y LOS COMPONENTES
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("4 En Linea");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(600, 0, 800, 800);
		Panel contentPane = new Panel("/images/Computadora.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		vaciar();
		// CREA LOS BOTONES
		A1.setIcon(new ImageIcon(urlRevers));
		A1.setBounds(105, 603, 83, 83);
		contentPane.add(A1);
		A1.setEnabled(false);

		A2.setIcon(new ImageIcon(urlRevers));
		A2.setBounds(188, 603, 83, 83);
		contentPane.add(A2);
		A2.setEnabled(false);

		A3.setBounds(271, 603, 83, 83);
		A3.setIcon(new ImageIcon(urlRevers));
		contentPane.add(A3);
		A3.setEnabled(false);

		A4.setBounds(354, 603, 83, 83);
		A4.setIcon(new ImageIcon(urlRevers));
		contentPane.add(A4);
		A4.setEnabled(false);

		A5.setEnabled(false);
		A5.setBounds(437, 603, 83, 83);
		A5.setIcon(new ImageIcon(urlRevers));
		contentPane.add(A5);

		A6.setEnabled(false);
		A6.setBounds(520, 603, 83, 83);
		A6.setIcon(new ImageIcon(urlRevers));
		contentPane.add(A6);

		A7.setEnabled(false);
		A7.setBounds(603, 603, 83, 83);
		A7.setIcon(new ImageIcon(urlRevers));
		contentPane.add(A7);

		B1.setEnabled(false);
		B1.setBounds(105, 520, 83, 83);
		B1.setIcon(new ImageIcon(urlRevers));
		contentPane.add(B1);

		B2.setEnabled(false);
		B2.setBounds(188, 520, 83, 83);
		B2.setIcon(new ImageIcon(urlRevers));
		contentPane.add(B2);

		B3.setEnabled(false);
		B3.setBounds(271, 520, 83, 83);
		B3.setIcon(new ImageIcon(urlRevers));
		contentPane.add(B3);

		B4.setEnabled(false);
		B4.setBounds(354, 520, 83, 83);
		B4.setIcon(new ImageIcon(urlRevers));
		contentPane.add(B4);

		B5.setEnabled(false);
		B5.setBounds(437, 520, 83, 83);
		B5.setIcon(new ImageIcon(urlRevers));
		contentPane.add(B5);

		B6.setEnabled(false);
		B6.setBounds(520, 520, 83, 83);
		B6.setIcon(new ImageIcon(urlRevers));
		contentPane.add(B6);

		B7.setEnabled(false);
		B7.setBounds(603, 520, 83, 83);
		B7.setIcon(new ImageIcon(urlRevers));
		contentPane.add(B7);

		C1.setEnabled(false);
		C1.setBounds(105, 437, 83, 83);
		C1.setIcon(new ImageIcon(urlRevers));
		contentPane.add(C1);

		C2.setEnabled(false);
		C2.setBounds(188, 437, 83, 83);
		C2.setIcon(new ImageIcon(urlRevers));
		contentPane.add(C2);

		C3.setEnabled(false);
		C3.setBounds(271, 437, 83, 83);
		C3.setIcon(new ImageIcon(urlRevers));
		contentPane.add(C3);

		C4.setEnabled(false);
		C4.setBounds(354, 437, 83, 83);
		C4.setIcon(new ImageIcon(urlRevers));
		contentPane.add(C4);

		C5.setEnabled(false);
		C5.setBounds(437, 437, 83, 83);
		C5.setIcon(new ImageIcon(urlRevers));
		contentPane.add(C5);

		C6.setEnabled(false);
		C6.setBounds(520, 437, 83, 83);
		C6.setIcon(new ImageIcon(urlRevers));
		contentPane.add(C6);

		C7.setEnabled(false);
		C7.setBounds(603, 437, 83, 83);
		C7.setIcon(new ImageIcon(urlRevers));
		contentPane.add(C7);

		D1.setEnabled(false);
		D1.setBounds(105, 354, 83, 83);
		D1.setIcon(new ImageIcon(urlRevers));
		contentPane.add(D1);

		D2.setEnabled(false);
		D2.setBounds(188, 354, 83, 83);
		D2.setIcon(new ImageIcon(urlRevers));
		contentPane.add(D2);

		D3.setEnabled(false);
		D3.setBounds(271, 354, 83, 83);
		D3.setIcon(new ImageIcon(urlRevers));
		contentPane.add(D3);

		D4.setEnabled(false);
		D4.setBounds(354, 354, 83, 83);
		D4.setIcon(new ImageIcon(urlRevers));
		contentPane.add(D4);

		D5.setEnabled(false);
		D5.setBounds(437, 354, 83, 83);
		D5.setIcon(new ImageIcon(urlRevers));
		contentPane.add(D5);

		D6.setEnabled(false);
		D6.setBounds(520, 354, 83, 83);
		D6.setIcon(new ImageIcon(urlRevers));
		contentPane.add(D6);

		D7.setEnabled(false);
		D7.setBounds(603, 354, 83, 83);
		D7.setIcon(new ImageIcon(urlRevers));
		contentPane.add(D7);

		E1.setEnabled(false);
		E1.setBounds(105, 271, 83, 83);
		E1.setIcon(new ImageIcon(urlRevers));
		contentPane.add(E1);

		E2.setEnabled(false);
		E2.setBounds(188, 271, 83, 83);
		E2.setIcon(new ImageIcon(urlRevers));
		contentPane.add(E2);

		E3.setEnabled(false);
		E3.setBounds(271, 271, 83, 83);
		E3.setIcon(new ImageIcon(urlRevers));
		contentPane.add(E3);

		E4.setEnabled(false);
		E4.setBounds(354, 271, 83, 83);
		E4.setIcon(new ImageIcon(urlRevers));
		contentPane.add(E4);

		E5.setEnabled(false);
		E5.setBounds(437, 271, 83, 83);
		E5.setIcon(new ImageIcon(urlRevers));
		contentPane.add(E5);

		E6.setEnabled(false);
		E6.setBounds(520, 271, 83, 83);
		E6.setIcon(new ImageIcon(urlRevers));
		contentPane.add(E6);

		E7.setEnabled(false);
		E7.setBounds(603, 271, 83, 83);
		E7.setIcon(new ImageIcon(urlRevers));
		contentPane.add(E7);

		F1.setEnabled(false);
		F1.setBounds(105, 188, 83, 83);
		F1.setIcon(new ImageIcon(urlRevers));
		contentPane.add(F1);

		F2.setEnabled(false);
		F2.setBounds(188, 188, 83, 83);
		F2.setIcon(new ImageIcon(urlRevers));
		contentPane.add(F2);

		F3.setEnabled(false);
		F3.setBounds(271, 188, 83, 83);
		F3.setIcon(new ImageIcon(urlRevers));
		contentPane.add(F3);

		F4.setEnabled(false);
		F4.setBounds(354, 188, 83, 83);
		F4.setIcon(new ImageIcon(urlRevers));
		contentPane.add(F4);

		F5.setEnabled(false);
		F5.setBounds(437, 188, 83, 83);
		F5.setIcon(new ImageIcon(urlRevers));
		contentPane.add(F5);

		F6.setEnabled(false);
		F6.setBounds(520, 188, 83, 83);
		F6.setIcon(new ImageIcon(urlRevers));
		contentPane.add(F6);

		F7.setEnabled(false);
		F7.setBounds(603, 188, 83, 83);
		F7.setIcon(new ImageIcon(urlRevers));
		contentPane.add(F7);
		// CREA LOS LABEL Y LOS DEMAS COMPONENTES
		JLabel lblJugador = new JLabel(" :Jugador");
		lblJugador.setForeground(Color.WHITE);
		lblJugador.setBounds(701, 28, 83, 14);
		lblJugador.setFont(new Font("Agency FB", Font.BOLD, 14));
		contentPane.add(lblJugador);
		lblJugador.setVisible(false);

		JLabel lblImgJ = new JLabel("");
		lblImgJ.setBounds(83, 53, 83, 83);
		contentPane.add(lblImgJ);

		JLabel lbNombreJ1 = new JLabel("");
		lbNombreJ1.setForeground(Color.WHITE);
		lbNombreJ1.setBounds(613, 28, 90, 16);
		lbNombreJ1.setFont(new Font("Agency FB", Font.BOLD, 14));
		contentPane.add(lbNombreJ1);

		rdbtnJ1.setFont(new Font("Agency FB", Font.BOLD, 14));
		rdbtnJ1.setSelected(true);
		rdbtnJ1.setBounds(494, 24, 109, 23);
		lblJugador.setFont(new Font("Agency FB", Font.BOLD, 14));
		contentPane.add(rdbtnJ1);
		rdbtnJ1.setVisible(false);

		JLabel lblComputadora = new JLabel("Computadora");
		lblComputadora.setForeground(Color.WHITE);
		lblComputadora.setFont(new Font("Dialog", Font.BOLD, 10));
		lblComputadora.setBounds(10, 28, 109, 14);
		contentPane.add(lblComputadora);
		lblComputadora.setVisible(false);

		JLabel lblImgC = new JLabel("");
		lblImgC.setBounds(613, 53, 83, 83);
		contentPane.add(lblImgC);
		lbNombreComp.setFont(new Font("Dialog", Font.BOLD, 14));
		lbNombreComp.setForeground(Color.WHITE);

		lbNombreComp.setBounds(129, 29, 98, 16);
		lblComputadora.setFont(new Font("Agency FB", Font.BOLD, 16));
		contentPane.add(lbNombreComp);
		lbNombreComp.setVisible(false);

		rdbtnJC.setFont(new Font("Agency FB", Font.BOLD, 14));
		rdbtnJC.setSelected(true);
		rdbtnJC.setBounds(233, 24, 109, 23);
		contentPane.add(rdbtnJC);
		rdbtnJC.setVisible(false);
		// BOTON QUE INICIALIZA EL JUEGO EN SU TOTALIDAD
		JButton btnIniciar = new JButton("");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// POSICIONA EL RADIO BUTTON PARA QUE INICIE EL JUGADOR 1
				rdbtnJC.setVisible(false);
				rdbtnJ1.setVisible(true);
				// ENVIA LOS DATOS A LOS LABEL RESPECTIVOS Y CARGA LOS SIMBOLOS
				// DE CADA JUGADOR
				lblJugador.setVisible(true);
				lblComputadora.setVisible(true);
				lbNombreComp.setVisible(true);
				lbNombreJ1.setText(nombre);
				lblImgC.setIcon(new ImageIcon(imgn.getImagen()[1])); // compu
				lblImgJ.setIcon(new ImageIcon(imgn.getImagen()[0])); // pl
				// HABILITA LOS BOTONES
				A1.setEnabled(true);
				A2.setEnabled(true);
				A3.setEnabled(true);
				A4.setEnabled(true);
				A5.setEnabled(true);
				A6.setEnabled(true);
				A7.setEnabled(true);
				B1.setEnabled(true);
				B2.setEnabled(true);
				B3.setEnabled(true);
				B4.setEnabled(true);
				B5.setEnabled(true);
				B6.setEnabled(true);
				B7.setEnabled(true);
				C1.setEnabled(true);
				C2.setEnabled(true);
				C3.setEnabled(true);
				C4.setEnabled(true);
				C5.setEnabled(true);
				C6.setEnabled(true);
				C7.setEnabled(true);
				D1.setEnabled(true);
				D2.setEnabled(true);
				D3.setEnabled(true);
				D4.setEnabled(true);
				D5.setEnabled(true);
				D6.setEnabled(true);
				D7.setEnabled(true);
				E1.setEnabled(true);
				E2.setEnabled(true);
				E3.setEnabled(true);
				E4.setEnabled(true);
				E5.setEnabled(true);
				E6.setEnabled(true);
				E7.setEnabled(true);
				F1.setEnabled(true);
				F2.setEnabled(true);
				F3.setEnabled(true);
				F4.setEnabled(true);
				F5.setEnabled(true);
				F6.setEnabled(true);
				F7.setEnabled(true);
				// INICIALIZA LAS VARIABLES PARA CADA BOTON
				A1.setToolTipText("");
				A2.setToolTipText("");
				A3.setToolTipText("");
				A4.setToolTipText("");
				A5.setToolTipText("");
				A6.setToolTipText("");
				A7.setToolTipText("");
				B1.setToolTipText("");
				B2.setToolTipText("");
				B3.setToolTipText("");
				B4.setToolTipText("");
				B5.setToolTipText("");
				B6.setToolTipText("");
				B7.setToolTipText("");
				C1.setToolTipText("");
				C2.setToolTipText("");
				C3.setToolTipText("");
				C4.setToolTipText("");
				C5.setToolTipText("");
				C6.setToolTipText("");
				C7.setToolTipText("");
				D1.setToolTipText("");
				D2.setToolTipText("");
				D3.setToolTipText("");
				D4.setToolTipText("");
				D5.setToolTipText("");
				D6.setToolTipText("");
				D7.setToolTipText("");
				E1.setToolTipText("");
				E2.setToolTipText("");
				E3.setToolTipText("");
				E4.setToolTipText("");
				E5.setToolTipText("");
				E6.setToolTipText("");
				E7.setToolTipText("");
				F1.setToolTipText("");
				F2.setToolTipText("");
				F3.setToolTipText("");
				F4.setToolTipText("");
				F5.setToolTipText("");
				F6.setToolTipText("");
				F7.setToolTipText("");
				// INICIALIZA LAS VARIABLES CONTADORAS
				jugadaJ1 = 0;
				juega = 0;
			}
		});
		btnIniciar.setIcon(new ImageIcon(Game.class
				.getResource("/images/ImgBotonIniciar.jpg")));
		btnIniciar.setBounds(348, 26, 90, 35);
		contentPane.add(btnIniciar);
		
		//ES EL BOTON QUE REGRESA TODO A LA VENTANA DE INICIO
		JButton btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInicio v1 = new VentanaInicio();
				v1.setVisible(true);
				v1.setAlwaysOnTop(true);
				setVisible(false);

			}
		});
		btnSalir.setIcon(new ImageIcon(Game.class
				.getResource("/images/ImgBotonSalir.jpg")));
		btnSalir.setBounds(348, 118, 90, 35);
		contentPane.add(btnSalir);

		//ESTE PROCESO SE REPITE PARA CADA BOTON
		//ES UN ACTION LISTENER PARA EL BOTON A1
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (p1) {//SI EL BOTON ESTA HABILITADO ENTONCES
					dibujar(0, 0);
					A1.setIcon(new ImageIcon(imgn.getImagen()[1]));//ENVIA EL SIMBOLO DEL JUGADOR 1
					A1.setToolTipText(nombre);//ENVIA EL IDENTIFICADOR AL BOTON CON EL NOMBRE DE USUARIO
					p1 = false;//INHABILITA EL BOTON
					juega++;//AUMENTA LA VARIABLE CONTADORA PARA EL SIGUIENTE TURNO
					jugadaJ1++;//AUMENTA LA VARIABLE CONTADORA PARA LAS JUGADAS REALIZADAS POR EL USUARIO
					winner.setUno(A1.getToolTipText());//ENVIA A WINNER LA JUGADA A SU RESPECTIVA POSICION EN LA MATRIZ
					rdbtnJ1.setVisible(true);//INTERCALA LOS RADIOBUTTON
					rdbtnJC.setVisible(false);
				}
				if (winner.Ganador()) {//PREGUNTA SI HAY UN GANADOR
					terminar.Botones1();//FINALIZA EL PROCESO DE TODOS LOS BOTONES
					Resultados vr = new Resultados();//GENERA LA VENTANA GANADORA
					vr.setNombreJ(A1.getToolTipText());//ENVIA EL NOMBRE DEL GANADOR
					vr.setScore(jugadaJ1);//ABRE LA VENTANA
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (p2) {
					dibujar(0, 1);
					A2.setIcon(new ImageIcon(imgn.getImagen()[1]));
					A2.setToolTipText(nombre);
					p2 = false;
					juega++;
					jugadaJ1++;
					winner.setDos(A2.getToolTipText());
					rdbtnJ1.setVisible(true);
					rdbtnJC.setVisible(false);
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(A2.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (p3) {
					dibujar(0, 2);
					A3.setIcon(new ImageIcon(imgn.getImagen()[1]));
					p3 = false;
					A3.setToolTipText(nombre);
					juega++;
					jugadaJ1++;
					winner.setTres(A3.getToolTipText());
					rdbtnJ1.setVisible(true);
					rdbtnJC.setVisible(false);
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(A3.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (p4) {
					dibujar(0, 3);
					A4.setIcon(new ImageIcon(imgn.getImagen()[1]));
					A4.setToolTipText(nombre);
					p4 = false;
					juega++;
					jugadaJ1++;
					winner.setCuatro(A4.getToolTipText());
					rdbtnJ1.setVisible(true);
					rdbtnJC.setVisible(false);
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(A4.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (p5) {
					dibujar(0, 4);
					A5.setIcon(new ImageIcon(imgn.getImagen()[1]));
					A5.setToolTipText(nombre);
					p5 = false;
					juega++;
					jugadaJ1++;
					winner.setCinco(A5.getToolTipText());
					rdbtnJ1.setVisible(true);
					rdbtnJC.setVisible(false);
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(A5.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (p6) {
					dibujar(0, 5);
					A6.setIcon(new ImageIcon(imgn.getImagen()[1]));
					A6.setToolTipText(nombre);
					p6 = false;
					juega++;
					jugadaJ1++;
					winner.setSeis(A6.getToolTipText());
					rdbtnJ1.setVisible(true);
					rdbtnJC.setVisible(false);
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(A6.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		A7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (p7) {
					dibujar(0, 6);
					A7.setIcon(new ImageIcon(imgn.getImagen()[1]));
					A7.setToolTipText(nombre);
					p7 = false;
					juega++;
					jugadaJ1++;
					winner.setSiete(A7.getToolTipText());
					rdbtnJ1.setVisible(true);
					rdbtnJC.setVisible(false);
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(A7.getToolTipText());
					vr.setScore(jugadaJ1);
					setVisible(false);
					vr.setVisible(true);
				}
			}
		});
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (O1) {
					if (p1) {
						dibujar(0, 0);
						A1.setIcon(new ImageIcon(imgn.getImagen()[1]));
						A1.setToolTipText(nombre);
						B1.setToolTipText(nombre);
						p1 = false;
						juega++;
						jugadaJ1++;
						winner.setUno(A1.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					} else {
						dibujar(1, 0);
						B1.setIcon(new ImageIcon(imgn.getImagen()[1]));
						B1.setToolTipText(nombre);
						O1 = false;
						juega++;
						jugadaJ1++;
						winner.setDuno(B1.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(B1.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (O2) {
					if (p2) {
						dibujar(0, 1);
						A2.setIcon(new ImageIcon(imgn.getImagen()[1]));
						A2.setToolTipText(nombre);
						B2.setToolTipText(nombre);
						p2 = false;
						juega++;
						jugadaJ1++;
						winner.setDos(A2.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					} else {
						dibujar(1, 1);
						B2.setIcon(new ImageIcon(imgn.getImagen()[1]));
						B2.setToolTipText(nombre);
						O2 = false;
						juega++;
						jugadaJ1++;
						winner.setDdos(B2.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(B2.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (O3) {
					if (p3) {
						dibujar(0, 2);
						A3.setIcon(new ImageIcon(imgn.getImagen()[1]));
						A3.setToolTipText(nombre);
						B3.setToolTipText(nombre);
						p3 = false;
						juega++;
						jugadaJ1++;
						winner.setTres(A3.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					} else {
						dibujar(1, 2);
						B3.setIcon(new ImageIcon(imgn.getImagen()[1]));
						B3.setToolTipText(nombre);
						O3 = false;
						juega++;
						jugadaJ1++;
						winner.setDtres(B3.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(B3.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (O4) {
					if (p4) {
						dibujar(0, 3);
						A4.setIcon(new ImageIcon(imgn.getImagen()[1]));
						A4.setToolTipText(nombre);
						B4.setToolTipText(nombre);
						p4 = false;
						juega++;
						jugadaJ1++;
						winner.setCuatro(A4.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					} else {
						dibujar(1, 3);
						B4.setIcon(new ImageIcon(imgn.getImagen()[1]));
						B4.setToolTipText(nombre);
						O4 = false;
						juega++;
						jugadaJ1++;
						winner.setDcuatro(B4.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(B4.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (O5) {
					if (p5) {
						dibujar(0, 4);
						A5.setIcon(new ImageIcon(imgn.getImagen()[1]));
						A5.setToolTipText(nombre);
						B5.setToolTipText(nombre);
						p5 = false;
						juega++;
						jugadaJ1++;
						winner.setCinco(A5.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					} else {
						dibujar(1, 4);
						B5.setIcon(new ImageIcon(imgn.getImagen()[1]));
						B5.setToolTipText(nombre);
						O5 = false;
						juega++;
						jugadaJ1++;
						winner.setDcinco(B5.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(B5.getToolTipText());
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (O6) {
					if (p6) {
						dibujar(0, 5);
						A6.setIcon(new ImageIcon(imgn.getImagen()[1]));
						A6.setToolTipText(nombre);
						B6.setToolTipText(nombre);
						p6 = false;
						juega++;
						jugadaJ1++;
						winner.setSeis(A6.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					} else {
						dibujar(1, 5);
						B6.setIcon(new ImageIcon(imgn.getImagen()[1]));
						B6.setToolTipText(nombre);
						O6 = false;
						juega++;
						jugadaJ1++;
						winner.setDseis(B6.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(B6.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (O7) {
					if (p7) {
						dibujar(0, 6);
						A7.setIcon(new ImageIcon(imgn.getImagen()[1]));
						A7.setToolTipText(nombre);
						B7.setToolTipText(nombre);
						p7 = false;
						juega++;
						jugadaJ1++;
						winner.setSiete(A7.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					} else {
						dibujar(1, 6);
						B7.setIcon(new ImageIcon(imgn.getImagen()[1]));
						B7.setToolTipText(nombre);
						O7 = false;
						juega++;
						jugadaJ1++;
						winner.setDsiete(B7.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(B7.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (U1) {
					if (O1) {
						if (p1) {
							dibujar(0, 0);
							A1.setIcon(new ImageIcon(imgn.getImagen()[1]));
							A1.setToolTipText(nombre);
							C1.setToolTipText(nombre);
							p1 = false;
							juega++;
							jugadaJ1++;
							winner.setUno(A1.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						} else {
							dibujar(1, 0);
							B1.setIcon(new ImageIcon(imgn.getImagen()[1]));
							B1.setToolTipText(nombre);
							C1.setToolTipText(nombre);
							O1 = false;
							juega++;
							jugadaJ1++;
							winner.setDuno(B1.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(2, 0);
						C1.setIcon(new ImageIcon(imgn.getImagen()[1]));
						C1.setToolTipText(nombre);
						U1 = false;
						juega++;
						jugadaJ1++;
						winner.setVuno(C1.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(C1.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (U2) {
					if (O2) {
						if (p2) {
							dibujar(0, 1);
							A2.setIcon(new ImageIcon(imgn.getImagen()[1]));
							A2.setToolTipText(nombre);
							C2.setToolTipText(nombre);
							p2 = false;
							juega++;
							jugadaJ1++;
							winner.setDos(A2.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						} else {
							dibujar(1, 1);
							B2.setIcon(new ImageIcon(imgn.getImagen()[1]));
							B2.setToolTipText(nombre);
							C2.setToolTipText(nombre);
							O2 = false;
							juega++;
							jugadaJ1++;
							winner.setDdos(B2.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(2, 1);
						C2.setIcon(new ImageIcon(imgn.getImagen()[1]));
						C2.setToolTipText(nombre);
						U2 = false;
						juega++;
						jugadaJ1++;
						winner.setVdos(C2.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(C2.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (U3) {
					if (O3) {
						if (p3) {
							dibujar(0, 2);
							A3.setIcon(new ImageIcon(imgn.getImagen()[1]));
							A3.setToolTipText(nombre);
							C3.setToolTipText(nombre);
							p3 = false;
							juega++;
							jugadaJ1++;
							winner.setTres(A3.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						} else {
							dibujar(1, 2);
							B3.setIcon(new ImageIcon(imgn.getImagen()[1]));
							B3.setToolTipText(nombre);
							C3.setToolTipText(nombre);
							O3 = false;
							juega++;
							jugadaJ1++;
							winner.setDtres(B3.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(2, 2);
						C3.setIcon(new ImageIcon(imgn.getImagen()[1]));
						C3.setToolTipText(nombre);
						U3 = false;
						juega++;
						jugadaJ1++;
						winner.setVtres(C3.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(C3.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (U4) {
					if (O4) {
						if (p4) {
							dibujar(0, 3);
							A4.setIcon(new ImageIcon(imgn.getImagen()[1]));
							A4.setToolTipText(nombre);
							C4.setToolTipText(nombre);
							p4 = false;
							juega++;
							jugadaJ1++;
							winner.setCuatro(A4.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						} else {
							dibujar(1, 3);
							B4.setIcon(new ImageIcon(imgn.getImagen()[1]));
							B4.setToolTipText(nombre);
							C4.setToolTipText(nombre);
							O4 = false;
							juega++;
							jugadaJ1++;
							winner.setDcuatro(B4.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(2, 3);
						C4.setIcon(new ImageIcon(imgn.getImagen()[1]));
						C4.setToolTipText(nombre);
						U4 = false;
						juega++;
						jugadaJ1++;
						winner.setVcuatro(C4.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(C4.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (U5) {
					if (O5) {
						if (p5) {
							dibujar(0, 4);
							A5.setIcon(new ImageIcon(imgn.getImagen()[1]));
							A5.setToolTipText(nombre);
							C5.setToolTipText(nombre);
							p5 = false;
							juega++;
							jugadaJ1++;
							winner.setCinco(A5.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						} else {
							dibujar(1, 4);
							B5.setIcon(new ImageIcon(imgn.getImagen()[1]));
							B5.setToolTipText(nombre);
							C5.setToolTipText(nombre);
							O5 = false;
							juega++;
							jugadaJ1++;
							winner.setDcinco(B5.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(2, 4);
						C5.setIcon(new ImageIcon(imgn.getImagen()[1]));
						C5.setToolTipText(nombre);
						U5 = false;
						juega++;
						jugadaJ1++;
						winner.setVcinco(C5.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(C5.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (U6) {
					if (O6) {
						if (p6) {
							dibujar(0, 5);
							A6.setIcon(new ImageIcon(imgn.getImagen()[1]));
							A6.setToolTipText(nombre);
							C6.setToolTipText(nombre);
							p6 = false;
							juega++;
							jugadaJ1++;
							winner.setSeis(A6.getToolTipText());
							rdbtnJC.setVisible(true);
							rdbtnJ1.setVisible(false);
						} else {
							dibujar(1, 5);
							B6.setIcon(new ImageIcon(imgn.getImagen()[1]));
							B6.setToolTipText(nombre);
							C6.setToolTipText(nombre);
							O6 = false;
							juega++;
							jugadaJ1++;
							winner.setDseis(B6.getToolTipText());
							rdbtnJC.setVisible(true);
							rdbtnJ1.setVisible(false);
						}
					} else {
						dibujar(2, 5);
						C6.setIcon(new ImageIcon(imgn.getImagen()[1]));
						C6.setToolTipText(nombre);
						U6 = false;
						juega++;
						jugadaJ1++;
						winner.setVseis(C6.getToolTipText());
						rdbtnJC.setVisible(true);
						rdbtnJ1.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(C6.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		C7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (U7) {
					if (O7) {
						if (p7) {
							dibujar(0, 6);
							A7.setIcon(new ImageIcon(imgn.getImagen()[1]));
							A7.setToolTipText(nombre);
							C7.setToolTipText(nombre);
							p7 = false;
							juega++;
							jugadaJ1++;
							winner.setSiete(A7.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						} else {
							dibujar(1, 6);
							B7.setIcon(new ImageIcon(imgn.getImagen()[1]));
							B7.setToolTipText(nombre);
							C7.setToolTipText(nombre);
							O7 = false;
							juega++;
							jugadaJ1++;
							winner.setDsiete(B7.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(2, 6);
						C7.setIcon(new ImageIcon(imgn.getImagen()[1]));
						C7.setToolTipText(nombre);
						U7 = false;
						juega++;
						jugadaJ1++;
						winner.setVsiete(C7.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(C7.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Y1) {
					if (U1) {
						if (O1) {
							if (p1) {
								dibujar(0, 0);
								A1.setIcon(new ImageIcon(imgn.getImagen()[1]));
								A1.setToolTipText(nombre);
								D1.setToolTipText(nombre);
								p1 = false;
								juega++;
								jugadaJ1++;
								winner.setUno(A1.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							} else {
								dibujar(1, 0);
								B1.setIcon(new ImageIcon(imgn.getImagen()[1]));
								B1.setToolTipText(nombre);
								D1.setToolTipText(nombre);
								O1 = false;
								juega++;
								jugadaJ1++;
								winner.setDuno(B1.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(2, 0);
							C1.setIcon(new ImageIcon(imgn.getImagen()[1]));
							C1.setToolTipText(nombre);
							D1.setToolTipText(nombre);
							U1 = false;
							juega++;
							jugadaJ1++;
							winner.setVuno(C1.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(3, 0);
						D1.setIcon(new ImageIcon(imgn.getImagen()[1]));
						D1.setToolTipText(nombre);
						Y1 = false;
						juega++;
						jugadaJ1++;
						winner.setTuno(D1.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(D1.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		D2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Y2) {
					if (U2) {
						if (O2) {
							if (p2) {
								dibujar(0, 1);
								A2.setIcon(new ImageIcon(imgn.getImagen()[1]));
								A2.setToolTipText(nombre);
								D2.setToolTipText(nombre);
								p2 = false;
								juega++;
								jugadaJ1++;
								winner.setDos(A2.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							} else {
								dibujar(1, 1);
								B2.setIcon(new ImageIcon(imgn.getImagen()[1]));
								B2.setToolTipText(nombre);
								D2.setToolTipText(nombre);
								O2 = false;
								juega++;
								jugadaJ1++;
								winner.setDdos(B2.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(2, 1);
							C2.setIcon(new ImageIcon(imgn.getImagen()[1]));
							C2.setToolTipText(nombre);
							D2.setToolTipText(nombre);
							U2 = false;
							juega++;
							jugadaJ1++;
							winner.setVdos(C2.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(3, 1);
						D2.setIcon(new ImageIcon(imgn.getImagen()[1]));
						D2.setToolTipText(nombre);
						Y2 = false;
						juega++;
						jugadaJ1++;
						winner.setTdos(D2.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(D2.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		D3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Y3) {
					if (U3) {
						if (O3) {
							if (p3) {
								dibujar(0, 2);
								A3.setIcon(new ImageIcon(imgn.getImagen()[1]));
								A3.setToolTipText(nombre);
								D3.setToolTipText(nombre);
								p3 = false;
								juega++;
								jugadaJ1++;
								winner.setTres(A3.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							} else {
								dibujar(1, 2);
								B3.setIcon(new ImageIcon(imgn.getImagen()[1]));
								B3.setToolTipText(nombre);
								D3.setToolTipText(nombre);
								O3 = false;
								juega++;
								jugadaJ1++;
								winner.setDtres(B3.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(2, 2);
							C3.setIcon(new ImageIcon(imgn.getImagen()[1]));
							C3.setToolTipText(nombre);
							D3.setToolTipText(nombre);
							U3 = false;
							juega++;
							jugadaJ1++;
							winner.setVtres(C3.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(3, 2);
						D3.setIcon(new ImageIcon(imgn.getImagen()[1]));
						D3.setToolTipText(nombre);
						Y3 = false;
						juega++;
						jugadaJ1++;
						winner.setTtres(D3.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(D3.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		D4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Y4) {
					if (U4) {
						if (O4) {
							if (p4) {
								dibujar(0, 3);
								A4.setIcon(new ImageIcon(imgn.getImagen()[1]));
								A4.setToolTipText(nombre);
								D4.setToolTipText(nombre);
								p4 = false;
								juega++;
								jugadaJ1++;
								winner.setCuatro(A4.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							} else {
								dibujar(1, 3);
								B4.setIcon(new ImageIcon(imgn.getImagen()[1]));
								B4.setToolTipText(nombre);
								D4.setToolTipText(nombre);
								O4 = false;
								juega++;
								jugadaJ1++;
								winner.setDcuatro(B4.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(2, 3);
							C4.setIcon(new ImageIcon(imgn.getImagen()[1]));
							C4.setToolTipText(nombre);
							D4.setToolTipText(nombre);
							U4 = false;
							juega++;
							jugadaJ1++;
							winner.setVcuatro(C4.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(3, 3);
						D4.setIcon(new ImageIcon(imgn.getImagen()[1]));
						D4.setToolTipText(nombre);
						Y4 = false;
						juega++;
						jugadaJ1++;
						winner.setTcuatro(D4.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(D4.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		D5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Y5) {
					if (U5) {
						if (O5) {
							if (p5) {
								dibujar(0, 4);
								A5.setIcon(new ImageIcon(imgn.getImagen()[1]));
								A5.setToolTipText(nombre);
								D5.setToolTipText(nombre);
								p5 = false;
								juega++;
								jugadaJ1++;
								winner.setCinco(A5.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							} else {
								dibujar(1, 4);
								B5.setIcon(new ImageIcon(imgn.getImagen()[1]));
								B5.setToolTipText(nombre);
								D5.setToolTipText(nombre);
								O5 = false;
								juega++;
								jugadaJ1++;
								winner.setDcinco(B5.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(2, 4);
							C5.setIcon(new ImageIcon(imgn.getImagen()[1]));
							C5.setToolTipText(nombre);
							D5.setToolTipText(nombre);
							U5 = false;
							juega++;
							jugadaJ1++;
							winner.setVcinco(C5.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(3, 4);
						D5.setIcon(new ImageIcon(imgn.getImagen()[1]));
						D5.setToolTipText(nombre);
						Y5 = false;
						juega++;
						jugadaJ1++;
						winner.setTcinco(D5.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(D5.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		D6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Y6) {
					if (U6) {
						if (O6) {
							if (p6) {
								dibujar(0, 5);
								A6.setIcon(new ImageIcon(imgn.getImagen()[1]));
								A6.setToolTipText(nombre);
								D6.setToolTipText(nombre);
								p6 = false;
								juega++;
								jugadaJ1++;
								winner.setSeis(A6.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							} else {
								dibujar(1, 5);
								B6.setIcon(new ImageIcon(imgn.getImagen()[1]));
								B6.setToolTipText(nombre);
								D6.setToolTipText(nombre);
								O6 = false;
								juega++;
								jugadaJ1++;
								winner.setDseis(B6.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(2, 5);
							C6.setIcon(new ImageIcon(imgn.getImagen()[1]));
							C6.setToolTipText(nombre);
							D6.setToolTipText(nombre);
							U6 = false;
							juega++;
							jugadaJ1++;
							winner.setVseis(C6.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(3, 5);
						D6.setIcon(new ImageIcon(imgn.getImagen()[1]));
						D6.setToolTipText(nombre);
						Y6 = false;
						juega++;
						jugadaJ1++;
						winner.setTseis(D6.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(D6.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		D7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Y7) {
					if (U7) {
						if (O7) {
							if (p7) {
								dibujar(0, 6);
								A7.setIcon(new ImageIcon(imgn.getImagen()[1]));
								A7.setToolTipText(nombre);
								D7.setToolTipText(nombre);
								p7 = false;
								juega++;
								jugadaJ1++;
								winner.setSiete(A7.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							} else {
								dibujar(1, 6);
								B7.setIcon(new ImageIcon(imgn.getImagen()[1]));
								B7.setToolTipText(nombre);
								D7.setToolTipText(nombre);
								O7 = false;
								juega++;
								jugadaJ1++;
								winner.setDsiete(B7.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(2, 6);
							C7.setIcon(new ImageIcon(imgn.getImagen()[1]));
							C7.setToolTipText(nombre);
							D7.setToolTipText(nombre);
							U7 = false;
							juega++;
							jugadaJ1++;
							winner.setVsiete(C7.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(3, 6);
						D7.setIcon(new ImageIcon(imgn.getImagen()[1]));
						D7.setToolTipText(nombre);
						Y7 = false;
						juega++;
						jugadaJ1++;
						winner.setTsiete(D7.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(D7.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (T1) {
					if (Y1) {
						if (U1) {
							if (O1) {
								if (p1) {
									dibujar(0, 0);
									A1.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									A1.setToolTipText(nombre);
									E1.setToolTipText(nombre);
									p1 = false;
									juega++;
									jugadaJ1++;
									winner.setUno(A1.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								} else {
									dibujar(1, 0);
									B1.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									B1.setToolTipText(nombre);
									E1.setToolTipText(nombre);
									O1 = false;
									juega++;
									jugadaJ1++;
									winner.setDuno(B1.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(2, 0);
								C1.setIcon(new ImageIcon(imgn.getImagen()[1]));
								C1.setToolTipText(nombre);
								E1.setToolTipText(nombre);
								U1 = false;
								juega++;
								jugadaJ1++;
								winner.setVuno(C1.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(3, 0);
							D1.setIcon(new ImageIcon(imgn.getImagen()[1]));
							D1.setToolTipText(nombre);
							E1.setToolTipText(nombre);
							Y1 = false;
							juega++;
							jugadaJ1++;
							winner.setTuno(D1.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(4, 0);
						E1.setIcon(new ImageIcon(imgn.getImagen()[1]));
						E1.setToolTipText(nombre);
						T1 = false;
						juega++;
						jugadaJ1++;
						winner.setCuno(E1.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(E1.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});

		E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (T2) {
					if (Y2) {
						if (U2) {
							if (O2) {
								if (p2) {
									dibujar(0, 1);
									A2.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									A2.setToolTipText(nombre);
									E2.setToolTipText(nombre);
									p2 = false;
									juega++;
									jugadaJ1++;
									winner.setDos(A2.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								} else {
									dibujar(1, 1);
									B2.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									B2.setToolTipText(nombre);
									E2.setToolTipText(nombre);
									O2 = false;
									juega++;
									jugadaJ1++;
									winner.setDdos(B2.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(2, 1);
								C2.setIcon(new ImageIcon(imgn.getImagen()[1]));
								C2.setToolTipText(nombre);
								E2.setToolTipText(nombre);
								U2 = false;
								juega++;
								jugadaJ1++;
								winner.setVdos(C2.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(3, 1);
							D2.setIcon(new ImageIcon(imgn.getImagen()[1]));
							D2.setToolTipText(nombre);
							E2.setToolTipText(nombre);
							Y2 = false;
							juega++;
							jugadaJ1++;
							winner.setTdos(D2.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(4, 1);
						E2.setIcon(new ImageIcon(imgn.getImagen()[1]));
						E2.setToolTipText(nombre);
						T2 = false;
						juega++;
						jugadaJ1++;
						winner.setCdos(E2.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(E2.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (T3) {
					if (Y3) {
						if (U3) {
							if (O3) {
								if (p3) {
									dibujar(0, 2);
									A3.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									A3.setToolTipText(nombre);
									E3.setToolTipText(nombre);
									p3 = false;
									juega++;
									jugadaJ1++;
									winner.setTres(A3.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								} else {
									dibujar(1, 2);
									B3.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									B3.setToolTipText(nombre);
									E3.setToolTipText(nombre);
									O3 = false;
									juega++;
									jugadaJ1++;
									winner.setDtres(B3.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(2, 2);
								C3.setIcon(new ImageIcon(imgn.getImagen()[1]));
								C3.setToolTipText(nombre);
								E3.setToolTipText(nombre);
								U3 = false;
								juega++;
								jugadaJ1++;
								winner.setVtres(C3.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(3, 2);
							D3.setIcon(new ImageIcon(imgn.getImagen()[1]));
							D3.setToolTipText(nombre);
							E3.setToolTipText(nombre);
							Y3 = false;
							juega++;
							jugadaJ1++;
							winner.setTtres(D3.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(4, 2);
						E3.setIcon(new ImageIcon(imgn.getImagen()[1]));
						E3.setToolTipText(nombre);
						T7 = false;
						juega++;
						jugadaJ1++;
						winner.setCtres(E3.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(E3.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (T4) {
					if (Y4) {
						if (U4) {
							if (O4) {
								if (p4) {
									dibujar(0, 3);
									A4.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									A4.setToolTipText(nombre);
									E4.setToolTipText(nombre);
									p4 = false;
									juega++;
									jugadaJ1++;
									winner.setCuatro(A4.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								} else {
									dibujar(1, 3);
									B4.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									B4.setToolTipText(nombre);
									E4.setToolTipText(nombre);
									O4 = false;
									juega++;
									jugadaJ1++;
									winner.setDcuatro(B4.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(2, 3);
								C4.setIcon(new ImageIcon(imgn.getImagen()[1]));
								C4.setToolTipText(nombre);
								E4.setToolTipText(nombre);
								U4 = false;
								juega++;
								jugadaJ1++;
								winner.setVcuatro(C4.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(3, 3);
							D4.setIcon(new ImageIcon(imgn.getImagen()[1]));
							D4.setToolTipText(nombre);
							E4.setToolTipText(nombre);
							Y4 = false;
							juega++;
							jugadaJ1++;
							winner.setTcuatro(D4.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(4, 3);
						E4.setIcon(new ImageIcon(imgn.getImagen()[1]));
						E4.setToolTipText(nombre);
						T4 = false;
						juega++;
						jugadaJ1++;
						winner.setCsiete(E4.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(E4.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (T5) {
					if (Y5) {
						if (U5) {
							if (O5) {
								if (p5) {
									dibujar(0, 4);
									A5.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									A5.setToolTipText(nombre);
									E5.setToolTipText(nombre);
									p5 = false;
									juega++;
									jugadaJ1++;
									winner.setCinco(A5.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								} else {
									dibujar(1, 4);
									B5.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									B5.setToolTipText(nombre);
									E5.setToolTipText(nombre);
									O5 = false;
									juega++;
									jugadaJ1++;
									winner.setDcinco(B5.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(2, 4);
								C5.setIcon(new ImageIcon(imgn.getImagen()[1]));
								C5.setToolTipText(nombre);
								E5.setToolTipText(nombre);
								U5 = false;
								juega++;
								jugadaJ1++;
								winner.setVcinco(C5.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(3, 4);
							D5.setIcon(new ImageIcon(imgn.getImagen()[1]));
							D5.setToolTipText(nombre);
							E5.setToolTipText(nombre);
							Y5 = false;
							juega++;
							jugadaJ1++;
							winner.setTcinco(D5.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(4, 4);
						E5.setIcon(new ImageIcon(imgn.getImagen()[1]));
						E5.setToolTipText(nombre);
						T5 = false;
						juega++;
						jugadaJ1++;
						winner.setCcinco(E5.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(E5.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (T6) {
					if (Y6) {
						if (U6) {
							if (O6) {
								if (p6) {
									dibujar(0, 5);
									A6.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									A6.setToolTipText(nombre);
									E6.setToolTipText(nombre);
									p6 = false;
									juega++;
									jugadaJ1++;
									winner.setSeis(A6.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								} else {
									dibujar(1, 5);
									B6.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									B6.setToolTipText(nombre);
									E6.setToolTipText(nombre);
									O6 = false;
									juega++;
									jugadaJ1++;
									winner.setDseis(B6.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(2, 5);
								C6.setIcon(new ImageIcon(imgn.getImagen()[1]));
								C6.setToolTipText(nombre);
								E6.setToolTipText(nombre);
								U6 = false;
								juega++;
								jugadaJ1++;
								winner.setVseis(C6.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(3, 5);
							D6.setIcon(new ImageIcon(imgn.getImagen()[1]));
							D6.setToolTipText(nombre);
							E6.setToolTipText(nombre);
							Y6 = false;
							juega++;
							jugadaJ1++;
							winner.setTseis(D6.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(4, 5);
						E6.setIcon(new ImageIcon(imgn.getImagen()[1]));
						E6.setToolTipText(nombre);
						T6 = false;
						juega++;
						jugadaJ1++;
						winner.setCseis(E6.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(E6.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		E7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (T7) {
					if (Y7) {
						if (U7) {
							if (O7) {
								if (p7) {
									dibujar(0, 6);
									A7.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									A7.setToolTipText(nombre);
									E7.setToolTipText(nombre);
									p7 = false;
									juega++;
									jugadaJ1++;
									winner.setSiete(A7.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								} else {
									dibujar(1, 6);
									B7.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									B7.setToolTipText(nombre);
									E7.setToolTipText(nombre);
									O7 = false;
									juega++;
									jugadaJ1++;
									winner.setDsiete(B7.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(2, 6);
								C7.setIcon(new ImageIcon(imgn.getImagen()[1]));
								C7.setToolTipText(nombre);
								E7.setToolTipText(nombre);
								U7 = false;
								juega++;
								jugadaJ1++;
								winner.setVsiete(C7.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(3, 6);
							D7.setIcon(new ImageIcon(imgn.getImagen()[1]));
							D7.setToolTipText(nombre);
							E7.setToolTipText(nombre);
							Y7 = false;
							juega++;
							jugadaJ1++;
							winner.setTsiete(D7.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(4, 6);
						E7.setIcon(new ImageIcon(imgn.getImagen()[1]));
						E7.setToolTipText(nombre);
						T7 = false;
						juega++;
						jugadaJ1++;
						winner.setCsiete(E7.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(E7.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (R1) {
					if (T1) {
						if (Y1) {
							if (U1) {
								if (O1) {
									if (p1) {
										dibujar(0, 0);
										A1.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										A1.setToolTipText(nombre);
										F1.setToolTipText(nombre);
										p1 = false;
										juega++;
										jugadaJ1++;
										winner.setUno(A1.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									} else {
										dibujar(1, 0);
										B1.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										B1.setToolTipText(nombre);
										F1.setToolTipText(nombre);
										O1 = false;
										juega++;
										jugadaJ1++;
										winner.setDuno(B1.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									}
								} else {
									dibujar(2, 0);
									C1.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									C1.setToolTipText(nombre);
									F1.setToolTipText(nombre);
									U1 = false;
									juega++;
									jugadaJ1++;
									winner.setVuno(C1.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(3, 0);
								D1.setIcon(new ImageIcon(imgn.getImagen()[1]));
								D1.setToolTipText(nombre);
								F1.setToolTipText(nombre);
								Y1 = false;
								juega++;
								jugadaJ1++;
								winner.setTuno(D1.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(4, 0);
							E1.setIcon(new ImageIcon(imgn.getImagen()[1]));
							E1.setToolTipText(nombre);
							F1.setToolTipText(nombre);
							T1 = false;
							juega++;
							jugadaJ1++;
							winner.setCuno(E1.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(5, 0);
						F1.setIcon(new ImageIcon(imgn.getImagen()[1]));
						F1.setToolTipText(nombre);
						R1 = false;
						juega++;
						jugadaJ1++;
						winner.setSuno(F1.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(F1.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});

		F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (R2) {
					if (T2) {
						if (Y2) {
							if (U2) {
								if (O2) {
									if (p2) {
										dibujar(0, 1);
										A2.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										A2.setToolTipText(nombre);
										F2.setToolTipText(nombre);
										p2 = false;
										juega++;
										jugadaJ1++;
										winner.setDos(A2.getToolTipText());
										rdbtnJC.setVisible(true);
										rdbtnJ1.setVisible(false);
									} else {
										dibujar(1, 1);
										B2.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										B2.setToolTipText(nombre);
										F2.setToolTipText(nombre);
										O2 = false;
										juega++;
										jugadaJ1++;
										winner.setDdos(B2.getToolTipText());
										rdbtnJC.setVisible(true);
										rdbtnJ1.setVisible(false);
									}
								} else {
									dibujar(2, 1);
									C2.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									C2.setToolTipText(nombre);
									F2.setToolTipText(nombre);
									U2 = false;
									juega++;
									jugadaJ1++;
									winner.setVdos(C2.getToolTipText());
									rdbtnJC.setVisible(true);
									rdbtnJ1.setVisible(false);
								}
							} else {
								dibujar(3, 1);
								D2.setIcon(new ImageIcon(imgn.getImagen()[1]));
								D2.setToolTipText(nombre);
								F2.setToolTipText(nombre);
								Y2 = false;
								juega++;
								jugadaJ1++;
								winner.setTdos(D2.getToolTipText());
								rdbtnJC.setVisible(true);
								rdbtnJ1.setVisible(false);
							}
						} else {
							dibujar(4, 1);
							E2.setIcon(new ImageIcon(imgn.getImagen()[1]));
							E2.setToolTipText(nombre);
							F2.setToolTipText(nombre);
							T2 = false;
							juega++;
							jugadaJ1++;
							winner.setCdos(E2.getToolTipText());
							rdbtnJC.setVisible(true);
							rdbtnJ1.setVisible(false);
						}
					} else {
						dibujar(5, 1);
						F2.setIcon(new ImageIcon(imgn.getImagen()[1]));
						F2.setToolTipText(nombre);
						R2 = false;
						juega++;
						jugadaJ1++;
						winner.setSdos(F2.getToolTipText());
						rdbtnJC.setVisible(true);
						rdbtnJ1.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(F2.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (R3) {
					if (T3) {
						if (Y3) {
							if (U3) {
								if (O3) {
									if (p3) {
										dibujar(0, 2);
										A3.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										A3.setToolTipText(nombre);
										F3.setToolTipText(nombre);
										p3 = false;
										juega++;
										jugadaJ1++;
										winner.setTres(A3.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									} else {
										dibujar(1, 2);
										B3.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										B3.setToolTipText(nombre);
										F3.setToolTipText(nombre);
										O3 = false;
										juega++;
										jugadaJ1++;
										winner.setDtres(B3.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									}
								} else {
									dibujar(2, 2);
									C3.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									C3.setToolTipText(nombre);
									F3.setToolTipText(nombre);
									U3 = false;
									juega++;
									jugadaJ1++;
									winner.setVtres(C3.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(3, 2);
								D3.setIcon(new ImageIcon(imgn.getImagen()[1]));
								D3.setToolTipText(nombre);
								F3.setToolTipText(nombre);
								Y3 = false;
								juega++;
								jugadaJ1++;
								winner.setTtres(D3.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(4, 2);
							E3.setIcon(new ImageIcon(imgn.getImagen()[1]));
							E3.setToolTipText(nombre);
							F3.setToolTipText(nombre);
							T3 = false;
							juega++;
							jugadaJ1++;
							winner.setCtres(E3.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(5, 2);
						F3.setIcon(new ImageIcon(imgn.getImagen()[1]));
						F3.setToolTipText(nombre);
						R3 = false;
						juega++;
						jugadaJ1++;
						winner.setStres(F3.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(F3.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (R4) {
					if (T4) {
						if (Y4) {
							if (U4) {
								if (O4) {
									if (p4) {
										dibujar(0, 3);
										A4.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										A4.setToolTipText(nombre);
										F4.setToolTipText(nombre);
										p4 = false;
										juega++;
										jugadaJ1++;
										winner.setCuatro(A4.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									} else {
										dibujar(1, 3);
										B4.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										B4.setToolTipText(nombre);
										F4.setToolTipText(nombre);
										O4 = false;
										juega++;
										jugadaJ1++;
										winner.setDcuatro(B4.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									}
								} else {
									dibujar(2, 3);
									C4.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									C4.setToolTipText(nombre);
									F4.setToolTipText(nombre);
									U4 = false;
									juega++;
									jugadaJ1++;
									winner.setVcuatro(C4.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(3, 3);
								D4.setIcon(new ImageIcon(imgn.getImagen()[1]));
								D4.setToolTipText(nombre);
								F4.setToolTipText(nombre);
								Y4 = false;
								juega++;
								jugadaJ1++;
								winner.setTcuatro(D4.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(4, 3);
							E4.setIcon(new ImageIcon(imgn.getImagen()[1]));
							E4.setToolTipText(nombre);
							F4.setToolTipText(nombre);
							T4 = false;
							juega++;
							jugadaJ1++;
							winner.setCcuatro(E4.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(5, 3);
						F4.setIcon(new ImageIcon(imgn.getImagen()[1]));
						F4.setToolTipText(nombre);
						R4 = false;
						juega++;
						jugadaJ1++;
						winner.setScuatro(F4.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(F4.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (R5) {
					if (T5) {
						if (Y5) {
							if (U5) {
								if (O5) {
									if (p5) {
										dibujar(0, 4);
										A5.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										A5.setToolTipText(nombre);
										F5.setToolTipText(nombre);
										p5 = false;
										juega++;
										jugadaJ1++;
										winner.setCinco(A5.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									} else {
										dibujar(1, 4);
										B5.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										B5.setToolTipText(nombre);
										F5.setToolTipText(nombre);
										O5 = false;
										juega++;
										jugadaJ1++;
										winner.setDcinco(B5.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									}
								} else {
									dibujar(2, 4);
									C5.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									C5.setToolTipText(nombre);
									F5.setToolTipText(nombre);
									U5 = false;
									juega++;
									jugadaJ1++;
									winner.setVcinco(C5.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(3, 4);
								D5.setIcon(new ImageIcon(imgn.getImagen()[1]));
								D5.setToolTipText(nombre);
								F5.setToolTipText(nombre);
								Y5 = false;
								juega++;
								jugadaJ1++;
								winner.setTcinco(D5.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(4, 4);
							E5.setIcon(new ImageIcon(imgn.getImagen()[1]));
							E5.setToolTipText(nombre);
							F5.setToolTipText(nombre);
							T5 = false;
							juega++;
							jugadaJ1++;
							winner.setCcinco(E5.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(5, 4);
						F5.setIcon(new ImageIcon(imgn.getImagen()[1]));
						F5.setToolTipText(nombre);
						R5 = false;
						juega++;
						jugadaJ1++;
						winner.setScinco(F5.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(F5.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		F6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (R6) {
					if (T6) {
						if (Y6) {
							if (U6) {
								if (O6) {
									if (p6) {
										dibujar(0, 5);
										A6.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										A6.setToolTipText(nombre);
										F6.setToolTipText(nombre);
										p6 = false;
										juega++;
										jugadaJ1++;
										winner.setSeis(A6.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									} else {
										dibujar(1, 5);
										B6.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										B6.setToolTipText(nombre);
										F6.setToolTipText(nombre);
										O6 = false;
										juega++;
										jugadaJ1++;
										winner.setDseis(B6.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									}
								} else {
									dibujar(2, 5);
									C6.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									C6.setToolTipText(nombre);
									F6.setToolTipText(nombre);
									U6 = false;
									juega++;
									jugadaJ1++;
									winner.setVseis(C6.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(3, 5);
								D6.setIcon(new ImageIcon(imgn.getImagen()[1]));
								D6.setToolTipText(nombre);
								F6.setToolTipText(nombre);
								Y6 = false;
								juega++;
								jugadaJ1++;
								winner.setTseis(D6.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(4, 5);
							E6.setIcon(new ImageIcon(imgn.getImagen()[1]));
							E6.setToolTipText(nombre);
							F6.setToolTipText(nombre);
							T6 = false;
							juega++;
							jugadaJ1++;
							winner.setCseis(E6.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(5, 5);
						F6.setIcon(new ImageIcon(imgn.getImagen()[1]));
						F6.setToolTipText(nombre);
						R6 = false;
						juega++;
						jugadaJ1++;
						winner.setSseis(F6.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(F6.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
		F7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (R7) {
					if (T7) {
						if (Y7) {
							if (U7) {
								if (O7) {
									if (p7) {
										dibujar(0, 6);
										A7.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										A7.setToolTipText(nombre);
										F7.setToolTipText(nombre);
										p7 = false;
										juega++;
										jugadaJ1++;
										winner.setSiete(A7.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									} else {
										dibujar(1, 6);
										B7.setIcon(new ImageIcon(imgn
												.getImagen()[1]));
										B7.setToolTipText(nombre);
										F7.setToolTipText(nombre);
										O7 = false;
										juega++;
										jugadaJ1++;
										winner.setDsiete(B7.getToolTipText());
										rdbtnJ1.setVisible(true);
										rdbtnJC.setVisible(false);
									}
								} else {
									dibujar(2, 6);
									C7.setIcon(new ImageIcon(
											imgn.getImagen()[1]));
									C7.setToolTipText(nombre);
									F7.setToolTipText(nombre);
									U7 = false;
									juega++;
									jugadaJ1++;
									winner.setVsiete(C7.getToolTipText());
									rdbtnJ1.setVisible(true);
									rdbtnJC.setVisible(false);
								}
							} else {
								dibujar(3, 6);
								D7.setIcon(new ImageIcon(imgn.getImagen()[1]));
								D7.setToolTipText(nombre);
								F7.setToolTipText(nombre);
								Y7 = false;
								juega++;
								jugadaJ1++;
								winner.setTsiete(D7.getToolTipText());
								rdbtnJ1.setVisible(true);
								rdbtnJC.setVisible(false);
							}
						} else {
							dibujar(4, 6);
							E7.setIcon(new ImageIcon(imgn.getImagen()[1]));
							E7.setToolTipText(nombre);
							F7.setToolTipText(nombre);
							T7 = false;
							juega++;
							jugadaJ1++;
							winner.setCsiete(E7.getToolTipText());
							rdbtnJ1.setVisible(true);
							rdbtnJC.setVisible(false);
						}
					} else {
						dibujar(5, 6);
						F7.setIcon(new ImageIcon(imgn.getImagen()[1]));
						F7.setToolTipText(nombre);
						R7 = false;
						juega++;
						jugadaJ1++;
						winner.setSsiete(F7.getToolTipText());
						rdbtnJ1.setVisible(true);
						rdbtnJC.setVisible(false);
					}
				}
				if (winner.Ganador()) {
					terminar.Botones1();
					Resultados vr = new Resultados();
					vr.setNombreJ(F7.getToolTipText());
					vr.setScore(jugadaJ1);
					vr.setAlwaysOnTop(true);
					vr.setVisible(true);
					setVisible(false);
				}
			}
		});
	}
	//METODOS SETTERS AND GETTERS
	public boolean isP1() {
		return p1;
	}

	public void setP1(boolean p1) {
		this.p1 = p1;
	}

	public boolean isP2() {
		return p2;
	}

	public void setP2(boolean p2) {
		this.p2 = p2;
	}

	public boolean isP3() {
		return p3;
	}

	public void setP3(boolean p3) {
		this.p3 = p3;
	}

	public boolean isP4() {
		return p4;
	}

	public void setP4(boolean p4) {
		this.p4 = p4;
	}

	public boolean isP5() {
		return p5;
	}

	public void setP5(boolean p5) {
		this.p5 = p5;
	}

	public boolean isP6() {
		return p6;
	}

	public void setP6(boolean p6) {
		this.p6 = p6;
	}

	public boolean isP7() {
		return p7;
	}

	public void setP7(boolean p7) {
		this.p7 = p7;
	}

	public boolean isO1() {
		return O1;
	}

	public void setO1(boolean o1) {
		O1 = o1;
	}

	public boolean isO2() {
		return O2;
	}

	public void setO2(boolean o2) {
		O2 = o2;
	}

	public boolean isO3() {
		return O3;
	}

	public void setO3(boolean o3) {
		O3 = o3;
	}

	public boolean isO4() {
		return O4;
	}

	public void setO4(boolean o4) {
		O4 = o4;
	}

	public boolean isO5() {
		return O5;
	}

	public void setO5(boolean o5) {
		O5 = o5;
	}

	public boolean isO6() {
		return O6;
	}

	public void setO6(boolean o6) {
		O6 = o6;
	}

	public boolean isO7() {
		return O7;
	}

	public void setO7(boolean o7) {
		O7 = o7;
	}

	public boolean isU1() {
		return U1;
	}

	public void setU1(boolean u1) {
		U1 = u1;
	}

	public boolean isU2() {
		return U2;
	}

	public void setU2(boolean u2) {
		U2 = u2;
	}

	public boolean isU3() {
		return U3;
	}

	public void setU3(boolean u3) {
		U3 = u3;
	}

	public boolean isU4() {
		return U4;
	}

	public void setU4(boolean u4) {
		U4 = u4;
	}

	public boolean isU5() {
		return U5;
	}

	public void setU5(boolean u5) {
		U5 = u5;
	}

	public boolean isU6() {
		return U6;
	}

	public void setU6(boolean u6) {
		U6 = u6;
	}

	public boolean isU7() {
		return U7;
	}

	public void setU7(boolean u7) {
		U7 = u7;
	}

	public boolean isY1() {
		return Y1;
	}

	public void setY1(boolean y1) {
		Y1 = y1;
	}

	public boolean isY2() {
		return Y2;
	}

	public void setY2(boolean y2) {
		Y2 = y2;
	}

	public boolean isY3() {
		return Y3;
	}

	public void setY3(boolean y3) {
		Y3 = y3;
	}

	public boolean isY4() {
		return Y4;
	}

	public void setY4(boolean y4) {
		Y4 = y4;
	}

	public boolean isY5() {
		return Y5;
	}

	public void setY5(boolean y5) {
		Y5 = y5;
	}

	public boolean isY6() {
		return Y6;
	}

	public void setY6(boolean y6) {
		Y6 = y6;
	}

	public boolean isY7() {
		return Y7;
	}

	public void setY7(boolean y7) {
		Y7 = y7;
	}

	public boolean isT1() {
		return T1;
	}

	public void setT1(boolean t1) {
		T1 = t1;
	}

	public boolean isT2() {
		return T2;
	}

	public void setT2(boolean t2) {
		T2 = t2;
	}

	public boolean isT3() {
		return T3;
	}

	public void setT3(boolean t3) {
		T3 = t3;
	}

	public boolean isT4() {
		return T4;
	}

	public void setT4(boolean t4) {
		T4 = t4;
	}

	public boolean isT5() {
		return T5;
	}

	public void setT5(boolean t5) {
		T5 = t5;
	}

	public boolean isT6() {
		return T6;
	}

	public void setT6(boolean t6) {
		T6 = t6;
	}

	public boolean isT7() {
		return T7;
	}

	public void setT7(boolean t7) {
		T7 = t7;
	}

	public boolean isR1() {
		return R1;
	}

	public void setR1(boolean r1) {
		R1 = r1;
	}

	public boolean isR2() {
		return R2;
	}

	public void setR2(boolean r2) {
		R2 = r2;
	}

	public boolean isR3() {
		return R3;
	}

	public void setR3(boolean r3) {
		R3 = r3;
	}

	public boolean isR4() {
		return R4;
	}

	public void setR4(boolean r4) {
		R4 = r4;
	}

	public boolean isR5() {
		return R5;
	}

	public void setR5(boolean r5) {
		R5 = r5;
	}

	public boolean isR6() {
		return R6;
	}

	public void setR6(boolean r6) {
		R6 = r6;
	}

	public boolean isR7() {
		return R7;
	}

	public void setR7(boolean r7) {
		R7 = r7;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public JButton getA1() {
		return A1;
	}

	public void setA1(JButton a1) {
		A1 = a1;
	}

	public JButton getA2() {
		return A2;
	}

	public void setA2(JButton a2) {
		A2 = a2;
	}

	public JButton getA3() {
		return A3;
	}

	public void setA3(JButton a3) {
		A3 = a3;
	}

	public JButton getA4() {
		return A4;
	}

	public void setA4(JButton a4) {
		A4 = a4;
	}

	public JButton getA5() {
		return A5;
	}

	public void setA5(JButton a5) {
		A5 = a5;
	}

	public JButton getA6() {
		return A6;
	}

	public void setA6(JButton a6) {
		A6 = a6;
	}

	public JButton getA7() {
		return A7;
	}

	public void setA7(JButton a7) {
		A7 = a7;
	}

	public JButton getB1() {
		return B1;
	}

	public void setB1(JButton b1) {
		B1 = b1;
	}

	public JButton getB2() {
		return B2;
	}

	public void setB2(JButton b2) {
		B2 = b2;
	}

	public JButton getB3() {
		return B3;
	}

	public void setB3(JButton b3) {
		B3 = b3;
	}

	public JButton getB4() {
		return B4;
	}

	public void setB4(JButton b4) {
		B4 = b4;
	}

	public JButton getB5() {
		return B5;
	}

	public void setB5(JButton b5) {
		B5 = b5;
	}

	public JButton getB6() {
		return B6;
	}

	public void setB6(JButton b6) {
		B6 = b6;
	}

	public JButton getB7() {
		return B7;
	}

	public void setB7(JButton b7) {
		B7 = b7;
	}

	public JButton getC1() {
		return C1;
	}

	public void setC1(JButton c1) {
		C1 = c1;
	}

	public JButton getC2() {
		return C2;
	}

	public void setC2(JButton c2) {
		C2 = c2;
	}

	public JButton getC3() {
		return C3;
	}

	public void setC3(JButton c3) {
		C3 = c3;
	}

	public JButton getC4() {
		return C4;
	}

	public void setC4(JButton c4) {
		C4 = c4;
	}

	public JButton getC5() {
		return C5;
	}

	public void setC5(JButton c5) {
		C5 = c5;
	}

	public JButton getC6() {
		return C6;
	}

	public void setC6(JButton c6) {
		C6 = c6;
	}

	public JButton getC7() {
		return C7;
	}

	public void setC7(JButton c7) {
		C7 = c7;
	}

	public JButton getD1() {
		return D1;
	}

	public void setD1(JButton d1) {
		D1 = d1;
	}

	public JButton getD2() {
		return D2;
	}

	public void setD2(JButton d2) {
		D2 = d2;
	}

	public JButton getD3() {
		return D3;
	}

	public void setD3(JButton d3) {
		D3 = d3;
	}

	public JButton getD4() {
		return D4;
	}

	public void setD4(JButton d4) {
		D4 = d4;
	}

	public JButton getD5() {
		return D5;
	}

	public void setD5(JButton d5) {
		D5 = d5;
	}

	public JButton getD6() {
		return D6;
	}

	public void setD6(JButton d6) {
		D6 = d6;
	}

	public JButton getD7() {
		return D7;
	}

	public void setD7(JButton d7) {
		D7 = d7;
	}

	public JButton getE1() {
		return E1;
	}

	public void setE1(JButton e1) {
		E1 = e1;
	}

	public JButton getE2() {
		return E2;
	}

	public void setE2(JButton e2) {
		E2 = e2;
	}

	public JButton getE3() {
		return E3;
	}

	public void setE3(JButton e3) {
		E3 = e3;
	}

	public JButton getE4() {
		return E4;
	}

	public void setE4(JButton e4) {
		E4 = e4;
	}

	public JButton getE5() {
		return E5;
	}

	public void setE5(JButton e5) {
		E5 = e5;
	}

	public JButton getE6() {
		return E6;
	}

	public void setE6(JButton e6) {
		E6 = e6;
	}

	public JButton getE7() {
		return E7;
	}

	public void setE7(JButton e7) {
		E7 = e7;
	}

	public JButton getF1() {
		return F1;
	}

	public void setF1(JButton f1) {
		F1 = f1;
	}

	public JButton getF2() {
		return F2;
	}

	public void setF2(JButton f2) {
		F2 = f2;
	}

	public JButton getF3() {
		return F3;
	}

	public void setF3(JButton f3) {
		F3 = f3;
	}

	public JButton getF4() {
		return F4;
	}

	public void setF4(JButton f4) {
		F4 = f4;
	}

	public JButton getF5() {
		return F5;
	}

	public void setF5(JButton f5) {
		F5 = f5;
	}

	public JButton getF6() {
		return F6;
	}

	public void setF6(JButton f6) {
		F6 = f6;
	}

	public JButton getF7() {
		return F7;
	}

	public void setF7(JButton f7) {
		F7 = f7;
	}

}