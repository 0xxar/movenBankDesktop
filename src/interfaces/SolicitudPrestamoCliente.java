package interfaces;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SolicitudPrestamoCliente extends JFrame implements ActionListener {
    //TextField datos personales
    JTextField txt_nombre,txt_apellido,txt_cedula,txt_nacionalidad
            ,txt_edad,txt_nacimiento,txt_email,txt_celular, txt_direccionVivienda;
    //*******************************************************************************************************
    //TextField datos laborales
    JTextField txt_lugarTrabajo,txt_salario,txt_tiempoLaborando,txt_direccionTrabajo,txt_telefonoEmpresa,
            txt_puestoTrabajo;
    //********************************************************************************************************
    //TextField datos del prestamo
    JTextField txt_MontoSolicitado,txt_interesPrestamo,txt_tiempoAPagarPrestamo,txt_PagoCuotas;
    //***********************************************************************************************************
    //TextField datos referencia prestamo
    JTextField txt_nivelEndeudamiento,
            txt_nombreApellidoReferencia,txt_celularReferencia,txt_cedulaReferencia,txt_correoReferencia;
    //**********************************************************************************************************
    //Label datos personales
    JLabel lbl_nombre,lbl_apellido,lbl_cedula,lbl_nacionalidad,lbl_genero,lbl_edad,lbl_nacimiento,
            lbl_email,lbl_telefono,lbl_direccionResidencia,lbl_datosPersonales,
            lbl_estatusPrestamo, lbl_estadoCivil;
    //**************************************************************************************************************
    //Label datos laborales
    JLabel lbl_lugarTrabajo,lbl_puestoTrabajo,lbl_salario,lbl_tiempoLaborando,lbl_direccionTrabajo,
            lbl_telefonoEmpresa,lbl_actividadEmpresa,lbl_datosLaborales;
    //*************************************************************************************************
    //Label datos del prestamo
    JLabel lbl_interesPrestamo,lbl_tiempoAPagarPrestamo,lbl_PagoCuotas,lbl_datosMonto,lbl_motivoPrestamo,
            lbl_montoSolicitado;
    //**************************************************************************************************
    //Label datos referencia del presatmo
    JLabel lbl_nivelEndeudamiento,lbl_nombreApellidoReferencia,
            lbl_celularReferencia,lbl_cedulaReferencia,lbl_correoReferencia, lbl_parentesco,lbl_datosRefenciaPrestamo;
    //****************************************************************************************************************
    //Separadores
    JSeparator separatorVertical,separatorHorizontal,separatorHorizontalII,separatorReferenciaPrestamo;
    //****************************************************************************************************************
    //Botones
    JButton bt_enivar,bt_cerrar,bt_referencia;
    //***************************************************************************************************************
    JScrollPane scrollPane;


    JComboBox box_genero,box_estadoCivil,box_nivelEstudio;
    JComboBox box_parentesco;

    JComboBox box_motivoPrestamo;
    JComboBox box_actividadEmpresa;

    public SolicitudPrestamoCliente(){


        setLayout(null);
        setSize(900,670);
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();

        getContentPane().setBackground(new Color(0,0,0));
        setIconImage(new ImageIcon(getClass().getResource("/images/bank.png")).getImage());

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


    }

    private void initComponents(){

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
        txt_nombre.setBounds(20,60,120,30);
        txt_nombre.setFont(new Font("Andale Mono",3,12));
        txt_nombre.setHorizontalAlignment(JTextField.CENTER);
        txt_nombre.setForeground(new Color(0,0,0));
        txt_nombre.setEditable(true);
        add(txt_nombre);

        lbl_apellido = new JLabel("Apellidos");
        lbl_apellido.setBounds(160,30,100,40);
        lbl_apellido.setFont(new Font("Andale Mono",3,12));
        lbl_apellido.setForeground(new Color(0,233,0));
        lbl_apellido.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_apellido);

        txt_apellido = new JTextField("Oscar Isaac");
        txt_apellido.setBounds(170,60,120,30);
        txt_apellido.setFont(new Font("Andale Mono",3,12));
        txt_apellido.setHorizontalAlignment(JTextField.CENTER);
        txt_apellido.setForeground(new Color(0,0,0));
        txt_apellido.setEditable(true);
        add(txt_apellido);
        //***************************************************************
        lbl_cedula = new JLabel("Cedula de indentidad");
        lbl_cedula.setBounds(20,90,150,40);
        lbl_cedula.setFont(new Font("Andale Mono",3,12));
        lbl_cedula.setForeground(new Color(255,244,0));
        lbl_cedula.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_cedula);

        txt_cedula = new JTextField("X-XXXX-XXXX");
        //txt_cedula.setBounds(20,120,130,30);
        txt_cedula.setFont(new Font("Andale Mono",3,12));
        txt_cedula.setHorizontalAlignment(JTextField.CENTER);
        txt_cedula.setForeground(new Color(0,0,0));
        txt_cedula.setEditable(true);
        scrollPane = new JScrollPane(txt_cedula);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(20,120,130,30);
        add(scrollPane);


        lbl_nacionalidad = new JLabel("Nacionalidad");
        lbl_nacionalidad.setBounds(160,90,100,40);
        lbl_nacionalidad.setFont(new Font("Andale Mono",3,12));
        lbl_nacionalidad.setForeground(new Color(0,233,0));
        lbl_nacionalidad.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nacionalidad);

        txt_nacionalidad = new JTextField("Panamena");
        txt_nacionalidad.setBounds(170,120,130,30);
        txt_nacionalidad.setFont(new Font("Andale Mono",3,12));
        txt_nacionalidad.setHorizontalAlignment(JTextField.CENTER);
        txt_nacionalidad.setForeground(new Color(0,0,0));
        txt_nacionalidad.setEditable(true);
        add(txt_nacionalidad);

        lbl_estadoCivil = new JLabel("Estado civil");
        lbl_estadoCivil.setBounds(330,90,100,40);
        lbl_estadoCivil.setFont(new Font("Andale Mono",3,12));
        lbl_estadoCivil.setForeground(new Color(0,233,0));
        lbl_estadoCivil.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_estadoCivil);

        box_estadoCivil = new JComboBox();
        box_estadoCivil.setBounds(330,120,130,30);
        box_estadoCivil.setFont(new Font("Andale Mono",3,12));
        box_estadoCivil.addItem("None");
        box_estadoCivil.addItem("Casado");
        box_estadoCivil.addItem("Unido");
        box_estadoCivil.addItem("Soltero");
        box_estadoCivil.setForeground(new Color(0,0,0));
        box_estadoCivil.setEditable(true);
        add(box_estadoCivil);
        //****************************************************************
        lbl_genero = new JLabel("Genero");
        lbl_genero.setBounds(40,150,100,40);
        lbl_genero.setFont(new Font("Andale Mono",3,12));
        lbl_genero.setForeground(new Color(0,244,0));
        lbl_genero.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_genero);

        box_genero = new JComboBox();
        box_genero.setBounds(20,180,120,30);
        box_genero.setFont(new Font("Andale Mono",3,12));
        box_genero.addItem("None");
        box_genero.addItem("Femenino");
        box_genero.addItem("Masculino");
        box_genero.addItem("Otro");
        box_genero.setForeground(new Color(0,0,0));
        add(box_genero);

        lbl_nacimiento = new JLabel("Cumpleanos");
        lbl_nacimiento.setBounds(160,150,100,40);
        lbl_nacimiento.setFont(new Font("Andale Mono",3,12));
        lbl_nacimiento.setForeground(new Color(0,233,0));
        lbl_nacimiento.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nacimiento);

        txt_nacimiento = new JTextField("4 de mayo 1988");
        txt_nacimiento.setBounds(170,180,130,30);
        txt_nacimiento.setFont(new Font("Andale Mono",3,12));
        txt_nacimiento.setHorizontalAlignment(JTextField.CENTER);
        txt_nacimiento.setForeground(new Color(0,0,0));
        txt_nacimiento.setEditable(true);
        add(txt_nacimiento);

        lbl_edad = new JLabel("Edad");
        lbl_edad.setBounds(330,150,100,40);
        lbl_edad.setFont(new Font("Andale Mono",3,12));
        lbl_edad.setForeground(new Color(0,233,0));
        lbl_edad.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_edad);

        txt_edad = new JTextField(" 32");
        txt_edad.setBounds(330,180,100,30);
        txt_edad.setFont(new Font("Andale Mono",3,12));
        txt_edad.setHorizontalAlignment(JTextField.CENTER);
        txt_edad.setForeground(new Color(0,0,0));
        txt_edad.setEditable(false);
        add(txt_edad);
        //****************************************************************
        lbl_email = new JLabel("Email");
        lbl_email.setBounds(10,210,100,40);
        lbl_email.setFont(new Font("Andale Mono",3,12));
        lbl_email.setForeground(new Color(0,233,0));
        lbl_email.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_email);

        txt_email = new JTextField("OscarTownPanama@mail.com");
        //txt_email.setBounds(5,240,150,30);
        txt_email.setFont(new Font("Andale Mono",3,12));
        txt_email.setHorizontalAlignment(JTextField.CENTER);
        txt_email.setForeground(new Color(0,0,0));
        txt_email.setEditable(true);
        scrollPane = new JScrollPane(txt_email);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(5,240,150,50);
        add(scrollPane);
        //************************************************************
        lbl_telefono = new JLabel("Telefono");
        lbl_telefono.setBounds(150,210,100,40);
        lbl_telefono.setFont(new Font("Andale Mono",3,12));
        lbl_telefono.setForeground(new Color(0,233,0));
        lbl_telefono.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_telefono);

        txt_celular = new JTextField("(507)XXXX-XXXX");
        // txt_celular.setBounds(160,240,120,50);
        txt_celular.setFont(new Font("Andale Mono",3,12));
        txt_celular.setHorizontalAlignment(JTextField.CENTER);
        txt_celular.setForeground(new Color(0,0,0));
        txt_celular.setEditable(true);
        scrollPane = new JScrollPane(txt_celular);
        scrollPane.setBorder(BorderFactory.createEtchedBorder());
        scrollPane.setBounds(160,240,120,50);
        add(scrollPane);


        lbl_direccionResidencia = new JLabel("Direccion residencial");
        lbl_direccionResidencia.setBounds(285,210,200,40);
        lbl_direccionResidencia.setFont(new Font("Andale Mono",3,12));
        lbl_direccionResidencia.setForeground(new Color(0,233,0));
        lbl_direccionResidencia.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_direccionResidencia);

        txt_direccionVivienda = new JTextField("Panama,City Panama, calle 23");
        //txt_direccionVivienda.setBounds(285,240,200,30);
        txt_direccionVivienda.setFont(new Font("Andale Mono",3,12));
        txt_direccionVivienda.setHorizontalAlignment(JTextField.CENTER);
        txt_direccionVivienda.setForeground(new Color(0,0,0));
        txt_direccionVivienda.setEditable(true);
        scrollPane = new JScrollPane(txt_direccionVivienda);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(285,240,200,30);
        add(scrollPane);


        //*********************************************************************
        separatorReferenciaPrestamo = new JSeparator();
        separatorReferenciaPrestamo.setOrientation(SwingConstants.HORIZONTAL);
        separatorReferenciaPrestamo.setBounds(20,350,450,20);
        separatorReferenciaPrestamo.setFont(new Font("Andale Mono",1,14));
        add(separatorReferenciaPrestamo);
        //*************************************************************************
        //REFERENCIA DE DATOS PARA PRESTAMO
        lbl_datosRefenciaPrestamo = new JLabel("Datos de referencias de prestamo");
        lbl_datosRefenciaPrestamo.setBounds(80,350,300,40);
        lbl_datosRefenciaPrestamo.setForeground(new Color(0,233,0));
        lbl_datosRefenciaPrestamo.setFont(new Font("Andale Mono",1,18));
        lbl_datosRefenciaPrestamo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_datosRefenciaPrestamo);
