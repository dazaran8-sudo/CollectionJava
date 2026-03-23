package ejeArrayList.eje03;

import java.util.ArrayList;
import java.util.Random;

public class NumAleatorios {

    public static void main(String[] args) {

        Random rand = new Random();

        // Tamaño aleatorio entre 10 y 20
        int tamaño = rand.nextInt(11) + 10;

        ArrayList<Integer> lista = new ArrayList<>();

        // Llenar la lista con números aleatorios entre 0 y 100
        for (int i = 0; i < tamaño; i++) {
            int numero = rand.nextInt(101);
            lista.add(numero);
        }

        // a) Mostrar contenido
        System.out.println("Lista original: " + lista);

        // b) Calcular la suma
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        System.out.println("Suma total: " + suma);

        // c) Borrar números pares
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                lista.remove(i);
                i--; // corregir índice
            }
        }

        System.out.println("Lista sin pares: " + lista);

        // d) Reemplazar números divisibles entre 3 por 0
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 3 == 0) {
                lista.set(i, 0);
            }
        }

        System.out.println("Lista cambiando divisibles entre 3 por 0: " + lista);

        // e) Insertar 555 antes de números divisibles por 5
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 5 == 0) {
                lista.add(i, 555);
                i++; 
            }
        }

        System.out.println("Lista final: " + lista);
    }
}
