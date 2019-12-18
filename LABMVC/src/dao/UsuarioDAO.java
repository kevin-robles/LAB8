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
      String nombreUsuario = usuario.getNombre();
      String contraseña = usuario.getContraseña();
      Connection conexion = ConexionBD.getConexion();
      PreparedStatement consulta = conexion.prepareStatement("select esquema.validarUsuario(?,?)");
      consulta.setString(1, nombreUsuario);
      consulta.setString(2,contraseña);
      ResultSet respuesta = consulta.executeQuery();
      while(respuesta.next()){
        if(respuesta.getInt(1) == 0){
          usuario = null;
        }
      } 
    }catch(SQLException e){
      System.out.println(e);
      JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.PLAIN_MESSAGE);
    }
  return usuario;
  }
  
}
