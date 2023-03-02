package com.example.GymRoutine.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    public String nombre;

    public String apellidos;
    public String email;
    public int telefono;
    public String poblacion;

    public String provincia;
    public String direccion;

    @ManyToOne
    @JoinColumn(name = "entrenoUsuario_id")
    private EntrenoUsuario entrenoUsuario;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Rutina> rutina;

    public Usuario(Long id, String nombre, String apellidos, String email, int telefono, String poblacion, String provincia, String direccion, EntrenoUsuario entrenoUsuario) {
        Id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.direccion = direccion;
        this.entrenoUsuario = entrenoUsuario;
    }

    public Usuario() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public EntrenoUsuario getEntrenoUsuario() {
        return entrenoUsuario;
    }

    public void setEntrenoUsuario(EntrenoUsuario entrenoUsuario) {
        this.entrenoUsuario = entrenoUsuario;
    }
}
