package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Medico generated by hbm2java
 */
public class Medico  implements java.io.Serializable {


     private Integer idMedico;
     private AreaTrabajo areaTrabajo;
     private Cargo cargo;
     private Usuario usuario;
     private String primernombre;
     private String segundonombre;
     private String primerapellido;
     private String segundoapellido;
     private String cedula;
     private String sexoMedico;
     private Date fechaContratacion;
     private String direccion;
     private boolean estado;
     private byte[] foto;
     private Set prestamos = new HashSet(0);
     private Set nominas = new HashSet(0);
     private Set especialidads = new HashSet(0);
     private Set diasMedicos = new HashSet(0);
     private Set citas = new HashSet(0);
     private Set hrsExtrases = new HashSet(0);

    public Medico() {
    }

	
    public Medico(AreaTrabajo areaTrabajo, Cargo cargo, Usuario usuario, String primernombre, String primerapellido, String cedula, String sexoMedico, Date fechaContratacion, String direccion, boolean estado) {
        this.areaTrabajo = areaTrabajo;
        this.cargo = cargo;
        this.usuario = usuario;
        this.primernombre = primernombre;
        this.primerapellido = primerapellido;
        this.cedula = cedula;
        this.sexoMedico = sexoMedico;
        this.fechaContratacion = fechaContratacion;
        this.direccion = direccion;
        this.estado = estado;
    }
    public Medico(AreaTrabajo areaTrabajo, Cargo cargo, Usuario usuario, String primernombre, String segundonombre, String primerapellido, String segundoapellido, String cedula, String sexoMedico, Date fechaContratacion, String direccion, boolean estado, byte[] foto, Set prestamos, Set nominas, Set especialidads, Set diasMedicos, Set citas, Set hrsExtrases) {
       this.areaTrabajo = areaTrabajo;
       this.cargo = cargo;
       this.usuario = usuario;
       this.primernombre = primernombre;
       this.segundonombre = segundonombre;
       this.primerapellido = primerapellido;
       this.segundoapellido = segundoapellido;
       this.cedula = cedula;
       this.sexoMedico = sexoMedico;
       this.fechaContratacion = fechaContratacion;
       this.direccion = direccion;
       this.estado = estado;
       this.foto = foto;
       this.prestamos = prestamos;
       this.nominas = nominas;
       this.especialidads = especialidads;
       this.diasMedicos = diasMedicos;
       this.citas = citas;
       this.hrsExtrases = hrsExtrases;
    }
   
    public Integer getIdMedico() {
        return this.idMedico;
    }
    
    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
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
    public String getSexoMedico() {
        return this.sexoMedico;
    }
    
    public void setSexoMedico(String sexoMedico) {
        this.sexoMedico = sexoMedico;
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
    public Set getPrestamos() {
        return this.prestamos;
    }
    
    public void setPrestamos(Set prestamos) {
        this.prestamos = prestamos;
    }
    public Set getNominas() {
        return this.nominas;
    }
    
    public void setNominas(Set nominas) {
        this.nominas = nominas;
    }
    public Set getEspecialidads() {
        return this.especialidads;
    }
    
    public void setEspecialidads(Set especialidads) {
        this.especialidads = especialidads;
    }
    public Set getDiasMedicos() {
        return this.diasMedicos;
    }
    
    public void setDiasMedicos(Set diasMedicos) {
        this.diasMedicos = diasMedicos;
    }
    public Set getCitas() {
        return this.citas;
    }
    
    public void setCitas(Set citas) {
        this.citas = citas;
    }
    public Set getHrsExtrases() {
        return this.hrsExtrases;
    }
    
    public void setHrsExtrases(Set hrsExtrases) {
        this.hrsExtrases = hrsExtrases;
    }




}


