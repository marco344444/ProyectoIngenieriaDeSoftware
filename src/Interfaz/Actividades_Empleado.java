package Interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actividades_Empleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividades_Empleado frame = new Actividades_Empleado();
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
	public Actividades_Empleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton Atrás = new JButton("");
		Atrás.setBorder(null);
		
	
		
		Atrás.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Inicio_Inventario newframe = new Inicio_Inventario();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		

		JButton Administrar_Inventario = new JButton("");
		Administrar_Inventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Adm_Inventario newframe = new Adm_Inventario();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Administrar_Inventario.setBorder(null);
		Administrar_Inventario.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Administrar_Inventario.jpg")));
		Administrar_Inventario.setBounds(226, 219, 378, 63);
		contentPane.add(Administrar_Inventario);
		
		JButton Reporte = new JButton("");
		Reporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Interfaz.Reporte newframe = new Reporte();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Reporte.setBorder(null);
		Reporte.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Reporte.jpg")));
		Reporte.setBounds(222, 457, 393, 65);
		contentPane.add(Reporte);
		
		JButton Actualizar_Inventario = new JButton("");
		Actualizar_Inventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Interfaz.Act_Inventario newframe = new Act_Inventario();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Actualizar_Inventario.setBorder(null);
		Actualizar_Inventario.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Actualizar_Inventario.jpg")));
		Actualizar_Inventario.setBounds(233, 337, 382, 62);
		contentPane.add(Actualizar_Inventario);
		
		JButton Registro_De_Compras = new JButton("");
		Registro_De_Compras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Interfaz.Registro_De_Compras newframe = new Registro_De_Compras();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Registro_De_Compras.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Registro_De_Compras.jpg")));
		Registro_De_Compras.setBorder(null);
		Registro_De_Compras.setBounds(222, 579, 393, 64);
		contentPane.add(Registro_De_Compras);
		
		
		JLabel Actvidades_Empleado_I = new JLabel("");
		Actvidades_Empleado_I.setBounds(0, 0, 1300, 731);
		Actvidades_Empleado_I.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Imagenes/Actividades_Inventario.jpg")));
		contentPane.add(Actvidades_Empleado_I);
		
		
		
		
		
		
		
	}

}
