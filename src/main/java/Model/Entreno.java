package Model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Entreno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String estado;

    public String progreso;
    public String descripcion;
    public int inicio;
    public int fin;
    @ManyToOne
    @JoinColumn(name = "entrenoUsuario_id")
    private EntrenoUsuario entrenoUsuario;

    public Entreno() {
    }

    public Entreno(long id, String estado, String progreso, String descripcion, int inicio, int fin, EntrenoUsuario entrenoUsuario) {
        this.id = id;
        this.estado = estado;
        this.progreso = progreso;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
        this.entrenoUsuario = entrenoUsuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProgreso() {
        return progreso;
    }

    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public EntrenoUsuario getEntrenoUsuario() {
        return entrenoUsuario;
    }

    public void setEntrenoUsuario(EntrenoUsuario entrenoUsuario) {
        this.entrenoUsuario = entrenoUsuario;
    }
}