//*****************************************************************************
        lbl_nombreApellidoReferencia = new JLabel("Nombre y Apellido");
        lbl_nombreApellidoReferencia.setBounds(5,380,130,40);
        lbl_nombreApellidoReferencia.setFont(new Font("Andale Mono",3,12));
        lbl_nombreApellidoReferencia.setForeground(new Color(0,233,0));
        lbl_nombreApellidoReferencia.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nombreApellidoReferencia);

        txt_nombreApellidoReferencia = new JTextField("Oscar Isaac");
        //txt_nombreApellidoReferencia.setBounds(20,410,100,30);
        txt_nombreApellidoReferencia.setFont(new Font("Andale Mono",3,12));
        txt_nombreApellidoReferencia.setHorizontalAlignment(JTextField.CENTER);
        txt_nombreApellidoReferencia.setForeground(new Color(0,0,0));
        txt_nombreApellidoReferencia.setEditable(true);
        scrollPane = new JScrollPane(txt_celularReferencia);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(20,410,100,30);
        add(scrollPane);


        lbl_celularReferencia = new JLabel("Celular o telefono");
        lbl_celularReferencia.setBounds(120,380,130,40);
        lbl_celularReferencia.setFont(new Font("Andale Mono",3,12));
        lbl_celularReferencia.setForeground(new Color(0,233,0));
        lbl_celularReferencia.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_celularReferencia);

        txt_celularReferencia = new JTextField("507-XXXX-XXXX");
        //txt_celularReferencia.setBounds(130,410,120,30);
        txt_celularReferencia.setFont(new Font("Andale Mono",3,12));
        txt_celularReferencia.setHorizontalAlignment(JTextField.CENTER);
        txt_celularReferencia.setForeground(new Color(0,0,0));
        txt_celularReferencia.setEditable(true);
        scrollPane = new JScrollPane(txt_celularReferencia);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(130,410,120,30);
        add(scrollPane);


        lbl_correoReferencia = new JLabel("Email");
        lbl_correoReferencia.setBounds(255,380,130,40);
        lbl_correoReferencia.setFont(new Font("Andale Mono",3,12));
        lbl_correoReferencia.setForeground(new Color(0,233,0));
        lbl_correoReferencia.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_correoReferencia);

        txt_correoReferencia = new JTextField("Oscar@mail.com");
        //txt_correoReferencia.setBounds(255,410,120,30);
        txt_correoReferencia.setFont(new Font("Andale Mono",3,12));
        txt_correoReferencia.setHorizontalAlignment(JTextField.CENTER);
        txt_correoReferencia.setForeground(new Color(0,0,0));
        txt_correoReferencia.setEditable(true);
        scrollPane = new JScrollPane(txt_correoReferencia);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(255,410,120,30);
        add(scrollPane);


        lbl_parentesco = new JLabel("Perentesco");
        lbl_parentesco.setBounds(355,380,130,40);
        lbl_parentesco.setFont(new Font("Andale Mono",3,12));
        lbl_parentesco.setForeground(new Color(0,233,0));
        lbl_parentesco.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_parentesco);

        box_parentesco = new JComboBox();
        box_parentesco.setBounds(380,410,90,30);
        box_parentesco.setFont(new Font("Andale Mono",3,12));
        box_parentesco.addItem("None");
        box_parentesco.addItem("Amigo cercano");
        box_parentesco.addItem("Amigo trabajo");
        box_parentesco.addItem("Familiar");
        box_parentesco.setForeground(new Color(0,0,0));
        add(box_parentesco);
        //******************************************************************

        lbl_nombreApellidoReferencia = new JLabel("Nombre y Apellido");
        lbl_nombreApellidoReferencia.setBounds(5,440,130,40);
        lbl_nombreApellidoReferencia.setFont(new Font("Andale Mono",3,12));
        lbl_nombreApellidoReferencia.setForeground(new Color(0,233,0));
        lbl_nombreApellidoReferencia.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nombreApellidoReferencia);

        txt_nombreApellidoReferencia = new JTextField("Oscar Isaac");
        txt_nombreApellidoReferencia.setBounds(20,470,100,30);
        txt_nombreApellidoReferencia.setFont(new Font("Andale Mono",3,12));
        txt_nombreApellidoReferencia.setHorizontalAlignment(JTextField.CENTER);
        txt_nombreApellidoReferencia.setForeground(new Color(0,0,0));
        txt_nombreApellidoReferencia.setEditable(true);
        add(txt_nombreApellidoReferencia);

        lbl_celularReferencia = new JLabel("Celular o telefono");
        lbl_celularReferencia.setBounds(120,440,130,40);
        lbl_celularReferencia.setFont(new Font("Andale Mono",3,12));
        lbl_celularReferencia.setForeground(new Color(0,233,0));
        lbl_celularReferencia.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_celularReferencia);

        txt_celularReferencia = new JTextField("507-XXXX-XXXX");
        txt_celularReferencia.setBounds(130,470,120,30);
        txt_celularReferencia.setFont(new Font("Andale Mono",3,12));
        txt_celularReferencia.setHorizontalAlignment(JTextField.CENTER);
        txt_celularReferencia.setForeground(new Color(0,0,0));
        txt_celularReferencia.setEditable(true);
        add(txt_celularReferencia);

        lbl_correoReferencia = new JLabel("Email");
        lbl_correoReferencia.setBounds(255,440,130,40);
        lbl_correoReferencia.setFont(new Font("Andale Mono",3,12));
        lbl_correoReferencia.setForeground(new Color(0,233,0));
        lbl_correoReferencia.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_correoReferencia);

        txt_correoReferencia = new JTextField("Oscar@mail.com");
        txt_correoReferencia.setBounds(255,470,120,30);
        txt_correoReferencia.setFont(new Font("Andale Mono",3,12));
        txt_correoReferencia.setHorizontalAlignment(JTextField.CENTER);
        txt_correoReferencia.setForeground(new Color(0,0,0));
        txt_correoReferencia.setEditable(true);
        add(txt_correoReferencia);

        lbl_parentesco = new JLabel("Perentesco");
        lbl_parentesco.setBounds(355,440,130,40);
        lbl_parentesco.setFont(new Font("Andale Mono",3,12));
        lbl_parentesco.setForeground(new Color(0,233,0));
        lbl_parentesco.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_parentesco);

        box_parentesco = new JComboBox();
        box_parentesco.setBounds(380,470,90,30);
        box_parentesco.setFont(new Font("Andale Mono",3,12));
        box_parentesco.addItem("None");
        box_parentesco.addItem("Amigo cercano");
        box_parentesco.addItem("Amigo trabajo");
        box_parentesco.addItem("Familiar");
        box_parentesco.setForeground(new Color(0,0,0));
        add(box_parentesco);

        //******************************************************************



        //*********************************************************************
        separatorVertical = new JSeparator();
        separatorVertical.setOrientation(SwingConstants.VERTICAL);
        separatorVertical.setBounds(490,30,20,480);
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
        //txt_lugarTrabajo.setBounds(500,60,150,30);
        txt_lugarTrabajo.setFont(new Font("Andale Mono",3,12));
        txt_lugarTrabajo.setHorizontalAlignment(JTextField.CENTER);
        txt_lugarTrabajo.setForeground(new Color(0,0,0));
        txt_lugarTrabajo.setEditable(true);
        scrollPane = new JScrollPane(txt_lugarTrabajo);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        ;
        scrollPane.setBounds(500,60,150,30);
        add(scrollPane);


        lbl_direccionTrabajo = new JLabel("Direccion de empresa");
        lbl_direccionTrabajo.setBounds(700,30,200,40);
        lbl_direccionTrabajo.setFont(new Font("Andale Mono",3,12));
        lbl_direccionTrabajo.setForeground(new Color(0,233,0));
        lbl_direccionTrabajo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_direccionTrabajo);

        txt_direccionTrabajo = new JTextField("Oscar Isaac");
        //txt_direccionTrabajo.setBounds(720,60,150,30);
        txt_direccionTrabajo.setFont(new Font("Andale Mono",3,12));
        txt_direccionTrabajo.setHorizontalAlignment(JTextField.CENTER);
        txt_direccionTrabajo.setForeground(new Color(0,0,0));
        txt_direccionTrabajo.setEditable(true);
        scrollPane = new JScrollPane(txt_direccionTrabajo);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setViewportBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setBounds(720,60,150,30);
        add(scrollPane);
