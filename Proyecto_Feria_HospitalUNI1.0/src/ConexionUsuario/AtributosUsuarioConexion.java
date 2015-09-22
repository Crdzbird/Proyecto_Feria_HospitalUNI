/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionUsuario;

/**
 *
 * @author Crdzbird
 */
public class AtributosUsuarioConexion {

    private static String User, Pass;

    public static String getUser() {
        return User;
    }

    public static void setUser(String User) {
        AtributosUsuarioConexion.User = User;
    }

    public static String getPass() {
        return Pass;
    }

    public static void setPass(String Pass) {
        AtributosUsuarioConexion.Pass = Pass;
    }

}
