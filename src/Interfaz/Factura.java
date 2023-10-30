package Interfaz;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Factura extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField Nombre;
    private JTextField Nombre_Negocio;
    private JTextField Ciudad_CodPostal;
    private JTextField Base_Imponible;
    private JTextField textField;
    private JTextField IRPF;
    private JTextField Total;
    private JTextArea Producto;
    private JTextArea Cantidad;
    private JTextArea textArea;
    private JTextArea Precio_U;
    private JTextArea PrecioTotal;
    private JTextArea textArea_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Factura frame = new Factura();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Factura() {
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
                Venta newframe = new Venta();
                newframe.setVisible(true);
                dispose();
            }
        });

        Atras.setIcon(new ImageIcon(Factura.class.getResource("/paquetito/Botones/Atrás.jpg")));
        Atras.setBounds(0, 11, 81, 23);
        contentPane.add(Atras);

        Nombre = new JTextField();
        Nombre.setBounds(170, 141, 233, 20);
        contentPane.add(Nombre);
        Nombre.setColumns(10);

        Nombre_Negocio = new JTextField();
        Nombre_Negocio.setText("");
        Nombre_Negocio.setBounds(263, 172, 147, 20);
        contentPane.add(Nombre_Negocio);
        Nombre_Negocio.setColumns(10);

        Ciudad_CodPostal = new JTextField();
        Ciudad_CodPostal.setBounds(73, 225, 273, 20);
        contentPane.add(Ciudad_CodPostal);
        Ciudad_CodPostal.setColumns(10);

        Base_Imponible = new JTextField();
        Base_Imponible.setBounds(959, 556, 138, 20);
        contentPane.add(Base_Imponible);
        Base_Imponible.setColumns(10);

        textField = new JTextField();
        textField.setBounds(959, 578, 138, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        IRPF = new JTextField();
        IRPF.setBounds(959, 603, 138, 20);
        contentPane.add(IRPF);
        IRPF.setColumns(10);

        Total = new JTextField();
        Total.setText("");
        Total.setBounds(959, 628, 138, 20);
        contentPane.add(Total);
        Total.setColumns(10);

        JScrollPane cantidadScrollPane = new JScrollPane();
        cantidadScrollPane.setBounds(532, 366, 81, 168);
        contentPane.add(cantidadScrollPane);

        Cantidad = new JTextArea();
        cantidadScrollPane.setViewportView(Cantidad);

        JScrollPane productoScrollPane = new JScrollPane();
        productoScrollPane.setBounds(73, 366, 404, 168);
        contentPane.add(productoScrollPane);

        Producto = new JTextArea();
        productoScrollPane.setViewportView(Producto);
        JScrollPane precioUScrollPane = new JScrollPane();
        precioUScrollPane.setBounds(719, 366, 133, 168);
        contentPane.add(precioUScrollPane);

        Precio_U = new JTextArea();
        precioUScrollPane.setViewportView(Precio_U);

        JScrollPane precioTotalScrollPane = new JScrollPane();
        precioTotalScrollPane.setBounds(959, 366, 155, 162);
        contentPane.add(precioTotalScrollPane);

        PrecioTotal = new JTextArea();
        precioTotalScrollPane.setViewportView(PrecioTotal);


        textArea_1 = new JTextArea();
        textArea_1.setBounds(73, 601, 618, 80);
        contentPane.add(textArea_1);

        
        JLabel Venta = new JLabel("");
        Venta.setBorder(new CompoundBorder());
        Venta.setIcon(new ImageIcon(Factura.class.getResource("/paquetito/Imagenes/Factura_Electronica.jpg")));
        Venta.setBounds(0, 0, 1300, 731);
        contentPane.add(Venta);
        
        
    }
}


