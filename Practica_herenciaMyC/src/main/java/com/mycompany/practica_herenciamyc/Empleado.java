
package com.mycompany.practica_herenciamyc;

/**
 *
 * @author MABEL TORRES
 */
public class Empleado extends Persona {
    int salario;
    int horasExtra;
    String puesto;

    public Empleado(String nombre, String identificacion, int salario, int horasExtra, String puesto) {
        super(nombre, identificacion);
        this.salario = salario;
        this.horasExtra = horasExtra;
        this.puesto = puesto;
    }

    public void solicitudPermiso() {
        System.out.println(getNombre() + " ha solicitado un permiso.");
    }

    public void reporteHorasExtra() {
        System.out.println(getNombre() + " ha reportado " + horasExtra + " horas extra.");
    }

    public int getSalario() {
        return salario;
    }

    public int getHorasExtra() {
        return horasExtra;
    }
    public String getpuesto(){
        return puesto;
    }

}
