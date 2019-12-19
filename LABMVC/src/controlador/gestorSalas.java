package controlador;

import modelo.Usuario;
import vista.LoginForm;

/**
 * Clase encargada de iniciar la aplicacion
 * 
 * @author Kevin Robles, Raquel Rojas
 * @version 1.0
 */
public class gestorSalas {
    /**
     * Metodo main, el cual es el punto de inicio del programa
     * 
     */
  public static void main(String[] args){
    LoginForm vista = new LoginForm();
    Usuario modelo = new Usuario();
      
    ControladorUsuario controladorUsuario = new ControladorUsuario(vista,modelo);
    controladorUsuario.vista.setVisible(true);
    controladorUsuario.vista.setLocationRelativeTo(null);
  }
    
}
