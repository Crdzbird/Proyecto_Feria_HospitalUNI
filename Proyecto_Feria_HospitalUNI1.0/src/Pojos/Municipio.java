package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Municipio generated by hbm2java
 */
public class Municipio  implements java.io.Serializable {


     private Integer idMunicipio;
     private Departamento departamento;
     private String nombreMunicipio;
     private Set distritos = new HashSet(0);

    public Municipio() {
    }

	
    public Municipio(Departamento departamento, String nombreMunicipio) {
        this.departamento = departamento;
        this.nombreMunicipio = nombreMunicipio;
    }
    public Municipio(Departamento departamento, String nombreMunicipio, Set distritos) {
       this.departamento = departamento;
       this.nombreMunicipio = nombreMunicipio;
       this.distritos = distritos;
    }
   
    public Integer getIdMunicipio() {
        return this.idMunicipio;
    }
    
    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getNombreMunicipio() {
        return this.nombreMunicipio;
    }
    
    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }
    public Set getDistritos() {
        return this.distritos;
    }
    
    public void setDistritos(Set distritos) {
        this.distritos = distritos;
    }




}


