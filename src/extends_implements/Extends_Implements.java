
//PROGRAMADOR: FERNANDO JOSÉ MARTÍNEZ FLORES
//FECHA: 02/08/2018
//CARNET DE ESTUDIANTE: 1190-17-4904
//VIDEO NUMERO 50 INTERFACES Y CLASES INTERNAS

package extends_implements;

import java.util.*;

public class Extends_Implements {

    public static void main(String[] args) {
       
        Empleado nuevoEmpleado = new Empleado();//Instanciamos clase nuevo empleado
        Scanner memoria = new Scanner(System.in);    
        
        System.out.println("Ingresa datos del empleado");
        System.out.println();
        
        nuevoEmpleado.ingresarDatos();//Obtenemos datos
       
        System.out.println();
        System.out.println();
        System.out.println("Datos de la clase empleado");
        System.out.println();
        System.out.println("Id: " + nuevoEmpleado.obtenerId() + " Nombre: " +
                nuevoEmpleado.obtenerNombre() + " Sueldo: " + nuevoEmpleado.obtenerSueldo()
        + " Fecha de contratacion: " +  nuevoEmpleado.obtenerFechaDeAlta());
        
        Jefe nuevoJefe = new Jefe();//Creamos jefe
        
        System.out.println();
        
        System.out.println("Ahora ingresa datos del jefe...");
        System.out.println();
        nuevoJefe.ingresarDatos();
         
        System.out.println("Datos de la clase Jefe");
        System.out.println();
        System.out.println("Id: " + nuevoJefe.obtenerId() + " Nombre: " +
                nuevoJefe.obtenerNombre() + " Sueldo: " + nuevoJefe.obtenerSueldo()
        + " Fecha de contratacion: " +  nuevoJefe.obtenerFechaDeAlta());
        
        System.out.println();
        
        System.out.println("Cobrar bono14");
        System.out.println();
        System.out.println("Para empleado ingresa 1");
        System.out.println("Para jefe ingresa     2");
        int opcion = memoria.nextInt();
        float cantidad;
        System.out.println("Escribe la cantidad extra aparte del bono");
        cantidad= memoria.nextFloat();
        switch(opcion){
        
            case 1:
                    
                    System.out.println("El empleado: "+ nuevoEmpleado.obtenerNombre()+" ha recibido su bono de Q" + nuevoEmpleado.darBono(cantidad)); 
                    break;
            case 2:
                    System.out.println("El jefe: "+nuevoJefe.obtenerNombre()+" ha recibido su bono de Q"+nuevoJefe.darBono(1000));//Q1000 extra aparte del bono de Q 1500 y bono de productividad de jefes
                    break;
        }
        
       
        
        
//Código
        
    }

  
    
}
