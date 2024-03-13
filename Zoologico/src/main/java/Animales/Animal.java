package Animales;

public class Animal {
    private String nombre;
    private String especie;
    private int edad;
    private String genero;

    public Animal(String nombre, String especie, int edad, String genero) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.genero = genero;
    }

    public void alimentar() {
        System.out.println(nombre + " está siendo alimentado.");
    }

    public void monitorearSalud() {
        System.out.println("Monitoreando la salud de " + nombre);
    }

    public void comportamiento() {
        System.out.println(nombre + " está mostrando comportamiento normal.");
    }

    // Puedes agregar más métodos o atributos según tus necesidades

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
}