package logica;

import java.util.Scanner;

public class ProcesoDePrestamos {

    public static void AlDiezPorCiento(){
        Scanner sc = new Scanner(System.in);
        double montoAPrestar=0.00;
        montoAPrestar = sc.nextDouble();

        if(montoAPrestar > 0 && montoAPrestar <= 60){

            System.out.println("Su prestamo se calcular con un interes de el 10% en lapso de tiempo de 60 dias");


        }
        if(montoAPrestar>=61 && montoAPrestar<=100){
            System.out.println("Su prestamo se calcular con un interes de el 12% en lapso de tiempo de 90 dias");
        }
    }

    public static void main(String[] args) {
        new ProcesoDePrestamos();
        AlDiezPorCiento();
    }
}
