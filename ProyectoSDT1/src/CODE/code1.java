package CODE;

import java.util.Random;

public class code1 {
    public static void main(String[] args) {
        int[] tabla = new int[5];
        Random rand = new Random();
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rand.nextInt(100);
            System.out.println(tabla[i]);
        }

        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - i - 1; j++) {
                if (tabla[j] > tabla[j + 1]) {
                
                    int temp = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = temp;
                }
            }
        }

        System.out.println("Ordenado good1:");

        for (int n : tabla) {
            System.out.println(n);
        }
    }
}

