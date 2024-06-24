/*
INSTRUCCIONES: Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula) construida a base del numero 1 y 
               utilizar el numero 0 como espacio. El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a 
               imprimir en una matriz de n x n.
*/
package matricesejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HacerUnaSilla {
    public static void main(String[] args) throws IOException {
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        // Preguntamos el tamaño de la matriz
        System.out.println("Indica el tamanio de la matriz: ");
        int n = Integer.parseInt(teclado.readLine());
        
        // Declaramos la matriz
        int[][] matrizSilla = new int[n][n];
        
        // Dibujamos la silla
        for(int i = 0; i < matrizSilla.length; i++){
            for(int j = 0; j < matrizSilla[i].length; j++){
                if(j == 0 || (int) n / 2 == i || j == matrizSilla[i].length - 1 && (int) n / 2 < i ){
                    matrizSilla[i][j] = 1;
                } else {
                    matrizSilla[i][j] = 0;
                }
                
                System.out.print(matrizSilla[i][j] + "");
            }
            System.out.println();
        }
        
    }
    
}