//**************************************************************************************
        lbl_puestoTrabajo = new JLabel("Puesto de trabajo");
        lbl_puestoTrabajo.setBounds(500,90,150,40);
        lbl_puestoTrabajo.setFont(new Font("Andale Mono",3,12));
        lbl_puestoTrabajo.setForeground(new Color(0,233,0));
        lbl_puestoTrabajo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_puestoTrabajo);

        txt_puestoTrabajo = new JTextField("Gerente de tienda");
        //txt_puestoTrabajo.setBounds(500,120,150,30);
        txt_puestoTrabajo.setFont(new Font("Andale Mono",3,12));
        txt_puestoTrabajo.setHorizontalAlignment(JTextField.CENTER);
        txt_puestoTrabajo.setForeground(new Color(0,0,0));
        txt_puestoTrabajo.setEditable(true);
        scrollPane = new JScrollPane(txt_puestoTrabajo);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(500,120,150,30);
        add(scrollPane);


        lbl_tiempoLaborando = new JLabel("Tiempo laborando");
        lbl_tiempoLaborando.setBounds(700,90,200,40);
        lbl_tiempoLaborando.setFont(new Font("Andale Mono",3,12));
        lbl_tiempoLaborando.setForeground(new Color(0,233,0));
        lbl_tiempoLaborando.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_tiempoLaborando);

        txt_tiempoLaborando = new JTextField("12 meses");
        //txt_tiempoLaborando.setBounds(720,120,150,30);
        txt_tiempoLaborando.setFont(new Font("Andale Mono",3,12));
        txt_tiempoLaborando.setHorizontalAlignment(JTextField.CENTER);
        txt_tiempoLaborando.setForeground(new Color(0,0,0));
        txt_tiempoLaborando.setEditable(true);
        scrollPane = new JScrollPane(txt_tiempoLaborando);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(720,120,150,30);
        add(scrollPane);

