import java.util.Scanner;

public class w1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] palabras = { "JUEZA", "BIZCA", "VELOZ", "CUEVA", "IBIZA", "JEQUE", "KEBAB", "MARZO", "PLAZA", "TAPIZ",
				"ABEJA", "BAÑOS", "CASCO", "DOSIS", "ETAPA", "FOTOS", "SILLA", "HACHA", "ICONO", "JABON", "LEGAL",
				"MADRE", "NEVAR", "OCASO", "PULPA", "QUESO", "RANAS", "SAETA", "TERMA", "VIDEO" };

		int numAleatoria = (int) (Math.random() * palabras.length);
		String correcta = palabras[numAleatoria];
		String intento = "";
		String nombre = "";
		int i = 0;

		String cyan = "\033[36m";
		String amarillo = "\033[33m";
		String verde = "\033[32m";
		String reseteado = "\u001b[0m";
		String fondoverde = "\u001b[42m";
		String fondoamarillo = "\u001b[43m";

		Scanner lector = new Scanner(System.in);

		System.out.println("");
		System.out.println(
				cyan + " ##   ##        #####        ######        #####         ####          #######" + reseteado);
		System.out.println(
				cyan + " ##   ##       ##   ##        ##  ##        ## ##         ##            ##   #" + reseteado);
		System.out.println(
				cyan + " ##   ##       ##   ##        ##  ##        ##  ##        ##            ## " + reseteado);
		System.out.println(
				cyan + " ## # ##       ##   ##        #####         ##  ##        ##            ####" + reseteado);
		System.out.println(
				cyan + " #######       ##   ##        ## ##         ##  ##        ##   #        ## " + reseteado);
		System.out.println(
				cyan + " ### ###       ##   ##        ## ##         ##  ##        ##   #        ##  #" + reseteado);
		System.out.println(
				cyan + " ##   ##        #####        #### ##       #####         #######       #######" + reseteado);

		System.out.println("");
		System.out.println("");
		System.out.print(amarillo + " Introduce tu nombre: " + reseteado);
		nombre = lector.nextLine();
		System.out.println();
		System.out.println(amarillo + " ¡Bienvenid@ a Wordle " + nombre + "!" + reseteado);
		System.out.println(
				amarillo + " Tienes 6 intentos para adivinar la palabra de 5 letras del día, ¡suerte!" + reseteado);
		System.out.println("");
		System.out.println(amarillo
				+ " -------------------------------------------------------------------------------------" + reseteado);
		System.out.println("");

		// Bucle para realizar los 6 intentos
		do {
			i++;
			// Bucle para validar que la palabra tiene 5 letras
			do {
				System.out.print(cyan + " Intento " + i + ": " + reseteado);
				intento = lector.nextLine().toUpperCase();
			} while (intento.length() != 5);

			// Bucle para recorrer las 5 letras de la palabra introducida
			for (int j = 0; j < 5; j++) {

				// La letra coincide y esta en la posicion correcta
				if (intento.substring(j, j + 1).equals(correcta.substring(j, j + 1))) {
					System.out.print(" " + fondoverde + intento.substring(j, j + 1) + reseteado + " ");

					// La letra coincide pero esta en otra posicion
				} else if (correcta.indexOf(intento.substring(j, j + 1)) != -1) {
					System.out.print(" " + fondoamarillo + intento.substring(j, j + 1) + reseteado + " ");

					// La letra no esta
				} else {
					System.out.print(" " + intento.substring(j, j + 1) + " ");
				}
			}

			System.out.println("");
			System.out.println("");

		} while (!intento.equals(correcta) && i < 6);

		if (intento.equals(correcta)) {
			System.out.println(amarillo
					+ " --------------------------------------------------------------------------------------------------"
					+ reseteado);
			System.out.println("");
			System.out.println(verde
					+ " ##  ##   ##    ##      #####              ####     ##     ##   ##    ##     #####     #####   ##"
					+ reseteado);
			System.out.println(verde
					+ " ##  ##   ##   ####    ##   ##            ##  ##   ####    ###  ##   ####     ## ##   ##   ##    "
					+ reseteado);
			System.out.println(verde
					+ " ##  ##   ##  ##  ##   #                 ##       ##  ##   #### ##  ##  ##    ##  ##  ##   ##  ##"
					+ reseteado);
			System.out.println(verde
					+ " ##  #######  ##  ##    #####            ##       ##  ##   ## ####  ##  ##    ##  ##  ##   ##  ##"
					+ reseteado);
			System.out.println(verde
					+ " ##  ##   ##  ######        ##           ##  ###  ######   ##  ###  ######    ##  ##  ##   ##  ##"
					+ reseteado);
			System.out.println(verde
					+ "     ##   ##  ##  ##   ##   ##            ##  ##  ##  ##   ##   ##  ##  ##    ## ##   ##   ##  ##"
					+ reseteado);
			System.out.println(verde
					+ " ##  ##   ##  ##  ##    #####              #####  ##  ##   ##   ##  ##  ##   #####     #####   ##"
					+ reseteado);

		}

		if (!intento.equals(correcta)) {
			System.out.println(amarillo
					+ " --------------------------------------------------------------------------------------------------------------------"
					+ reseteado);
			System.out.println("");
			System.out
					.println(amarillo + " ¡No te quedan más intentos! La palabra correcta era " + correcta + reseteado);
			System.out.println("");
			System.out.println("");
			System.out.println(amarillo
					+ " ##   ##    ##      #####            ######   #######  ######   #####     ####    #####     #####               ## "
					+ reseteado);
			System.out.println(amarillo
					+ " ##   ##   ####    ##   ##            ##  ##   ##   #   ##  ##   ## ##     ##      ## ##   ##   ##             ## "
					+ reseteado);
			System.out.println(amarillo
					+ " ##   ##  ##  ##   #                  ##  ##   ##       ##  ##   ##  ##    ##      ##  ##  ##   ##       ##   ## "
					+ reseteado);
			System.out.println(amarillo
					+ " #######  ##  ##    #####             #####    ####     #####    ##  ##    ##      ##  ##  ##   ##            ## "
					+ reseteado);
			System.out.println(amarillo
					+ " ##   ##  ######        ##            ##       ##       ## ##    ##  ##    ##      ##  ##  ##   ##            ## "
					+ reseteado);
			System.out.println(amarillo
					+ " ##   ##  ##  ##   ##   ##            ##       ##   #   ##  ##   ## ##     ##      ## ##   ##   ##       ##    ## "
					+ reseteado);
			System.out.println(amarillo
					+ " ##   ##  ##  ##    #####            ####     #######  #### ##  #####     ####    #####     #####               ## "
					+ reseteado);
		}

		lector.close();

	}

}
