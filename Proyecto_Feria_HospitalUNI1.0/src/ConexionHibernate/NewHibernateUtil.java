/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionHibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author crdzbird
 */
public class NewHibernateUtil {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory conexion(String login, String Contraseña, String Puerto, String IP) {
        try {
            try {
                Connection conexion = DriverManager.getConnection("jdbc:mysql://" + IP + ":" + Puerto + "/BaseDatosHospitalUNI", login, Contraseña);
                conexion.close();
            } catch (SQLException e) {
                return null;
            }
            sessionFactory = (SessionFactory) new Configuration()
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                    .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
                    .setProperty("hibernate.connection.url", "jdbc:mysql://" + IP + ":" + Puerto + "/BaseDatosHospitalUNI")
                    .setProperty("hibernate.connection.username", login)
                    .setProperty("hibernate.connection.password", Contraseña)
                    .addResource("Pojos/ExpedientePaciente.hbm.xml")
                    .addResource("Pojos/AreaTrabajo.hbm.xml")
                    .addResource("Pojos/Pais.hbm.xml")
                    .addResource("Pojos/Prestamo.hbm.xml")
                    .addResource("Pojos/FacturaConsulta.hbm.xml")
                    .addResource("Pojos/Compra.hbm.xml")
                    .addResource("Pojos/Enfermera.hbm.xml")
                    .addResource("Pojos/Cita.hbm.xml")
                    .addResource("Pojos/Nomina.hbm.xml")
                    .addResource("Pojos/Diagnostico.hbm.xml")
                    .addResource("Pojos/EmpleadoLaboratorio.hbm.xml")
                    .addResource("Pojos/Laboratorio.hbm.xml")
                    .addResource("Pojos/Paciente.hbm.xml")
                    .addResource("Pojos/Consulta.hbm.xml")
                    .addResource("Pojos/InventarioGeneral.hbm.xml")
                    .addResource("Pojos/Departamento.hbm.xml")
                    .addResource("Pojos/DetalleVenta.hbm.xml")
                    .addResource("Pojos/DevolucionCompra.hbm.xml")
                    .addResource("Pojos/Usuario.hbm.xml")
                    .addResource("Pojos/DetalleCompra.hbm.xml")
                    .addResource("Pojos/Proveedor.hbm.xml")
                    .addResource("Pojos/Venta.hbm.xml")
                    .addResource("Pojos/Distrito.hbm.xml")
                    .addResource("Pojos/TipoCambio.hbm.xml")
                    .addResource("Pojos/Cargo.hbm.xml")
                    .addResource("Pojos/Habitaciones.hbm.xml")
                    .addResource("Pojos/DetalleConsulta.hbm.xml")
                    .addResource("Pojos/DiasMedico.hbm.xml")
                    .addResource("Pojos/Producto.hbm.xml")
                    .addResource("Pojos/Cajero.hbm.xml")
                    .addResource("Pojos/PacienteInterno.hbm.xml")
                    .addResource("Pojos/Municipio.hbm.xml")
                    .addResource("Pojos/HrsExtras.hbm.xml")
                    .addResource("Pojos/Enfermedades.hbm.xml")
                    .addResource("Pojos/Medico.hbm.xml")
                    .addResource("Pojos/Especialidad.hbm.xml")
                    .buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        return sessionFactory;
    }

    public static void cerrarSessionFactory() {
        if (!sessionFactory.isClosed()) {
            sessionFactory.close();
        }
        else{
            JOptionPane.showMessageDialog(null, "La conexion ya ha sido cerrada con antelacion", "Notificacion del Sistema", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
