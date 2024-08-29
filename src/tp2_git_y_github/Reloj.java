
package tp2_git_y_github;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {
    private LocalDate dia;
    private LocalTime hora;
    private String modelo;
    private long numSerie;

    public Reloj(LocalDate dia, LocalTime hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void incrementarDia() {
        this.dia = dia.plusDays(1);
        System.out.println("El día ha sido incrementado a: " + this.dia);
    }

    public void incrementarHora() {
        this.hora = hora.plusHours(1);
        System.out.println("La hora a sido incrementada a: " + this.hora);
    }

    public void limpiarPantalla() {
        System.out.println("La pantalla ha sido limpiada.");
    }
}
