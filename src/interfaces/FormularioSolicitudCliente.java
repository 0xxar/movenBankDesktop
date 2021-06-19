package interfaces;

import logica.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 *En esta el usuario podra realizar la solicitud de un prestamo por medio del formulario,
 * el usuario debe completar todos los campos para poder enviar su informacion para que los encargado puedas validar sus datos.
 **/
public class FormularioSolicitudCliente extends JFrame implements ActionListener {

    JButton bt_enviarSolicitud, bt_cancelar;
    JComboBox box_razonPrestamo,box_actividadTrabajo,box_nivelEstudio;
    JTextField txt_lugarTrabajo,txt_direccionTrabajo,txt_salario,txt_fechaEntradaTrabjo,
            txt_ContactoReferencia,txt_nombreReferncia,txt_nombre,txt_apellido,
            txt_residencia,txt_email,txt_nacimiento;
    JLabel label_lugarTrabajo,label_direccionTrabajo,label_salario,label_fechaEntradaTrabajo,label_nombreReferencia,label_contactoReferencia,label_nombre,label_apellido,
            label_nivelEstudio,label_residencia,label_email,label_nacimiento,label_razonPrestamo,label_ActividadTrabajo;

   public FormularioSolicitudCliente(){
       setLayout(null);
       setSize(700,700);
       setResizable(false);
       setLocationRelativeTo(null);
       setTitle("Solicitar prestamo");

       getContentPane().setBackground(new Color(0,0,0));
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       initComponents();






   }
    private void initComponents(){

        label_nombre = new JLabel("Introducir nombre");
        label_nombre.setBounds(50,20,200,40);
        label_nombre.setFont(new Font("Andale Mono",3,14));
        label_nombre.setForeground(new Color(255,255,255));
        add(label_nombre);

        txt_nombre = new JTextField();
        txt_nombre.setBounds(30,60,200,40);
        txt_nombre.setBackground(new Color(255,255,255));
        txt_nombre.setFont(new Font("Andale Mono",3,14));
        txt_nombre.setForeground(new Color(0,0,0));
        txt_nombre.setHorizontalAlignment(JTextField.CENTER);
        add(txt_nombre);

        label_apellido = new JLabel("Introducir apellido");
        label_apellido.setBounds(330,20,200,40);
        label_apellido.setFont(new Font("Andale Mono",3,14));
        label_apellido.setForeground(new Color(255,255,255));
        add(label_apellido);

        txt_apellido = new JTextField();
        txt_apellido.setBounds(300,60,200,40);
        txt_apellido.setBackground(new Color(255,255,255));
        txt_apellido.setFont(new Font("Andale Mono",3,14));
        txt_apellido.setForeground(new Color(0,0,0));
        txt_apellido.setHorizontalAlignment(JTextField.CENTER);
        add(txt_apellido);

        label_nacimiento = new JLabel("Introducir fecha de nacimiento");
        label_nacimiento.setBounds(25,110,250,40);
        label_nacimiento.setFont(new Font("Andale Mono",3,14));
        label_nacimiento.setForeground(new Color(255,255,255));
        add(label_nacimiento);

        txt_nacimiento = new JTextField("YYYY/MM/DD");
        txt_nacimiento.setBounds(30,150,200,40);
        txt_nacimiento.setBackground(new Color(255,255,255));
        txt_nacimiento.setFont(new Font("Andale Mono",3,14));
        txt_nacimiento.setForeground(new Color(0,0,0));
        txt_nacimiento.setHorizontalAlignment(JTextField.CENTER);
        add(txt_nacimiento);

        label_email = new JLabel("Introducir correo electronico");
        label_email.setBounds(300,110,200,40);
        label_email.setFont(new Font("Andale Mono",3,14));
        label_email.setForeground(new Color(255,255,255));
        add(label_email);

        txt_email = new JTextField("example@mail.com");
        txt_email.setBounds(300,150,200,40);
        txt_email.setBackground(new Color(255,255,255));
        txt_email.setFont(new Font("Andale Mono",3,14));
        txt_email.setForeground(new Color(0,0,0));
        txt_email.setHorizontalAlignment(JTextField.CENTER);
        add(txt_email);

        label_residencia = new JLabel("Introducir direccion residencial");
        label_residencia.setBounds(30,200,250,40);
        label_residencia.setFont(new Font("Andale Mono",3,14));
        label_residencia.setForeground(new Color(255,255,255));
        add(label_residencia);

        txt_residencia = new JTextField();
        txt_residencia.setBounds(30,240,200,40);
        txt_residencia.setBackground(new Color(255,255,255));
        txt_residencia.setFont(new Font("Andale Mono",3,14));
        txt_residencia.setForeground(new Color(0,0,0));
        txt_residencia.setHorizontalAlignment(JTextField.CENTER);
        add(txt_residencia);

        label_nivelEstudio = new JLabel("Seleccione nivel de estudio");
        label_nivelEstudio.setBounds(300,200,250,40);
        label_nivelEstudio.setFont(new Font("Andale Mono",3,14));
        label_nivelEstudio.setForeground(new Color(255,255,255));
        add(label_nivelEstudio);

        box_nivelEstudio = new JComboBox();
        box_nivelEstudio.setBounds(300,240,200,40);
        box_nivelEstudio.setBackground(new Color(255,255,255));
        box_nivelEstudio.setFont(new Font("Andale Mono",3,14));
        box_nivelEstudio.setForeground(new Color(0,0,0));
        box_nivelEstudio.addItem("None");
        box_nivelEstudio.addItem("Primaria");
        box_nivelEstudio.addItem("Secundaria");
        box_nivelEstudio.addItem("Universidad");
        add(box_nivelEstudio);

        label_lugarTrabajo = new JLabel("Introducir nombre de la empresa:");
        label_lugarTrabajo.setBounds(30,280,250,40);
        label_lugarTrabajo.setFont(new Font("Andale Mono",3,14));
        label_lugarTrabajo.setForeground(new Color(255,255,255));
        add(label_lugarTrabajo);

        txt_lugarTrabajo = new JTextField();
        txt_lugarTrabajo.setBounds(30,320,200,40);
        txt_lugarTrabajo.setBackground(new Color(255,255,255));
        txt_lugarTrabajo.setFont(new Font("Andale Mono",3,14));
        txt_lugarTrabajo.setForeground(new Color(0,0,0));
        txt_lugarTrabajo.setHorizontalAlignment(JTextField.CENTER);
        add(txt_lugarTrabajo);

        label_direccionTrabajo = new JLabel("Introducir direccion de la empresa:");
        label_direccionTrabajo.setBounds(300,280,250,40);
        label_direccionTrabajo.setFont(new Font("Andale Mono",3,14));
        label_direccionTrabajo.setForeground(new Color(255,255,255));
        add(label_direccionTrabajo);

        txt_direccionTrabajo = new JTextField();
        txt_direccionTrabajo.setBounds(300,320,250,40);
        txt_direccionTrabajo.setBackground(new Color(255,255,255));
        txt_direccionTrabajo.setFont(new Font("Andale Mono",3,14));
        txt_direccionTrabajo.setForeground(new Color(0,0,0));
        txt_direccionTrabajo.setHorizontalAlignment(JTextField.CENTER);
        add(txt_direccionTrabajo);

        label_ActividadTrabajo = new JLabel("Seleccione actividad de la empresa");
        label_ActividadTrabajo.setBounds(30,360,250,40);
        label_ActividadTrabajo.setFont(new Font("Andale Mono",3,14));
        label_ActividadTrabajo.setForeground(new Color(255,255,255));
        add(label_ActividadTrabajo);

        box_actividadTrabajo = new JComboBox();
        box_actividadTrabajo.setBounds(30,400,200,40);
        box_actividadTrabajo.setBackground(new Color(255,255,255));
        box_actividadTrabajo.setFont(new Font("Andale Mono",3,14));
        box_actividadTrabajo.setForeground(new Color(0,0,0));
        box_actividadTrabajo.addItem("None");
        box_actividadTrabajo.addItem("Primaria");
        box_actividadTrabajo.addItem("Secundaria");
        box_actividadTrabajo.addItem("Universidad");
        add(box_actividadTrabajo);

        label_fechaEntradaTrabajo = new JLabel("fecha de entrada a la empresa");
        label_fechaEntradaTrabajo.setBounds(300,360,250,40);
        label_fechaEntradaTrabajo.setFont(new Font("Andale Mono",3,14));
        label_fechaEntradaTrabajo.setForeground(new Color(255,255,255));
        add(label_fechaEntradaTrabajo);

        txt_fechaEntradaTrabjo = new JTextField("YYYY/MM/DD");
        txt_fechaEntradaTrabjo.setBounds(300,400,200,40);
        txt_fechaEntradaTrabjo.setBackground(new Color(255,255,255));
        txt_fechaEntradaTrabjo.setFont(new Font("Andale Mono",3,14));
        txt_fechaEntradaTrabjo.setForeground(new Color(0,0,0));
        txt_fechaEntradaTrabjo.setHorizontalAlignment(JTextField.CENTER);
        add(txt_fechaEntradaTrabjo);

        label_salario = new JLabel("Introducir salario B/.");
        label_salario.setBounds(30,440,250,40);
        label_salario.setFont(new Font("Andale Mono",3,14));
        label_salario.setForeground(new Color(255,255,255));
        add(label_salario);

        txt_salario = new JTextField();
        txt_salario.setBounds(30,480,200,40);
        txt_salario.setBackground(new Color(255,255,255));
        txt_salario.setFont(new Font("Andale Mono",3,14));
        txt_salario.setForeground(new Color(0,0,0));
        txt_salario.setHorizontalAlignment(JTextField.CENTER);
        add(txt_salario);

        label_razonPrestamo = new JLabel("Seleccione razon del prestamo");
        label_razonPrestamo.setBounds(300,440,250,40);
        label_razonPrestamo.setFont(new Font("Andale Mono",3,14));
        label_razonPrestamo.setForeground(new Color(255,255,255));
        add(label_razonPrestamo);

        box_razonPrestamo = new JComboBox();
        box_razonPrestamo.setBounds(300,480,200,40);
        box_razonPrestamo.setBackground(new Color(255,255,255));
        box_razonPrestamo.setFont(new Font("Andale Mono",3,14));
        box_razonPrestamo.setForeground(new Color(0,0,0));
        box_razonPrestamo.addItem("None");
        box_razonPrestamo.addItem("Primaria");
        box_razonPrestamo.addItem("Secundaria");
        box_razonPrestamo.addItem("Universidad");
        add(box_razonPrestamo);

        label_nombreReferencia = new JLabel("Introducir nombre de referencia");
        label_nombreReferencia.setBounds(30,520,250,40);
        label_nombreReferencia.setFont(new Font("Andale Mono",3,14));
        label_nombreReferencia.setForeground(new Color(255,255,255));
        add(label_nombreReferencia);

        txt_nombreReferncia = new JTextField();
        txt_nombreReferncia.setBounds(30,560,200,40);
        txt_nombreReferncia.setBackground(new Color(255,255,255));
        txt_nombreReferncia.setFont(new Font("Andale Mono",3,14));
        txt_nombreReferncia.setForeground(new Color(0,0,0));
        txt_nombreReferncia.setHorizontalAlignment(JTextField.CENTER);
        add(txt_nombreReferncia);

        label_contactoReferencia = new JLabel("Introducir contacto de referencia");
        label_contactoReferencia.setBounds(300,520,250,40);
        label_contactoReferencia.setFont(new Font("Andale Mono",3,14));
        label_contactoReferencia.setForeground(new Color(255,255,255));
        add(label_contactoReferencia);

        txt_ContactoReferencia = new JTextField();
        txt_ContactoReferencia.setBounds(300,560,200,40);
        txt_ContactoReferencia.setBackground(new Color(255,255,255));
        txt_ContactoReferencia.setFont(new Font("Andale Mono",3,14));
        txt_ContactoReferencia.setForeground(new Color(0,0,0));
        txt_ContactoReferencia.setHorizontalAlignment(JTextField.CENTER);
        add(txt_ContactoReferencia);

        bt_cancelar = new JButton("Cancelar");
        bt_cancelar.setBounds(40,610,100,40);
        bt_cancelar.setBackground(new Color(255,255,255));
        bt_cancelar.setForeground(new Color(0,0,0));
        bt_cancelar.setFont(new Font("Andale Mono",1,14));
        bt_cancelar.addActionListener(this);
        add(bt_cancelar);

        bt_enviarSolicitud = new JButton("Enviar");
        bt_enviarSolicitud.setBounds(520,610,100,40);
        bt_enviarSolicitud.setBackground(new Color(255,255,255));
        bt_enviarSolicitud.setForeground(new Color(0,0,0));
        bt_enviarSolicitud.setFont(new Font("Andale Mono",1,14));
        bt_enviarSolicitud.addActionListener(this);
        add(bt_enviarSolicitud);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

       if(e.getSource() == bt_enviarSolicitud){
           JOptionPane.showMessageDialog(null,"Solictud enviada!!!");


       }

       if(e.getSource() == bt_cancelar){
           this.dispose();
       }

    }

    public static void main(String[] args) {
        new FormularioSolicitudCliente().setVisible(true);
    }
}
