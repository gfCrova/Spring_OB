package com.example.SpringDataJPA_obs2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  // Entidad o Tabla de base de datos
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generar Id automaticamente
    private Long id;
    private String fabricante;
    private String modelo;
    private Integer anio;
    private String color;

    public Coche() {
    }

    public Coche(Long id, String fabricante, String modelo, Integer anio, String color) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", color='" + color + '\'' +
                '}';
    }
}
