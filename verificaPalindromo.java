package ExerciciosComMetodos;

import javax.swing.JOptionPane;

public class verificaPalindromo {

	public static void main(String[] args) {

		String frase;

		do {

			try {

				frase = JOptionPane.showInputDialog(null, "Digite uma frase");

				frase = frase.replace(" ", "");

				if (frase == null || frase.isEmpty()) {

					JOptionPane.showMessageDialog(null, "Você não inseriu nenhuma informação ");

					break;

				}

				else {

					MetodoPalindromo.Palindromo(frase);

				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você inseriu dados inválidos ou fechou o programa incorretamente");

				break;
			}

		} while (frase != null);

	}

}
