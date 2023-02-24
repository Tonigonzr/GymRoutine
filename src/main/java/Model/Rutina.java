package Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Rutina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(mappedBy = "rutina",cascade = CascadeType.ALL)
    public List<Usuario> usuario;
    public String nombre;

    public String img;

    public Rutina(int id, List<Usuario> usuario, String nombre, String img) {
        this.id = id;
        this.usuario = usuario;
        this.nombre = nombre;
        this.img = img;
    }

    public Rutina() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
