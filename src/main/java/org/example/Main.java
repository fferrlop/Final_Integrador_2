//Tres modulos, uno de animales, otro de visitantes y otro de habitats


package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

// dentro de main un constructor que compile zoologico y ordenar las jaulas organizando una ruta
// Zoo - habitat - animal - Necesita preguntar al visitante que tipo de animales quiere ver para la ruta
// Hacen falta dos menus, uno para trabajadores y otro para visitantes, por tanto las vacunas y tal sera para trabajadores y los animales y rutas para los visitantes
// Crear Package de trabajadores y visitantes