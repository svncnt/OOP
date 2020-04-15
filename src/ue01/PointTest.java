package ue01;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point a,b;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        a = new Point(2,4,6);
        b = new Point(1,1,1);
    }

    @org.junit.jupiter.api.Test
    void negate() {
        System.out.println("negate");
        a.print();
        a.negate();
        a.print();
        b.print();
        b.negate();
        b.print();
    }

    @org.junit.jupiter.api.Test
    void norm() {
        System.out.println(a.norm());
        System.out.println(b.norm());
    }
}