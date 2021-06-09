package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConexionBd {

   public static Connection conection(){

       try{
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3329/prestamosdb","root","0xXarF3RR0n-29");
                return cn;
       }catch (SQLException e){

           System.out.println("No se pudo conectar a la base de datos, por favor comuniquese con el administrador "+e);
       }
        return null;
   }
}
