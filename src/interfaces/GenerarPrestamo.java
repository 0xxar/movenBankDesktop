package interfaces;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.function.ObjDoubleConsumer;

public class GenerarPrestamo extends JFrame implements ActionListener, MouseListener {

    JButton bt_validarPresupuesto,bt_guardarInfoCliente;
    JLabel label_solicitudes, label_estaus, label_orden,label_buscarPor;
    JPanel panelTabla;
    JTable tabla_solicitudes = new JTable();
    JComboBox box_orden,box_estatus,box_referencia;
    JTextField txt_buscarPor;
    JButton bt_buscar, bt_cerrar,bt_imprimir_registros;

    JScrollPane scrollPane = new JScrollPane();



    DefaultTableModel model = new DefaultTableModel();

    public GenerarPrestamo(){

        setLayout(null);
        setSize(900,700);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Budget");

        getContentPane().setBackground(new Color(0,0,0));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        label_solicitudes = new JLabel("Informe de solicitudes de Prestamos");
        label_solicitudes.setBounds(300,20,300,30);
        label_solicitudes.setFont(new Font("Andale Mono",3,14));
        label_solicitudes.setForeground(new Color(0,0,0));
        label_solicitudes.setHorizontalAlignment(JLabel.CENTER);
        add(label_solicitudes);

        label_buscarPor = new JLabel("Buscar por:");
        label_buscarPor.setBounds(20,60,100,30);
        label_buscarPor.setFont(new Font("Andale Mono",3,14));
        add(label_buscarPor);

        box_referencia = new JComboBox();
        box_referencia.setBounds(30,100,100,30);
        box_referencia.setForeground(new Color(0,0,0));
        box_referencia.setFont(new Font("Andale Mono",3,12));
        box_referencia.addItem("Nombre");
        box_referencia.addItem("Apellido");
        box_referencia.addItem("Empresa");
        add(box_referencia);

        txt_buscarPor = new JTextField("");
        txt_buscarPor.setBounds(150,100,200,30);
        txt_buscarPor.setFont(new Font("Andale Mono",3,14));
        txt_buscarPor.setForeground(new Color(0,0,0));
        txt_buscarPor.setHorizontalAlignment(JTextField.CENTER);
        add(txt_buscarPor);

        bt_buscar = new JButton("Buscar");
        bt_buscar.setBounds(30,150,100,30);
        bt_buscar.setFont(new Font("Andale Mono",3,14));
        bt_buscar.setForeground(new Color(0,0,0));
        bt_buscar.addActionListener(this);
        add(bt_buscar);



        label_orden = new JLabel("Orden Alfabetido");
        label_orden.setBounds(580,50,300,30);
        label_orden.setFont(new Font("Andale Mono",3,14));
        label_orden.setForeground(new Color(0,0,0));
        label_orden.setHorizontalAlignment(JLabel.CENTER);
        add(label_orden);

        box_orden = new JComboBox();
        box_orden.setBounds(650,80,150,30);
        box_orden.setFont(new Font("Andale Mono",3,14));
        box_orden.setForeground(new Color(0,0,0));
        box_orden.addItem("None");
        box_orden.addItem("A-Z");
        box_orden.addItem("Z-A");
        add(box_orden);

        label_estaus = new JLabel("Estado de solicitud");
        label_estaus.setBounds(580,120,300,30);
        label_estaus.setFont(new Font("Andale Mono",3,14));
        label_estaus.setForeground(new Color(0,0,0));
        label_estaus.setHorizontalAlignment(JLabel.CENTER);
        add(label_estaus);

        box_estatus = new JComboBox();
        box_estatus.setBounds(650,150,150,30);
        box_estatus.setFont(new Font("Andale Mono",3,14));
        box_estatus.setForeground(new Color(0,0,0));
        box_estatus.addItem("None");
        box_estatus.addItem("Aprobado");
        box_estatus.addItem("Rechazado");
        box_estatus.addItem("Pendiente");
        box_estatus.addItem("En observacion");
        add(box_estatus);





        tabla_solicitudes = new JTable();
        tabla_solicitudes.setModel( new DefaultTableModel(
                new Object[][]{

                        {null, null, null, null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null},
                        {null, null, null,null, null, null}





                },
                new String[]{
                        "Nombre","Apellido","Trabajo","Posicion","Salario","TIempo"
                }
        ));
        scrollPane = new JScrollPane(tabla_solicitudes);
        scrollPane.setViewportView(tabla_solicitudes);
        scrollPane.setBounds(20,200,800,330);
        getContentPane().add(scrollPane);

        bt_cerrar = new JButton("Cerrar");
        bt_cerrar.setBounds(30,590,100,30);
        bt_cerrar.setFont(new Font("Andale Mono",3,14));
        bt_cerrar.setForeground(new Color(0,0,0));
        bt_cerrar.addActionListener(this);
        add(bt_cerrar);

        bt_imprimir_registros = new JButton("Imprimir registros");
        bt_imprimir_registros.setBounds(660,590,200,30);
        bt_imprimir_registros.setFont(new Font("Andale Mono",3,14));
        bt_imprimir_registros.setForeground(new Color(0,0,0));
        bt_imprimir_registros.addActionListener(this);
        add(bt_imprimir_registros);




       panelTabla = new JPanel();
       panelTabla.setLayout(null);
       panelTabla.setBounds(20,40,850,600);
       panelTabla.setBackground(new Color(255,255,255));
       panelTabla.add(label_buscarPor);
       panelTabla.add(bt_buscar);
       panelTabla.add(txt_buscarPor);
       panelTabla.add(box_referencia);
       panelTabla.add(label_solicitudes);
       panelTabla.add(label_orden);
       panelTabla.add(label_estaus);
       panelTabla.add(box_orden);
       panelTabla.add(box_estatus);
       panelTabla.add(scrollPane);

       add(panelTabla);




    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== bt_buscar){
           JOptionPane.showMessageDialog(null,"Buscanado registro...");
        }
        if(e.getSource()== bt_cerrar){
            JOptionPane.showMessageDialog(null,"Cerrando registro...");
            this.dispose();
        }
        if(e.getSource()== bt_imprimir_registros){
            JOptionPane.showMessageDialog(null,"Imprimiendo registro...");
        }

    }

    public static void main(String[] args) {
            new GenerarPrestamo().setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
