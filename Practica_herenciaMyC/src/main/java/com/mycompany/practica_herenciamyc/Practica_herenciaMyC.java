package com.mycompany.practica_herenciamyc;
import java.util.Scanner;

/**
 *
 * @author MABEL TORRES
 */

public class Practica_herenciaMyC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Empleado empleado = new Empleado("Juan Garcia", "E123", 80000, 5, "Vendedor");
        Cliente cliente = new Cliente("Mabel Torres ", "C456", 1130, "Alta");

        int opcion = 0;

        while (opcion != 6) {
           
            System.out.println("1. Ver informacion (empleado)");
            System.out.println("2. Solicitar permiso (empleado)");
            System.out.println("3. Reportar horas extra (empleado)");
            System.out.println("4. Contactar representante (cliente)");
            System.out.println("5. Solicitar informacion (cliente)");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Empleado: " + empleado.nombre + ", ID: " 
                        + empleado.identificacion +
                        ", Puesto: " + empleado.puesto + ", Horas Extra:" + 
                        empleado.horasExtra +
                        ", Salario:" + empleado.salario);
            } else if (opcion == 2) {
                empleado.solicitudPermiso();
            } else if (opcion == 3) {
                empleado.reporteHorasExtra();
            } else if (opcion == 4) {
                cliente.contactarRepresentante();
            } else if (opcion == 5) {
                cliente.solicitarInformacion();
            } else if (opcion == 6) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion no valida. Intente de nuevo.");
            }

            System.out.println();  
        }
    }
}