//************************************************************************************
        lbl_salario = new JLabel("Salario mensual");
        lbl_salario.setBounds(500,150,150,40);
        lbl_salario.setFont(new Font("Andale Mono",3,12));
        lbl_salario.setForeground(new Color(0,233,0));
        lbl_salario.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_salario);

        txt_salario = new JTextField("B/.1800.00");
        //txt_salario.setBounds(500,180,150,30);
        txt_salario.setFont(new Font("Andale Mono",3,12));
        txt_salario.setHorizontalAlignment(JTextField.CENTER);
        txt_salario.setForeground(new Color(0,0,0));
        txt_salario.setEditable(true);
        scrollPane = new JScrollPane(txt_salario);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(500,180,150,30);
        add(scrollPane);


        lbl_nivelEndeudamiento = new JLabel("Nivel de endeudamiento %");
        lbl_nivelEndeudamiento.setBounds(700,150,200,40);
        lbl_nivelEndeudamiento.setFont(new Font("Andale Mono",3,12));
        lbl_nivelEndeudamiento.setForeground(new Color(0,233,0));
        lbl_nivelEndeudamiento.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nivelEndeudamiento);

        txt_nivelEndeudamiento = new JTextField("30.00 %");
        //txt_nivelEndeudamiento.setBounds(720,180,150,30);
        txt_nivelEndeudamiento.setFont(new Font("Andale Mono",3,12));
        txt_nivelEndeudamiento.setHorizontalAlignment(JTextField.CENTER);
        txt_nivelEndeudamiento.setForeground(new Color(0,0,0));
        txt_nivelEndeudamiento.setEditable(false);
        scrollPane = new JScrollPane(txt_nivelEndeudamiento);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(720,180,150,30);
        add(scrollPane);

