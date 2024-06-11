
package modelo;

import java.io.Serializable;
import util.Fecha;


public class Enfermedad implements Serializable{
    private String nombreEnfermedad;
    private Fecha fechaEnfermedad;
    private String tratamiento;

    public Enfermedad() {
        this.nombreEnfermedad=null;
        this.fechaEnfermedad=null;
        this.tratamiento=null;
    }

    public Enfermedad(String nombreEnfermedad, Fecha fechaEnfermedad, String tratamiento) {
        this.nombreEnfermedad = nombreEnfermedad;
        this.fechaEnfermedad = fechaEnfermedad;
        this.tratamiento = tratamiento;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public Fecha getFechaEnfermedad() {
        return fechaEnfermedad;
    }

    public void setFechaEnfermedad(Fecha fechaEnfermedad) {
        this.fechaEnfermedad = fechaEnfermedad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
}
