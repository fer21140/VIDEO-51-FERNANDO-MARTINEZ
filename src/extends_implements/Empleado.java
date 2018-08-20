//PROGRAMADOR: FERNANDO JOSÉ MARTÍNEZ FLORES
//FECHA: 02/08/2018
//CARNET DE ESTUDIANTE: 1190-17-4904

package extends_implements;

import java.util.*;



public class Empleado implements Trabajadores{
    
    
    
    String obtenerId(){   
        return id;
    }
    
    String obtenerNombre(){
        return nombre;//Devuelve el nombre
    }
    
    Float obtenerSueldo(){
        return sueldo;//Devuelve el sueldo
    }
    
    Date obtenerFechaDeAlta(){
        return fechaDeAlta;//Devuelve la fecha de contratación
    }
    
    void ingresarId(String ID){
        id=ID;//Da valor a la propiedad id
    }
    
    void ingresarNombre(String NOMBRE){
        nombre = NOMBRE;//Da un nombre
    }
    
    void ingresarSueldo(float SUELDO){
        sueldo = SUELDO; 
    }
    
    void ingresarFecha(){
    
      Date fecha2 = new Date();
      fechaDeAlta = fecha2;
        
    }
   
   
    public void ingresarDatos(){
    
        Scanner memoria = new Scanner(System.in);

        String id;
        String nombre;
        float sueldo;
        String fecha;

        System.out.println("Ingresa el id: ");
        id = memoria.nextLine();
        ingresarId(id);

        System.out.println("Ingresa el nombre: ");
        nombre = memoria.nextLine();
        ingresarNombre(nombre);
        
        System.out.println("Ingresa el sueldo: ");
        sueldo = memoria.nextFloat();
        ingresarSueldo(sueldo);
        
        ingresarFecha();//Obtenemos automaticamente la fecha
        
    }
    
    public double darBono(double gratificacion){
    
    
    return gratificacion + Trabajadores.bonoExtra;
    
    }
    
    private Date fechaDeAlta; 
    private String id;
    private String nombre;
    private float sueldo;
    
    
}
