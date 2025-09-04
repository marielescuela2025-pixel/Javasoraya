import java.util.Scanner;

public class Practica2MarielTriangulos {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del punto A (x y):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Ingrese las coordenadas del punto B (x y):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Ingrese las coordenadas del punto C (x y):");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
// Calculos
        double ladoAB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
        double ladoBC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double ladoCA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        System.out.printf("Lado AB: %.2f\n", ladoAB);
        System.out.printf("Lado BC: %.2f\n", ladoBC);
        System.out.printf("Lado CA: %.2f\n", ladoCA);
         if (ladoAB == ladoBC && ladoBC == ladoCA) { //  ab y bc y ca son iguales
            System.out.println("El triángulo es Equilátero.");
        } else if (ladoAB == ladoBC || ladoBC == ladoCA || ladoCA == ladoAB) {//todos lados iguales
            System.out.println("El triángulo es Isósceles.");
        } else {
            System.out.println("El triángulo es Escaleno.");
        }
    }//funciono con ejercicios del libro de geometria analitica y tmb la forma de poner los numeros
     // es con enter o seguidos con espacio separandolos ms no supe como poner que se separaran con coma
     
}

   
    