//***********************************************************************************
        lbl_actividadEmpresa = new JLabel("Actividad de la empresa");
        lbl_actividadEmpresa.setBounds(480,210,200,40);
        lbl_actividadEmpresa.setFont(new Font("Andale Mono",3,12));
        lbl_actividadEmpresa.setForeground(new Color(0,233,0));
        lbl_actividadEmpresa.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_actividadEmpresa);

        box_actividadEmpresa = new JComboBox();
        //txt_actividadEmpresa.setBounds(500,240,150,30);
        box_actividadEmpresa.setFont(new Font("Andale Mono",3,12));
        box_actividadEmpresa.addItem("None");
        box_actividadEmpresa.addItem("Agricultura");
        box_actividadEmpresa.addItem("Ganaderia");
        box_actividadEmpresa.addItem("Mineria");
        box_actividadEmpresa.addItem("Industria");
        box_actividadEmpresa.addItem("Comercio");
        box_actividadEmpresa.setForeground(new Color(0,0,0));
        box_actividadEmpresa.setEditable(false);
        scrollPane = new JScrollPane(box_actividadEmpresa);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(500,240,150,30);
        add(scrollPane);


        lbl_telefonoEmpresa = new JLabel("Telefono de la empresa");
        lbl_telefonoEmpresa.setBounds(700,210,200,40);
        lbl_telefonoEmpresa.setFont(new Font("Andale Mono",3,12));
        lbl_telefonoEmpresa.setForeground(new Color(0,233,0));
        lbl_telefonoEmpresa.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_telefonoEmpresa);

        txt_telefonoEmpresa = new JTextField("396-XXXX");
        //txt_telefonoEmpresa.setBounds(720,240,150,30);
        txt_telefonoEmpresa.setFont(new Font("Andale Mono",3,12));
        txt_telefonoEmpresa.setHorizontalAlignment(JTextField.CENTER);
        txt_telefonoEmpresa.setForeground(new Color(0,0,0));
        txt_telefonoEmpresa.setEditable(true);
        scrollPane = new JScrollPane(txt_telefonoEmpresa);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(720,240,150,30);
        add(scrollPane);


        //*********************************************************************
        separatorHorizontal = new JSeparator();
        separatorHorizontal.setOrientation(SwingConstants.HORIZONTAL);
        separatorHorizontal.setBounds(500,280,350,20);
        separatorHorizontal.setFont(new Font("Andale Mono",1,14));
        add(separatorHorizontal);
        //*************************************************************************

        lbl_datosMonto = new JLabel("Datos de prestamo");
        lbl_datosMonto.setBounds(600,275,250,50);
        lbl_datosMonto.setFont(new Font("Andale Mono",1,18));
        lbl_datosMonto.setForeground(new Color(0,233,0));
        add(lbl_datosMonto);
