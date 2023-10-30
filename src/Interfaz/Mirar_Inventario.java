package Interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mirar_Inventario extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea Productos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Mirar_Inventario frame = new Mirar_Inventario();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Mirar_Inventario() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1300, 731);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton Atras = new JButton("");
        Atras.setBorder(null);
        Atras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Interfaz.Actividades_Empleado newframe = new Actividades_Empleado();
                newframe.setVisible(true);
                dispose();
            }
        });
        Atras.setIcon(new ImageIcon(Mirar_Inventario.class.getResource("/paquetito/Botones/Atrás.jpg")));
        Atras.setBounds(10, 24, 81, 23);
        contentPane.add(Atras);

        Productos = new JTextArea();
        JScrollPane productosScrollPane = new JScrollPane(Productos);
        productosScrollPane.setBounds(54, 275, 1192, 290);
        contentPane.add(productosScrollPane);

        JLabel Mirar_Inventario = new JLabel("");
        Mirar_Inventario.setIcon(new ImageIcon(Mirar_Inventario.class.getResource("/paquetito/Imagenes/Mirar_Inventario.jpg")));
        Mirar_Inventario.setBounds(0, 0, 1300, 731);
        contentPane.add(Mirar_Inventario);
    }
}
