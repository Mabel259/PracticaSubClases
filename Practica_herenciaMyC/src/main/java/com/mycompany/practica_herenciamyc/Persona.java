
package com.mycompany.practica_herenciamyc;
/**
 *
 * @author MABEL TORRES
 */
public class Persona {
    String nombre;
    String identificacion;

    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
}

