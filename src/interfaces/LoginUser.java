package interfaces;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import logica.MethodLogin;
import logica.Person;
import logica.Person.*;
import logica.MethodLogin.*;

public class LoginUser extends JFrame implements ActionListener {

    // variables
    String login_user = "";
    String login_pass ="";


    public JButton bt_login,bt_createCount;
    public JTextField txt_login;
    public JPasswordField txt_password;
    public JLabel label_down,label_logo,label_facebook,label_twitter,label_instaram;
    CardLayout cardLayout = new CardLayout();


    public LoginUser(){

        //metodo para que los objetos se puedan mover dentro del JFrame
        setLayout(null);
        setSize(450,650);
        setResizable(false);
        setTitle("Sistema de prestamos");
        setLocationRelativeTo(null);
        LoginUser.this.getRootPane().setBorder(new LineBorder(new Color(76, 41, 211)));

        getContentPane().setBackground(new Color(255,255,230));
        //setIconImage(new ImageIcon(getClass().getResource("")).getImage());

        //metodo para que la aplicacion no quede ne segundo plano
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("src/images/userLogin.png");
        label_logo = new JLabel(imageIcon);
        label_logo.setBounds(150,50,140,130);
        add(label_logo);

        txt_login = new JTextField("");
        txt_login.setBackground(new Color(255,255,255));
        txt_login.setBounds(110,200,220,50);
        txt_login.setFont(new Font("Andale Mono",1,12));
        txt_login.setHorizontalAlignment(JTextField.CENTER);
        add(txt_login);

        txt_password = new JPasswordField("");
        txt_password.setBackground(new Color(255,255,255));
        txt_password.setBounds(110,280,220,50);
        txt_password.setHorizontalAlignment(JTextField.CENTER);
        add(txt_password);

        bt_login = new JButton("Acceder");
        bt_login.setBounds(180,350,100,50);
        bt_login.setFont(new Font("Andale Mono",1,14));
        bt_login.addActionListener(this);
        add(bt_login);

        bt_createCount = new JButton("Registrarse");
        bt_createCount.setBounds(160,420,140,50);
        bt_createCount.setFont(new Font("Andale Mono",1,12));
        bt_createCount.addActionListener(this);
        add(bt_createCount);

        ImageIcon image_face = new ImageIcon("src/images/facebook.png");
        label_facebook = new JLabel(image_face);
        label_facebook.setBounds(90,480,80,80);
        add(label_facebook);

        ImageIcon image_twitter = new ImageIcon("src/images/gorjeo.png");
        label_twitter = new JLabel(image_twitter);
        label_twitter.setBounds(190,480,80,80);
        add(label_twitter);

        ImageIcon image_insta = new ImageIcon("src/images/instagram.png");
        label_instaram = new JLabel(image_insta);
        label_instaram.setBounds(290,480,80,80);
        add(label_instaram);


        label_down = new JLabel("Todos los derechos reservados 2021");
        label_down.setBackground(new Color(222,222,222));
        label_down.setBounds(120,550,220,40);
        label_down.setForeground(new Color(0,0,0));
        label_down.setFont(new Font("Andale Mono",1,12));
        add(label_down);

    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("src/images/bank.png"));
        return retValue;
    }

    public static void main(String[] args) {
            new LoginUser().setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        MethodLogin ml = new MethodLogin();
        Person user = new Person();

        if(e.getSource() == bt_login){


                    ml.loginUser(txt_login.getText().toString(), txt_password.getText().toString());
                    if(ml.getBandera()==1){
                        this.dispose();
                    }if(ml.getBandera()==2){

            }







        }if(e.getSource() == bt_createCount){
            this.dispose();
            ml.RegisterAccount();
        }



    }


}
