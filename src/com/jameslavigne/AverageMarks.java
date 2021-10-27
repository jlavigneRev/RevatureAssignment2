package com.jameslavigne;

/**
 * @author James Lavigne
 * Revature Assignment 2 : Q4
 */
abstract class Marks{
    double mark1;
    double mark2;
    double mark3;

    public Marks(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    abstract double getPercentage();
}

class A extends Marks{

    public A(double mark1, double mark2, double mark3) {
        super(mark1, mark2, mark3);
    }

    @Override
    double getPercentage() {
        return ((mark1 + mark2 + mark3) / 3);
    }
}

class B extends Marks{
    double mark4;

    public B(double mark1, double mark2, double mark3, double mark4){
        super(mark1, mark2, mark3);
        this.mark4 = mark4;
    }

    @Override
    double getPercentage() {
        return ((mark1 + mark2 + mark3 + mark4) / 4);
    }
}

public class AverageMarks {
    public static void main(String[] args) {
        A studentA = new A(83, 76.5, 94);
        B studentB = new B(65, 82.3, 76.8, 90.2);

        System.out.println("Average marks of Student A: " + studentA.getPercentage());
        System.out.println("Average marks of Student B: " + studentB.getPercentage());

    }
}
