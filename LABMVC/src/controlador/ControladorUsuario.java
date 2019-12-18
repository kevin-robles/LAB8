/**
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
  
  public ControladorUsuario(LoginForm pVista,Usuario pModelo){
    vista = pVista;
    modelo = pModelo;
    UsuarioDAO dao = new UsuarioDAO();
    
    this.vista.btIniciarLogin.addActionListener(this);
    this.vista.btCancelarLogin.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e){
    System.out.println(e.getActionCommand());
    switch(e.getActionCommand()){
        case "Iniciar LogIn":
            logIn();
            break;
        case "Cancelar LogIn":
            cerrarVentanaLogin();
            break;
        default:
            break;
    }
  }
  
  public void logIn(){
    if(vista.logInDatosCorrectos() == true){
      String nombreUsuario = vista.txtNombreUsuario.getText();
      String contraseña = vista.txtContraseña.getText();
    
      modelo = new Usuario(nombreUsuario,contraseña);
      Usuario usuarioActual = dao.iniciarSesion(modelo);
    
      if(usuarioActual != null){
        vista.setVisible(true);
        JOptionPane.showMessageDialog(vista,"Bienvenido: "+modelo.getNombre());
        vista.setVisible(true);
      }else{
        JOptionPane.showMessageDialog(vista, "El usuario indicado no existe");
      }
    }else{
      JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
    }
  }
  
  public void cerrarVentanaLogin(){
    vista.cancelarIniciarSesion();
  }
}
