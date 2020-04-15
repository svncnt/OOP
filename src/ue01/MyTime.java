package ue01;

public class MyTime {
    private int h, m, s;

    public MyTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public void advance(int h, int m, int s) {

        if (this.s + s > 59)
            m++;
        this.s = (this.s + s) % 60;
        if (this.m + m > 59)
            h++;
        this.m = (this.m + m) % 60;
        this.h = (this.h + h) % 24;
    }

    public void reset(int h, int m, int s) {
        if (this.s - s < 0) {
            this.m--;
            this.s += 60;
        }
        this.s -= s;

        if (this.m - m < 0) {
            this.h--;
            this.m += 60;
        }
        this.m -= m;

        if (this.h - h < 0) {
            this.h += 24;
        }
        this.h -= h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if (h > 23 || h < 0)
            throw new IllegalArgumentException("Stunden müssen zwischen 0 und 23 liegen.");
        else
            this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        if (m > 59 || m < 0)
            throw new IllegalArgumentException("Minuten müssen zwischen 0 und 59 liegen.");
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        if (s > 59 || s < 0)
            throw new IllegalArgumentException("Sekunden müssen zwischen 0 und 59 liegen.");
        this.s = s;
    }

    public void print() {
        System.out.println(this.h + ":" + this.m + ":" + this.s);
    }
}
