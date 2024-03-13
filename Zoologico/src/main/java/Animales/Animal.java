package Animales;


public class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;
    protected String genero;

    public Animal(String nombre, String especie, int edad, String genero) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.genero = genero;
    }

    public void alimentar() {
        System.out.println(nombre + " tiene comida.");
    }

    public void monitorearSalud() {
        System.out.println("Monitoreando la salud de " + nombre);
    }

    public void comportamiento() {
        System.out.println(nombre + " está mostrando comportamiento normal.");
    }

    // Obtener información del animal
    public String obtenerInformacion() {
        return "Nombre: " + nombre +
                ", Especie: " + especie +
                ", Edad: " + edad +
                ", Género: " + genero;
    }

    // Getter para el nombre
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