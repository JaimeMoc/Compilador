// Jaime Alberto Suarez Moctezuma.
// Lenguajes y automatas II.

package analizadorlexico;

import java.util.List;

public class AnalizadorSintactico {

	public static void analizar(List<Token> tokens) {
		
		if (tokens.isEmpty()) {
			throw new RuntimeException("Expresión vacia.");
		} // Cierre del if
		
		if (tokens.get(0).getTipo() != Token.Tipos.NUMERO) {
			throw new RuntimeException("La expresión debe comenzar con un número.");
		} // Cierre del segundo if
		
		for (int i = 0; i < tokens.size(); i++) {
			
			Token token = tokens.get(i);
			if (i % 2 == 0) {
				
				if (token.getTipo() != Token.Tipos.NUMERO) {
					throw new RuntimeException("Se esperaba un número en la posición " + i + ": " + token.getValor());
				} // Cierre del if
			// Cierre del if		
			} else {
				if (token.getTipo() != Token.Tipos.OPERADOR) {
				throw new RuntimeException("Se esperaba un operador en la posición " + i + ": " + token.getValor());
				} // Cierre del if 
			} //Cierre del else
			
		} // Ciere del for
		
		if (tokens.get(tokens.size() - 1).getTipo() == Token.Tipos.OPERADOR) {
			throw new RuntimeException("La expresión no puede terminar en un operador.");
		}
		
		System.out.println("Sintaxis válida.");
		
	} // Cierre de analizar
}
