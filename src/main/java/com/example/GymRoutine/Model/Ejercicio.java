package com.example.GymRoutine.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String nombre;

    @OneToMany(mappedBy = "ejercicio", cascade = CascadeType.ALL)
    private List<Musculo> musculos;
    public String img1;
    public String img2;
    public String index;

    public Ejercicio(long id, String nombre, List<Musculo> musculos, String img1, String img2, String index) {
        this.id = id;
        this.nombre = nombre;
        this.musculos = musculos;
        this.img1 = img1;
        this.img2 = img2;
        this.index = index;
    }

    public Ejercicio() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Musculo> getMusculos() {
        return musculos;
    }

    public void setMusculos(List<Musculo> musculos) {
        this.musculos = musculos;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
