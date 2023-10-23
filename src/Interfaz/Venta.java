package Interfaz;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Venta extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField Nombre;
    private JTextField Nombre_Negocio;
    private JTextField Ciudad_CodPostal;
    private JTextField Base_Imponible;
    private JTextField textField;
    private JTextField IRPF;
    private JTextField Total;
    private JTextArea PrecioxU;
    private JTextArea PrecioTotal;
    private JTextArea Producto; // Agregado
    private JTextArea textArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Venta frame = new Venta();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Venta() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1300, 731);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton Atras = new JButton("");
        Atras.setBorder(null);

        Atras.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actividades_Empleado_venta newframe = new Actividades_Empleado_venta();
                newframe.setVisible(true);
                dispose();
            }
        });

        Atras.setIcon(new ImageIcon(Venta.class.getResource("/paquetito/Botones/Atrás.jpg")));
        Atras.setBounds(10, 24, 81, 23);
        contentPane.add(Atras);

        Nombre = new JTextField();
        Nombre.setBounds(279, 144, 355, 20);
        contentPane.add(Nombre);
        Nombre.setColumns(10);

        Nombre_Negocio = new JTextField();
        Nombre_Negocio.setText("");
        Nombre_Negocio.setBounds(304, 170, 330, 20);
        contentPane.add(Nombre_Negocio);
        Nombre_Negocio.setColumns(10);

        Ciudad_CodPostal = new JTextField();
        Ciudad_CodPostal.setBounds(362, 197, 273, 20);
        contentPane.add(Ciudad_CodPostal);
        Ciudad_CodPostal.setColumns(10);

        Base_Imponible = new JTextField();
        Base_Imponible.setBounds(959, 489, 138, 20);
        contentPane.add(Base_Imponible);
        Base_Imponible.setColumns(10);

        textField = new JTextField();
        textField.setBounds(959, 514, 138, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        IRPF = new JTextField();
        IRPF.setBounds(959, 537, 138, 20);
        contentPane.add(IRPF);
        IRPF.setColumns(10);

        Total = new JTextField();
        Total.setText("");
        Total.setBounds(959, 568, 138, 20);
        contentPane.add(Total);
        Total.setColumns(10);

        JTextArea Cantidad = new JTextArea();
        Cantidad.setBounds(560, 291, 97, 172);
        contentPane.add(Cantidad);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(560, 293, 97, 170);
        contentPane.add(textArea_1);

        PrecioxU = new JTextArea();
        PrecioxU.setBorder(new CompoundBorder());
        PrecioxU.setBounds(742, 293, 149, 170);
        contentPane.add(PrecioxU);

        PrecioTotal = new JTextArea();
        PrecioTotal.setBorder(new CompoundBorder());
        PrecioTotal.setBounds(993, 293, 149, 170);
        contentPane.add(PrecioTotal);

        JScrollPane cantidadScrollPane = new JScrollPane(Cantidad);
        cantidadScrollPane.setBounds(560, 291, 97, 172);
        contentPane.add(cantidadScrollPane);

        JScrollPane textArea1ScrollPane = new JScrollPane(textArea_1);
        textArea1ScrollPane.setBounds(560, 293, 97, 170);
        contentPane.add(textArea1ScrollPane);

        JScrollPane precioxUScrollPane = new JScrollPane(PrecioxU);
        precioxUScrollPane.setBounds(742, 293, 149, 170);
        contentPane.add(precioxUScrollPane);

        JScrollPane precioTotalScrollPane = new JScrollPane(PrecioTotal);
        precioTotalScrollPane.setBounds(993, 293, 149, 170);
        contentPane.add(precioTotalScrollPane);

        Producto = new JTextArea(); // Agregado
        JScrollPane productoScrollPane = new JScrollPane(Producto); // Agregado
        productoScrollPane.setBounds(106, 293, 406, 170); // Agregado
        contentPane.add(productoScrollPane); // Agregado
        
        textArea = new JTextArea();
        textArea.setBounds(126, 512, 608, 76);
        contentPane.add(textArea);

        JLabel Venta = new JLabel("");
        Venta.setIcon(new ImageIcon(Venta.class.getResource("/paquetito/Imagenes/Venta.jpg")));
        Venta.setBounds(0, 0, 1300, 731);
        contentPane.add(Venta);
        
        
    }
}
