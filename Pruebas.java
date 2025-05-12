// Jaime Alberto Suarez Moctezuma. 
// Lenguajes y Automatas II. 

package analizadorlexico;

// Importación de las librerias
import java.util.Scanner;
import analizadorlexico.Token.Tipos;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pruebas {

	// Función main.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una expresión matemática (ej: 11 + 22 - 33):");
		String entrada = sc.nextLine(); 
		
		try {
		ArrayList<Token> tokens = lex(entrada);
		
		// Se imprime cada token con su tipo y valor
		for (Token token : tokens) {
			System.out.println(token.getTipo() + " : " + token.getValor());
		}
		
		AnalizadorSintactico.analizar(tokens);
		AnalizadorSemantico.analizar(tokens);
		
		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	} // Cierre del método Main
	
	// Método que procesa la cadena y devuelve una serie de tokens
	private static ArrayList<Token> lex(String entrada) {
		
		final ArrayList<Token> tokens = new ArrayList<>();
		final StringTokenizer st = new StringTokenizer(entrada);
		
		while (st.hasMoreTokens()){
			String palabra = st.nextToken();
			boolean banderas = false;
			
			for (Tipos tokenTipo: Tipos.values()) {
				
				Pattern patron = Pattern.compile(tokenTipo.patron);
				Matcher busqueda = patron.matcher(palabra);
				
				if (busqueda.matches()) {
					Token token = new Token();
					
					token.setTipo(tokenTipo);
					token.setValor(palabra);
					tokens.add(token);
					banderas = true;
				} // Cierre del if
				
			} // Cierre de for
			
			if (!banderas) {
				throw new RuntimeException("Token invalido:" + palabra);
			} //fin del if	
		}// Cierre del while
		
		return tokens;
	}
}