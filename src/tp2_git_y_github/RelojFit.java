
package tp2_git_y_github;

import java.time.LocalDate;
import java.time.LocalTime;

public class RelojFit extends Reloj {

    public RelojFit(LocalDate dia, LocalTime hora, String modelo, long numSerie) {
        super(dia, hora, modelo, numSerie);
    }

    public int cuentaPasos(int x, int y) {
        return (x + y);
    }

    public double frecuenciaAleatoria() {
        return Math.random() * 100;
    }
}
