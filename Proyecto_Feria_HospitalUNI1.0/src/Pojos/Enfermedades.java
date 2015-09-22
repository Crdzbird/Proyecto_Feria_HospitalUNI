package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Enfermedades generated by hbm2java
 */
public class Enfermedades  implements java.io.Serializable {


     private Integer idEnfermedad;
     private String nombreEnfermedad;
     private Date fechaRegistro;
     private boolean enfermedadCronica;
     private Set expedientePacientes = new HashSet(0);

    public Enfermedades() {
    }

	
    public Enfermedades(String nombreEnfermedad, Date fechaRegistro, boolean enfermedadCronica) {
        this.nombreEnfermedad = nombreEnfermedad;
        this.fechaRegistro = fechaRegistro;
        this.enfermedadCronica = enfermedadCronica;
    }
    public Enfermedades(String nombreEnfermedad, Date fechaRegistro, boolean enfermedadCronica, Set expedientePacientes) {
       this.nombreEnfermedad = nombreEnfermedad;
       this.fechaRegistro = fechaRegistro;
       this.enfermedadCronica = enfermedadCronica;
       this.expedientePacientes = expedientePacientes;
    }
   
    public Integer getIdEnfermedad() {
        return this.idEnfermedad;
    }
    
    public void setIdEnfermedad(Integer idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }
    public String getNombreEnfermedad() {
        return this.nombreEnfermedad;
    }
    
    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public boolean isEnfermedadCronica() {
        return this.enfermedadCronica;
    }
    
    public void setEnfermedadCronica(boolean enfermedadCronica) {
        this.enfermedadCronica = enfermedadCronica;
    }
    public Set getExpedientePacientes() {
        return this.expedientePacientes;
    }
    
    public void setExpedientePacientes(Set expedientePacientes) {
        this.expedientePacientes = expedientePacientes;
    }




}


