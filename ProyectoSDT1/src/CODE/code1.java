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
    }
}
