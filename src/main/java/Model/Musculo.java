package Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "musculos")
public class Musculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Grupo grupos;

    @ManyToOne
    @JoinColumn(name = "ejercicio_id")
    private Ejercicio ejercicio;

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }


    public Musculo(int id, String nombre, Grupo grupos) {
        this.id = id;
        this.nombre = nombre;
        this.grupos = grupos;
    }

    public Musculo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo grupos) {
        this.grupos = grupos;
    }
}
