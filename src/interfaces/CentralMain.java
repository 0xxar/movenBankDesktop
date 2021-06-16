package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CentralMain extends JFrame implements ActionListener,MouseListener {

  JPanel panel_dashboard,panel_informePrestamos,panel_InformeUsuarios,panel_presupuesto,panel_RegistrosPagos;
  JLabel label_dashboard,label_informePrestamos,labelClientes,label_exit,label_cerrarSesion;
  JTabbedPane tabbedPane, tabbedPane1, tabbedPane2;
    public CentralMain(){
        setLayout(null);
        setSize(900,650);
        setResizable(false);
        setTitle("");
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(0,0,0));

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        tabbedPane = new JTabbedPane();
        tabbedPane.setLayout(null);
        tabbedPane.setBounds(5,5,620,540);
        tabbedPane.setName("inicio");
        add(tabbedPane);

        tabbedPane1 = new JTabbedPane();
        tabbedPane1.setLayout(null);
        tabbedPane1.setBounds(5,5,620,540);
        tabbedPane1.setName("inicio");
        add(tabbedPane1);

        tabbedPane2 = new JTabbedPane();
        tabbedPane2.setLayout(null);
        tabbedPane2.setBounds(5,5,620,540);
        tabbedPane2.setName("inicio");
        add(tabbedPane2);

        ImageIcon imageIcon = new ImageIcon("src/images/bt_of.png");
        label_cerrarSesion = new JLabel(imageIcon);
        label_cerrarSesion.setBounds(810,5,50,50);
        label_cerrarSesion.addMouseListener((MouseListener) this);
        add(label_cerrarSesion);

        panel_dashboard = new JPanel();
        panel_dashboard.setLayout(null);
        panel_dashboard.setBounds(250,60,620,540);
        panel_dashboard.setBackground(new Color(255,255,255));
        panel_dashboard.add(tabbedPane);
        panel_dashboard.add(tabbedPane1);
        panel_dashboard.add(tabbedPane2);
        add(panel_dashboard);

        label_informePrestamos = new JLabel("Prestamos");
        label_informePrestamos.setBounds(5,5,64,64);

        panel_informePrestamos = new JPanel();
        panel_informePrestamos.setLayout(null);
        panel_informePrestamos.setBounds(20,90,160,80);
        panel_informePrestamos.setBackground(new Color(255,255,255));
        panel_informePrestamos.add(label_informePrestamos);
        panel_informePrestamos.addMouseListener((MouseListener) this);
        add(panel_informePrestamos);

        label_informePrestamos = new JLabel("Prestamos");
        label_informePrestamos.setBounds(5,5,64,64);

        panel_InformeUsuarios = new JPanel();
        panel_InformeUsuarios.setLayout(null);
        panel_InformeUsuarios.setBounds(20,200,160,80);
        panel_InformeUsuarios.setBackground(new Color(255,255,255));
        panel_InformeUsuarios.add(label_informePrestamos);
        panel_InformeUsuarios.addMouseListener((MouseListener) this);
        add(panel_InformeUsuarios);

        label_informePrestamos = new JLabel("Prestamos");
        label_informePrestamos.setBounds(5,5,64,64);

        panel_InformeUsuarios = new JPanel();
        panel_InformeUsuarios.setLayout(null);
        panel_InformeUsuarios.setBounds(20,300,160,80);
        panel_InformeUsuarios.setBackground(new Color(255,255,255));
        panel_InformeUsuarios.add(label_informePrestamos);
        panel_InformeUsuarios.addMouseListener((MouseListener) this);
        add(panel_InformeUsuarios);

        label_informePrestamos = new JLabel("Prestamos");
        label_informePrestamos.setBounds(5,5,64,64);

        panel_InformeUsuarios = new JPanel();
        panel_InformeUsuarios.setLayout(null);
        panel_InformeUsuarios.setBounds(20,400,160,80);
        panel_InformeUsuarios.setBackground(new Color(255,255,255));
        panel_InformeUsuarios.add(label_informePrestamos);
        panel_InformeUsuarios.addMouseListener((MouseListener) this);
        add(panel_InformeUsuarios);

    }



    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        new CentralMain().setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()== panel_informePrestamos){

            new GenerarPrestamo().setVisible(true);

        }if(e.getSource()==label_cerrarSesion){

            new LoginUser().setVisible(true);
            this.dispose();

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
