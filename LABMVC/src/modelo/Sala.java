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
  private int area;
  private String nombre;
  private boolean hayWifi; 

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
   * @param pArea area en metros cuadrados de la sala
   * @param pNombre nombre de la Sala
   * @param pHayWifi si la sala tiene o no wifi
   */
  public Sala(String pIdentificador, String pUbicacion, int pCapacidad, int pArea, String pNombre, boolean pHayWifi){
    this.identificador = pIdentificador;
    this.ubicacion = pUbicacion;
    this.capacidad = pCapacidad;
    this.area = pArea;
    this.nombre = pNombre;
    this.hayWifi = pHayWifi;
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
      public void setArea(int area) {
        this.area = area;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHayWifi(boolean hayWifi) {
        this.hayWifi = hayWifi;
    }

    public int getArea() {
        return area;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isHayWifi() {
        return hayWifi;
    }
}
