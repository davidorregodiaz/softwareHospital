
package modelo;

import java.io.Serializable;
import util.Fecha;

public class Paciente implements Serializable{
    private AnalisisImagen [] imagen;
    private Enfermedad [] enfermedad;
    private String cI;
    private String nombre;
    private String apellidos;
    private Fecha fechaNacimiento;
    private String sexo;
    private double peso;
    private double talla;
    private String direccion;

    public Paciente() {
        this.imagen=null;
        this.enfermedad=null;
        this.cI=null;
        this.nombre=null;
        this.apellidos=null;
        this.fechaNacimiento=null;
        this.sexo=null;
        this.peso=0;
        this.talla=0;
        this.direccion=null;
    }

    public Paciente(AnalisisImagen[] imagen, Enfermedad[] enfermedad, String cI, String nombre, String apellidos, Fecha fechaNacimiento, String sexo, double peso, double talla, String direccion) {
        this.imagen = imagen;
        this.enfermedad = enfermedad;
        this.cI = cI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.talla = talla;
        this.direccion = direccion;
    }

    public AnalisisImagen[] getImagen() {
        return imagen;
    }

    public void setImagen(AnalisisImagen[] imagen) {
        this.imagen = imagen;
    }

    public Enfermedad[] getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad[] enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getcI() {
        return cI;
    }

    public void setcI(String cI) {
        this.cI = cI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
