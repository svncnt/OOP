package ue01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTimeTest {
    MyTime a;
    MyTime b;
    @BeforeEach
    void setUp() {
        System.out.println("setup:");
        a=new MyTime(16,15,2);
        a.print();
        b=new MyTime(23,59,59);
        b.print();
    }

    @Test
    void advance() {
        System.out.println("advance:");
        a.advance(3,44,27);
        a.print();
        b.advance(0,0,2);
        b.print();
    }

    @Test
    void reset() {
        System.out.println("reset:");
        a.reset(16,15,3);
        a.print();
    }
}