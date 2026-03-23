package ejeHashMap.eje02;



import java.util.HashMap;

import java.util.Scanner;



public class eje02 {

	

	public static void main (String[]args) {

		var datauser = new HashMap<String, String>();

		

		//Clave login, valor password

		datauser.put("root", "root");

		datauser.put("alumno", "alumno1");

		datauser.put("admin", "12345");

		datauser.put("master", "12345");

		

		int num_intentos= 0;

		boolean accesoConcedido= false;

		

		String login;

		String passwd;

		String passwd_store;

		Scanner sc= new Scanner(System.in);

		while (num_intentos < 3 && !accesoConcedido) {

			System.out.println("Login:");

			login = sc.nextLine();

			System.out.println("Passwd:");

			passwd = sc.nextLine();

			

			//Recupera la clave almacenada

			passwd_store = datauser.get(login);

			

			if (passwd_store !=null && passwd_store.equals(passwd)) {

				accesoConcedido= true;

			}else {

				System.out.println("Usuario y clave incorrectos");

				num_intentos++;

			}

		}

		if (accesoConcedido) {

			System.out.println("Ha accedido al área restringida");

		}else {

			System.out.println("Lo siento, no tiene acceso al área restringida");

			System.out.println("Lo siento, no tiene mas intentos");

		}

	}

}