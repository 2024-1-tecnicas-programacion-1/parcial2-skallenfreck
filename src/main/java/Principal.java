
import java.util.Scanner;
import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.TipoCombustible;
import parcial2.TipoMotocicleta;
import parcial2.Vehiculo;

    /*
    *Complejidad Temporal: complejidad constante O(1)
    */
public class Principal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String marca=sc.next();
        String modelo=sc.next();
        int año=sc.nextInt();
        Vehiculo vehiculo=new Vehiculo(marca, modelo, año);
        marca=sc.next();
        modelo=sc.next();
        año=sc.nextInt();  
        Vehiculo automovil=new Automovil(marca, modelo, año, año, TipoCombustible.HIBRIDO);
        marca=sc.next();
        modelo=sc.next();
        año=sc.nextInt();
        Vehiculo motocicleta= new Motocicleta(marca, modelo, año, TipoMotocicleta.DEPORTIVA);   
    }
}
