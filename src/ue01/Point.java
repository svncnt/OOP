package ue01;

public class Point {
    double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void negate() {
        this.x *= -1;
        this.y *= -1;
        this.z *= -1;
    }

    public double norm() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public void print() {
        System.out.println("( " + this.x + " / " + this.y + " / " + this.z + " )");
    }
}
