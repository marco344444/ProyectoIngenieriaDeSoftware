package Interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Registro_De_Compras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Fecha;
	private JTextField Cantidad;
	private JTextField Código;
	private JTextField Precio;
	private JTextField Proveedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro_De_Compras frame = new Registro_De_Compras();
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
	public Registro_De_Compras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Atrás = new JButton("");
		Atrás.setBorder(null);
		Atrás.setIcon(new ImageIcon(Interfaz.Devoluciones.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Actividades_Empleado newframe = new Actividades_Empleado();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		JButton Actualizar = new JButton("");
		Actualizar.setIcon(new ImageIcon(Devoluciones.class.getResource("/paquetito/Botones/Actualizar.jpg")));
		Actualizar.setBorder(null);
		Actualizar.setBounds(958, 588, 180, 45);
		contentPane.add(Actualizar);
		
		Fecha = new JTextField();
		Fecha.setBounds(53, 210, 203, 39);
		contentPane.add(Fecha);
		Fecha.setColumns(10);
		
		Cantidad = new JTextField();
		Cantidad.setBounds(319, 210, 113, 39);
		contentPane.add(Cantidad);
		Cantidad.setColumns(10);
		
		Código = new JTextField();
		Código.setBounds(542, 210, 195, 39);
		contentPane.add(Código);
		Código.setColumns(10);
		
		Precio = new JTextField();
		Precio.setText("");
		Precio.setBounds(768, 210, 252, 39);
		contentPane.add(Precio);
		Precio.setColumns(10);
		
		Proveedor = new JTextField();
		Proveedor.setBounds(1040, 210, 203, 39);
		contentPane.add(Proveedor);
		Proveedor.setColumns(10);
		
		JLabel Registro_D_C = new JLabel("");
		Registro_D_C.setIcon(new ImageIcon(Registro_De_Compras.class.getResource("/paquetito/Imagenes/Registro_De_Compras.jpg")));
		Registro_D_C.setBounds(0, 0, 1300, 731);
		contentPane.add(Registro_D_C);
		
		
		
	}
}
