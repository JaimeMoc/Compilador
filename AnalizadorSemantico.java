// Jaime Alberto Suarez Moctezuma.
// Lenguajes y automatas II.

package analizadorlexico;

// Importamos las librerias
import java.util.List;

public class AnalizadorSemantico {

	public static void analizar(List<Token> tokens) {
		
		for (int i=0; i < tokens.size(); i++) {
			Token token = tokens.get(i);
			
			if (token.getTipo() == Token.Tipos.OPERADOR && token.getValor().equals("/")) {
				Token siguiente = tokens.get(i + 1);
				if (siguiente.getTipo() == Token.Tipos.NUMERO && siguiente.getValor().equals("0")) {
					throw new RuntimeException("Error semántico: División entre cero en la posición " + (i + 1));
				} // Fin del segundo if
			} // Fin del primer if
			
		} // Cierre del for.
		
		System.out.println("Semantica válida.");
		System.out.println("Resultado: " + evaluar(tokens));
	
	} // Final del public static. 

	private static int evaluar(List<Token> tokens) {
		int resultado = Integer.parseInt(tokens.get(0).getValor());
		
		for (int i = 1; i < tokens.size(); i +=2) {
			String operador = tokens.get(i).getValor();
			int siguienteNumero = Integer.parseInt(tokens.get(i +1).getValor());
			
			switch (operador) {
			case "+": 
				resultado += siguienteNumero;
				break;
			case "-": 
				resultado -= siguienteNumero;
				break;
			case "*":
				resultado *= siguienteNumero;
				break;
			case "/": 
				resultado /= siguienteNumero;
				break;
			} // Cierre del SWITCH
		} // Cierre del for 
		
		return resultado;
		
	} // Cierre del Private Static int 
} // Final del public class. 
