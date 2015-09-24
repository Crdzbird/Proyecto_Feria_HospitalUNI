/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSistema;

import java.net.ServerSocket;
import javax.swing.JOptionPane;

/**
 *
 * @author ingdonaldo
 */
public class Main {

    private static ServerSocket SERVER_SOCKET;

    public static void main(String[] args) {

        try {
            SERVER_SOCKET = new ServerSocket(1334);
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            new Login_Hospital().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El Programa ya ha sido ejecutado", "Informacion del Sistema", JOptionPane.ERROR_MESSAGE);
        }

    }
}
