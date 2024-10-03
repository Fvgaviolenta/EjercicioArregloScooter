/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemaarreglosscooter;

/**
 *
 * @author alfon
 */
public class Empleado {
    private String rut, nombreCompleto, genero;
    private int aniosServicio, edad;
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(String rut, String nombreCompleto, String genero, int aniosServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.aniosServicio = aniosServicio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado: " + "RUT: " + rut + ", Nombre Completo: " + nombreCompleto + ", Genero: " + genero + ", Anios de Servicio: " + aniosServicio + ", Edad: " + edad + ", Puesto: " + puesto.getNombre();
    }
    
    
}
