
package tp2_git_y_github;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        
        Reloj reloj = new Reloj(LocalDate.of(2024, 8, 20), LocalTime.of(10, 30), "Casio", 123456789);
        Persona persona = new Persona("Juan", reloj);
        
        persona.mostrarHoraReloj();
        persona.mostrarDiaReloj();
        persona.incrementarHoraReloj();
        persona.incrementarDiaReloj();
        
        RelojFit relojFit = new RelojFit(LocalDate.of(2024, 8, 21), LocalTime.of(12, 0), "FitModel", 987654321);
        System.out.println("Pasos contados: " + relojFit.cuentaPasos(5, 10));
        System.out.println("Frecuencia aleatoria: " + relojFit.frecuenciaAleatoria());
    }
}
