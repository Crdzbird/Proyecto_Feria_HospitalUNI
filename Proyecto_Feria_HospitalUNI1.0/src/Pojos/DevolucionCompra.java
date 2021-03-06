package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * DevolucionCompra generated by hbm2java
 */
public class DevolucionCompra  implements java.io.Serializable {


     private Integer idDevolucionCompra;
     private DetalleCompra detalleCompra;
     private EmpleadoLaboratorio empleadoLaboratorio;
     private Date fechaDevolucion;
     private int unidadesDevueltas;
     private BigDecimal costoDevolucionUnit;

    public DevolucionCompra() {
    }

    public DevolucionCompra(DetalleCompra detalleCompra, EmpleadoLaboratorio empleadoLaboratorio, Date fechaDevolucion, int unidadesDevueltas, BigDecimal costoDevolucionUnit) {
       this.detalleCompra = detalleCompra;
       this.empleadoLaboratorio = empleadoLaboratorio;
       this.fechaDevolucion = fechaDevolucion;
       this.unidadesDevueltas = unidadesDevueltas;
       this.costoDevolucionUnit = costoDevolucionUnit;
    }
   
    public Integer getIdDevolucionCompra() {
        return this.idDevolucionCompra;
    }
    
    public void setIdDevolucionCompra(Integer idDevolucionCompra) {
        this.idDevolucionCompra = idDevolucionCompra;
    }
    public DetalleCompra getDetalleCompra() {
        return this.detalleCompra;
    }
    
    public void setDetalleCompra(DetalleCompra detalleCompra) {
        this.detalleCompra = detalleCompra;
    }
    public EmpleadoLaboratorio getEmpleadoLaboratorio() {
        return this.empleadoLaboratorio;
    }
    
    public void setEmpleadoLaboratorio(EmpleadoLaboratorio empleadoLaboratorio) {
        this.empleadoLaboratorio = empleadoLaboratorio;
    }
    public Date getFechaDevolucion() {
        return this.fechaDevolucion;
    }
    
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public int getUnidadesDevueltas() {
        return this.unidadesDevueltas;
    }
    
    public void setUnidadesDevueltas(int unidadesDevueltas) {
        this.unidadesDevueltas = unidadesDevueltas;
    }
    public BigDecimal getCostoDevolucionUnit() {
        return this.costoDevolucionUnit;
    }
    
    public void setCostoDevolucionUnit(BigDecimal costoDevolucionUnit) {
        this.costoDevolucionUnit = costoDevolucionUnit;
    }




}


