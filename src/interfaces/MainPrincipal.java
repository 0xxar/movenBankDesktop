package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPrincipal extends JFrame implements ActionListener {

   JTabbedPane tabprincipal;
   JTabbedPane tabprincipal1 = new JTabbedPane();
   JTabbedPane tabprincipal2 = new JTabbedPane();
   JTabbedPane tabprincipal3 = new JTabbedPane();
   JPanel panel1;
   JTextField txt_search;


    public MainPrincipal(){
        setLayout(null);
        setSize(600,650);
        setResizable(false);
        setTitle("Main");
        setLocationRelativeTo(null);



            txt_search = new JTextField("Buscar");
            txt_search.setBounds(30,40,200,40);
            txt_search.setFont(new Font("Andale Mono",2,14));
            txt_search.setBackground(new Color(255,255,255));
            txt_search.setEnabled(true);
            txt_search.setEditable(true);
            add(txt_search);

            panel1 = new JPanel();
            panel1.setSize(500,600);
            panel1.setLayout(null);
            panel1.add(txt_search);
            panel1.setBackground(new Color(0,0,0));
            panel1.setVisible(true);

            add(panel1);

            tabprincipal = new JTabbedPane();
            tabprincipal.setSize(580,640);
            tabprincipal.addTab("Principal",tabprincipal1);
            tabprincipal.addTab("Principal",tabprincipal2);
            tabprincipal.addTab("Principal",tabprincipal3);
            tabprincipal.setVisible(true);
            add(tabprincipal);

            tabprincipal1 = new JTabbedPane();
            tabprincipal1.setSize(580,640);
            tabprincipal1.add(panel1);
            tabprincipal1.setVisible(true);
            add(tabprincipal1);

        tabprincipal2 = new JTabbedPane();
        tabprincipal2.setSize(580,640);
        tabprincipal2.add(panel1);
        tabprincipal2.setVisible(true);
        add(tabprincipal2);

        tabprincipal3 = new JTabbedPane();
        tabprincipal3.setSize(580,640);
        tabprincipal3.add(panel1);
        tabprincipal3.setVisible(true);
        add(tabprincipal3);

            getContentPane().add(tabprincipal);
            getContentPane().add(tabprincipal1);
           getContentPane().add(tabprincipal2);
           getContentPane().add(tabprincipal3);





    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new MainPrincipal().setVisible(true);
    }
}
