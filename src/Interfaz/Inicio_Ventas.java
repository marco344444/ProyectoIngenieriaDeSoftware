package Interfaz;

import Interfaz.Actividades_Empleado_venta;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio_Ventas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ID;
	private JPasswordField Contraseña;
	private JButton Admin;
	private JButton Empleado_I;
	private JButton Ingresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio_Ventas frame = new Inicio_Ventas();
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
	public Inicio_Ventas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ID = new JTextField();
		ID.setBounds(929, 294, 231, 20);
		contentPane.add(ID);
		ID.setColumns(10);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(929, 390, 231, 20);
		contentPane.add(Contraseña);
		
		Admin = new JButton("");
		Admin.setBorder(null);
		Admin.setIcon(new ImageIcon(Inicio_Inventario.class.getResource("/paquetito/Botones/Admin.jpg")));
		Admin.setBounds(738, 52, 165, 52);
		contentPane.add(Admin);
		
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				inicio newframe = new inicio();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		Empleado_I = new JButton("New button");
		Empleado_I.setBorder(null);
		Empleado_I.setIcon(new ImageIcon(Inicio_Ventas.class.getResource("/paquetito/Botones/Empleado_I.jpg")));
		Empleado_I.setBounds(912, 52, 143, 53);
		contentPane.add(Empleado_I);
		
		Empleado_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Inicio_Inventario newframe = new Inicio_Inventario();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		Ingresar = new JButton("New button");
		Ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Actividades_Empleado_venta newframe = new Actividades_Empleado_venta();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Ingresar.setBorder(null);
		Ingresar.setIcon(new ImageIcon(Inicio_Inventario.class.getResource("/paquetito/Botones/Ingresar.jpg")));
		Ingresar.setBounds(897, 465,213 , 64);
		contentPane.add(Ingresar);
		
		JLabel Inicio_Empleado_Ventas = new JLabel("");
		Inicio_Empleado_Ventas.setIcon(new ImageIcon(Inicio_Ventas.class.getResource("/paquetito/Imagenes/Inicio_Empleado_V.jpg")));
		Inicio_Empleado_Ventas.setBounds(0, 0, 1300, 731);
		contentPane.add(Inicio_Empleado_Ventas);
		
		
		
		
		
		
		
	}
}
