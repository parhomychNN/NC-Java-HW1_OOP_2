package ru.parhomych.netcraker.hw2_oop_2.task1_complex;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
        // default constructor
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (int)(Double.doubleToLongBits(real) ^ Double.doubleToLongBits(real) >>> 32);
        result = result * 31 + (int)(Double.doubleToLongBits(imag) ^ Double.doubleToLongBits(imag) >>> 32);
        return result;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + ((imag > 0)? "+" : "-") + Math.abs(imag) + "i)";
    }

    public boolean isReal(){
        if (real == 0.0){
            return false;
        }
        return true;
    }

    public boolean isImaginary(){
        if (imag == 0.0){
            return false;
        }
        return true;
    }

    public boolean equals(MyComplex o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Double.compare(o.real, real) == 0 &&
                Double.compare(o.imag, imag) == 0;
    }

    public boolean equals(double real, double imag){
        MyComplex complex = new MyComplex(real, imag);
        return this.equals(complex);
    }

    public double magnitude(){
        double magnitude = Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
        return magnitude;
    }

    public double argument(){
        double argument = Math.atan(imag/real);
        return argument;
    }

    public MyComplex add(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex subtract(MyComplex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex multiply(MyComplex right){
        double realTmp = this.real * right.real - this.imag * right.imag;
        double imagTmp = this.imag * right.real + this.real * right.imag;
        this.real = realTmp;
        this.imag = imagTmp;
        return this;
    }

    public MyComplex divide(MyComplex right){
        double realTmp = (this.real*right.real + this.imag*right.imag)
                / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        double imagTmp = (this.imag*right.real - this.real*right.imag)
                / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.real = realTmp;
        this.imag = imagTmp;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        double realTmp = this.real + right.real;
        double imagTmp = this.imag + right.imag;
        return new MyComplex(realTmp, imagTmp);
    }

    public MyComplex subtractNew(MyComplex right){
        double realTmp = this.real - right.real;
        double imagTmp = this.imag - right.imag;
        return new MyComplex(realTmp, imagTmp);
    }

    public MyComplex conjugate(){
        MyComplex result = new MyComplex(real, -imag);
        return result;
    }
}
