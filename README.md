# Proyecto: Analizador Léxico, Sintáctico y Semántico en Java

Este proyecto implementa un compilador básico en Java, que analiza expresiones matemáticas simples. Incluye las fases de análisis léxico, sintáctico y semántico, permitiendo validar y evaluar expresiones como `11 + 22 - 33`.

## 📌 Objetivo

El objetivo de este proyecto es demostrar el funcionamiento de las etapas fundamentales de un compilador mediante la creación de un sistema que:
- Identifica y clasifica tokens (análisis léxico).
- Verifica la estructura gramatical de una expresión (análisis sintáctico).
- Evalúa reglas semánticas como la división por cero (análisis semántico).

---

## 🗂️ Estructura del Proyecto

analizadorlexico (Nombre del proyecto )/

├── Pruebas.java # Contiene el método main y el flujo principal.

├── Token.java # Clase Token y definición del enum Tipos.

├── AnalizadorSintactico.java# Verifica estructura de la expresión.

├── AnalizadorSemantico.java # Evalúa la semántica y realiza el cálculo.


---

## 🔤 Análisis Léxico

El léxico convierte la entrada en una lista de **tokens**, que pueden ser:
- `NUMERO`: Secuencias numéricas (e.g., `10`, `42`)
- `OPERADOR`: Operadores válidos `+`, `-`, `*`, `/`

---

## 🔁 Análisis Sintáctico

Verifica la **estructura de la expresión**:
- Debe comenzar con un número.
- Se alternan `NUMERO` y `OPERADOR`.
- No puede terminar en un operador.

📌 *Ejemplo válido:* `4 + 5 - 2`  
🚫 *Ejemplo inválido:* `+ 5 5` o `4 +`

---

## 📐 Análisis Semántico

Aplica **reglas de sentido lógico**:
- ✅ Los operandos deben ser números.
- ❌ No se permite dividir entre cero.
- Evalúa la expresión solo si no hay errores semánticos.

---

## ⚙️ Ejecución

1. Clona el repositorio o copia los archivos a tu IDE Java.
2. Ejecuta `Pruebas.java`.
3. Ingresa una expresión cuando se te solicite.
4. Verás:
   - Lista de tokens detectados
   - Validación sintáctica
   - Verificación semántica
   - Resultado final

---

## 📌 Requisitos

- Java JDK 8 o superior
- IDE como Eclipse, IntelliJ o compilador en línea

---

## 👤 Autor

**Jaime Alberto Suárez Moctezuma**  
Lenguajes y Autómatas II — Instituto Tecnológico de Tuxtla Gutiérrez

---

## 📚 Créditos Académicos

Este proyecto fue desarrollado como parte del curso de **Lenguajes y Autómatas II**, con el fin de comprender de forma práctica las etapas de la construcción de un compilador simple.

---

## 📝 Licencia

Este código es de uso académico y educativo.

