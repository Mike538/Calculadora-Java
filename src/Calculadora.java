
//Librerias
package hoja1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Clase
public class Calculadora extends JFrame {

    private JPanel contentPane;
    private JTextField tfn1;
    private JTextField tfn2;
    private JTextField resultado;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculadora frame = new Calculadora();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Propiedades de ventana

    public Calculadora() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setTitle("CALCULADORA");

        //Panel numero 1

        JLabel lblNumero = new JLabel("Numero 1");
        lblNumero.setFont(new Font("Baguet Script", Font.PLAIN, 16));
        lblNumero.setBounds(23, 25, 73, 21);
        contentPane.add(lblNumero);

        //Panel numero 2

        JLabel lblNumero_1 = new JLabel("Numero 2");
        lblNumero_1.setFont(new Font("Baguet Script", Font.PLAIN, 16));
        lblNumero_1.setBounds(23, 104, 73, 21);
        contentPane.add(lblNumero_1);

        tfn1 = new JTextField();
        tfn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        tfn1.setBounds(176, 27, 86, 20);
        contentPane.add(tfn1);
        tfn1.setColumns(10);

        tfn2 = new JTextField();
        tfn2.setColumns(10);
        tfn2.setBounds(176, 106, 86, 20);
        contentPane.add(tfn2);

        //Panel Resultado

        JLabel lblResultado = new JLabel("Resultado");
        lblResultado.setFont(new Font("Baguet Script", Font.PLAIN, 16));
        lblResultado.setBounds(189, 171, 73, 21);
        contentPane.add(lblResultado);

        //Boton borrar

        JButton btnLimpiar = new JButton("C");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfn1.setText("");
                tfn2.setText("");
                resultado.setText("");
            }
        });


        btnLimpiar.setBounds(270, 227, 49, 23);
        contentPane.add(btnLimpiar);

        //Boton Multiplicación

        JButton button = new JButton("*");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double multiplicacion = Double.parseDouble(tfn1.getText())* Double.parseDouble(tfn2.getText());
                String sol = String.valueOf(multiplicacion);
                resultado.setText(sol);
            }
        });
        button.setBounds(23, 227, 59, 23);
        contentPane.add(button);

        //Boton División

        JButton button_1 = new JButton("/");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double division = Double.parseDouble(tfn1.getText())/ Double.parseDouble(tfn2.getText());
                String sol = String.valueOf(division);
                resultado.setText(sol);
            }
        });
        button_1.setBounds(92, 227, 59, 23);
        contentPane.add(button_1);

        //Boton Suma

        JButton button_2 = new JButton("+");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double suma = Double.parseDouble(tfn1.getText())+Double.parseDouble(tfn2.getText());
                String sol = String.valueOf(suma);
                resultado.setText(sol);
            }
        });
        button_2.setBounds(23, 197, 59, 23);
        contentPane.add(button_2);

        //Boton Resta

        JButton button_3 = new JButton("-");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resta = Double.parseDouble(tfn1.getText())- Double.parseDouble(tfn2.getText());
                String sol = String.valueOf(resta);
                resultado.setText(sol);
            }
        });
        button_3.setBounds(92, 197, 59, 23);
        contentPane.add(button_3);

        //Boton Salir

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        btnSalir.setBounds(329, 227, 89, 23);
        contentPane.add(btnSalir);

        resultado = new JTextField();
        resultado.setEditable(false);
        resultado.setColumns(10);
        resultado.setBounds(306, 173, 86, 20);
        contentPane.add(resultado);

        JButton AC = new JButton("AC");
        AC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                tfn2.setText("0");
            }
        });
        AC.setBounds(203, 227, 59, 23);
        contentPane.add(AC);
    }
}