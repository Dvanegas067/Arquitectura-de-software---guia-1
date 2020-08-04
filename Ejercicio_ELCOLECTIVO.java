package ejercicio_elcolectivo;
import java.util.Scanner;

public class Ejercicio_ELCOLECTIVO {

    public static void main(String[] args) {
      
        int Pasaje = 10000, pago_conductor_porviaje = 2000, Cupo_colectivo, Grupo_turistas;
        int pago_total_turistas, pago_total_conductor, viajes;
        
        Scanner colectivo = new Scanner(System.in);
        
        System.out.println("cupo del colectivo ");
        Cupo_colectivo = colectivo.nextInt();
        
        System.out.println("Ingresa la cantidad de turistas ");
        Grupo_turistas = colectivo.nextInt();
        
        viajes = Grupo_turistas / Cupo_colectivo;
        pago_total_turistas = Pasaje * Grupo_turistas;
        pago_total_conductor = pago_conductor_porviaje * viajes;
        
        System.out.println("el numero de viajes que tiene que realizar el conductor es " +viajes+ " viajes");
        System.out.println("los turistas pagaran un total de " +pago_total_turistas+ " pesos");
        System.out.println("y el conductor debera pagar a la empresa dueña del coletivo un total de " +pago_total_conductor+ " pesos");
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
