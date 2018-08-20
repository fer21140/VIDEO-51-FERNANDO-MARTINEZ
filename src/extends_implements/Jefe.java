
package extends_implements;


public class Jefe extends Empleado implements Jefes{//Un jefe puede subir el sueldo al empleado
    
   
    public void subirSueldo(float porcentaje, Empleado i){
    
        float nuevoSueldo = (i.obtenerSueldo()*porcentaje/100)+obtenerSueldo();
        float copiaSueldo = i.obtenerSueldo();
        
        i.ingresarSueldo(nuevoSueldo);
        System.out.println("El empleado " + i.obtenerNombre() +"ha aumentado su sueldo anterior de Q"+ copiaSueldo +" a Q " + i.obtenerSueldo());
    
    }//Fin de función subir sueldo
    
    public String tomarDecision(String decision){
    
        String decisionTomada="";
        
    return "Un miembro de la empresa ha tomado la decisión de: "+decision;
    }
    
    
    public double darBono(double gratificacion){
    double bonoProductividad = 1000;//Los jefes tienen un bono extra
    return gratificacion + Trabajadores.bonoExtra +bonoProductividad;
    }
    
}
