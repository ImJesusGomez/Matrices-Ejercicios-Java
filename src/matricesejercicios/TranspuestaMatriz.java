/*
INSTRUCCIONES: Realizar la transpuesta de una matriz
 */
package matricesejercicios;

public class TranspuestaMatriz {

    public static void main(String[] args) {

        // Declaramos e inicializamos la matriz
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},};

        // Imprimimos la matriz oiginal
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Creamos la transpuesta de la matriz original
        int aux;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                aux = matriz[j][i];
                matriz[j][i] = matriz[i][j];
                matriz[i][j] = aux;
            }
        }
        
        System.out.println();

        
        // Imprimimos la matriz transpuesta
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

    }

}
