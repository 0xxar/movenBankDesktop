package logica;

import interfaces.CentralMain;
import interfaces.CreateAccount;
import interfaces.CreateUserAndPassword;
import logica.Person.*;
import interfaces.CreateAccount.*;
import interfaces.CreateUserAndPassword.*;

import javax.swing.*;

public class MethodCreateAccount {

    Person person;
    private String firtsname;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPass() {
        return confirmedPass;
    }

    public void setConfirmedPass(String confirmedPass) {
        this.confirmedPass = confirmedPass;
    }

    private static String lastname;
    private static String birthday;
    private static String email;
    private String user;
    private String password;
    private String confirmedPass;


    public void CreateCount(String firtsname,String lastname,String email,String birthday){
        CreateAccount ca = new CreateAccount();
        setFirtsname(firtsname);
        setLastname(lastname);
        setEmail(email);
        setBirthday(birthday);

        if(!getFirtsname().isEmpty() && !getLastname().isEmpty() && !getEmail().isEmpty() && !getBirthday().isEmpty()){
            new CreateAccount().setVisible(false);
            new CreateUserAndPassword().setVisible(true);

        }else{
            if(getFirtsname().isEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor completar el Campo Nombre");
            }
            if(getLastname().isEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor completar el Campo Apellido");
            }
            if(getEmail().isEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor completar el Campo Email");
            }
            if(getBirthday().isEmpty()){
                JOptionPane.showMessageDialog(null,"Por favor completar el Campo Nacimiento");
            }

        }


    }

    public void CreateUserAndPass(String user, String password,String confirmPass){
        setUser(user);
        setPassword(password);
        setConfirmedPass(confirmPass);
        if(!getUser().isEmpty() && !getPassword().isEmpty() && !getConfirmedPass().isEmpty()){
            if(getPassword().equals(getConfirmedPass())){
                new CreateUserAndPassword().setVisible(false);
                new CentralMain().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Contrasenas no coinciden");
            }

        }else{

            if(getUser().isEmpty()){

                JOptionPane.showMessageDialog(null,"Completar el campo USER");
            }
            if(getPassword().isEmpty()){

                JOptionPane.showMessageDialog(null,"Completar el campo PASSWORD");
            }
            if(getConfirmedPass().isEmpty()){

                JOptionPane.showMessageDialog(null,"Completar el campo CONFIRMED PASSWORD");
            }
        }

    }
}
