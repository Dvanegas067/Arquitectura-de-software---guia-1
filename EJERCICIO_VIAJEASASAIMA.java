package ejercicio_viajeasasaima;
import java.util.Scanner;


public class EJERCICIO_VIAJEASASAIMA {

    
    public static void main(String[] args) {
        
        //un viaje se completa cuando vaya y vuelva el camion, dado que solo se,
        // puede llevar un determiando kilo por viaje 
        
        int costodegasolina = 10000, kilosxviaje = 25, distancia = 80, galonporkilometro;
        int viajes , gasolina, kilos, galones, totalgalones;
         
        Scanner Camion = new Scanner(System.in);
        
        System.out.println("Ingresa el numero de kilos ");
        kilos = Camion.nextInt();  
        System.out.println("Ingresa el numero de galon por kilometro ");
        galonporkilometro = Camion.nextInt();  
        
                    
        
        
        viajes = kilos / kilosxviaje;
        galones = (distancia * 2)* galonporkilometro;
        totalgalones = galones * viajes;
        gasolina = totalgalones * costodegasolina;
        
        System.out.println("se necesita hacer " +viajes+ " viajes para transportar " +kilos+ " kilos y se requieren " +galones+ " galones de gasolina en cada viaje ");
        System.out.println("para un total de " +totalgalones+ " galones para transportar los " +100+ " kilos");
        System.out.println("adicion el costo de la gasolina tendra un valor de  " +gasolina);
        
     
       
       
                   
                         
           
                       
            }
    
}
