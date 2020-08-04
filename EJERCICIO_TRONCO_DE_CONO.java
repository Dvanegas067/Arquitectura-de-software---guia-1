package ejercicio_tronco_de_cono;
import java.util.Scanner;

public class EJERCICIO_TRONCO_DE_CONO {
    
    public static void main(String[] args) {
        
        double R1, H1, R2, H2, altura_cono_truncado, Volumen;
        
        Scanner Tronco = new Scanner(System.in);
        
        System.out.println("Ingresa el numero de radio 1 ");
        R1= Tronco.nextInt();  
        System.out.println("Ingresa el numero de la altura 1");
        H1 = Tronco.nextInt(); 
        System.out.println("Ingresa el numero de radio 1 ");
        R2= Tronco.nextInt();  
        System.out.println("Ingresa el numero de la altura 1");
        H2 = Tronco.nextInt(); 
        
        altura_cono_truncado = (H1 - H2);        
        Volumen = (altura_cono_truncado * Math.PI / 3 ) * (Math.pow(R1, 2) + Math.pow(R2, 2) + R1 * R2);
        
        
        System.out.println("el volumen del tronco truncado es " +Volumen);
        
        
        
      
        
        
      
        
        
               
        
        
                
                
        
    }
    
}
