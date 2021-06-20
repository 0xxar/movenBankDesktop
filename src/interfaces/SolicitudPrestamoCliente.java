package interfaces;

import logica.PoliticasDePrestamos;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class SolicitudPrestamoCliente extends JFrame implements ActionListener {
    //limitar los decimales
    DecimalFormat df = new DecimalFormat("#.00");
    //VARIABLES
    double salario ,tiempoLaborando,nivelEndeudamiento,deudaActual;
    String nivelEstudio,motivo_prestamo;
    //TextField datos personales
    public JTextField txt_nombre,txt_apellido,txt_cedula,txt_nacionalidad,txt_apellidoCasado
            ,txt_edad,txt_nacimiento,txt_email,txt_celular, txt_direccionVivienda;
    //*******************************************************************************************************
    //TextField datos laborales
   public JTextField txt_lugarTrabajo,txt_salario,txt_tiempoLaborando,txt_direccionTrabajo,txt_telefonoEmpresa,
            txt_puestoTrabajo;
    //********************************************************************************************************
    //TextField datos del prestamo
  public   JTextField txt_MontoSolicitado,txt_interesPrestamo,txt_tiempoAPagarPrestamo,txt_PagoCuotas;
    //***********************************************************************************************************
    //TextField datos referencia prestamo
    public JTextField txt_nivelEndeudamiento,txt_nombreApellidoReferencia,
            txt_celularReferencia,txt_cedulaReferencia,txt_correoReferencia,txt_deudaActual;
    //**********************************************************************************************************
    //Label datos personales
    JLabel lbl_nombre,lbl_apellido,lbl_cedula,lbl_nacionalidad,lbl_genero,lbl_edad,lbl_nacimiento,
            lbl_email,lbl_telefono,lbl_direccionResidencia,lbl_datosPersonales,
            lbl_estatusPrestamo, lbl_estadoCivil,lbl_nivelEstudio,lbl_apellidoCasado;
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
    JLabel lbl_nivelEndeudamiento,lbl_nombreApellidoReferencia,lbl_celularReferencia,lbl_cedulaReferencia,
            lbl_correoReferencia, lbl_parentesco,lbl_datosRefenciaPrestamo,lbl_deudaActual;
    //****************************************************************************************************************
    //Separadores
    JSeparator separatorVertical,separatorHorizontal,separatorHorizontalII,separatorReferenciaPrestamo;
    //****************************************************************************************************************
    //Botones
    JButton bt_enivar,bt_cerrar,bt_referencia,bt_verPropuestaPrestamo;
    JButton bt_calcularPretamo;
    //***************************************************************************************************************
    JScrollPane scrollPane;


   public JComboBox box_genero,box_estadoCivil,box_nivelEstudio;
   public JComboBox box_parentesco;

    public JComboBox box_motivoPrestamo;
    public JComboBox box_actividadEmpresa;

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

        lbl_apellidoCasado = new JLabel("Apellidos");
        lbl_apellidoCasado.setBounds(300,30,100,40);
        lbl_apellidoCasado.setFont(new Font("Andale Mono",3,12));
        lbl_apellidoCasado.setForeground(new Color(0,233,0));
        lbl_apellidoCasado.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_apellidoCasado);

        txt_apellidoCasado = new JTextField("Oscar Isaac");
        txt_apellidoCasado.setBounds(310,60,120,30);
        txt_apellidoCasado.setFont(new Font("Andale Mono",3,12));
        txt_apellidoCasado.setHorizontalAlignment(JTextField.CENTER);
        txt_apellidoCasado.setForeground(new Color(0,0,0));
        txt_apellidoCasado.setEditable(false);
        add(txt_apellidoCasado);
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
        box_estadoCivil.addActionListener(this);
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
//***********************************************************************************************8
        lbl_nivelEstudio = new JLabel("Nivel de estudio");
        lbl_nivelEstudio.setBounds(30,280,100,40);
        lbl_nivelEstudio.setFont(new Font("Andale Mono",3,12));
        lbl_nivelEstudio.setForeground(new Color(0,233,0));
        lbl_nivelEstudio.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nivelEstudio);

        box_nivelEstudio = new JComboBox();
        box_nivelEstudio.setBounds(20,310,150,30);
        box_nivelEstudio.setFont(new Font("Andale Mono",3,12));
        box_nivelEstudio.addItem("None");
        box_nivelEstudio.addItem("Primaria");
        box_nivelEstudio.addItem("Secundaria");
        box_nivelEstudio.addItem("Universidad");
        box_nivelEstudio.addItem("Universidad-Maestria");
        box_nivelEstudio.addItem("Universidad-Doctorado");
        box_nivelEstudio.setForeground(new Color(0,0,0));
        box_nivelEstudio.addActionListener(this);
        add(box_nivelEstudio);


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

        lbl_deudaActual = new JLabel("Deuda actual B/.");
        lbl_deudaActual.setBounds(2,500,120,40);
        lbl_deudaActual.setFont(new Font("Andale Mono",3,12));
        lbl_deudaActual.setForeground(new Color(0,233,0));
        lbl_deudaActual.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_deudaActual);

        txt_deudaActual = new JTextField();
        //txt_correoReferencia.setBounds(255,520,100,30);
        txt_deudaActual.setFont(new Font("Andale Mono",3,12));
        txt_deudaActual.setHorizontalAlignment(JTextField.CENTER);
        txt_deudaActual.setForeground(new Color(0,0,0));
        txt_deudaActual.setEditable(true);
        scrollPane = new JScrollPane(txt_deudaActual);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(10,530,100,30);
        add(scrollPane);

        lbl_nivelEndeudamiento = new JLabel("Nivel endeudamiento %");
        lbl_nivelEndeudamiento.setBounds(110,500,200,40);
        lbl_nivelEndeudamiento.setFont(new Font("Andale Mono",3,12));
        lbl_nivelEndeudamiento.setForeground(new Color(0,233,0));
        lbl_nivelEndeudamiento.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_nivelEndeudamiento);

        txt_nivelEndeudamiento = new JTextField();
        //txt_nivelEndeudamiento.setBounds(720,180,150,30);
        txt_nivelEndeudamiento.setFont(new Font("Andale Mono",3,12));
        txt_nivelEndeudamiento.setHorizontalAlignment(JTextField.CENTER);
        txt_nivelEndeudamiento.setForeground(new Color(0,0,0));
        txt_nivelEndeudamiento.setEditable(false);
        scrollPane = new JScrollPane(txt_nivelEndeudamiento);
        scrollPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(150,530,130,50);
        add(scrollPane);

        bt_calcularPretamo = new JButton("Calcular Prestamo");
        bt_calcularPretamo.setBounds(290,530,150,30);
        bt_calcularPretamo.setForeground(new Color(0,0,0));
        bt_calcularPretamo.setFont(new Font("Andale Mono",1,12));
        bt_calcularPretamo.addActionListener(this);
        add(bt_calcularPretamo);

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

        txt_tiempoLaborando = new JTextField();
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
        lbl_salario = new JLabel("Salario mensual B/.");
        lbl_salario.setBounds(500,150,150,40);
        lbl_salario.setFont(new Font("Andale Mono",3,12));
        lbl_salario.setForeground(new Color(0,233,0));
        lbl_salario.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_salario);

        txt_salario = new JTextField();
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
        lbl_montoSolicitado = new JLabel("Monto a recibir B/.");
        lbl_montoSolicitado.setBounds(480,300,200,40);
        lbl_montoSolicitado.setFont(new Font("Andale Mono",3,12));
        lbl_montoSolicitado.setForeground(new Color(0,233,0));
        lbl_montoSolicitado.setHorizontalAlignment(JLabel.CENTER);
        add(lbl_montoSolicitado);

        txt_MontoSolicitado = new JTextField("");
        //txt_MontoSolicitado.setBounds(500,330,150,30);
        txt_MontoSolicitado.setFont(new Font("Andale Mono",3,12));
        txt_MontoSolicitado.setHorizontalAlignment(JTextField.CENTER);
        txt_MontoSolicitado.setForeground(new Color(0,0,0));
        txt_MontoSolicitado.setEditable(false);
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

        txt_interesPrestamo = new JTextField("");
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

        txt_tiempoAPagarPrestamo = new JTextField();
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

        txt_PagoCuotas = new JTextField("");
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



        bt_verPropuestaPrestamo = new JButton("Ver propuesta de prestamo");
        bt_verPropuestaPrestamo.setBounds(570,520,200,30);
        bt_verPropuestaPrestamo.setFont(new Font("Andale Mono",1,12));
        bt_verPropuestaPrestamo.setForeground(new Color(0,0,0));
        bt_verPropuestaPrestamo.setEnabled(true);
        bt_verPropuestaPrestamo.addActionListener(this);
        add(bt_verPropuestaPrestamo);

        bt_referencia = new JButton("Enviar solicitud");
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

        if(e.getSource() == bt_calcularPretamo){

           CalculoNivelEndeudamiento();


        }
        if(e.getSource() == bt_verPropuestaPrestamo){
           PoliticasPrestamos();
        }

    }

    public  void CalculoNivelEndeudamiento(){
        String deuda = txt_deudaActual.getText().toString();
        String sueldo = txt_salario.getText().toString();

        if(!deuda.isEmpty() && !sueldo.isEmpty() ){
            deudaActual = Double.parseDouble(deuda);
            salario = Double.parseDouble(sueldo);
            double capacidadSalarial = (deudaActual / salario) * 100;

            txt_nivelEndeudamiento.setText(String.valueOf(df.format(capacidadSalarial)));

        }else{
            //deudaActual = Double.parseDouble(deuda);
            //salario = Double.parseDouble(sueldo);
            if(deuda.isEmpty() && !sueldo.isEmpty() ){
                JOptionPane.showMessageDialog(null,"Por favor completar el campo DEUDA ACTUAL");

            } if(!deuda.isEmpty() && sueldo.isEmpty() ){
                JOptionPane.showMessageDialog(null,"Por favor completar el campo SALARIO");
            } if(deuda.isEmpty() && sueldo.isEmpty() ){
                JOptionPane.showMessageDialog(null,"Por favor completar los campo DEUDA ACTUAL y SALARIO");
            }

        }





    }
    //POLITICAS DE PRESTAMOS ************************************************************************************8
    public void PoliticasPrestamos(){
            nivelEstudio = box_nivelEstudio.getSelectedItem().toString();
            motivo_prestamo = box_motivoPrestamo.getSelectedItem().toString();
            String NEndeudamiento = txt_nivelEndeudamiento.getText().toString();
            String sueldo = txt_salario.getText().toString();
            String deuda = txt_deudaActual.getText().toString();
            String tiempoTrabajo = txt_tiempoLaborando.getText().toString();

        if(!NEndeudamiento.isEmpty() && !sueldo.isEmpty() && !deuda.isEmpty() && !nivelEstudio.equals("None") && !motivo_prestamo.equals("None") && !tiempoTrabajo.isEmpty() ){

            salario = Double.parseDouble(txt_salario.getText().toString());
            nivelEndeudamiento = Double.parseDouble(txt_nivelEndeudamiento.getText().toString());
            tiempoLaborando = Double.parseDouble(txt_tiempoLaborando.getText().toString());


            if(salario >= 500.00 && salario <= 700.00 && nivelEndeudamiento <= 30.00 && tiempoLaborando <= 18 && tiempoLaborando >=6 && nivelEstudio.equals("Secundaria") && !motivo_prestamo.equals("None") ){
                txt_interesPrestamo.setText("8.00 % mensual");
                txt_tiempoAPagarPrestamo.setText("14 meses");
                txt_PagoCuotas.setText("55.00");
                txt_MontoSolicitado.setText("1500.00");

            }
            if(salario > 700.00 && salario <= 850 && nivelEndeudamiento <= 30.00 && tiempoLaborando <= 24 && tiempoLaborando>=19 && nivelEstudio.equals("Secundaria") && !motivo_prestamo.equals("None")){
                txt_interesPrestamo.setText("10.00 mensual");
                txt_tiempoAPagarPrestamo.setText("18 meses");
                txt_PagoCuotas.setText("75.00");
                txt_MontoSolicitado.setText("2500.00");

            }
            if(salario > 700.00 && salario <= 850 && nivelEndeudamiento <= 30.00 && tiempoLaborando <= 24 && tiempoLaborando>=19 && nivelEstudio.equals("Universidad") && !motivo_prestamo.equals("None")){
                txt_interesPrestamo.setText("10.00 mensual");
                txt_tiempoAPagarPrestamo.setText("24 meses");
                txt_PagoCuotas.setText("95.00");
                txt_MontoSolicitado.setText("4000.00");

            }if(salario > 850.00 && salario <= 1300 && nivelEndeudamiento <= 30.00 && tiempoLaborando <= 24 && tiempoLaborando>=19 && nivelEstudio.equals("Secundaria") && !motivo_prestamo.equals("None")){
                txt_interesPrestamo.setText("9.85 mensual");
                txt_tiempoAPagarPrestamo.setText("36 meses");
                txt_PagoCuotas.setText("125.00");
                txt_MontoSolicitado.setText("6500.00");

            }
        }else{
            if(!NEndeudamiento.isEmpty() && sueldo.isEmpty() && !deuda.isEmpty() && !nivelEstudio.equals("None") && !motivo_prestamo.equals("None")){

                        JOptionPane.showMessageDialog(null,"Por favor completar el campo SALARIO");
            }
            if(!NEndeudamiento.isEmpty() && !sueldo.isEmpty() && deuda.isEmpty() && !nivelEstudio.equals("None") && !motivo_prestamo.equals("None")){

                JOptionPane.showMessageDialog(null,"Por favor completar el campo DEUDA ACTUAL");

            }if(!NEndeudamiento.isEmpty() && !sueldo.isEmpty() && !deuda.isEmpty() && nivelEstudio.equals("None") && !motivo_prestamo.equals("None")){

                JOptionPane.showMessageDialog(null,"Por favor completar el campo NIVEL ESTUDIO");
            }if(!NEndeudamiento.isEmpty() && !sueldo.isEmpty() && !deuda.isEmpty() && !nivelEstudio.equals("None") && motivo_prestamo.equals("None")){

                JOptionPane.showMessageDialog(null,"Por favor completar el campo MOTIVO PRESTAMO");

            }if(!NEndeudamiento.isEmpty() && !sueldo.isEmpty() && !deuda.isEmpty() && !nivelEstudio.equals("None") && !motivo_prestamo.equals("None") && tiempoTrabajo.isEmpty()){

                JOptionPane.showMessageDialog(null,"Por favor completar el campo TIEMPO LABORANDO");

            }
        }


    }

    public static void main(String[] args) {

        new SolicitudPrestamoCliente().setVisible(true);

    }
}
