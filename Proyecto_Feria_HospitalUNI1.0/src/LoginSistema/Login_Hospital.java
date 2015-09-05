/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSistema;

import Captcha.IngresarCaptcha;
import Conexion.HibernateUtil;
import Interfaces.MDI;
import Seguridad.EnviarCorreo;
import Validaciones.GhostText;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import org.hibernate.SessionFactory;

/**
 *
 * @author crdzbird
 */
public class Login_Hospital extends javax.swing.JFrame {

    EnviarCorreo enviarCorreo = new EnviarCorreo();

    int x = 0, intentos = 0;
    Key key = new Key();
    private static SessionFactory sf;

    public Login_Hospital() {
        initComponents();
        new GhostText(txtNombre, "Nombre de Usuario");
        new GhostText(txtPassword, "Clave del Usuario");
        this.lblIdenti.setVisible(false);
        setLocationRelativeTo(null);
        setResizable(false);
        this.txtPassword.addKeyListener(key);
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Salir");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnVerClave = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        txtRecuperarClave = new org.jdesktop.swingx.JXHyperlink();
        cmbUsuario = new org.jdesktop.swingx.JXComboBox();
        lblIdenti = new org.jdesktop.swingx.JXLabel();
        btnEnter = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoLogin.png"))); // NOI18N
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoLogin2.png"))); // NOI18N
        jcMousePanel1.setModo(4);
        jcMousePanel1.setTransparencia(0.1F);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/iconoLoginGeneral.png"))); // NOI18N

        txtNombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtNombre.setToolTipText("Nombre Usuario");
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));

        txtPassword.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        txtPassword.setToolTipText("Clave del Usuario");
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnVerClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mostrarClave.png"))); // NOI18N
        btnVerClave.setToolTipText("Mostrar Clave");
        btnVerClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVerClaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVerClaveMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerClaveMouseClicked(evt);
            }
        });

        Mensaje.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N

        txtRecuperarClave.setText("Recuperar Contraseña");
        txtRecuperarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecuperarClaveActionPerformed(evt);
            }
        });

        cmbUsuario.setMaximumRowCount(4);
        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo Usuario", "Administrador", "Medico", "Cajero" }));
        cmbUsuario.setToolTipText("Seleccion de Usuario");
        cmbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsuarioItemStateChanged(evt);
            }
        });
        cmbUsuario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbUsuarioPropertyChange(evt);
            }
        });

        lblIdenti.setText("__-");
        lblIdenti.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/accept.png"))); // NOI18N
        btnEnter.setToolTipText("Aceptar");
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(Mensaje)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(lblIdenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                            .addComponent(btnEnter)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSalir))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnVerClave)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtRecuperarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Mensaje)
                .addGap(18, 18, 18)
                .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnter)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecuperarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerClaveMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnVerClaveMouseClicked

    private void btnVerClaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerClaveMouseReleased
        // TODO add your handling code here:
        txtPassword.setEchoChar('\u25cf');
    }//GEN-LAST:event_btnVerClaveMouseReleased

    private void btnVerClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerClaveMousePressed
        // TODO add your handling code here:
        txtPassword.setEchoChar('\0');
    }//GEN-LAST:event_btnVerClaveMousePressed

    private void txtRecuperarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecuperarClaveActionPerformed
        // TODO add your handling code here:
        String correo = JOptionPane.showInputDialog(this, "Favor escribir su correo", "Informacion del Sistema", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtRecuperarClaveActionPerformed

    private void cmbUsuarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbUsuarioPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsuarioPropertyChange

    private void cmbUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUsuarioItemStateChanged
        // TODO add your handling code here:
        switch (cmbUsuario.getSelectedIndex()) {
            case 0:
                lblIdenti.setText("");
                this.lblIdenti.setVisible(false);
                break;
            case 1:
                lblIdenti.setText("ad-");
                this.lblIdenti.setVisible(true);
                break;
            case 2:
                lblIdenti.setText("me-");
                this.lblIdenti.setVisible(true);
                break;
            case 3:
                lblIdenti.setText("ca-");
                this.lblIdenti.setVisible(true);
                break;
        }
    }//GEN-LAST:event_cmbUsuarioItemStateChanged

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseClicked
        // TODO add your handling code here:
        Ejecutar();
        intentos++;
    }//GEN-LAST:event_btnEnterMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Ejecutar();
            intentos++;
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    public void Cerrar() {
        this.dispose();
    }

    public void Redimensionar() {
        this.pack();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(this.getClass().getResource("/Iconos/IconoInicio.png"));
        return retValue;
    }

    class Key extends KeyAdapter {

        @Override
        public void keyPressed(java.awt.event.KeyEvent evt) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                btnEnterMouseClicked(null);
            }
        }
    }

    public void esperar(int segundos) {

        try {
            Thread.sleep(segundos * 1000);
            this.btnEnter.setEnabled(true);
            this.btnVerClave.setEnabled(true);
        } catch (Exception e) {
            System.out.println("error");
        }

    }

    private void Ejecutar() {
        if (intentos == 3) {
            this.btnEnter.setEnabled(false);
            this.btnVerClave.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Numero de intentos maximos, intente en 1 min", "Espere por favor", JOptionPane.WARNING_MESSAGE);
            esperar(60);
            intentos = 0;
            return;
        }
        if (txtNombre.getText().length() == 0 || txtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Atencion, se deben llenar todos los campos para continuar", "Informacion del Sistema", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if ((txtNombre.getText().equals("root") && txtPassword.getText().trim().equals("lacb2208")) && cmbUsuario.getSelectedIndex() == 0) {
            new IngresarCaptcha(sf).setVisible(true);
            this.dispose();
        } else {
            sf = HibernateUtil.conexion(lblIdenti.getText() + txtNombre.getText(), txtPassword.getText(), "3306", "localhost");
            if (sf != null) {
                new MDI(sf).setVisible(true);
                Cerrar();
            } else {
                JOptionPane.showMessageDialog(this, "Revise su usuario y contraseña", "error en la conexion", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel btnEnter;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnVerClave;
    private org.jdesktop.swingx.JXComboBox cmbUsuario;
    private javax.swing.JLabel jLabel2;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private org.jdesktop.swingx.JXLabel lblIdenti;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private org.jdesktop.swingx.JXHyperlink txtRecuperarClave;
    // End of variables declaration//GEN-END:variables
}