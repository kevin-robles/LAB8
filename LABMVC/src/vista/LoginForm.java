/**
 *
 * @author kevin Robles, Raquel Rojas
 * @version 1.0
 */
package vista;

public class LoginForm extends javax.swing.JFrame {

  public LoginForm() {
    initComponents();
  }
  
  public boolean logInDatosCorrectos(){
    if (txtNombreUsuario.equals("") || txtContraseña.equals("")){
      return false;
    }
    return true;
  }
  
  public void abrirVentanaAnterior(LoginForm ventanaAnterior){
    ventanaAnterior.setVisible(true);
  }
  
  public void cancelarIniciarSesion(){
    System.exit(0);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombreUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btCancelarLogin = new javax.swing.JButton();
        btIniciarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombreUsuario.setText("Usuario");

        lbContraseña.setText("Contraseña");

        btCancelarLogin.setText("Cancelar login");

        btIniciarLogin.setText("Iniciar login");
        btIniciarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreUsuario)
                            .addComponent(lbContraseña))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btCancelarLogin)
                        .addGap(18, 18, 18)
                        .addComponent(btIniciarLogin)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarLogin)
                    .addComponent(btIniciarLogin))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btIniciarLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btCancelarLogin;
    public javax.swing.JButton btIniciarLogin;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbNombreUsuario;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