//************************************************************************************
        lbl_montoSolicitado = new JLabel("Monto solicitado B/.");
        lbl_montoSolicitado.setBounds(480,300,200,40);
        lbl_montoSolicitado.setFont(new Font("Andale Mono",3,12));
        lbl_montoSolicitado.setForeground(new Color(0,233,0));
        lbl_montoSolicitado.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_montoSolicitado);

        txt_MontoSolicitado = new JTextField("3000.00");
        //txt_MontoSolicitado.setBounds(500,330,150,30);
        txt_MontoSolicitado.setFont(new Font("Andale Mono",3,12));
        txt_MontoSolicitado.setHorizontalAlignment(JTextField.CENTER);
        txt_MontoSolicitado.setForeground(new Color(0,0,0));
        txt_MontoSolicitado.setEditable(true);
        scrollPane = new JScrollPane(txt_MontoSolicitado);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(500,330,150,30);
        add(scrollPane);


        lbl_motivoPrestamo = new JLabel("Motivo del prestamo solicitado");
        lbl_motivoPrestamo.setBounds(680,300,200,40);
        lbl_motivoPrestamo.setFont(new Font("Andale Mono",3,12));
        lbl_motivoPrestamo.setForeground(new Color(0,233,0));
        lbl_motivoPrestamo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_motivoPrestamo);

        box_motivoPrestamo = new JComboBox();
        //txt_motivoPrestamo.setBounds(700,330,150,30);
        box_motivoPrestamo.setFont(new Font("Andale Mono",3,12));
        box_motivoPrestamo.addItem("None");
        box_motivoPrestamo.addItem("Consolidar deudas");
        box_motivoPrestamo.addItem("Emprendimiento");
        box_motivoPrestamo.addItem("Vacaciones");
        box_motivoPrestamo.addItem("Negocios");
        box_motivoPrestamo.setForeground(new Color(0,0,0));
        box_motivoPrestamo.setEditable(false);
        scrollPane = new JScrollPane(box_motivoPrestamo);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(700,330,150,30);
        add(scrollPane);
