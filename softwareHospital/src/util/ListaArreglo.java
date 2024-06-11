/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import excepction.ExceptionElementoFueraDeRango;


public class ListaArreglo<T> {
    private int cantMax;
    private int cantReal;
    private T [] elementos;

    public ListaArreglo() {
        this.cantMax = 10;
        this.cantReal = 0;
        this.elementos = (T[]) new Object[this.cantMax];
    }

    public ListaArreglo(int cantMax, int cantReal, T[] elementos) {
        this.cantMax = cantMax;
        this.cantReal = cantReal;
        this.elementos = elementos;
    }
    
    
    
    public void aniadir(T valor){
        if(cantReal==cantMax){
            redimensionarArreglo();
        }else{
            elementos[cantReal]=valor;
            cantReal++;
        }
    }
    
    public void insertar(int pos,T valor) throws ExceptionElementoFueraDeRango{
        if(0<=pos && cantReal>pos){
            redimensionarArreglo();
            for(int i=cantReal;i>pos;i--){
                elementos[i]=elementos[i-1];
            }
            elementos[pos]=valor;
            cantReal++;
        }else{
            throw new ExceptionElementoFueraDeRango();
        }
    }
    
    public void eliminar(int pos) throws ExceptionElementoFueraDeRango{
        if(0<=pos && cantReal>pos){
            for(int i = pos;i<=cantReal-1;i++){
                elementos[i]=elementos[i+1];
            }
            cantReal--;
        }else{
            throw new ExceptionElementoFueraDeRango();
        }
    }
    public T obtener(int pos) throws ExceptionElementoFueraDeRango{
        if(0<=pos && cantReal>pos){
                return elementos[pos];
        }else{
            throw new ExceptionElementoFueraDeRango();
        }
    }
    public int cantElementos(){
        return cantReal;
    }
    private void redimensionarArreglo(){
        T [] copia = (T[]) new Object[this.cantMax];
        for(int i=0;i<cantMax;i++){
            copia[i]=elementos[i];
        }
        cantMax +=10;
        elementos = (T[]) new Object[this.cantMax];
        
        for(int i=0;i<=cantReal;i++){
            elementos[i]=copia[i];
        }
    }
}
