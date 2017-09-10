import java.util.Scanner;
public class Suma {
    public static void main (String [] args){
        Scanner scn = new Scanner (System.in);
        float resultado;
        System.out.println("Primer sumando: ");
        float sumando1 = scn.nextFloat();
        System.out.println ("Segundo sumando: ");
        float sumando2 = scn.nextFloat ();
        resultado = sumando1 + sumando2;
        System.out.println ("El resultado es: " + resultado);
    }
}
