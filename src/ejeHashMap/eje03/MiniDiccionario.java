package ejeHashMap.eje03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MiniDiccionario {


	public static void main(String[] args) {
		var Diccionario = new HashMap <String, String>();
		Scanner sc = new Scanner(System.in);

		//10 palabras
		Diccionario.put("hola", "hello");
		Diccionario.put("hola", "hello");
		Diccionario.put("hola", "hello");
		Diccionario.put("hola", "hello");
		Diccionario.put("cerrar", "close");
		Diccionario.put("abrir", "open");
		Diccionario.put("comer", "eat");
		Diccionario.put("correr", "run");
		Diccionario.put("cantar", "sing");
		Diccionario.put("leer", "read");
		Diccionario.put("escribir", "write");
		Diccionario.put("tamaño", "size");
		Diccionario.put("pantalla", "screen");
		Diccionario.put("blanco", "white");
		Diccionario.put("arbol", "tree");

		
		ArrayList <String>seleccionadas = obtenerPalabras2(Diccionario,10);
		int puntos=0;
		for (String palabra:seleccionadas) {
			System.out.println("Palabra en español: " + palabra);
			System.out.println("Palabra en ingles: ");
			String palabraUsuario = sc.nextLine();
			if(Diccionario.get(palabra).equals(palabraUsuario)) {
				System.out.println("Respuesta correcta");
				puntos++;
			} else {
				System.out.println("Respuesta incorrecta");
			}
			
		}
		System.out.println("Total de puntos" + puntos);
	}

	private static ArrayList<String> obtenerPalabras(HashMap<String, String> diccionario, int numPalabras) {
		var listaEspañol = new ArrayList <String>(diccionario.keySet());
		var listaSeleccionada = new ArrayList <String>();
		var rd = new Random();
		
		for (int i=1; i <= numPalabras; i++) {
			boolean nueva = false;
			do {
			int posicion = rd.nextInt(listaEspañol.size());
			String palabra= listaEspañol.get(posicion);
			if ( !listaSeleccionada.contains(palabra)) {
			listaSeleccionada.add(palabra);
			nueva = true;
			}
			} while (!nueva);
		}
		return listaSeleccionada;
	}

	private static ArrayList<String> obtenerPalabras2(HashMap<String, String> diccionario, int numPalabras) {
		List <String> resu=  new ArrayList<String>(diccionario.keySet());
		
		//Barajeo
		Collections.shuffle(resu);
		resu = resu.subList(0, numPalabras);
		
		return new ArrayList <String>(resu);
		
	}
}
