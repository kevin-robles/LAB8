/**
 * Clase encargada de las operaciones del usuario
 * 
 * @author Kevin Robles, Raquel Rojas
 * @version 1.0
 */
package controlador;
import dao.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.LoginForm;

public class ControladorUsuario implements ActionListener{
  public LoginForm vista;
  public UsuarioDAO dao;
  public Usuario modelo;
  
  /**
   * Constructor para el objeto controlador del usuario
   * 
   * @param pVista interfaz en la que se trabaja
   * @param pModelo usuario actual
   */
  public ControladorUsuario(LoginForm pVista,Usuario pModelo){
    vista = pVista;
    modelo = pModelo;
    dao = new UsuarioDAO(); //Encargado de administrar la base de datos
    
    this.vista.btIniciarLogin.addActionListener(this);
    this.vista.btCancelarLogin.addActionListener(this);
  }
  
  /**
   * Metodo para determinar accion realizada por el usuario
   * 
   * @param e accion realizada
   */
  public void actionPerformed(ActionEvent e){
    switch(e.getActionCommand()){
      case "Iniciar login":
        logIn();
        break;
      case "Cancelar login":
        cerrarVentanaLogin();
        break;
      default:
        break;
    }
  }
  
  /**
   * Metodo para iniciar sesion 
   */
  public void logIn(){
    if(vista.logInDatosCorrectos() == true){
      String nombreUsuario = vista.txtNombreUsuario.getText();
      String contraseña = vista.txtContraseña.getText();
    
      modelo = new Usuario(nombreUsuario,contraseña);
      Usuario usuarioActual = dao.iniciarSesion(modelo);
    
      if(usuarioActual != null){
        vista.setVisible(true);
        JOptionPane.showMessageDialog(vista,"Bienvenido: "+usuarioActual.getNombre());
        vista.setVisible(true);
      }else{
        JOptionPane.showMessageDialog(vista, "El usuario indicado no existe");
      }
    }else{
      JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
    }
  }
  
  /**
   * Metodo para cerrar ventana
   */
  public void cerrarVentanaLogin(){
    vista.cancelarIniciarSesion();
  }
}
