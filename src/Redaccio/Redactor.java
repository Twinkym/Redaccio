package Redaccio;

public class Redactor  extends Redaccio {

    String nom;
    String dni;
    double sou;
    public Redactor(String nom, String dni, double sou) {
        this.nom = nom;
        this.dni = dni;
        this.sou = sou;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }


}