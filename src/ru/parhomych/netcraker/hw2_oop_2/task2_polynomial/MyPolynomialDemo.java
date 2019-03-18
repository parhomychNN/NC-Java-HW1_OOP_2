package ru.parhomych.netcraker.hw2_oop_2.task2_polynomial;

public class MyPolynomialDemo {
    public static void main(String[] args) {

        MyPolynomial polynomial1 = new MyPolynomial(1, 3, 2);
        MyPolynomial polynomial2 = new MyPolynomial(-4.2, -10.1, 23.6);
        MyPolynomial polynomial3 = new MyPolynomial(2, 34.4, -34.5, 1.1, 34.47);
        MyPolynomial polynomial4 = new MyPolynomial(3, 2);
        MyPolynomial polynomial5 = new MyPolynomial(1, 3);

        System.out.println("Polynomial1[degree-->"+ polynomial1.getDegree() +"] = " + polynomial1);
        System.out.println("Polynomial2[degree-->"+ polynomial2.getDegree() +"] = " + polynomial2);
        System.out.println("Polynomial3[degree-->"+ polynomial3.getDegree() +"] = " + polynomial3);

        System.out.println();

        System.out.println("Evaluate Polynomial1: "+ polynomial1 +" [x = 2] --> " + polynomial1.evaluate(2));
        System.out.println("Evaluate Polynomial2: "+ polynomial2 +" [x = 2] --> " + polynomial2.evaluate(2));
        System.out.println("Evaluate Polynomial3: "+ polynomial3 +" [x = 2] --> " + polynomial3.evaluate(2));

        System.out.println();

        System.out.println("Polynomial1 = " + polynomial1);
        System.out.println("Polynomial2 = " + polynomial2);

        System.out.println("Add polynomial1 and polynomial2: " + polynomial1.add(polynomial2));
        System.out.println("Multiply polynomial1 and polynomial2: " + polynomial1.multiply(polynomial2));
        System.out.println("Multiply polynomial4 and polynomial5: " + polynomial4.multiply(polynomial5));

    }
}
