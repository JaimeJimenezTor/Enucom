package apartadoPractico;
import java.util.*;
public class Principal 
{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar el numero de candidatos
        System.out.print("Ingrese el número de candidatos: ");
        int numeroCandidatos;
        numeroCandidatos = entrada.nextInt();

        // Inicializar ArrayList para almacenar los votos de cada candidato
        ArrayList<Integer> votos = new ArrayList<>(numeroCandidatos);
        for (int i = 0; i < numeroCandidatos; i++) {
            votos.add(0); // Inicializar todos los votos a 0
        }

        // Solicitar el número de votantes
        System.out.print("Ingrese el número de votantes: ");
        int numeroDeVotantes = entrada.nextInt();

        // Proceso de votación
        for (int i = 0; i < numeroDeVotantes; i++) 
        {
           
          

            // Solicitar al votante que elija un candidato
            System.out.print("Votante " + (i + 1) + ", elija un candidato (1-" + numeroCandidatos + "): ");
            int voto = entrada.nextInt();

            // Validar que el voto sea válido
            if (voto >= 1 && voto <= numeroCandidatos) {
                // Registrar el voto
                votos.set(voto - 1, votos.get(voto - 1) + 1);
                System.out.println("Voto registrado con éxito.");
            } else {
                System.out.println("Voto inválido. Intente de nuevo.");
                i--; // Decrementar el índice para permitir que el votante vote nuevamente
            }
        }

        // Mostrar los resultados de las elecciones
        System.out.println("\nResultados de las elecciones:");
        for (int i = 0; i < numeroCandidatos; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos.get(i) + " votos");
        }

        // Determinar al ganador
        int indiceGanador = 0;
        for (int i = 1; i < numeroCandidatos; i++) {
            if (votos.get(i) > votos.get(indiceGanador)) {
                indiceGanador = i;
            }
        }

        System.out.println("\nEl ganador es el Candidato " + (indiceGanador + 1) + " con " + votos.get(indiceGanador) + " votos.");

    }
}
