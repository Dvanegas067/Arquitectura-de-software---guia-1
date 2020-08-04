package ejercicio_distancia;
import java.util.Scanner;

 
public class EJERCICIO_DISTANCIA {

   
    public static void main(String[] args) {
        
        //declaramos las variables para las dos ciudades donde utilizaremos
        //t1, g1 para la latitud y longitud de la primera ciudad
        //t1, g2 para la latitud y longitud de la segunda ciudad
        
        double t1, g1 = 0, t2, g2;
        double distancia;                
                 
        
        Scanner Tierra = new Scanner(System.in);
       
        
        System.out.println("ingresa la latitud de la primera ciudad ");
        t1 = Tierra.nextShort();
        System.out.println("ingresa la longitud de la primera ciudad ");
        g2 = Tierra.nextDouble();
        System.out.println("ingresa la latitud de la segunda ciudad ");
        t2 = Tierra.nextDouble();
        System.out.println("ingresa la longitud de la segunda ciudad ");
        g2 = Tierra.nextDouble();
        
        
        distancia = 6371.07* Math.acos(Math.sin(t1) * Math.sin(t2) + Math.cos(t1) * Math.cos(t2) * Math.cos(g1 - g2));
        
        System.out.println("la distancia entre las dos ciudadaes es " +distancia+ " km");
        
        
        
        
        
        
    }    
}
