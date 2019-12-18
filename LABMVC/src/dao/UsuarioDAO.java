/**
 *
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
import modelo.Usuario;
import utilidad.ConexionBD;

public class UsuarioDAO {
  public Usuario iniciarSesion(Usuario usuario){
    try{
      Connection conexion = ConexionBD.getConexion();
      PreparedStatement consulta = conexion.prepareStatement("s");
      ResultSet respuesta = consulta.executeQuery();
      if(respuesta.getInt(1) == 0){
        usuario = null;
      }
    }catch(SQLException e){
      JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.PLAIN_MESSAGE);
    }
  return usuario;
  }
  
}
