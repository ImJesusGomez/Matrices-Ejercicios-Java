/*
INSTRUCCIONES: Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y 
               utilizar el carácter guion bajo como relleno. El tamaño de la x se basa en una variable n que indicará el 
               tamaño de la letra para imprimir en una matriz de n x n.
               
               El carácter "X" en mayúscula y el guion bajo "_" para los espacios.
 */
package matricesejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HacerUnaX {

    public static void main(String[] args) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // Preguntamos al usuario el tamaño de la x
        System.out.println("Indica la altura de la x: ");
        int alturaX = Integer.parseInt(teclado.readLine());

        // Validamos la altura
        if (alturaX <= 0) {
            System.out.println("ERROR!!!");
            System.exit(0);
        }

        // Declaramos la matriz 
        String[][] matrizEquis = new String[alturaX][alturaX];

        // Imprimimos la X
        int aux = 0;
        int aux2 = matrizEquis.length - 1;
        for (int i = 0; i < matrizEquis.length; i++) {
            for (int j = 0; j < matrizEquis[i].length; j++) {
                if (i == j || i == aux && j == aux2) {
                    matrizEquis[i][j] = "X";
                } else {
                    matrizEquis[i][j] = "_";
                }

                System.out.print(matrizEquis[i][j] + "");
            }
            aux++;
            aux2--;
            System.out.println();
        }

    }

}
