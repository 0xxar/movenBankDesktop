package interfaces;

import logica.MethodCreateAccount;
import logica.MethodLogin.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccount extends JFrame implements ActionListener {

    public JButton bt_createAccount, bt_cancel;
    public JLabel label_email,label_firtName, label_lastName,label_birthday,label_gender;
    public JTextField txt_email,txt_firtName,txt_lastName,txt_birthday;
    public JComboBox box_gender;

    public CreateAccount(){

        setLayout(null);
        setSize(550,630);
        setResizable(false);
        setTitle("Create Account");
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(100,100,100));

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        label_firtName = new JLabel("Ingresa tu primer nombre:");
        label_firtName.setBounds(180,20,250,60);
        label_firtName.setFont(new Font("Andale Mono",2,14));
        label_firtName.setForeground(new Color(0,0,0));
        add(label_firtName);

        txt_firtName = new JTextField("");
        txt_firtName.setBounds(140,70,250,50);
        txt_firtName.setForeground(new Color(0,0,0));
        txt_firtName.setFont(new Font("Andale Mono",2,14));
        txt_firtName.setHorizontalAlignment(JTextField.CENTER);
        add(txt_firtName);

        label_lastName = new JLabel("Ingresa tu apellido:");
        label_lastName.setBounds(180,120,250,60);
        label_lastName.setFont(new Font("Andale Mono",2,14));
        label_lastName.setForeground(new Color(0,0,0));
        add(label_lastName);

        txt_lastName = new JTextField("");
        txt_lastName.setBounds(140,170,250,50);
        txt_lastName.setForeground(new Color(0,0,0));
        txt_lastName.setFont(new Font("Andale Mono",2,14));
        txt_lastName.setHorizontalAlignment(JTextField.CENTER);
        add(txt_lastName);

        label_email = new JLabel("Introduce tu Email:");
        label_email.setBounds(180,220,250,60);
        label_email.setFont(new Font("Andale Mono",2,14));
        label_email.setForeground(new Color(0,0,0));
        add(label_email);

        txt_email = new JTextField("example@mail.com");
        txt_email.setBounds(140,270,250,50);
        txt_email.setForeground(new Color(0,0,0));
        txt_email.setFont(new Font("Andale Mono",2,14));
        txt_email.setHorizontalAlignment(JTextField.CENTER);
        add(txt_email);

        label_birthday = new JLabel("Ingresa tu anio de naciemiento:");
        label_birthday.setBounds(180,320,250,60);
        label_birthday.setFont(new Font("Andale Mono",2,14));
        label_birthday.setForeground(new Color(0,0,0));
        add(label_birthday);

        txt_birthday = new JTextField("YYYY/MM/DD");
        txt_birthday.setBounds(140,370,250,50);
        txt_birthday.setForeground(new Color(0,0,0));
        txt_birthday.setFont(new Font("Andale Mono",2,14));
        txt_birthday.setHorizontalAlignment(JTextField.CENTER);
        add(txt_birthday);

        label_gender = new JLabel("Selecciona tu genero:");
        label_gender.setBounds(180,420,250,60);
        label_gender.setFont(new Font("Andale Mono",2,14));
        label_gender.setForeground(new Color(0,0,0));
        add(label_gender);

        box_gender = new JComboBox();
        box_gender.setBounds(140,470,250,50);
        box_gender.setForeground(new Color(0,0,0));
        box_gender.setFont(new Font("Andale Mono",2,14));
        box_gender.setBackground(new Color(255,255,255));
        box_gender.addItem("None");
        box_gender.addItem("Femenine");
        box_gender.addItem("Masculine");
        box_gender.addItem("Other");
        add(box_gender);

        bt_createAccount = new JButton("Next");
        bt_createAccount.setBounds(410,530,110,40);
        bt_createAccount.setFont(new Font("Andale Mono",2,14));
        bt_createAccount.addActionListener(this);
        add(bt_createAccount);

        bt_cancel = new JButton("Cancel");
        bt_cancel.setBounds(20,530,110,40);
        bt_cancel.setFont(new Font("Andale Mono",2,14));
        bt_cancel.addActionListener(this);
        add(bt_cancel);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
            MethodCreateAccount mca = new MethodCreateAccount();
        if(e.getSource() == bt_createAccount){


                mca.CreateCount(txt_firtName.getText().toString(),txt_lastName.getText().toString(),
                    txt_email.getText().toString(),txt_birthday.getText().toString());
                if(mca.getBandera() == 1){
                    this.dispose();
                }if(mca.getBandera() == 2){

                }


    }
        if(e.getSource() == bt_cancel){
            this.dispose();
            new LoginUser().setVisible(true);

        }
    }

    public static void main(String[] args) {

        new CreateAccount().setVisible(true);

    }
}
