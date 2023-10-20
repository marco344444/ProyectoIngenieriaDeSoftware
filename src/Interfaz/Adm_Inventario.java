package Interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;


public class Adm_Inventario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Buscar;
	private JTextField Descripción;
	private JTextField Código;
	private JTextField textField;
	private JButton BotonBuscar;
	private JButton Modificar;


	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adm_Inventario frame = new Adm_Inventario();
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
	public Adm_Inventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Atrás = new JButton("");
		Atrás.setBorder(null);
		Atrás.setSelected(true);
		Atrás.setIcon(new ImageIcon(Devoluciones.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atrás.setBounds(10, 24, 81, 23);
		contentPane.add(Atrás);
		Atrás.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Actividades_Empleado newframe = new Actividades_Empleado();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		Buscar = new JTextField();
		Buscar.setBorder(null);
		Buscar.setBounds(57, 121, 1039, 31);
		contentPane.add(Buscar);
		Buscar.setColumns(10);
		
		Descripción = new JTextField();
		Descripción.setForeground(new Color(0, 0, 0));
		Descripción.setBounds(300, 285, 625, 39);
		contentPane.add(Descripción);
		Descripción.setColumns(10);
		
		Código = new JTextField();
		Código.setForeground(Color.BLACK);
		Código.setColumns(10);
		Código.setBounds(57, 285, 206, 39);
		contentPane.add(Código);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBounds(943, 285, 158, 39);
		contentPane.add(textField);

		BotonBuscar = new JButton("");
		BotonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonBuscar.setBorder(null);
		BotonBuscar.setIcon(new ImageIcon(Adm_Inventario.class.getResource("/paquetito/Botones/Buscar.jpg")));
		BotonBuscar.setBounds(1134, 119, 101, 44);
		contentPane.add(BotonBuscar);
		
		Modificar = new JButton("");
		Modificar.setBorder(null);
		Modificar.setIcon(new ImageIcon(Adm_Inventario.class.getResource("/paquetito/Botones/Modificar.jpg")));
		Modificar.setBounds(928, 586, 254, 50);
		contentPane.add(Modificar);
		
		
		JLabel Adm_Inventario = new JLabel("");
		Adm_Inventario.setForeground(new Color(0, 0, 0));
		Adm_Inventario.setIconTextGap(10);
		Adm_Inventario.setIcon(new ImageIcon(Adm_Inventario.class.getResource("/paquetito/Imagenes/Administrar_Inventario.jpg")));
		Adm_Inventario.setBounds(0, 0, 1300, 731);
		contentPane.add(Adm_Inventario);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
