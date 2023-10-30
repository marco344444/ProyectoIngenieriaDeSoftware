package Interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Generar_Reporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generar_Reporte frame = new Generar_Reporte();
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
	public Generar_Reporte() {
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
		Atrás.setIcon(new ImageIcon(Generar_Reporte.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 297, 1206, 298);
		contentPane.add(textArea);
		

		JButton Guardar = new JButton("");
		Guardar.setBorder(null);
		Guardar.setIcon(new ImageIcon(Generar_Reporte.class.getResource("/paquetito/Botones/Guardar.jpg")));
		Guardar.setBounds(954, 613, 303, 42);
		contentPane.add(Guardar);
		
		
		JLabel Generar_Reporte = new JLabel("");
		Generar_Reporte.setIcon(new ImageIcon(Generar_Reporte.class.getResource("/paquetito/Imagenes/Generar_Reporte.jpg")));
		Generar_Reporte.setBounds(0, 0, 1300, 731);
		contentPane.add(Generar_Reporte);
		
		
		
	}

}
