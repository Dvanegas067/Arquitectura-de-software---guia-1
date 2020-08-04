package ejercicio_elpaseo;
import java.util.Scanner;

public class EJERCICIO_ELPASEO {
    
        
    public static void main(String[] args) {
        
        double dias, alumnos_gordos = 0, alumnos_flacos = 0; 
        double puestos_gordos, puestos_flacos, numero_platos, costo_total_comida, numero_habitaciones, costo_dia_habitaciones;
        double costo_total_habitaciones, numero_buses, cantidad_alumnos, sillas_totales; 
        double cupo_bus = 60;
        double sillas_gordos = 2; 
        double sillas_flacos = 1;
        double costo_comida = 10000;
        double alumnos_por_habitacion = 4;
        double costo_habitacion = 25000;
        double comida_gordos = 5;
        double comida_flacos = 3;
        
        Scanner Paseo = new Scanner(System.in);
        System.out.println("Ingresa el numero de dias que dura el paseo ");
        dias = Paseo.nextInt();
        System.out.println("Ingresa el numero de estudiantes gordos ");
        alumnos_gordos = Paseo.nextInt(); 
        System.out.println("Ingresa el numero de estudiantes flacos ");
        alumnos_flacos = Paseo.nextInt(); 
        
        
      
        cantidad_alumnos = (alumnos_gordos + alumnos_flacos);
        puestos_gordos = (sillas_gordos * alumnos_gordos);
        puestos_flacos = (sillas_flacos * alumnos_flacos);
        sillas_totales = (puestos_gordos + puestos_flacos);
        
        numero_buses = (sillas_totales / cupo_bus);
        numero_platos = (comida_gordos * alumnos_gordos) + (comida_flacos * alumnos_flacos); 
        costo_total_comida = (costo_comida * numero_platos) * dias;
        numero_habitaciones = cantidad_alumnos / alumnos_por_habitacion;
        costo_dia_habitaciones = numero_habitaciones * costo_habitacion;
        costo_total_habitaciones = costo_dia_habitaciones * dias;
                       
               
        
        System.out.println("el numero de buses que se necesitan es de " +Math.round(numero_buses)+ " buses para transportar " +Math.round(cantidad_alumnos)+ " alumnos");
        System.out.println("la cantidad de platos de comida a servir son " +Math.round(numero_platos)+ " platos de comida");
        System.out.println("el costo de la comida durante " +Math.round(dias)+ " dias tiene un costo de " +Math.round(costo_total_comida)+ " millones");
        System.out.println("se necesitan " + Math.round(numero_habitaciones)+ " habitaciones para los " +Math.round(cantidad_alumnos)+ " alumnos del paseo");
        System.out.println("el costo por dia de las " + Math.round(numero_habitaciones)+ "habitaciones tiene un valor de " + Math.round(costo_dia_habitaciones)+ " millones");
        System.out.println("y un costo total de " + Math.round(costo_total_habitaciones)+ " durante toda la estadia");
        
        
        
        
        
               
        
        
        
        
        
        
                
    

        
        
        
        
        
               
        
        
        
       
    }
    
}
