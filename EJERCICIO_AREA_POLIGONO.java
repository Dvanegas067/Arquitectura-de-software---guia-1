package ejercicio_area_poligono;
import java.util.Scanner;

public class EJERCICIO_AREA_POLIGONO {

    
    public static void main(String[] args) {
        
        double s, n, area;
        
        Scanner poligono = new Scanner(System.in);
        
        System.out.println("Ingresa la longitud de un lado del poligono ");
        s= poligono.nextInt();  
        System.out.println("Ingresa los lados del poligono  ");
        n= poligono.nextInt();
        
        
        area = (n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n)));
        
        System.out.println("el area del poligono regular es " + area);
                
    }
    
}
