/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.trabajo3.SwingElements.clasesBase;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Persona {
    private String nombre; 
    private String curp; 
    private String rfc; 
    private String genero; 
    private String direccion; 
    private ArrayList<String> apoyos; 

    public Persona() {
    }

    public Persona(String nombre, String curp, String rfc, String genero, String direccion, ArrayList<String> apoyos) {
        this.nombre = nombre;
        this.curp = curp;
        this.rfc = rfc;
        this.genero = genero;
        this.direccion = direccion;
        this.apoyos = apoyos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setApoyos(ArrayList<String> apoyos) {
        this.apoyos = apoyos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurp() {
        return curp;
    }

    public String getRfc() {
        return rfc;
    }

    public String getGenero() {     
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<String> getApoyos() {
        return apoyos;
    }
    
    
    @Override 
    public String toString(){
        String apoyosCadena = "";
        
        if(apoyos.size() > 0){
            for(String apoyo : apoyos){
                apoyosCadena += apoyo + ", "; 
            }
        }else{
            apoyosCadena = "No tiene apoyos"; 
        }
        
        String infoPersona = "\nNombre:  " + this.nombre + 
                         "\nCurp: " + this.curp.toUpperCase() + 
                         "\nGénero: " + this.genero + 
                         "\nRFC: " + this.rfc.toUpperCase() +
                         "\nLugar de origen: " + this.direccion + 
                         "\nApoyos: " + apoyosCadena; 
        return infoPersona; 
    }
}
