package ExerciciosComMetodos;

import javax.swing.JOptionPane;

public class MetodoPalindromo {

	public static void Palindromo(String frase) {

		String fraseInvertida = "";

		char caractere;

		for (int inicio = frase.length() - 1; inicio >= 0; inicio--) {

			caractere = frase.charAt(inicio);

			fraseInvertida += caractere;

		}

		fraseInvertida = fraseInvertida.toUpperCase();

		frase = frase.toUpperCase();

		if (frase.equals(fraseInvertida)) {

			JOptionPane.showMessageDialog(null,

					"Frase fornecida = " + frase + "\nFrase invertida = " + fraseInvertida
							+ " \nPortanto é um Palindromo");
		}

		else {

			JOptionPane.showMessageDialog(null, "A frase " + frase + " não é um Palindromo");
		}

	}

}
