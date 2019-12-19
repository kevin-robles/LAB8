/**
 * Clase del objeto tipo Sala
 * 
 * @author kevin Robles, Raquel Rojas
 * @version 1.0
 */
package modelo;

public class Sala {
  private String identificador;
  private String ubicacion;
  private int capacidad;
  
  /**
   * Constructor vacío
   */
  public Sala(){}
  
  /**
   * Constructor con parametros
   * 
   * @param pIdentificador identificador de la sala
   * @param pUbicacion ubicacion de la sala
   * @param pCapacidad capacidad maxima de la sala
   */
  public Sala(String pIdentificador, String pUbicacion, int pCapacidad) {
    this.identificador = pIdentificador;
    this.ubicacion = pUbicacion;
    this.capacidad = pCapacidad;
  }
  
  public String getIdentificador() {
    return identificador;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public int getCapacidad() {
    return capacidad;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }
  
  
  
  
  
  
  
}
