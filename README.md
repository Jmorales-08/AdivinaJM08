# Adivina el Número 🔢🔥

Este es un juego simple de consola en Java. El objetivo es adivinar un número entre 1 y 100 generado aleatoriamente, con solo 10 intentos.

## Lógica del juego

- El juego genera un número secreto aleatorio entre 1 y 100.
- El jugador tiene hasta 10 intentos para adivinarlo.
- El programa entrega pistas según la cercanía del intento:
  - ❄️ **Frío**: diferencia de 20 o más
  - 🌤 **Tibio**: diferencia entre 10 y 19
  - 🔥 **Caliente**: diferencia menor a 10
- Al finalizar el juego, se puede elegir jugar de nuevo o no.

## Cómo ejecutarlo

1. Asegúrate de tener Java 17+ instalado.
2. Compila el archivo:
   ```bash
   javac src/AdivinaElNumero.java
