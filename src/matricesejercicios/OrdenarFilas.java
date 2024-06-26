/*
INSTRUCCIONES: Ordenar las filas de una matriz bidimensional
 */
package matricesejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrdenarFilas {

    public static void main(String[] args) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // Declaramos e inicializamos una matriz que será ordenado segun sus filas
        int[][] matriz = {
            {5, 3, 9, 8},
            {10, 12, 8, 10},
            {7, 9, 0, 6},
            {4, 5, 2, 6},};

        // Imprimimos la matriz original
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Usamos el ordenamiento burbuja
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                if(matriz[i][j] > matriz[i][j + 1]){
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[i][j + 1];
                    matriz[i][j + 1] =  aux;
                }
            }

        }
        
        System.out.println();
        
        // Imprimimos la matriz ordenada
        System.out.println("Matriz Ordenada");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
