package ru.parhomych.netcraker.hw2_oop_2.task1_complex;

public class MyComplexEqualsHashTest {

    public static void main(String[] args) {
        MyComplex comp1 = new MyComplex(1.03,4.93);
        MyComplex comp2 = new MyComplex(1.03,4.93);
        MyComplex comp3 = new MyComplex(1.03,4);

        System.out.println(comp1.hashCode() + " <-- comp1.hashCode()");
        System.out.println(comp1.hashCode() + " <-- comp2.hashCode()");
        System.out.println(comp1.hashCode() + " <-- comp3.hashCode()");

        System.out.println();
        System.out.println("comp1.equals(comp2) --> " + comp1.equals(comp2));
        System.out.println("comp1.equals(comp2) --> " + comp1.equals(comp3));
    }

}
