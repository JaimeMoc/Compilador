// Jaime Alberto Suarez Moctezuma.
// LLenguajes y automatas II.

package analizadorlexico;

public class Token {

	private String valor; // Almacena el texto del token
	private Tipos tipo; // Enum indica el tipo del token
	
	// Métodos getters y setters
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Tipos getTipo() {
		return tipo;
	}

	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}

	enum Tipos {
		NUMERO ("[0-9]+"), // Coincide con uno o más dígitos 
		OPERADOR ("[\\+\\-\\*\\/]"); // Coincide con +,-,*,/
		
		public final String patron;
		
		Tipos(String s){
			this.patron = s;
		} // Cierre de constructor Tipos. 
		
	} // Cierra el enum Tipos 
	
}
