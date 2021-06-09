package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CentralMain extends JFrame implements ActionListener {

  JPanel panel_dashboard,panel_verTablaDePrestamos,panel_verTablaDeClientes;
  JLabel label_dashboard,labelPrestamos,labelClientes;
    public CentralMain(){
        setLayout(null);
        setSize(900,650);
        setResizable(false);
        setTitle("");
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0,0,0));

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        panel_dashboard = new JPanel();
        panel_dashboard.setLayout(null);
        panel_dashboard.setBounds(40,90,100,100);
        panel_dashboard.setBackground(new Color(255,255,255));
        add(panel_dashboard);

        panel_verTablaDePrestamos = new JPanel();
        panel_verTablaDePrestamos.setLayout(null);
        panel_verTablaDePrestamos.setBounds(40,90,100,100);
        panel_verTablaDePrestamos.setBackground(new Color(255,255,255));
        add(panel_verTablaDePrestamos);

        panel_verTablaDeClientes = new JPanel();
        panel_verTablaDeClientes.setLayout(null);
        panel_verTablaDeClientes.setBounds(40,90,100,100);
        panel_verTablaDeClientes.setBackground(new Color(255,255,255));
        add(panel_verTablaDeClientes);



    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== panel_dashboard){


        }if(e.getSource()==panel_verTablaDePrestamos){

        }

    }

    public static void main(String[] args) {
        new CentralMain().setVisible(true);
    }
}
