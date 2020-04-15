package ue01;

public class Rechteck extends Form2dimensional {
    double a, b;

    public Rechteck(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double berechneFlaeche() {
        return a * b;
    }

    @Override
    double berechneUmfang() {
        return 2 * (a + b);
    }
}
