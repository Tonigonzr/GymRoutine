package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "repeticiones")
public class Repeticion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Rutina rutina;

    @ManyToOne
    @JoinColumn(name = "id_ejercicio")
    private Ejercicio ejercicio;

    public int series;
    public int repeticiones;
    public int peso;

    public Repeticion(Long id, Rutina rutina, Ejercicio ejercicio, int series, int repeticiones, int peso) {
        this.id = id;
        this.rutina = rutina;
        this.ejercicio = ejercicio;
        this.series = series;
        this.repeticiones = repeticiones;
        this.peso = peso;
    }

    public Repeticion() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
