package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actvidades_Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton Empleados;
	private JButton MirarInventario;
	private JButton Proveedores;

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
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inicio newframe = new inicio();
				newframe.setVisible(true);
				dispose();
			}
		});
		Atrás.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);

		// Botón para abrir la ventana de Empleados
		Empleados = new JButton("");
		Empleados.setBorder(null);
		Empleados.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Empleados.jpg")));
		Empleados.setBounds(214, 221, 399, 65);
		contentPane.add(Empleados);

		Empleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleados newframe = new Empleados();
				newframe.setVisible(true);
				dispose();
			}
		});

		// Botón para abrir la ventana de Mirar Inventario
		MirarInventario = new JButton("");
		MirarInventario.setBorder(null);
		MirarInventario.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Mirar_Inventario.jpg")));
		MirarInventario.setBounds(214, 346, 399, 57);
		contentPane.add(MirarInventario);

		MirarInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mirar_Inventario newframe = new Mirar_Inventario();
				newframe.setVisible(true);
				dispose();
			}
		});

		// Botón para abrir la ventana de Proveedores
		Proveedores = new JButton("");
		Proveedores.setBorder(null);
		Proveedores.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Proveedores.jpg")));
		Proveedores.setBounds(214, 463, 404, 57);
		contentPane.add(Proveedores);

		Proveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proveedores newframe = new Proveedores();
				newframe.setVisible(true);
				dispose();
			}
		});

		// Botón para abrir la ventana de Generar Reporte
		JButton GenerarReporte = new JButton("");
		GenerarReporte.setBorder(null);
		GenerarReporte.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Botones/Generar_Reporte.jpg")));
		GenerarReporte.setBounds(227, 590, 386, 55);
		contentPane.add(GenerarReporte);

		GenerarReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generar_Reporte newframe = new Generar_Reporte();
				newframe.setVisible(true);
				dispose();
			}
		});

		JLabel Actividades_Admin = new JLabel("");
		Actividades_Admin.setBounds(0, 0, 1300, 731);
		Actividades_Admin.setIcon(new ImageIcon(Actvidades_Admin.class.getResource("/paquetito/Imagenes/Actividades_Admin.jpg")));
		contentPane.add(Actividades_Admin);
	}
}
