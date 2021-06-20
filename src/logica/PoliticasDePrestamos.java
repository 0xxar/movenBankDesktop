package logica;

import interfaces.SolicitudPrestamoCliente;
import interfaces.SolicitudPrestamoCliente.*;

public class PoliticasDePrestamos {

    SolicitudPrestamoCliente spc;
   public double salario,nivelEndeudamiento,tasaInteres,cuotasAPagar, montoSolicitado, deudaActual,capacidadSalarial;
    public PoliticasDePrestamos(){

    }

    public void PoliticasPrestamos(){

        if(!spc.txt_nivelEndeudamiento.equals("") && !spc.txt_salario.equals("") && !spc.txt_deudaActual.equals("")){
            salario = Double.parseDouble(spc.txt_salario.getName().toString());
            nivelEndeudamiento = Double.parseDouble(spc.txt_nivelEndeudamiento.getText().toString());
            montoSolicitado = Double.parseDouble(spc.txt_MontoSolicitado.getText().toString());

            if(salario >= 500.00 && salario <= 700.00 && nivelEndeudamiento <= 30.00 && montoSolicitado <= 1500.00 ){
                spc.txt_interesPrestamo.setText("8.00 % mensual");
                spc.txt_tiempoAPagarPrestamo.setText("14 meses");
                spc.txt_PagoCuotas.setText("55.00");
                spc.txt_MontoSolicitado.setText("1500.00");

            }
            if(salario> 750.00 && salario <= 850 && nivelEndeudamiento <= 30.00 && montoSolicitado <= 1500 ){
                spc.txt_interesPrestamo.setText("10.00 mensual");
                spc.txt_tiempoAPagarPrestamo.setText("14 meses");
                spc.txt_PagoCuotas.setText("75.00");
                spc.txt_MontoSolicitado.setText("2500.00");

            }
        }


    }

    public void CalculoNivelEndeudamiento(/**double deudaActual, double salario, double capacidadSalarial**/){

       deudaActual = Double.parseDouble(spc.txt_deudaActual.getText().toString());
       salario = Double.parseDouble(spc.txt_salario.getText().toString());
       capacidadSalarial = (deudaActual / salario) * 100;



    }
}
