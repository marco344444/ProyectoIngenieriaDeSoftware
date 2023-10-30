package Interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Empleados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Buscar;
	private JTextField Nombre;
	private JTextField Cedula;
	private JTextField Edad;
	private JTextField Genero;
	private JTextField Puesto_De_Trabajo;
	private JButton BotonBuscar;
	private JButton Eliminar_Usuario;
	private JButton Añadir_Usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empleados frame = new Empleados();
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
	public Empleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Atrás = new JButton("");
		Atrás.setBorder(null);
		Atrás.setIcon(new ImageIcon(Empleados.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Actvidades_Admin newframe = new Actvidades_Admin();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		
		Buscar = new JTextField();
		Buscar.setBorder(null);
		Buscar.setBounds(56, 176, 1039, 39);
		contentPane.add(Buscar);
		Buscar.setColumns(10);
		
		Nombre = new JTextField();
		Nombre.setBounds(56, 343, 229, 39);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		Cedula = new JTextField();
		Cedula.setBounds(295, 343, 146, 39);
		contentPane.add(Cedula);
		Cedula.setColumns(10);
		
		Edad = new JTextField();
		Edad.setBounds(451, 343, 190, 39);
		contentPane.add(Edad);
		Edad.setColumns(10);
		
		Genero = new JTextField();
		Genero.setBounds(652, 343, 236, 39);
		contentPane.add(Genero);
		Genero.setColumns(10);
		
		Puesto_De_Trabajo = new JTextField();
		Puesto_De_Trabajo.setColumns(10);
		Puesto_De_Trabajo.setBounds(947, 343, 297, 39);
		contentPane.add(Puesto_De_Trabajo);
		
		BotonBuscar = new JButton("");
		BotonBuscar.setBorder(null);
		BotonBuscar.setIcon(new ImageIcon(Empleados.class.getResource("/paquetito/Botones/Buscar.jpg")));
		BotonBuscar.setBounds(1132, 162, 101, 44);
		contentPane.add(BotonBuscar);
		

		Eliminar_Usuario = new JButton("");
		Eliminar_Usuario.setBorder(null);
		Eliminar_Usuario.setIcon(new ImageIcon(Empleados.class.getResource("/paquetito/Botones/Eliminar_Usuario.jpg")));
		Eliminar_Usuario.setBounds(843, 583, 407, 38);
		contentPane.add(Eliminar_Usuario);
		

		Añadir_Usuario = new JButton("");
		Añadir_Usuario.setBorder(null);
		Añadir_Usuario.setIcon(new ImageIcon(Empleados.class.getResource("/paquetito/Botones/Añadir_Usuario.jpg")));
		Añadir_Usuario.setBounds(389, 580, 404, 41);
		contentPane.add(Añadir_Usuario);
		
		JLabel Empleados = new JLabel("");
		Empleados.setIcon(new ImageIcon(Empleados.class.getResource("/paquetito/Imagenes/Empleados.jpg")));
		Empleados.setBounds(0, 0, 1300, 731);
		contentPane.add(Empleados);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
