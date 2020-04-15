package ue01;

public class Kreis extends Form2dimensional {
    double r;

    public Kreis(double r) {
        this.r = r;
    }

    @Override
    double berechneFlaeche() {
        return Math.PI * r;
    }

    @Override
    double berechneUmfang() {
        return 2 * Math.PI * r;
    }
}
