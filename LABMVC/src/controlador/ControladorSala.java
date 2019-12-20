/**
 * Clase encargada de las operaciones de la sala
 * 
 * @author Kevin Robles, Raquel Rojas
 * @version 1.0
 */
package controlador;


import dao.SalaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Sala;
import vista.RegistrarSala;


public class ControladorSala implements ActionListener{
  public SalaDAO dao;
  public Sala modelo;
  public RegistrarSala vista;
  public ControladorSala(RegistrarSala pVista , Sala pModelo){
    vista = pVista;
    modelo = pModelo;
    dao = new SalaDAO(); //Encargado de administrar la base de datos
  
    this.vista.btnRegistro.addActionListener(this);
    this.vista.btnRegreso.addActionListener(this);
  }
  
    /**
   * Metodo para determinar accion realizada por el usuario
   * 
   * @param e accion realizada
   */
  public void actionPerformed(ActionEvent e){
    switch(e.getActionCommand()){
      case "Registrar Sala":
        registrarSala();
        break;
      case "Regresar":
        break;
      default:
        break;
    }
  }
  
    /**
   * Metodo para registrar una sala
   */
  public void registrarSala(){
    if(vista.datosCorrectos() == true){
      int capacidad = Integer.parseInt(vista.txtCapacidad.getText());
      int area = Integer.parseInt(vista.txtArea.getText());
      String nombre = vista.txtNombre.getText();
      String ubicacion = vista.txtCapacidad.getText();
      String identificador = vista.txtId.getText();
      boolean hayWifi = vista.checkWifi.isSelected();
      System.out.println(hayWifi);
      Sala sala = new Sala(identificador, ubicacion, capacidad, area, nombre, hayWifi);
      Boolean bandera = dao.registrarSala(sala);
      if(bandera == true){
        JOptionPane.showMessageDialog(vista, "Sala ingresada correctamente");
        vista.abrirVentanaAnterior(new RegistrarSala());
      }else{
        JOptionPane.showMessageDialog(vista, "Error al ingresar la sala");
      }
      
      } else {
        JOptionPane.showMessageDialog(null, "Error al ingresar los datos, compruebe los datos "
            + "ingresados");
      }
  }   
}
