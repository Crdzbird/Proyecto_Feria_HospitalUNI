package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Enfermera generated by hbm2java
 */
public class Enfermera  implements java.io.Serializable {


     private Integer idEnfermera;
     private AreaTrabajo areaTrabajo;
     private Cargo cargo;
     private Usuario usuario;
     private String primernombre;
     private String segundonombre;
     private String primerapellido;
     private String segundoapellido;
     private String cedula;
     private String sexoEnfermera;
     private Date fechaContratacion;
     private String direccion;
     private boolean estado;
     private byte[] foto;
     private Set pacienteInternos = new HashSet(0);

    public Enfermera() {
    }

	
    public Enfermera(AreaTrabajo areaTrabajo, Cargo cargo, Usuario usuario, String primernombre, String primerapellido, String cedula, String sexoEnfermera, Date fechaContratacion, String direccion, boolean estado) {
        this.areaTrabajo = areaTrabajo;
        this.cargo = cargo;
        this.usuario = usuario;
        this.primernombre = primernombre;
        this.primerapellido = primerapellido;
        this.cedula = cedula;
        this.sexoEnfermera = sexoEnfermera;
        this.fechaContratacion = fechaContratacion;
        this.direccion = direccion;
        this.estado = estado;
    }
    public Enfermera(AreaTrabajo areaTrabajo, Cargo cargo, Usuario usuario, String primernombre, String segundonombre, String primerapellido, String segundoapellido, String cedula, String sexoEnfermera, Date fechaContratacion, String direccion, boolean estado, byte[] foto, Set pacienteInternos) {
       this.areaTrabajo = areaTrabajo;
       this.cargo = cargo;
       this.usuario = usuario;
       this.primernombre = primernombre;
       this.segundonombre = segundonombre;
       this.primerapellido = primerapellido;
       this.segundoapellido = segundoapellido;
       this.cedula = cedula;
       this.sexoEnfermera = sexoEnfermera;
       this.fechaContratacion = fechaContratacion;
       this.direccion = direccion;
       this.estado = estado;
       this.foto = foto;
       this.pacienteInternos = pacienteInternos;
    }
   
    public Integer getIdEnfermera() {
        return this.idEnfermera;
    }
    
    public void setIdEnfermera(Integer idEnfermera) {
        this.idEnfermera = idEnfermera;
    }
    public AreaTrabajo getAreaTrabajo() {
        return this.areaTrabajo;
    }
    
    public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
    public Cargo getCargo() {
        return this.cargo;
    }
    
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getPrimernombre() {
        return this.primernombre;
    }
    
    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }
    public String getSegundonombre() {
        return this.segundonombre;
    }
    
    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }
    public String getPrimerapellido() {
        return this.primerapellido;
    }
    
    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }
    public String getSegundoapellido() {
        return this.segundoapellido;
    }
    
    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getSexoEnfermera() {
        return this.sexoEnfermera;
    }
    
    public void setSexoEnfermera(String sexoEnfermera) {
        this.sexoEnfermera = sexoEnfermera;
    }
    public Date getFechaContratacion() {
        return this.fechaContratacion;
    }
    
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public byte[] getFoto() {
        return this.foto;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public Set getPacienteInternos() {
        return this.pacienteInternos;
    }
    
    public void setPacienteInternos(Set pacienteInternos) {
        this.pacienteInternos = pacienteInternos;
    }




}


