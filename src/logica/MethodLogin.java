package logica;


import interfaces.LoginUser;
import interfaces.LoginUser.*;

import javax.swing.*;
import java.awt.*;
import interfaces.*;

public class MethodLogin{

    Person pe = new Person();
    LoginUser lg = new LoginUser();

//metodo encargado de validar los campso al inicar sesion 
    public void loginUser(String userName,String password){

        pe.setUserName(userName);
        pe.setPassword(password);

        if(!pe.getUserName().isEmpty() && !pe.getPassword().isEmpty()){
            JOptionPane.showMessageDialog(null,"Bienvenido a su sistema Bancario");
            lg.txt_login.setBackground(new Color(255,255,255));
            lg.txt_password.setBackground(new Color(255,255,255));



        }else {

            if (pe.getUserName().isEmpty() && pe.getPassword().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor completar los campos vacios");
                lg.txt_login.setBackground(new Color(255, 2, 12));
                lg.txt_password.setBackground(new Color(255, 2, 12));

            }
            if (!pe.getUserName().isEmpty() && pe.getPassword().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese su password");
                lg.txt_login.setBackground(new Color(255, 255, 255));
                lg.txt_password.setBackground(new Color(255, 2, 12));

            }
            if (pe.getUserName().isEmpty() && !pe.getPassword().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese su Username");
                lg.txt_login.setBackground(new Color(255, 2, 12));
                lg.txt_password.setBackground(new Color(255, 255, 255));


            }
        }

    }
}
