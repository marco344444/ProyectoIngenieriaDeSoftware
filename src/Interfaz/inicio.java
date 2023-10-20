package Interfaz;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	private ImageIcon imagen;
	private Icon icono;
	private JLabel jLabel1;
	private JLabel jLabel1_1;
	private JPasswordField Contraseña;
	private JTextField textField;
	private JTextField ID;
	private JButton Empleado_V;
	private JButton Empleado_I;
	private JButton Ingresar;
	
	
	public inicio() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300
				, 731);
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
		
		Empleado_I = new JButton("New button");
		Empleado_I.setIcon(new ImageIcon(Inicio_Ventas.class.getResource("/paquetito/Botones/Empleado_I.jpg")));
		Empleado_I.setBounds(912, 52, 136, 53);
		contentPane.add(Empleado_I);
		
		Empleado_I.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Inicio_Inventario newframe = new Inicio_Inventario();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		Empleado_V = new JButton("");
		Empleado_V.setIcon(new ImageIcon(Inicio_Inventario.class.getResource("/paquetito/Botones/Empleado_V.jpg")));
		Empleado_V.setBounds(1058, 52, 157, 51);
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
		Ingresar.setBounds(880, 466,213 , 64);
		contentPane.add(Ingresar);
		
		
		jLabel1_1 = new JLabel("");
		jLabel1_1.setBackground(new Color(255, 255, 255));
		jLabel1_1.setBounds(-16, 0, 1300, 731);
		jLabel1_1.setIcon(new ImageIcon(inicio.class.getResource("/paquetito/Imagenes/Inicio2.jpg")));
		contentPane.add(jLabel1_1);
		
	
		
	}
}
