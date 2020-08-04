package ejercicio_aritmetica;
import java.util.Scanner; 

public class Ejercicio_Aritmetica {

    public static void main(String [] args) {
       
        double A, B, suma, resta, producto, residuo, cociente, logaritmo, exponente ;
        
        Scanner Resultados = new Scanner( System.in );       
        
         System.out.print( "Ingresa el primer numero " );
        A = Resultados.nextInt();
        System.out.print( "ingresa el segundo numero " );
        B = Resultados.nextInt();  
               
        suma = A + B ;
        resta = A - B ;
        producto = A * B ;
        cociente  = A / B ;
        residuo = A % B ;  
        logaritmo = (double) Math.log10(A) ;
        exponente = (int) Math.pow(A, B) ;
       
                    
        System.out.println( "El resultado de la suma es = " +suma);
        System.out.println( "El resultado de la resta es = " +resta);
        System.out.println( "El resultado de producto es = " +producto);
        System.out.println( "El resultado de cociente es = " +cociente);
        System.out.println( "El resultado de residuo es = " +residuo);
        System.out.println( "El resultado del logaritmo A es = " +logaritmo); 
        System.out.println( "El resultado del exponente es = " +exponente);     
                
                                                                  
    }
    
}
