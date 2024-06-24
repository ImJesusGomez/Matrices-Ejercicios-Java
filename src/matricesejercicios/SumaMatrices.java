package matricesejercicios;

import java.util.Random;

public class SumaMatrices {

    public static void main(String[] args) {

        Random random = new Random();

        // Creamos la matriz
        int[][] matrizUno = new int[3][3];
        int[][] matrizDos = new int[3][3];
        int[][] matrizSuma = new int[3][3];

        // Creamos la variable que almacera los numeros aleatorios
        int numeroAleatorio;

        // Llenamos la matriz de numeros aleatorios
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                numeroAleatorio = random.nextInt(101);
                matrizUno[i][j] = numeroAleatorio;
                numeroAleatorio = random.nextInt(101);
                matrizDos[i][j] = numeroAleatorio;
            }
        }

        // Realizamos la suma de las matrices
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                matrizSuma[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }

        // Mostramos las matrices
        System.out.println("Primera Matriz: ");
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                System.out.print(matrizUno[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();

        System.out.println("Segunda Matriz: ");
        for (int i = 0; i < matrizDos.length; i++) {
            for (int j = 0; j < matrizDos[i].length; j++) {
                System.out.print(matrizDos[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Suma de las Matrices: ");
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                System.out.print(matrizSuma[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
