package Interfaz;

import Interfaz.Actividades_Empleado_venta;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Devoluciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Devoluciones frame = new Devoluciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Devoluciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 10, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Devoluciones = new JLabel("");
		JButton Atrás = new JButton("");
		Atrás.setBorder(null);
		Atrás.setIcon(new ImageIcon(Devoluciones.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Actividades_Empleado_venta newframe = new Actividades_Empleado_venta();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		;

		JButton Buscar = new JButton("");
		Buscar.setBorder(null);
		Buscar.setIcon(new ImageIcon(Devoluciones.class.getResource("/paquetito/Botones/Buscar.jpg")));
		Buscar.setBounds(1140, 204, 101, 44);
		contentPane.add(Buscar);
		
		JButton Actualizar = new JButton("");
		Actualizar.setIcon(new ImageIcon(Devoluciones.class.getResource("/paquetito/Botones/Actualizar.jpg")));
		Actualizar.setBorder(null);
		Actualizar.setBounds(958, 588, 180, 45);
		contentPane.add(Actualizar);
		
		Devoluciones.setIcon(new ImageIcon(Devoluciones.class.getResource("/paquetito/Imagenes/Devoluciones.jpg")));
		Devoluciones.setBounds(0, 0,1300, 731);
		contentPane.add(Devoluciones);
		
		
		
		
	}

}
