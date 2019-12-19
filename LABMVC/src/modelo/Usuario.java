/**
 * Clase para objetos tipo Usuario
 * 
 * @author kevin Robles, Raquel Rojas
 * @version 1.0
 */
package modelo;

public class Usuario {
  private String nombre;
  private String contraseña;
  
  /**
   * Constructor vacio
   */
  public Usuario() {}
  
  /**
   * Constructor con parametros
   * 
   * @param pNombre nombre de usuario del usuario
   * @param pContraseña clave de acceso
   */
  public Usuario(String pNombre, String pContraseña){
    nombre = pNombre;
    contraseña = pContraseña;
  }

  public String getNombre() {
    return nombre;
  }

  public String getContraseña() {
    return contraseña;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }
  
}
