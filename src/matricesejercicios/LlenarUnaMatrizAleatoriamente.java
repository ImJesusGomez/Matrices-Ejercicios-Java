/*
INSTRUCCIONES: Escribe un programa que cree una matriz de enteros de 3x3 y la llene con números aleatorios entre 1 y 100.
 */
package matricesejercicios;

import java.util.Random;

public class LlenarUnaMatrizAleatoriamente {

    public static void main(String[] args) {

        Random random = new Random();

        // Creamos la matriz
        int[][] matrizAleatoria = new int[3][3];

        // Creamos la variable que almacera los numeros aleatorios
        int numeroAleatorio;

        // Llenamos la matriz de numeros aleatorios
        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                numeroAleatorio = random.nextInt(101);
                matrizAleatoria[i][j] = numeroAleatorio;
            }
        }

        // Mostramos la matriz
        System.out.println("Matriz Aleatoria: ");
        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria.length; j++) {
                System.out.print(matrizAleatoria[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
