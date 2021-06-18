package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SolicitudPrestamoCliente extends JFrame implements ActionListener {
    JTextField txt_nombre,txt_apellido,txt_cedula,txt_nacionalidad,txt_genero,txt_edad,txt_nacimiento,txt_email,txt_celular,txt_lugarTrabajo,
            txt_salario,txt_tiempoLaborando,txt_direccionVivienda,txt_direccionTrabajo,txt_nivelEndeudamiento,txt_MontoSolicitado,txt_puestoTrabajo,
            txt_actividadEmpresa,txt_fechaEntradaTrabjo;
    JLabel lbl_nombre,lbl_apellido,lbl_cedula,lbl_nacionalidad,lbl_genero,lbl_edad,lbl_nacimiento,
            lbl_email,lbl_telefono,lbl_lugarTrabajo,lbl_puestoTrabajo,lbl_salario,lbl_tiempoLaborando,lbl_direccionTrabajo,lbl_direccionResidencia,
            lbl_nivelEndeudamiento,lbl_actividadEmpresa,lbl_montoSolicitado,lbl_datosPersonales,lbl_datosLaborales,lbl_datosMonto,lbl_motivoPrestamo,
            lbl_estatusPrestamo;
    JComboBox box_razonPrestamo,box_actividadTrabajo,box_nivelEstudio;
    JSeparator separatorVertical,separatorHorizontal,separatorHorizontalII;
    JButton bt_enivar,bt_cerrar,bt_referencia;

    public SolicitudPrestamoCliente(){


        setLayout(null);
        setSize(900,670);
        setResizable(false);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(0,0,0));
        setIconImage(new ImageIcon(getClass().getResource("/images/bank.png")).getImage());

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        lbl_datosPersonales = new JLabel("Datos Personales");
        lbl_datosPersonales.setBounds(120,4,250,50);
        lbl_datosPersonales.setFont(new Font("Andale Mono",1,18));
        lbl_datosPersonales.setForeground(new Color(0,233,0));
        add(lbl_datosPersonales);
        //******************************************************
        lbl_nombre = new JLabel("Nombres");
        lbl_nombre.setBounds(20,30,100,40);
        lbl_nombre.setFont(new Font("Andale Mono",3,12));
        lbl_nombre.setForeground(new Color(0,233,0));
        lbl_nombre.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nombre);

        txt_nombre = new JTextField("Oscar Isaac");
        txt_nombre.setBounds(20,60,150,40);
        txt_nombre.setFont(new Font("Andale Mono",3,16));
        txt_nombre.setHorizontalAlignment(JTextField.CENTER);
        txt_nombre.setForeground(new Color(0,0,0));
        txt_nombre.setEditable(false);
        add(txt_nombre);

        lbl_apellido = new JLabel("Apellidos");
        lbl_apellido.setBounds(260,30,100,40);
        lbl_apellido.setFont(new Font("Andale Mono",3,12));
        lbl_apellido.setForeground(new Color(0,233,0));
        lbl_apellido.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_apellido);

        txt_apellido = new JTextField("Oscar Isaac");
        txt_apellido.setBounds(240,60,150,40);
        txt_apellido.setFont(new Font("Andale Mono",3,16));
        txt_apellido.setHorizontalAlignment(JTextField.CENTER);
        txt_apellido.setForeground(new Color(0,0,0));
        txt_apellido.setEditable(false);
        add(txt_apellido);
        //***************************************************************
        lbl_cedula = new JLabel("Cedula de indentidad");
        lbl_cedula.setBounds(20,100,150,40);
        lbl_cedula.setFont(new Font("Andale Mono",3,12));
        lbl_cedula.setForeground(new Color(255,244,0));
        lbl_cedula.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_cedula);

        txt_cedula = new JTextField("X-XXXX-XXXX");
        txt_cedula.setBounds(20,130,150,40);
        txt_cedula.setFont(new Font("Andale Mono",3,16));
        txt_cedula.setHorizontalAlignment(JTextField.CENTER);
        txt_cedula.setForeground(new Color(0,0,0));
        txt_cedula.setEditable(false);
        add(txt_cedula);

        lbl_nacionalidad = new JLabel("Nacionalidad");
        lbl_nacionalidad.setBounds(240,100,100,40);
        lbl_nacionalidad.setFont(new Font("Andale Mono",3,12));
        lbl_nacionalidad.setForeground(new Color(0,233,0));
        lbl_nacionalidad.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nacionalidad);

        txt_nacionalidad = new JTextField("Panamena");
        txt_nacionalidad.setBounds(240,130,150,40);
        txt_nacionalidad.setFont(new Font("Andale Mono",3,16));
        txt_nacionalidad.setHorizontalAlignment(JTextField.CENTER);
        txt_nacionalidad.setForeground(new Color(0,0,0));
        txt_nacionalidad.setEditable(false);
        add(txt_nacionalidad);
        //****************************************************************
        lbl_genero = new JLabel("Genero");
        lbl_genero.setBounds(40,180,100,40);
        lbl_genero.setFont(new Font("Andale Mono",3,12));
        lbl_genero.setForeground(new Color(0,244,0));
        lbl_genero.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_genero);

        txt_genero = new JTextField("Masculino");
        txt_genero.setBounds(20,210,150,40);
        txt_genero.setFont(new Font("Andale Mono",3,16));
        txt_genero.setHorizontalAlignment(JTextField.CENTER);
        txt_genero.setForeground(new Color(0,0,0));
        txt_genero.setEditable(false);
        add(txt_genero);

        lbl_nacimiento = new JLabel("Cumpleanos");
        lbl_nacimiento.setBounds(260,180,100,40);
        lbl_nacimiento.setFont(new Font("Andale Mono",3,12));
        lbl_nacimiento.setForeground(new Color(0,233,0));
        lbl_nacimiento.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nacimiento);

        txt_nacimiento = new JTextField("4 de mayo 1988");
        txt_nacimiento.setBounds(240,210,150,40);
        txt_nacimiento.setFont(new Font("Andale Mono",3,16));
        txt_nacimiento.setHorizontalAlignment(JTextField.CENTER);
        txt_nacimiento.setForeground(new Color(0,0,0));
        txt_nacimiento.setEditable(false);
        add(txt_nacimiento);
        //****************************************************************
        lbl_edad = new JLabel("Edad");
        lbl_edad.setBounds(40,260,100,40);
        lbl_edad.setFont(new Font("Andale Mono",3,12));
        lbl_edad.setForeground(new Color(0,233,0));
        lbl_edad.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_edad);

        txt_edad = new JTextField(" 32");
        txt_edad.setBounds(20,290,150,40);
        txt_edad.setFont(new Font("Andale Mono",3,16));
        txt_edad.setHorizontalAlignment(JTextField.CENTER);
        txt_edad.setForeground(new Color(0,0,0));
        txt_edad.setEditable(false);
        add(txt_edad);

        lbl_email = new JLabel("Email");
        lbl_email.setBounds(260,260,100,40);
        lbl_email.setFont(new Font("Andale Mono",3,12));
        lbl_email.setForeground(new Color(0,233,0));
        lbl_email.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_email);

        txt_email = new JTextField("Oscar@mail.com");
        txt_email.setBounds(240,290,150,40);
        txt_email.setFont(new Font("Andale Mono",3,16));
        txt_email.setHorizontalAlignment(JTextField.CENTER);
        txt_email.setForeground(new Color(0,0,0));
        txt_email.setEditable(false);
        add(txt_email);
        //************************************************************
        lbl_telefono = new JLabel("Telefono");
        lbl_telefono.setBounds(40,350,100,40);
        lbl_telefono.setFont(new Font("Andale Mono",3,12));
        lbl_telefono.setForeground(new Color(0,233,0));
        lbl_telefono.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_telefono);

        txt_celular = new JTextField("(507)XXXX-XXXX");
        txt_celular.setBounds(20,380,150,40);
        txt_celular.setFont(new Font("Andale Mono",3,16));
        txt_celular.setHorizontalAlignment(JTextField.CENTER);
        txt_celular.setForeground(new Color(0,0,0));
        txt_celular.setEditable(false);
        add(txt_celular);

        lbl_direccionResidencia = new JLabel("Direccion residencial");
        lbl_direccionResidencia.setBounds(240,350,200,40);
        lbl_direccionResidencia.setFont(new Font("Andale Mono",3,12));
        lbl_direccionResidencia.setForeground(new Color(0,233,0));
        lbl_direccionResidencia.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_direccionResidencia);

        txt_direccionVivienda = new JTextField("Panama,City Panama, calle 23");
        txt_direccionVivienda.setBounds(240,380,200,40);
        txt_direccionVivienda.setFont(new Font("Andale Mono",3,16));
        txt_direccionVivienda.setHorizontalAlignment(JTextField.CENTER);
        txt_direccionVivienda.setForeground(new Color(0,0,0));
        txt_direccionVivienda.setEditable(false);
        add(txt_direccionVivienda);
        //*********************************************************************
        separatorVertical = new JSeparator();
        separatorVertical.setOrientation(SwingConstants.VERTICAL);
        separatorVertical.setBounds(460,30,20,480);
        separatorVertical.setFont(new Font("Andale Mono",1,14));
        add(separatorVertical);
        //*************************************************************************
        //Datos laborales

        lbl_datosLaborales = new JLabel("Datos laborales");
        lbl_datosLaborales.setBounds(600,4,250,50);
        lbl_datosLaborales.setFont(new Font("Andale Mono",1,18));
        lbl_datosLaborales.setForeground(new Color(0,233,0));
        add(lbl_datosLaborales);

        lbl_lugarTrabajo = new JLabel("Nombre de empresa");
        lbl_lugarTrabajo.setBounds(450,30,250,40);
        lbl_lugarTrabajo.setFont(new Font("Andale Mono",3,12));
        lbl_lugarTrabajo.setForeground(new Color(0,233,0));
        lbl_lugarTrabajo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_lugarTrabajo);

        txt_lugarTrabajo = new JTextField("Oscar Isaac");
        txt_lugarTrabajo.setBounds(500,60,150,40);
        txt_lugarTrabajo.setFont(new Font("Andale Mono",3,16));
        txt_lugarTrabajo.setHorizontalAlignment(JTextField.CENTER);
        txt_lugarTrabajo.setForeground(new Color(0,0,0));
        txt_lugarTrabajo.setEditable(false);
        add(txt_lugarTrabajo);

        lbl_direccionTrabajo = new JLabel("Direccion de empresa");
        lbl_direccionTrabajo.setBounds(700,30,200,40);
        lbl_direccionTrabajo.setFont(new Font("Andale Mono",3,12));
        lbl_direccionTrabajo.setForeground(new Color(0,233,0));
        lbl_direccionTrabajo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_direccionTrabajo);

        txt_direccionTrabajo = new JTextField("Oscar Isaac");
        txt_direccionTrabajo.setBounds(720,60,150,40);
        txt_direccionTrabajo.setFont(new Font("Andale Mono",3,12));
        txt_direccionTrabajo.setHorizontalAlignment(JTextField.CENTER);
        txt_direccionTrabajo.setForeground(new Color(0,0,0));
        txt_direccionTrabajo.setEditable(false);
        add(txt_direccionTrabajo);

        lbl_puestoTrabajo = new JLabel("Puesto de trabajo");
        lbl_puestoTrabajo.setBounds(500,110,150,40);
        lbl_puestoTrabajo.setFont(new Font("Andale Mono",3,12));
        lbl_puestoTrabajo.setForeground(new Color(0,233,0));
        lbl_puestoTrabajo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_puestoTrabajo);

        txt_puestoTrabajo = new JTextField("Gerente de tienda");
        txt_puestoTrabajo.setBounds(500,140,150,40);
        txt_puestoTrabajo.setFont(new Font("Andale Mono",3,16));
        txt_puestoTrabajo.setHorizontalAlignment(JTextField.CENTER);
        txt_puestoTrabajo.setForeground(new Color(0,0,0));
        txt_puestoTrabajo.setEditable(false);
        add(txt_puestoTrabajo);

        lbl_tiempoLaborando = new JLabel("Tiempo laborando");
        lbl_tiempoLaborando.setBounds(700,110,200,40);
        lbl_tiempoLaborando.setFont(new Font("Andale Mono",3,12));
        lbl_tiempoLaborando.setForeground(new Color(0,233,0));
        lbl_tiempoLaborando.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_tiempoLaborando);

        txt_tiempoLaborando = new JTextField("12 meses");
        txt_tiempoLaborando.setBounds(720,140,150,40);
        txt_tiempoLaborando.setFont(new Font("Andale Mono",3,16));
        txt_tiempoLaborando.setHorizontalAlignment(JTextField.CENTER);
        txt_tiempoLaborando.setForeground(new Color(0,0,0));
        txt_tiempoLaborando.setEditable(false);
        add(txt_tiempoLaborando);

        lbl_salario = new JLabel("Salario mensual");
        lbl_salario.setBounds(500,190,150,40);
        lbl_salario.setFont(new Font("Andale Mono",3,12));
        lbl_salario.setForeground(new Color(0,233,0));
        lbl_salario.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_salario);

        txt_salario = new JTextField("B/.1800.00");
        txt_salario.setBounds(500,220,150,40);
        txt_salario.setFont(new Font("Andale Mono",3,16));
        txt_salario.setHorizontalAlignment(JTextField.CENTER);
        txt_salario.setForeground(new Color(0,0,0));
        txt_salario.setEditable(false);
        add(txt_salario);

        lbl_nivelEndeudamiento = new JLabel("Nivel de endeudamiento %");
        lbl_nivelEndeudamiento.setBounds(700,190,200,40);
        lbl_nivelEndeudamiento.setFont(new Font("Andale Mono",3,12));
        lbl_nivelEndeudamiento.setForeground(new Color(0,233,0));
        lbl_nivelEndeudamiento.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nivelEndeudamiento);

        txt_nivelEndeudamiento = new JTextField("30.00 %");
        txt_nivelEndeudamiento.setBounds(720,220,150,40);
        txt_nivelEndeudamiento.setFont(new Font("Andale Mono",3,16));
        txt_nivelEndeudamiento.setHorizontalAlignment(JTextField.CENTER);
        txt_nivelEndeudamiento.setForeground(new Color(0,0,0));
        txt_nivelEndeudamiento.setEditable(false);
        add(txt_nivelEndeudamiento);

        lbl_actividadEmpresa = new JLabel("Actividad de la empresa");
        lbl_actividadEmpresa.setBounds(480,270,200,40);
        lbl_actividadEmpresa.setFont(new Font("Andale Mono",3,12));
        lbl_actividadEmpresa.setForeground(new Color(0,233,0));
        lbl_actividadEmpresa.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_actividadEmpresa);

        txt_actividadEmpresa = new JTextField("Entretenimiento");
        txt_actividadEmpresa.setBounds(500,300,150,40);
        txt_actividadEmpresa.setFont(new Font("Andale Mono",3,16));
        txt_actividadEmpresa.setHorizontalAlignment(JTextField.CENTER);
        txt_actividadEmpresa.setForeground(new Color(0,0,0));
        txt_actividadEmpresa.setEditable(false);
        add(txt_actividadEmpresa);

        //*********************************************************************
        separatorHorizontal = new JSeparator();
        separatorHorizontal.setOrientation(SwingConstants.HORIZONTAL);
        separatorHorizontal.setBounds(500,360,350,20);
        separatorHorizontal.setFont(new Font("Andale Mono",1,14));
        add(separatorHorizontal);
        //*************************************************************************

        lbl_datosMonto = new JLabel("Datos de prestamo");
        lbl_datosMonto.setBounds(600,360,250,50);
        lbl_datosMonto.setFont(new Font("Andale Mono",1,18));
        lbl_datosMonto.setForeground(new Color(0,233,0));
        add(lbl_datosMonto);

        lbl_montoSolicitado = new JLabel("Monto solicitado B/.");
        lbl_montoSolicitado.setBounds(480,390,200,40);
        lbl_montoSolicitado.setFont(new Font("Andale Mono",3,12));
        lbl_montoSolicitado.setForeground(new Color(0,233,0));
        lbl_montoSolicitado.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_montoSolicitado);

        txt_MontoSolicitado = new JTextField("3000.00");
        txt_MontoSolicitado.setBounds(500,420,150,40);
        txt_MontoSolicitado.setFont(new Font("Andale Mono",3,16));
        txt_MontoSolicitado.setHorizontalAlignment(JTextField.CENTER);
        txt_MontoSolicitado.setForeground(new Color(0,0,0));
        txt_MontoSolicitado.setEditable(false);
        add(txt_MontoSolicitado);

        lbl_motivoPrestamo = new JLabel("Motivo del prestamo solicitado");
        lbl_motivoPrestamo.setBounds(680,390,200,40);
        lbl_motivoPrestamo.setFont(new Font("Andale Mono",3,12));
        lbl_motivoPrestamo.setForeground(new Color(0,233,0));
        lbl_motivoPrestamo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_motivoPrestamo);

        /**box_razonPrestamo = new JTextField("Emprendimiento");
        txt_motivoPrestamo.setBounds(700,420,150,40);
        txt_motivoPrestamo.setFont(new Font("Andale Mono",3,16));
        txt_motivoPrestamo.setHorizontalAlignment(JTextField.CENTER);
        txt_motivoPrestamo.setForeground(new Color(0,0,0));
        txt_motivoPrestamo.setEditable(false);
        add(txt_motivoPrestamo);**/



        bt_enivar = new JButton("Siguiente");
        bt_enivar.setBounds(740,580,100,30);
        bt_enivar.setFont(new Font("Andale Mono",1,12));
        bt_enivar.setForeground(new Color(0,0,0));
        bt_enivar.setEnabled(false);
        bt_enivar.addActionListener(this);
        add(bt_enivar);

        bt_referencia = new JButton("Enviar referencia");
        bt_referencia.setBounds(500,580,180,30);
        bt_referencia.setFont(new Font("Andale Mono",1,12));
        bt_referencia.setForeground(new Color(0,0,0));
        bt_referencia.setEnabled(false);
        bt_referencia.addActionListener(this);
        add(bt_referencia);

        bt_cerrar = new JButton("Cerrar");
        bt_cerrar.setBounds(20,580,100,30);
        bt_cerrar.setFont(new Font("Andale Mono",1,12));
        bt_cerrar.setForeground(new Color(0,0,0));
        bt_cerrar.addActionListener(this);
        add(bt_cerrar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

        new SolicitudPrestamoCliente().setVisible(true);

    }
}
