package Interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actvidades_Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton Empleados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actvidades_Admin frame = new Actvidades_Admin();
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
	public Actvidades_Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton Atrás = new JButton("");
		Atrás.setBorder(null);
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				inicio newframe = new inicio();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Atrás.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		
		Empleados = new JButton("");
		Empleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Interfaz.Empleados newframe = new Empleados();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Empleados.setBorder(null);
		Empleados.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Empleados.jpg")));
		Empleados.setBounds(214, 221, 399, 65);
		contentPane.add(Empleados);
		
		JButton Mirar_Inventario = new JButton("");
		Mirar_Inventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Interfaz.Mirar_Inventario newframe = new Mirar_Inventario();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Mirar_Inventario.setBorder(null);
		Mirar_Inventario.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Mirar_Inventario.jpg")));
		Mirar_Inventario.setBounds(214, 346, 399, 57);
		contentPane.add(Mirar_Inventario);
		
		JButton Proveedores = new JButton("");
		Proveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Interfaz.Proveedores newframe = new Proveedores();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Proveedores.setBorder(null);
		Proveedores.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Proveedores.jpg")));
		Proveedores.setBounds(214, 463, 404, 57);
		contentPane.add(Proveedores);
		
		JButton Generar_Reporte = new JButton("");
		Generar_Reporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Interfaz.Generar_Reporte newframe = new Generar_Reporte();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Generar_Reporte.setBorder(null);
		Generar_Reporte.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Generar_Reporte.jpg")));
		Generar_Reporte.setBounds(227, 590, 386, 55);
		contentPane.add(Generar_Reporte);
		
		JLabel Actividades_Admin = new JLabel("");
		Actividades_Admin.setBounds(0, 0, 1300, 731);
		Actividades_Admin.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Imagenes/Actividades_Admin.jpg")));
		contentPane.add(Actividades_Admin);
		
		
		
		
		
		
		
		
		
	}

}
