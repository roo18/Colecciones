/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Persona {
    
    private String dni;
    private String nombre;
    private String ape1;
    private Sexo sexo;
    List<Coche> coches = new ArrayList<>();

    public Persona() {
    }

    public Persona(String dni, String nombre, String ape1, Sexo sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.sexo = sexo;
        this.coches = new ArrayList<>(); //Optativo, ya esta arriba.
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNombreCompleto() {
        String nombreCompleto;
        nombreCompleto = this.nombre + " " + this.ape1;
        return nombreCompleto;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }
    
    
}
