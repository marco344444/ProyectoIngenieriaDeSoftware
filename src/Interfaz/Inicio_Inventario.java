package Interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Inicio_Inventario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField Contraseña;
	private JTextField ID;
	private JButton Admin;
	private JButton Empleado_V;
	private JButton Ingresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio_Inventario frame = new Inicio_Inventario();
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
	public Inicio_Inventario() {
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
		Admin.setIcon(new ImageIcon(Inicio_Inventario.class.getResource("/paquetito/Botones/Admin.jpg")));
		Admin.setBounds(738, 52, 165, 52);
		contentPane.add(Admin);
		
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inicio newframe = new inicio();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		Empleado_V = new JButton("");
		Empleado_V.setIcon(new ImageIcon(Inicio_Inventario.class.getResource("/paquetito/Botones/Empleado_V.jpg")));
		Empleado_V.setBounds(1085, 52, 157, 51);
		contentPane.add(Empleado_V);
		
		Empleado_V.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Inicio_Ventas newframe = new Inicio_Ventas();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		Ingresar = new JButton("New button");
		Ingresar.setBorder(null);
		Ingresar.setIcon(new ImageIcon(Inicio_Inventario.class.getResource("/paquetito/Botones/Ingresar.jpg")));
		Ingresar.setBounds(894, 468,213 , 64);
		contentPane.add(Ingresar);
		
		JLabel Inicio_Empleado_Inventario = new JLabel("");
		Inicio_Empleado_Inventario.setIcon(new ImageIcon(Inicio_Inventario.class.getResource("/paquetito/Imagenes/Inicio_Empleado_I.jpg")));
		Inicio_Empleado_Inventario.setBounds(0, 0, 1300, 731);
		contentPane.add(Inicio_Empleado_Inventario);

		Ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// Validar el usuario aquí
				String usuario = ID.getText();
				String contrasena = new String(Contraseña.getPassword());

				if (usuario.equals("bodega") && contrasena.equals("bodega123")) {
					// Si el usuario y contraseña son correctos para bodega, redirigir a la ventana de actividades de empleado
					Actividades_Empleado newframe = new Actividades_Empleado();
					newframe.setVisible(true);
					dispose(); // Cierra la ventana actual
				} else {
					// Muestra una ventana de "Usuario no válido"
					JOptionPane.showMessageDialog(null, "Usuario no válido", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
		
		
	}

}
