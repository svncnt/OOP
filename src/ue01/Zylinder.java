package ue01;

public class Zylinder extends Form3dimensional {
    double r, h;

    public Zylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    double berechneVolumen() {
        return (Math.PI * (r * r)) * h;
    }
}
