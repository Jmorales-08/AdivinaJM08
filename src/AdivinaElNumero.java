import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int intento;
        boolean jugarDeNuevo = true;
        final int limiteIntentos = 10;

        while (jugarDeNuevo) {
            boolean adivinado = false;
            int numeroSecreto = random.nextInt(100) + 1;
            int intentosTotales = 0;

            System.out.println("Adivina el número entre 1 y 100 :)");

            do {
                System.out.print("Tu intento: ");
                intento = scanner.nextInt();
                intentosTotales++;

                if (intento==numeroSecreto) {
                System.out.println("FELICIDADES ACERTASTE EL NUMERO en el intento: " + intentosTotales);
                adivinado = true;
                } else if(intentosTotales < limiteIntentos){
                    int diferencia = Math.abs(intento - numeroSecreto);
                    if (diferencia >= 20) {
                        System.out.println("Friooo! prueba otro numero :)");
                    } else if(diferencia >= 10){
                        System.out.println("Tibioo! estas cerca, prueba otro numero :)");
                    } else{
                        System.out.println("CALIENTE CALIENTE!!!");
                    }
                }

                if(intentosTotales == limiteIntentos && !adivinado){
                    System.out.println("Limite de intentos alcanzados. :( el número era " + numeroSecreto);
                }
        } while (!adivinado);
        System.out.println("El juego terminó, Quieres intentarlo nuevamente? (S/N)");
        String respuesta = scanner.next().toLowerCase();
        jugarDeNuevo = respuesta.equals("s");
        }
        scanner.close();
    }
}
