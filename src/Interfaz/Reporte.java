package Interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Reporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reporte frame = new Reporte();
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
	public Reporte() {
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
				Actividades_Empleado newframe = new Actividades_Empleado();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		Atrás.setIcon(new ImageIcon(Mirar_Inventario.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		
		JButton Guardar = new JButton("");
		Guardar.setBorder(null);
		Guardar.setIcon(new ImageIcon(Reporte.class.getResource("/paquetito/Botones/Guardar.jpg")));
		Guardar.setBounds(953, 639, 303, 42);
		contentPane.add(Guardar);
		
		
		JTextArea Reporte = new JTextArea();
		Reporte.setBounds(46, 298, 1210, 366);
		contentPane.add(Reporte);
		
	
		
		JLabel Ver_Reporte = new JLabel("");
		Ver_Reporte.setIcon(new ImageIcon(Reporte.class.getResource("/paquetito/Imagenes/Ver_Reporte.jpg")));
		Ver_Reporte.setBounds(0, 0, 1300, 731);
		contentPane.add(Ver_Reporte);
		
	
	
		
		
		
		
		
		
		
	}
}
