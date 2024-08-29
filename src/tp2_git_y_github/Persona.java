
package tp2_git_y_github;

public class Persona {
    private String nombre;
    private Reloj reloj;

    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }

    public void mostrarHoraReloj() {
        System.out.println("La hora del reloj es: " + reloj.getHora());
    }

    public void mostrarDiaReloj() {
        System.out.println("El día del reloj es: " + reloj.getDia());
    }

    public void incrementarDiaReloj() {
        reloj.incrementarDia();
    }

    public void incrementarHoraReloj() {
        reloj.incrementarHora();
    }
}
