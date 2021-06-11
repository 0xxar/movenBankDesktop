package interfaces;

import logica.MethodCreateAccount;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreateUserAndPassword extends JFrame implements ActionListener {

    JButton bt_createCount,bt_cancel;
    JTextField txt_createUser;
    JPasswordField txt_create_password, txt_confirmed_password;
    JLabel label_createUser,label_createPassword,label_ConfirmedPassword;
    public CreateUserAndPassword(){
            setLayout(null);
            setSize(500,550);
            setTitle("Create Account");
            setResizable(false);
            setLocationRelativeTo(null);

            getContentPane().setBackground(new Color(0,0,0));

            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            label_createUser = new JLabel("Create user");
            label_createUser.setBounds(200,30,200,40);
            label_createUser.setForeground(new Color(255,255,255));
            label_createUser.setFont(new Font("Andale Mono",3,14));
            add(label_createUser);

            txt_createUser = new JTextField("");
            txt_createUser.setBounds(170,70,150,40);
            txt_createUser.setFont(new Font("Andale Mono",2,14));
            txt_createUser.setBackground(new Color(255,255,255));
            txt_createUser.setHorizontalAlignment(JTextField.CENTER);
            add(txt_createUser);

            label_createPassword = new JLabel("Create Password");
            label_createPassword.setBounds(190,110,200,40);
            label_createPassword.setForeground(new Color(255,255,255));
            label_createPassword.setFont(new Font("Andale Mono",3,14));
            add(label_createPassword);

            txt_create_password = new JPasswordField("");
            txt_create_password.setBounds(170,150,150,40);
            txt_create_password.setFont(new Font("Andale Mono",2,14));
            txt_create_password.setBackground(new Color(255,255,255));
            txt_create_password.setHorizontalAlignment(JPasswordField.CENTER);
            add(txt_create_password);

            label_ConfirmedPassword = new JLabel("Confirmed Password");
            label_ConfirmedPassword.setBounds(170,190,200,40);
            label_ConfirmedPassword.setForeground(new Color(255,255,255));
            label_ConfirmedPassword.setFont(new Font("Andale Mono",3,14));
            add(label_ConfirmedPassword);

            txt_confirmed_password = new JPasswordField("");
            txt_confirmed_password.setBounds(170,240,150,40);
            txt_confirmed_password.setFont(new Font("Andale Mono",2,14));
            txt_confirmed_password.setBackground(new Color(255,255,255));
            txt_confirmed_password.setHorizontalAlignment(JPasswordField.CENTER);
            add(txt_confirmed_password);

            bt_createCount = new JButton("Create Account");
            bt_createCount.setBounds(150,310,180,40);
            bt_createCount.setFont(new Font("Andale Mono",1,14));
            bt_createCount.setForeground(new Color(0,0,0));
            bt_createCount.setBackground(new Color(255,255,255));
            bt_createCount.addActionListener(this);
            add(bt_createCount);


            bt_cancel = new JButton("Cancel");
            bt_cancel.setBounds(190,380,100,40);
            bt_cancel.setFont(new Font("Andale Mono",1,14));
            bt_cancel.setForeground(new Color(0,0,0));
            bt_cancel.setBackground(new Color(255,255,255));
            bt_cancel.addActionListener(this);
            add(bt_cancel);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
            MethodCreateAccount mca = new MethodCreateAccount();
        if(e.getSource() == bt_createCount){

                mca.CreateUserAndPass(txt_createUser.getText().toString(),
                        txt_create_password.getText().toString(),txt_confirmed_password.getText().toString());
                if(mca.getBandera()==1){
                    this.dispose();
                }if(mca.getBandera()==2){

            }


        }if(e.getSource() == bt_cancel){
            this.setVisible(false);
            new LoginUser().setVisible(true);
        }



    }

    public static void main(String[] args) {
        new CreateUserAndPassword().setVisible(true);
    }
}
