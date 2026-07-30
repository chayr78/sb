package com.example.sb.Models;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private double altura = 0.0;
    private double peso = 0.0;

    public Persona(String nombre, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona() {
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }
}