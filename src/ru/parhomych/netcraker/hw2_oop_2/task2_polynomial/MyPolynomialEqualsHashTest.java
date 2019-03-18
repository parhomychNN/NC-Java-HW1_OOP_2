package ru.parhomych.netcraker.hw2_oop_2.task2_polynomial;

public class MyPolynomialEqualsHashTest {
    public static void main(String[] args) {

        MyPolynomial polynomial1 = new MyPolynomial(1, 3, 2, 54.5);
        MyPolynomial polynomial2 = new MyPolynomial(-4.2, -10.1, 84.59 ,23.6);
        MyPolynomial polynomial3 = new MyPolynomial(2, 34.4, 74.5, -34.5, 1.1, 34.47);
        MyPolynomial polynomial4 = new MyPolynomial(2, 34.4, 74.5, -34.5, 1.1, 34.47);

        System.out.println(polynomial1);
        System.out.println(polynomial2);
        System.out.println(polynomial3);
        System.out.println(polynomial4);

        System.out.println("polynomial4.equals(polynomial3) --> " + polynomial4.equals(polynomial3));
        System.out.println("polynomial2.equals(polynomial3) --> " + polynomial2.equals(polynomial3));
        System.out.println("polynomial2.equals(polynomial2) --> " + polynomial2.equals(polynomial2));

        System.out.println();
        System.out.println("polynomial1.hashCode() --> " + polynomial1.hashCode());
        System.out.println("polynomial2.hashCode() --> " + polynomial2.hashCode());
        System.out.println("polynomial3.hashCode() --> " + polynomial3.hashCode());
        System.out.println("polynomial4.hashCode() --> " + polynomial4.hashCode());
    }
}
