package Redaccio;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final ArrayList<Redactor> redactors = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio;
        do {
            System.out.println("\nMENU");
            System.out.println("1.- Introduir redactor");
            System.out.println("2.- Eliminar redactor");
            System.out.println("3.- Introduir notícia a un redactor");
            System.out.println("4.- Eliminar notícia");
            System.out.println("5.- Mostrar totes les notícies per redactor");
            System.out.println("6.- Calcular puntuació de la notícia");
            System.out.println("7.- Calcular preu-notícia");
            System.out.println("0.- Sortir");
            System.out.print("Selecciona una opció: ");
            opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio) {
                case 1 -> introduirRedactor();
                case 2 -> eliminarRedactor();
                case 3 -> introduirNoticia();
                case 4 -> eliminarNoticia();
                case 5 -> mostrarNoticiesRedactor();
                case 6 -> calcularPuntuacioNoticia();
                case 7 -> calcularPreuNoticia();
                case 0 -> System.out.println("Sortint del programa...");
                default -> System.out.println("Opció no vàlida.");
            }
        } while (opcio != 0);
        sc.close();
    }

    private static void calcularPreuNoticia() {

    }

    private static void calcularPuntuacioNoticia() {
    }

    private static void mostrarNoticiesRedactor() {
    }

    private static void eliminarNoticia() {
    }

    public static void introduirRedactor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el nom del redactor: ");
        String nom = sc.nextLine();
        System.out.print("Introdueix el DNI del redactor: ");
        String dni = sc.nextLine();
        System.out.print("Introdueix el sou del redactor: ");
        double sou = sc.nextDouble();
        sc.nextLine();
        Redactor redactor = new Redactor(nom, dni, sou);
        redactors.add(redactor);
        System.out.println("Redactor afegit correctament.");
    }

    public static void eliminarRedactor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el DNI del redactor a eliminar: ");
        String dni = sc.nextLine();
        boolean eliminat = false;
        for (Redactor redactor : redactors) {
            if (redactor.getDni().equals(dni)) {
                redactors.remove(redactor);
                System.out.println("Redactor eliminat correctament.");
                eliminat = true;
                break;
            }
        }
        if (!eliminat) {
            System.out.println("No s'ha trobat cap redactor amb aquest DNI.");
        }
    }

    public static void introduirNoticia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el DNI del redactor: ");
        String dni = sc.nextLine();
        Redactor redactor = null;
        for (Redactor r : redactors) {
            if (r.getDni().equals(dni)) {
                redactor = r;
                break;
            }
        }
        if (redactor == null) {
            System.out.println("No s'ha trobat cap redactor");
        }
    }
}