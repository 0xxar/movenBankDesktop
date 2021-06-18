package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CentralMainUser extends JFrame implements ActionListener {

    JComboBox box_busqueda;
    JTable tabla_info;
    JPanel panel_central,panel_solicitarPrestamo,panel_perfil,panel_estadoCuenta,panel_logout;
    JLabel label_cerrarSesion;

    public CentralMainUser(){
        setLayout(null);
        setSize(900,700);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Central User");

        getContentPane().setBackground(new Color(0,200,255));
        setIconImage(new ImageIcon(getClass().getResource("/images/bank.png")).getImage());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

    }
}
