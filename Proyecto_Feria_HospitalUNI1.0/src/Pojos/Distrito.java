package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1



/**
 * Distrito generated by hbm2java
 */
public class Distrito  implements java.io.Serializable {


     private Integer idDistrito;
     private Municipio municipio;
     private int numeroDistrito;

    public Distrito() {
    }

    public Distrito(Municipio municipio, int numeroDistrito) {
       this.municipio = municipio;
       this.numeroDistrito = numeroDistrito;
    }
   
    public Integer getIdDistrito() {
        return this.idDistrito;
    }
    
    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    public int getNumeroDistrito() {
        return this.numeroDistrito;
    }
    
    public void setNumeroDistrito(int numeroDistrito) {
        this.numeroDistrito = numeroDistrito;
    }




}

