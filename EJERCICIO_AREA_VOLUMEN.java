package ejercicio_area_volumen;
import java.util.Scanner;        
        

public class EJERCICIO_AREA_VOLUMEN {

     
    public static void main(String[] args) {
        
        double area, volumen;
        // Nombraremos la variable radio como r //
        
        double r = 0; 
        
        Scanner ESFERA = new Scanner(System.in);
        
        System.out.println(" Ingresa el radio ");
        r = ESFERA.nextDouble();
        
        area = Math.PI * (r*r);
        volumen = (4/3.0)* Math.PI * Math.pow(r, 3);
        
        System.out.println("El area del circulo es " +area+ " cm²");
        System.out.println("El volumen de la esfera " +volumen+ " cm³");
        
       
        
              
        
        
      
       
        
       
        
        
        
        
     
                
       
    }
    
    
}
