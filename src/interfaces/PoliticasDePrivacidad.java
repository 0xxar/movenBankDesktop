package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoliticasDePrivacidad extends JFrame implements ActionListener {

    JTextArea txt_politicasPrivacidad;
    JScrollPane scrollPanePrivacidad;
    JButton bt_aceptar,bt_cancelar;
    JCheckBox check_aceptoTerminos;

    public PoliticasDePrivacidad(){
        setLayout(null);
        setSize(700,550);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Terminos y condiciones de uso");

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(0,0,0));

        txt_politicasPrivacidad = new JTextArea();
        txt_politicasPrivacidad.setEditable(false);
        txt_politicasPrivacidad.setText("\n\n          T�RMINOS Y CONDICIONES" +
                "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCI�N SIN AUTORIZACI�N DE LA GEEKIPEDIA DE ERNESTO." +
                "\n            B.  PROHIBIDA LA ALTERACI�N DEL C�DIGO FUENTE O DISE�O DE LAS INTERFACES GR�FICAS." +
                "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACI�N RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n          PARA MAYOR INFORMACI�N SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                "\n          http://www.youtube.com/ernestoperezm");
        txt_politicasPrivacidad.setBackground(new Color(255,255,255));
        txt_politicasPrivacidad.setForeground(new Color(0,0,0));
        txt_politicasPrivacidad.setLayout(null);
        scrollPanePrivacidad = new JScrollPane(txt_politicasPrivacidad);
        scrollPanePrivacidad.setBounds(10,40,670,350);
        add(scrollPanePrivacidad);

        bt_cancelar = new JButton("Cancelar");
        bt_cancelar.setBounds(560,440,100,30);
        bt_cancelar.setForeground(new Color(0,0,0));
        bt_cancelar.setFont(new Font("Andale Mono",3,14));
        bt_cancelar.addActionListener(this);
        add(bt_cancelar);

        check_aceptoTerminos = new JCheckBox("Acepto terminos y condiciones de uso");
        check_aceptoTerminos.setBounds(30,400,300,30);
        check_aceptoTerminos.setFont(new Font("Andale Mono",3,12));
        check_aceptoTerminos.setForeground(new Color(255,255,255));
        check_aceptoTerminos.setBackground(new Color(0,0,0));
        check_aceptoTerminos.addActionListener(this);
        add(check_aceptoTerminos);

        bt_aceptar = new JButton("Acepto");
        bt_aceptar.setEnabled(false);
        bt_aceptar.setBounds(30,440,100,30);
        bt_aceptar.setForeground(new Color(0,0,0));
        bt_aceptar.setFont(new Font("Andale Mono",3,12));
        bt_aceptar.addActionListener(this);
        add(bt_aceptar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==check_aceptoTerminos){

            if(check_aceptoTerminos.isSelected()){
                bt_aceptar.setEnabled(true);
                bt_cancelar.setEnabled(false);

            }else{

                bt_aceptar.setEnabled(false);
                bt_cancelar.setEnabled(true);

            }


        }
        if(e.getSource()==bt_aceptar){

            JOptionPane.showMessageDialog(null,"Terminos y condiciones aceptados");

        }if(e.getSource()==bt_cancelar){
            new LoginUser().setVisible(true);
            this.dispose();
        }

    }

    public static void main(String[] args) {
        new PoliticasDePrivacidad().setVisible(true);
    }
}
