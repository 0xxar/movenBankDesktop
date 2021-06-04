package interfaces;

import logica.MethodLogin.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccount extends JFrame implements ActionListener {

    public JButton bt_createAccount, bt_cancel;
    public JLabel label_email,label_firtName, label_lastName,label_gender,label_birthday;
    public JTextField txt_email,txt_firtName, txt_lastName,txt_birthday;
    public JComboBox box_gender;

    public CreateAccount(){

        setLayout(null);
        setSize(550,600);
        setResizable(false);
        setTitle("Create Account");
        setLocationRelativeTo(null);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

        new CreateAccount().setVisible(true);

    }
}
