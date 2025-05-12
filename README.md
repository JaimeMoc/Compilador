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
