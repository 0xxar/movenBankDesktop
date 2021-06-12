package interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SolicitudPrestamoCliente extends JFrame implements ActionListener {
    JLabel label_montoASolicitar,label_tiempoApagarPrestamo;
    JButton bt_enviarSolicitud, bt_cancelar,bt_calcularPrestamo;
    JTextField txt_montoASolicitar,tiempoParaPagarPrestamo;
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

    }
}
