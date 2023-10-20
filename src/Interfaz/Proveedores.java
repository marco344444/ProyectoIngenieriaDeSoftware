package Interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Proveedores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Buscar;
	private JTextField Código;
	private JTextField Proveedor;
	private JButton BotonBuscar;
	private JButton Añadir_Proveedor;
	private JButton Eliminar_Proveedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proveedores frame = new Proveedores();
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
	public Proveedores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Atrás = new JButton("");
		Atrás.setBorder(null);
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Actvidades_Admin newframe = new Actvidades_Admin();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Atrás.setIcon(new ImageIcon(Mirar_Inventario.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		
		Buscar = new JTextField();
		Buscar.setBorder(null);
		Buscar.setBounds(59, 167, 1039, 31);
		contentPane.add(Buscar);
		Buscar.setColumns(10);
		
		Código = new JTextField();
		Código.setBounds(59, 323, 185, 39);
		contentPane.add(Código);
		Código.setColumns(10);
		
		Proveedor = new JTextField();
		Proveedor.setBounds(300, 323, 798, 39);
		contentPane.add(Proveedor);
		Proveedor.setColumns(10);
		
		BotonBuscar = new JButton("");
		BotonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonBuscar.setBorder(null);
		BotonBuscar.setIcon(new ImageIcon(Adm_Inventario.class.getResource("/paquetito/Botones/Buscar.jpg")));
		BotonBuscar.setBounds(1134, 154, 101, 44);
		contentPane.add(BotonBuscar);
		
		Añadir_Proveedor = new JButton("New button");
		Añadir_Proveedor.setIcon(new ImageIcon(Proveedores.class.getResource("/paquetito/Botones/Añadir_Proveedor.jpg")));
		Añadir_Proveedor.setBounds(391, 578, 389, 47);
		contentPane.add(Añadir_Proveedor);
		

		Eliminar_Proveedor = new JButton("New button");
		Eliminar_Proveedor.setIcon(new ImageIcon(Proveedores.class.getResource("/paquetito/Botones/Eliminar_Proveedor.jpg")));
		Eliminar_Proveedor.setBounds(862, 578, 383, 47);
		contentPane.add(Eliminar_Proveedor);
		
		JLabel Proveedores = new JLabel("");
		Proveedores.setIcon(new ImageIcon(Proveedores.class.getResource("/paquetito/Imagenes/Proveedores.jpg")));
		Proveedores.setBounds(0, 0, 1300, 731);
		contentPane.add(Proveedores);
		
		
		
		
		
		
		
	}

}
