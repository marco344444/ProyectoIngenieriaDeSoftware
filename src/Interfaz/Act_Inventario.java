package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
public class Act_Inventario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton Atras;
	private JTextField Buscar;
	private JTextField Código;
	private JTextField Proveedor;
	private JTextField Stock;
	private JButton BotonBuscar;
	private JButton BotonActulizar;

	/**
	 * Launch the application.
	 */
	/**@SuppressWarnings("unused")
	private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {
		Actividades_Empleado newframe = new Actividades_Empleado();
		newframe.setVisible(true);
		this.dispose();}
	**/
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act_Inventario frame = new Act_Inventario();
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
	
	public Act_Inventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 Atras = new JButton("");
		 Atras.setBorder(null);
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Actividades_Empleado newframe = new Actividades_Empleado();
				newframe.setVisible(true);
				dispose();
				
			}
		});
		
		
		Atras.setForeground(new Color(255, 255, 255));
		Atras.setIcon(new ImageIcon(Generar_Reporte.class.getResource("/paquetito/Botones/Atrás.jpg")));
		Atras.setBounds(10, 24, 81, 23);
		
		contentPane.add(Atras);
		Buscar = new JTextField();
		Buscar.setBorder(null);
		Buscar.setBounds(57, 217, 1039, 31);
		contentPane.add(Buscar);
		Buscar.setColumns(10);
		
		Código = new JTextField();
		Código.setBounds(57, 381, 190, 39);
		contentPane.add(Código);
		Código.setColumns(10);
		
		Proveedor = new JTextField();
		Proveedor.setColumns(10);
		Proveedor.setBounds(289, 381, 553, 39);
		contentPane.add(Proveedor);
		
		Stock = new JTextField();
		Stock.setColumns(10);
		Stock.setBounds(862, 381, 183, 39);
		contentPane.add(Stock);

		BotonBuscar = new JButton("");
		BotonBuscar.setBorder(null);
		
		BotonBuscar.setIcon(new ImageIcon(Act_Inventario.class.getResource("/paquetito/Botones/Buscar.jpg")));
		BotonBuscar.setBounds(1136, 204, 95, 44);
		contentPane.add(BotonBuscar);
		

		BotonActulizar = new JButton("");
		BotonActulizar.setBorder(null);
		BotonActulizar.setIcon(new ImageIcon(Act_Inventario.class.getResource("/paquetito/Botones/Actualizar.jpg")));
		BotonActulizar.setBounds(966, 583, 180, 45);
		contentPane.add(BotonActulizar);
		
		JLabel Act_Inventario = new JLabel("");
		Act_Inventario.setIcon(new ImageIcon(Act_Inventario.class.getResource("/paquetito/Imagenes/Actualizar_Inventario.jpg")));
		Act_Inventario.setBounds(0, 0, 1300, 731);
		contentPane.add(Act_Inventario);
		
		
		
            }
        };
        
       
		
		
		
	


