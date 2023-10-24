package Interfaz;

import Interfaz.Adm_Inventario;
import Interfaz.Inicio_Inventario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actividades_Empleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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

	public Actividades_Empleado() {
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
				Inicio_Inventario newframe = new Inicio_Inventario();
				newframe.setVisible(true);
				dispose();
			}
		});

		Atrás.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);

		JButton Administrar_Inventario = new JButton("");
		Administrar_Inventario.setBorder(null);
		Administrar_Inventario.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Administrar_Inventario.jpg")));
		Administrar_Inventario.setBounds(226, 219, 378, 63);
		contentPane.add(Administrar_Inventario);

		// Agregar ActionListener al botón Administrar Inventario
		Administrar_Inventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Abrir la ventana Adm_Inventario
				Adm_Inventario newframe = new Adm_Inventario();
				newframe.setVisible(true);
				dispose();
			}
		});

		JButton Reporte = new JButton("");
		Reporte.setBorder(null);
		Reporte.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Reporte.jpg")));
		Reporte.setBounds(222, 457, 393, 65);
		contentPane.add(Reporte);

		JButton Actualizar_Inventario = new JButton("");
		Actualizar_Inventario.setBorder(null);
		Actualizar_Inventario.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Actualizar_Inventario.jpg")));
		Actualizar_Inventario.setBounds(233, 337, 382, 62);
		contentPane.add(Actualizar_Inventario);

		JButton Registro_De_Compras = new JButton("");
		Registro_De_Compras.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Botones/Registro_De_Compras.jpg")));
		Registro_De_Compras.setBorder(null);
		Registro_De_Compras.setBounds(222, 579, 393, 64);
		contentPane.add(Registro_De_Compras);

		JLabel Actvidades_Empleado_I = new JLabel("");
		Actvidades_Empleado_I.setBounds(0, 0, 1300, 731);
		Actvidades_Empleado_I.setIcon(new ImageIcon(Actividades_Empleado.class.getResource("/paquetito/Imagenes/Actividades_Inventario.jpg")));
		contentPane.add(Actvidades_Empleado_I);
		Registro_De_Compras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro_De_Compras registroComprasFrame = new Registro_De_Compras();
				registroComprasFrame.setVisible(true);
				dispose(); // Cierra la ventana actual
			}
		});
		Reporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reporte reporteFrame = new Reporte();
				reporteFrame.setVisible(true);
				dispose(); // Cierra la ventana actual
			}
		});
		Actualizar_Inventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Act_Inventario newframe = new Act_Inventario();
				newframe.setVisible(true);
				dispose(); // Cierra la ventana actual
			}
		});



	}
}
