package Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EntrenoUsuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@OneToMany(mappedBy = "entrenoUsuario",cascade = CascadeType.ALL)
private List<Entreno> entrenos;

@OneToMany(mappedBy = "entrenoUsuario", cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

    public EntrenoUsuario(Long id, List<Entreno> entrenos, List<Usuario> usuarios) {
        this.id = id;
        this.entrenos = entrenos;
        this.usuarios = usuarios;
    }

    public EntrenoUsuario() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Entreno> getEntrenos() {
        return entrenos;
    }

    public void setEntrenos(List<Entreno> entrenos) {
        this.entrenos = entrenos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
