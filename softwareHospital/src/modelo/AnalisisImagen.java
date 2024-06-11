
package modelo;

import java.io.Serializable;
import util.Fecha;

public class AnalisisImagen implements Serializable{
    private String nombreArchivo;
    private Fecha fechaTomada;
    private String tipoImagen;
    private String comentario;

    public AnalisisImagen() {
        this.nombreArchivo=null;
        this.fechaTomada=null;
        this.tipoImagen=null;
        this.comentario=null;
    }

    public AnalisisImagen(String nombreArchivo, Fecha fechaTomada, String tipoImagen, String comentario) {
        this.nombreArchivo = nombreArchivo;
        this.fechaTomada = fechaTomada;
        this.tipoImagen = tipoImagen;
        this.comentario = comentario;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Fecha getFechaTomada() {
        return fechaTomada;
    }

    public void setFechaTomada(Fecha fechaTomada) {
        this.fechaTomada = fechaTomada;
    }

    public String getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(String tipoImagen) {
        this.tipoImagen = tipoImagen;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
