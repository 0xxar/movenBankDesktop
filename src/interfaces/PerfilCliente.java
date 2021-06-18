package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerfilCliente extends JFrame implements ActionListener {

    JLabel label_name,label_apellido,label_lugarTrabajo,label_cellphone,label_LugarResid,label_gender,label_nacimiento,label_nacionalidad,label_email,label_cedula;
    JTextField txt_nombre,txt_apellido,txt_trabajo,txt_cellPhone,txt_residencia,txt_nacioladidad,txt_email,txt_cedula,txt_naciemiento;
    JComboBox boxGender;
    JButton bt_registrar_cliente, bt_cancelar;
    public PerfilCliente(){
        setLayout(null);
        setSize(600,700);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Register Client");

        getContentPane().setBackground(new Color(0,0,0));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label_name = new JLabel("Ingrese primer y segundo nombre:");
        label_name.setBounds(10,60,250,50);
        label_name.setForeground(new Color(255,255,255));
        label_name.setFont(new Font("Andale Mono",3,14));
        label_name.setHorizontalAlignment(JLabel.CENTER);
        add(label_name);

        txt_nombre = new JTextField("");
        txt_nombre.setBounds(30,110,200,40);
        txt_nombre.setForeground(new Color(0,0,0));
        txt_nombre.setFont(new Font("Andale Mono",3,16));
        txt_nombre.setHorizontalAlignment(JLabel.CENTER);
        txt_nombre.setBackground(new Color(255,255,255));
        add(txt_nombre);

        label_apellido = new JLabel("Ingrese primer y segundo apellido:");
        label_apellido.setBounds(300,60,250,50);
        label_apellido.setForeground(new Color(255,255,255));
        label_apellido.setFont(new Font("Andale Mono",3,14));
        label_apellido.setHorizontalAlignment(JLabel.CENTER);
        add(label_apellido);

        txt_apellido = new JTextField("");
        txt_apellido.setBounds(330,110,200,40);
        txt_apellido.setForeground(new Color(0,0,0));
        txt_apellido.setFont(new Font("Andale Mono",3,16));
        txt_apellido.setHorizontalAlignment(JLabel.CENTER);
        txt_apellido.setBackground(new Color(255,255,255));
        add(txt_apellido);

        label_cedula = new JLabel("Ingrese cedula o indenficacion:");
        label_cedula.setBounds(10,160,250,50);
        label_cedula.setForeground(new Color(255,255,255));
        label_cedula.setFont(new Font("Andale Mono",3,14));
        label_cedula.setHorizontalAlignment(JLabel.CENTER);
        add(label_cedula);

        txt_cedula = new JTextField("");
        txt_cedula.setBounds(30,210,200,40);
        txt_cedula.setForeground(new Color(0,0,0));
        txt_cedula.setFont(new Font("Andale Mono",3,16));
        txt_cedula.setHorizontalAlignment(JLabel.CENTER);
        txt_cedula.setBackground(new Color(255,255,255));
        add(txt_cedula);

        label_nacionalidad = new JLabel("Ingrese nacionalidad:");
        label_nacionalidad.setBounds(300,160,250,50);
        label_nacionalidad.setForeground(new Color(255,255,255));
        label_nacionalidad.setFont(new Font("Andale Mono",3,14));
        label_nacionalidad.setHorizontalAlignment(JLabel.CENTER);
        add(label_nacionalidad);

        txt_nacioladidad = new JTextField("");
        txt_nacioladidad.setBounds(330,210,200,40);
        txt_nacioladidad.setForeground(new Color(0,0,0));
        txt_nacioladidad.setFont(new Font("Andale Mono",3,16));
        txt_nacioladidad.setHorizontalAlignment(JLabel.CENTER);
        txt_nacioladidad.setBackground(new Color(255,255,255));
        add(txt_nacioladidad);

        label_lugarTrabajo = new JLabel("Ingrese lugar de trabajo:");
        label_lugarTrabajo.setBounds(300,260,250,50);
        label_lugarTrabajo.setForeground(new Color(255,255,255));
        label_lugarTrabajo.setFont(new Font("Andale Mono",3,14));
        label_lugarTrabajo.setHorizontalAlignment(JLabel.CENTER);
        add(label_lugarTrabajo);

        txt_trabajo = new JTextField("");
        txt_trabajo.setBounds(310,310,250,40);
        txt_trabajo.setForeground(new Color(0,0,0));
        txt_trabajo.setFont(new Font("Andale Mono",3,16));
        txt_trabajo.setHorizontalAlignment(JLabel.CENTER);
        txt_trabajo.setBackground(new Color(255,255,255));
        add(txt_trabajo);

        label_LugarResid = new JLabel("Ingrese lugar de residencia:");
        label_LugarResid.setBounds(10,260,250,50);
        label_LugarResid.setForeground(new Color(255,255,255));
        label_LugarResid.setFont(new Font("Andale Mono",3,14));
        label_LugarResid.setHorizontalAlignment(JLabel.CENTER);
        add(label_LugarResid);

        txt_residencia = new JTextField("");
        txt_residencia.setBounds(20,310,250,40);
        txt_residencia.setForeground(new Color(0,0,0));
        txt_residencia.setFont(new Font("Andale Mono",3,16));
        txt_residencia.setHorizontalAlignment(JLabel.CENTER);
        txt_residencia.setBackground(new Color(255,255,255));
        add(txt_residencia);

        label_cellphone = new JLabel("Ingrese numero de telefono:");
        label_cellphone.setBounds(10,360,250,50);
        label_cellphone.setForeground(new Color(255,255,255));
        label_cellphone.setFont(new Font("Andale Mono",3,14));
        label_cellphone.setHorizontalAlignment(JLabel.CENTER);
        add(label_cellphone);

        txt_cellPhone = new JTextField("");
        txt_cellPhone.setBounds(30,410,200,40);
        txt_cellPhone.setForeground(new Color(0,0,0));
        txt_cellPhone.setFont(new Font("Andale Mono",3,16));
        txt_cellPhone.setHorizontalAlignment(JLabel.CENTER);
        txt_cellPhone.setBackground(new Color(255,255,255));
        add(txt_cellPhone);

        label_email = new JLabel("Ingrese Correo electronico:");
        label_email.setBounds(300,360,250,50);
        label_email.setForeground(new Color(255,255,255));
        label_email.setFont(new Font("Andale Mono",3,14));
        label_email.setHorizontalAlignment(JLabel.CENTER);
        add(label_email);

        txt_email = new JTextField("");
        txt_email.setBounds(330,410,200,40);
        txt_email.setForeground(new Color(0,0,0));
        txt_email.setFont(new Font("Andale Mono",3,16));
        txt_email.setHorizontalAlignment(JLabel.CENTER);
        txt_email.setBackground(new Color(255,255,255));
        add(txt_email);

        label_gender = new JLabel("Seleccione Genero:");
        label_gender.setBounds(10,460,250,50);
        label_gender.setForeground(new Color(255,255,255));
        label_gender.setFont(new Font("Andale Mono",3,14));
        label_gender.setHorizontalAlignment(JLabel.CENTER);
        add(label_gender);

        boxGender = new JComboBox();
        boxGender.setBounds(30,510,200,40);
        boxGender.setForeground(new Color(0,0,0));
        boxGender.setFont(new Font("Andale Mono",3,16));
        boxGender.setBackground(new Color(255,255,255));
        boxGender.addItem("None");
        boxGender.addItem("Femenine");
        boxGender.addItem("Masculine");
        boxGender.addItem("Other");
        add(boxGender);

        label_nacimiento = new JLabel("Ingrese fecha de nacimiento:");
        label_nacimiento.setBounds(300,460,250,50);
        label_nacimiento.setForeground(new Color(255,255,255));
        label_nacimiento.setFont(new Font("Andale Mono",3,14));
        label_nacimiento.setHorizontalAlignment(JLabel.CENTER);
        add(label_nacimiento);

        txt_naciemiento = new JTextField("yyyy/mm/dd");
        txt_naciemiento.setBounds(330,510,200,40);
        txt_naciemiento.setForeground(new Color(0,0,0));
        txt_naciemiento.setFont(new Font("Andale Mono",3,16));
        txt_naciemiento.setHorizontalAlignment(JLabel.CENTER);
        txt_naciemiento.setBackground(new Color(255,255,255));
        add(txt_naciemiento);

        bt_registrar_cliente = new JButton("Registrar");
        bt_registrar_cliente.setBounds(330,590,150,40);
        bt_registrar_cliente.setBackground(new Color(255,255,255));
        bt_registrar_cliente.setForeground(new Color(0,0,0));
        bt_registrar_cliente.setFont(new Font("Andale Mono",3,14));
        bt_registrar_cliente.addActionListener(this);
        add(bt_registrar_cliente);

        bt_cancelar = new JButton("Cancelar");
        bt_cancelar.setBounds(40,590,150,40);
        bt_cancelar.setBackground(new Color(255,255,255));
        bt_cancelar.setForeground(new Color(0,0,0));
        bt_cancelar.setFont(new Font("Andale Mono",3,14));
        bt_cancelar.addActionListener(this);
        add(bt_cancelar);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new PerfilCliente().setVisible(true);
    }
}
