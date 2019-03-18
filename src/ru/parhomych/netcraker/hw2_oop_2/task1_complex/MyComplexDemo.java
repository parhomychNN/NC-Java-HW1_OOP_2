package ru.parhomych.netcraker.hw2_oop_2.task1_complex;

public class MyComplexDemo {
    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("*********** OOP_2, task 1, MyComplex *********");
        System.out.println("*************** by Parkhomenko Ilya **********");
        System.out.println("**********************************************");
        System.out.println();

        MyComplex complex1 = new MyComplex();
        MyComplex complex2 = new MyComplex(3, 4);
        MyComplex complex3 = new MyComplex(-5.3, 18);
        MyComplex complex4 = new MyComplex(3,4);

        System.out.println("My complex numbers are:");
        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex3);

        System.out.println();

        System.out.println("Is there a real part in complex1? " + complex1.isReal());
        System.out.println("Is there a imaginary part in complex1? " + complex1.isImaginary());
        System.out.println("Is there a real part in complex2? " + complex2.isReal());
        System.out.println("Is there a imaginary part in complex2? " + complex2.isImaginary());

        System.out.println();

        System.out.println("Is complex2 equals complex4? " + complex2.equals(complex4));
        System.out.println("Is complex1 equals 0.0+0.0i? " + complex1.equals(0, 0));

        System.out.println();

        System.out.println("Magnitude of complex1 is " + complex1.magnitude());
        System.out.println("Magnitude of complex2 is " + complex2.magnitude());
        System.out.println("Magnitude of complex3 is " + complex3.magnitude());

        System.out.println();

        System.out.println("Argument of complex1 is " + complex1.argument());
        System.out.println("Argument of complex2 is " + complex2.argument());
        System.out.println("Argument of complex3 is " + complex3.argument());

        System.out.println();
        System.out.println("Complex2 = " + complex2);
        System.out.println("[Add complex2] complex2 + (2+3i) = " +
                complex2.add(new MyComplex(2,3)));
        System.out.println("Complex2 = " + complex2);
        System.out.println("[Subtract complex2] complex2 - (2+3i) = " +
                complex2.subtract(new MyComplex(2,3)));

        System.out.println("Complex2 = " + complex2);
        System.out.println("[Multiply complex2] complex2 * (2+3i) = " +
                complex2.multiply(new MyComplex(2,3)));
        System.out.println("Complex2 = " + complex2);
        System.out.println("[Divide complex2] complex2 / (2+3i) = " +
                complex2.divide(new MyComplex(2,3)));
        System.out.println("Complex2 = " + complex2);

        System.out.println("[Test dividing by 0+0i ]" + complex4.divide(complex1));

        System.out.println();
        System.out.println("addNew & subtractNew");
        System.out.println("Complex2 = " + complex2);
        System.out.println("[AddNew complex2] complex2 + (2+3i) = " +
                complex2.addNew(new MyComplex(2,3)));
        System.out.println("Complex2 = " + complex2);
        System.out.println("[SubtractNew complex2] complex2 - (2+3i) = " +
                complex2.subtractNew(new MyComplex(2,3)));
        System.out.println("Complex2 = " + complex2);

        System.out.println();

        System.out.println("Complex2 = " + complex2);
        System.out.println("complex2.conjugate() = " + complex2.conjugate());
        System.out.println("Complex2 = " + complex2);
    }
}
