package ejercicio_eficiencia_combustible;
import java.util.Scanner; 
public class EJERCICIO_EFICIENCIA_COMBUSTIBLE {

   
    public static void main(String[] args) {
        
        // 1 milla equivale a 1.609 km
        // 1 galon equivale 
        
        double Millas = 1.609;
        double galones = 3.785; 
        double MPG = 0, LPK = 0;
        
        Scanner Conversion = new Scanner( System.in ); 
        
        System.out.println(" Ingresa la cantidad de MPG ");
        MPG = Conversion.nextDouble();
        
        LPK = MPG * Millas / galones;
        
        System.out.println( "El consumo de LPK ES " +LPK);
        
        
        
        
       
        
       
        
        
        
        
       
      
        
        
        
    }
    
}
