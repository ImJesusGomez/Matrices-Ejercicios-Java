/*
INSTRUCCIONES: Desarrolle un programa para rellenar una matriz de la siguiente manera: que contenga en las filas pares 10
               y en las columnas impares 11, el resto 0.
 */
package matricesejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrizParImpar {

    public static void main(String[] args) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // Pedimos al usuario el tamaño de la matriz
        System.out.println("Indica el tamanio de la matriz: ");
        int tamMatriz = Integer.parseInt(teclado.readLine());

        // Declaramos la matriz
        int[][] matriz = new int[tamMatriz][tamMatriz];

        // Llenamos la matriz segun el valor que le corresponde
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = 10;
                } else if (j % 2 != 0) {
                    matriz[i][j] = 11;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println();

        // Imprimimos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
