package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actividades_Empleado_venta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividades_Empleado_venta frame = new Actividades_Empleado_venta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Actividades_Empleado_venta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton Atrás = new JButton("");
		Atrás.setBorder(null);
		Atrás.setIcon(new ImageIcon(Actividades_Empleado_venta.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);

		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Redirige a la ventana de inicio de sesión en ventas
				Inicio_Ventas newframe = new Inicio_Ventas();
				newframe.setVisible(true);
				dispose(); // Cierra la ventana actual
			}
		});

		JButton Venta = new JButton("");
		Venta.setBorder(null);
		Venta.setIcon(new ImageIcon(Actividades_Empleado_venta.class.getResource("/paquetito/Botones/Venta.jpg")));
		Venta.setBounds(84, 270, 505, 110);
		contentPane.add(Venta);

		// Agrega un ActionListener al botón "venta"
		Venta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Venta ventaFrame = new Venta();
				ventaFrame.setVisible(true);
				// Cierra el frame actual si es necesario
				dispose();
			}
		});


		JButton Devoluciones = new JButton("");
		Devoluciones.setBorder(null);
		Devoluciones.setIcon(new ImageIcon(Actividades_Empleado_venta.class.getResource("/paquetito/Botones/Devoluciones.jpg")));
		Devoluciones.setBounds(92, 408, 500, 110);
		contentPane.add(Devoluciones);

		// Agrega un ActionListener al botón "Devoluciones"
		Devoluciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Devoluciones devolucionesFrame = new Devoluciones();
				devolucionesFrame.setVisible(true);
				// Cierra el frame actual si es necesario
				dispose();
			}
		});

		JLabel Actividades_Venta = new JLabel("");
		Actividades_Venta.setBounds(0, 0, 1300, 731);
		Actividades_Venta.setIcon(new ImageIcon(Actividades_Empleado_venta.class.getResource("/paquetito/Imagenes/Actividades_Ventas.jpg")));
		contentPane.add(Actividades_Venta);
	}
}
