package logicapresasberes;

import java.util.Scanner;

/**
 *1190-22-102 Luis Armando Orozco Cifuentes
 * @author Luis Orozco
 */
import java.util.Scanner;

public class LogicaPresasberes {

    public static void main(String[] args) {
        
        //objeto Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una Palabra:");
        
         // Convertir la palabra a mayúsculas para facilitar el cálculo
        String palabra = sc.nextLine().toUpperCase();
        
         // Crear un arreglo con los valores de cada letra
        int[] valores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

        int total = 0;
        
        //bucle for-each para recorrer las letras de la palabra
        for (char letra : palabra.toCharArray()) {
            int posicion = letra - 'A';
            total += valores[posicion];
        }

        System.out.println("La puntuación para " + palabra + " es: " + total);
    }
}

    

