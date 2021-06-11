package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 *En esta el usuario podra realizar la solicitud de un prestamo por medio del formulario,
 * el usuario debe completar todos los campos para poder enviar su informacion para que los encargado puedas validar sus datos.
 **/
public class SolicitudPrestamoCliente extends JFrame implements ActionListener {

    JButton bt_enviarSolicitud, bt_cancelar;
    JComboBox box_razonPrestamo,box_actividadTrabajo;
    JTextField txt_lugarTrabajo,txt_salario,txt_fechaEntradaTrabjo,
            txt_ContactoReferencia,txt_nombre,txt_apellido,txt_nivelEstudio,
            txt_residencia,txt_email,txt_nacimiento;
    JLabel label_lugarTrabajo,label_salario,label_fechaEntradaTrabajo,label_contactoReferencia,label_nombre,label_apellido,
            label_nivelEstudio,label_residencia,label_email,_label_nacimiento,label_razonPrestamo,label_ActividadTrabajo;

   public SolicitudPrestamoCliente(){
       setLayout(null);
       setSize(700,700);
       setResizable(false);
       setLocationRelativeTo(null);
       setTitle("Solicitar prestamo");

       getContentPane().setBackground(new Color(0,0,0));
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



   }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new SolicitudPrestamoCliente().setVisible(true);
    }
}
