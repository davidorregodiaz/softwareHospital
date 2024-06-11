
package controladora;

import excepction.ExceptionArregloLleno;
import excepction.ExceptionArregloVacio;
import excepction.ExceptionElementoFueraDeRango;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import modelo.*;
import util.ListaArreglo;


public class Hospital{
    private ListaArreglo<Paciente> pacientes;
    private ListaArreglo<AnalisisImagen> imagenes;
    private ListaArreglo<Enfermedad> enfermedades;
    
    private final int maxCapacidad=1000;

    public Hospital() {
        pacientes = new ListaArreglo<Paciente>();
        imagenes = new ListaArreglo<AnalisisImagen>();
        enfermedades = new ListaArreglo<Enfermedad>();
        
    }
    
    public ListaArreglo<Paciente> getPaciente() {
        return pacientes;
    }
    
    public int getCantRealPacientes() {
        return pacientes.cantElementos();
    }

    public int getCantRealImagen() {
        return pacientes.cantElementos();
    }

    public int getCantRealEnfermedad() {
        return enfermedades.cantElementos();
    }

    public int getMaxCapacidad() {
        return maxCapacidad;
    }
    
    
    public void addPaciente(Paciente _paciente)throws ExceptionArregloLleno {
            pacientes.aniadir(_paciente);
    }

    public ListaArreglo<AnalisisImagen> getImagen() {
        return imagenes;
    }

    public void addImagen(AnalisisImagen _imagen) throws ExceptionArregloLleno{
        imagenes.aniadir(_imagen);
    }

    public ListaArreglo<Enfermedad> getEnfermedad() {
        return enfermedades;
    }

    public void addEnfermedad(Enfermedad _enfermedad)throws ExceptionArregloLleno {
        enfermedades.aniadir(_enfermedad);
    }
    
    public void borrarPaciente(int posPaciente)throws ExceptionArregloVacio,ExceptionElementoFueraDeRango{
        if(0<=posPaciente && pacientes.cantElementos()>0){
            pacientes.eliminar(posPaciente);    
        }else{
            throw new ExceptionElementoFueraDeRango();
        }
                         
    }    
    public void borrarImagen(int posImagen)throws ExceptionElementoFueraDeRango,ExceptionArregloVacio{
        if(0<=posImagen && imagenes.cantElementos()>0){
            pacientes.eliminar(posImagen);    
        }else{
            throw new ExceptionElementoFueraDeRango();
        }
    }
    
    public void borrarEnfermedad(int posEnfermedad)throws ExceptionElementoFueraDeRango,ExceptionArregloVacio{
        if(0<=posEnfermedad && enfermedades.cantElementos()>0){
            pacientes.eliminar(posEnfermedad);    
        }else{
            throw new ExceptionElementoFueraDeRango();
        }
    }
     
    public ListaArreglo<Paciente> mostrarDatosPaciente(ListaArreglo<Paciente> pacientes){//mostrar datos del paciente con cantImagen y cantEnfermedades
        if(pacientes!=null){
            Array.get(this, pacientes.cantElementos());
        }
        return pacientes;
    }
    
    public void getMayorTalla(ListaArreglo<Paciente> pacientes)throws ExceptionArregloVacio, ExceptionElementoFueraDeRango{
        double aux;
        if(pacientes!=null){
            for(int i =0;i<pacientes.cantElementos()-1;i++){
                for(int j=i+1;j<pacientes.cantElementos();j++){
                    if((pacientes.obtener(i).getTalla())<(pacientes.obtener(j).getTalla())){
                        aux = pacientes.obtener(i).getTalla();
                        pacientes.obtener(i).setTalla(pacientes.obtener(j).getTalla());
                        pacientes.obtener(j).setTalla(aux);
                    }
                }
            }
            
        }
    
    }   

    public double getDengueSexoF(ListaArreglo<Paciente> pacientes,Enfermedad enfermedad) throws ExceptionArregloVacio, ExceptionElementoFueraDeRango{
        double cantDengueF=0;
        if(pacientes!=null && enfermedad !=null){
            for (int i=0;i<pacientes.cantElementos();i++) {
                if (((pacientes.obtener(i).getSexo().equalsIgnoreCase("f"))) &&(enfermedad.getNombreEnfermedad().equalsIgnoreCase("dengue"))){
                    cantDengueF++;
                } else {
                    ExceptionArregloVacio e = new ExceptionArregloVacio();
                    throw e;
                }
            }
    }
        return cantDengueF;
    }
    
    public void getNombreAlf(ListaArreglo<Paciente> pacientes,String cI) throws ExceptionElementoFueraDeRango{
        String aux;
        if(pacientes!=null){
            
            for(int i =0;i<pacientes.cantElementos()-1;i++){
                for(int j=i+1;j<pacientes.cantElementos();j++){
                    if(pacientes.obtener(i).getNombre().compareTo(pacientes.obtener(j).getNombre())>0){
                        aux = pacientes.obtener(i).getNombre();
                        pacientes.obtener(i).setNombre(pacientes.obtener(j).getNombre());
                        pacientes.obtener(j).setNombre(aux);
                    }
                }
            }
            
        }
    }
    
    public void getPesoOrdenado() throws ExceptionElementoFueraDeRango{
        double aux;
        if(pacientes!=null){
            
            for(int i =0;i<pacientes.cantElementos()-1;i++){
                for(int j=i+1;j<pacientes.cantElementos();j++){
                    if((pacientes.obtener(i).getPeso())<(pacientes.obtener(j).getPeso())){
                        aux = pacientes.obtener(i).getPeso();
                        pacientes.obtener(i).setPeso(pacientes.obtener(j).getPeso());
                        pacientes.obtener(j).setPeso(aux);
                    }
                }
            }
            
        }
    }
    
    public void exportarFichero(String rutaFichero)throws IOException, ExceptionElementoFueraDeRango{
        File file = new File(rutaFichero);
        FileOutputStream outputFile = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(outputFile);
        
        output.writeInt(pacientes.cantElementos());
        
        for(int i =0;i<pacientes.cantElementos();i++){
            output.writeObject(pacientes.obtener(i));
        }
        
        output.flush();
        output.close();
    }
    
    public void importarFichero(String rutaFichero)throws IOException, ClassNotFoundException, ExceptionArregloLleno{
        File file = new File(rutaFichero);
        FileInputStream inputFile = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(inputFile);
        
        int tcantRealPacientes=input.readInt();
        
        for(int i =0;i<tcantRealPacientes;i++){
            Object o=input.readObject();
            if(o instanceof Paciente){
               Paciente paciente = (Paciente) o;
               addPaciente(paciente);
        }
        }
        
        
        input.close();
    }   
    
}
