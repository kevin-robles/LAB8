/**
 * Clase encargada de administrar las salas con la base de datos
 * 
 * @author Kevin Robles, Raquel Rojas
 * @version 1.0
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Sala;
import utilidad.ConexionBD;

public class SalaDAO {
public String registrarSala(Sala sala){
    try{
      String nombre = sala.getNombre();
      String identificador = sala.getIdentificador();
      int area = sala.getArea();
      int capacidad = sala.getCapacidad();
      String ubicacion = sala.getUbicacion();
      int hayWifi = 0;
      if (sala.isHayWifi()){
        hayWifi = 1;
      }
     
      
      Connection conexion = ConexionBD.getConexion(); 
      PreparedStatement consulta = conexion.prepareStatement("select  esquema.ingresarSala(?,?,?,?,?,?)");
      consulta.setString(1, identificador);
      consulta.setString(2,ubicacion);
      consulta.setInt(3,capacidad);
      consulta.setInt(4,area);
      consulta.setString(5,nombre);
      consulta.setInt(6,hayWifi);
      consulta.executeQuery();
      
      return  "Se ha ingresado la sala correctamente";
    }catch(SQLException e){
      System.out.println(e);
      JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.PLAIN_MESSAGE);
      return "Error";
    }
  }    
}