//*********************************************************************************************
        lbl_interesPrestamo = new JLabel("Tasa de interes %");
        lbl_interesPrestamo.setBounds(500,360,200,40);
        lbl_interesPrestamo.setFont(new Font("Andale Mono",3,12));
        lbl_interesPrestamo.setForeground(new Color(0,233,0));
        lbl_interesPrestamo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_interesPrestamo);

        txt_interesPrestamo = new JTextField("8.00");
        //txt_interesPrestamo.setBounds(500,390,150,30);
        txt_interesPrestamo.setFont(new Font("Andale Mono",3,12));
        txt_interesPrestamo.setHorizontalAlignment(JTextField.CENTER);
        txt_interesPrestamo.setForeground(new Color(0,0,0));
        txt_interesPrestamo.setEditable(false);
        scrollPane = new JScrollPane(txt_interesPrestamo);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(500,390,150,30);
        add(scrollPane);


        lbl_tiempoAPagarPrestamo = new JLabel("Tiempo a pagar prestamo");
        lbl_tiempoAPagarPrestamo.setBounds(680,360,200,40);
        lbl_tiempoAPagarPrestamo.setFont(new Font("Andale Mono",3,12));
        lbl_tiempoAPagarPrestamo.setForeground(new Color(0,233,0));
        lbl_tiempoAPagarPrestamo.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_tiempoAPagarPrestamo);

        txt_tiempoAPagarPrestamo = new JTextField("72 meses");
        //txt_tiempoAPagarPrestamo.setBounds(700,390,150,30);
        txt_tiempoAPagarPrestamo.setFont(new Font("Andale Mono",3,12));
        txt_tiempoAPagarPrestamo.setHorizontalAlignment(JTextField.CENTER);
        txt_tiempoAPagarPrestamo.setForeground(new Color(0,0,0));
        txt_tiempoAPagarPrestamo.setEditable(false);
        scrollPane = new JScrollPane(txt_tiempoAPagarPrestamo);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(700,390,150,30);
        add(scrollPane);

