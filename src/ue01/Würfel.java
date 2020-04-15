package ue01;

public class Würfel extends Form3dimensional {
    double a;

    public Würfel(double a) {
        this.a = a;
    }

    @Override
    double berechneVolumen() {
        return 3 * a;
    }
}
