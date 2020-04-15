package ue01;

/**
 * rechtwinkliges Dreieck
 */
public class Dreieck extends Form2dimensional {

    double a, b, c;

    public Dreieck(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double berechneFlaeche() {
        return a * b / 2;
    }

    @Override
    double berechneUmfang() {
        return a + b + c;
    }
}