//******************************************************************************************
        lbl_PagoCuotas = new JLabel("Monto a pagar a cuotas B/.");
        lbl_PagoCuotas.setBounds(580,420,200,40);
        lbl_PagoCuotas.setFont(new Font("Andale Mono",3,12));
        lbl_PagoCuotas.setForeground(new Color(0,233,0));
        lbl_PagoCuotas.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_PagoCuotas);

        txt_PagoCuotas = new JTextField("87.50");
        //txt_PagoCuotas.setBounds(600,450,150,30);
        txt_PagoCuotas.setFont(new Font("Andale Mono",3,12));
        txt_PagoCuotas.setHorizontalAlignment(JTextField.CENTER);
        txt_PagoCuotas.setForeground(new Color(0,0,0));
        txt_PagoCuotas.setEditable(false);
        scrollPane = new JScrollPane(txt_PagoCuotas);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(600,450,150,30);
        add(scrollPane);


        //*********************************************************************
        separatorHorizontalII = new JSeparator();
        separatorHorizontalII.setOrientation(SwingConstants.HORIZONTAL);
        separatorHorizontalII.setBounds(500,490,350,20);
        separatorHorizontalII.setFont(new Font("Andale Mono",1,14));
        add(separatorHorizontalII);
        //*************************************************************************



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
