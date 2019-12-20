/**
 * Clase encargada de administrar las salas con la base de datos
 * 
 * @author Kevin Robles, Raquel Rojas
 * @version 1.0
 */
package dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.Sala;
import utilidad.ConexionBD;

public class SalaDAO {
  public boolean registrarSala(Sala sala){
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
      String query = "execute esquema.ingresarSala "
              + "@identificador = ?, @ubicacion = ?,@capacidad = ?,@area = ?,@nombre = ?, "
              + "@wifi = ?;";
      CallableStatement consulta = conexion.prepareCall(query);
      consulta.setString(1, identificador);
      consulta.setString(2,ubicacion);
      consulta.setInt(3,capacidad);
      consulta.setInt(4,area);
      consulta.setString(5,nombre);
      consulta.setInt(6,hayWifi);
      consulta.execute();
      return true;
    }catch(SQLException e){
      System.out.println(e);
      return false;
    }
  }    
}
