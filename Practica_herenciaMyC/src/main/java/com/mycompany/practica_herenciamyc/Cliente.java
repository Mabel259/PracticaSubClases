
package com.mycompany.practica_herenciamyc;

/**
 *
 * @author MABEL TORRES
 */
public class Cliente extends Persona {
    int idCliente;
    String nivelPrioridad;

    public Cliente(String nombre, String identificacion, int idCliente, String nivelPrioridad) {
        super(nombre, identificacion);
        this.idCliente = idCliente;
        this.nivelPrioridad = nivelPrioridad;
    }

    public void contactarRepresentante() {
        System.out.println(getNombre() + " ha contactado a un representante. "
                + "Nivel de prioridad: " + nivelPrioridad);
    }

    public void solicitarInformacion() {
        System.out.println(getNombre() + " ha solicitado su información. "
                + "Número de cliente: " + idCliente + "  Nivel de Prioridad: " + nivelPrioridad);
    }

    public int getidCliente() {
        return idCliente;
    }

    public String getNivelPrioridad() {
        return nivelPrioridad;
    }
  
}
