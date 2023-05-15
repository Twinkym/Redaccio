package Redaccio;

public class Noticias extends Redaccio implements F1, Futbol, Basquet, Motociclisme, Tenis {

    private String titular;
    private String text;
    private double puntuacio;
    private double preu;

    public Noticias(String titular, String text, double puntuacio, double preu, String competicio, String club, String jugador) {
        this.titular = titular;
        this.text = text;
        this.puntuacio = puntuacio;
        this.preu = preu;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(double puntuacio) {
        this.puntuacio = puntuacio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public Noticias(String titular){
        this.titular = titular;
        this.text = "";
        this.puntuacio = 0.0;
        this.preu = 0.0;
    }

}
