package ru.parhomych.netcraker.hw2_oop_2.task2_polynomial;

import java.util.Arrays;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPolynomial that = (MyPolynomial) o;

        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        int hashResult = 17;

        for (double coef : coeffs) {
            hashResult = 31 * hashResult + (int)(Double.doubleToLongBits(coef) ^ (Double.doubleToLongBits(coef) >>> 32));
        }

        return hashResult;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = coeffs.length-1; i > -1; i--) {
            if (i == coeffs.length-1){
                result += coeffs[i] + "x^" + i;
            } else if (i == 0){
                result += ((coeffs[i] >= 1) ? " + " : " - ") + Math.abs(coeffs[i]);
            }else {
                result += ((coeffs[i] >= 1) ? " + " : " - ") + Math.abs(coeffs[i]) + ((i == 1) ? "x" : ("x^" + i));
            }

        }
        return result;
    }


    public int getDegree(){
        return coeffs.length - 1;
    }

    public double evaluate(double x){
        double result = 0;

        for (int i = 0; i < coeffs.length; i++){
            result += coeffs[i] * Math.pow(x, i);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        int resArrlength = Math.max(this.coeffs.length, right.coeffs.length);
        int minArrlength = Math.min(this.coeffs.length, right.coeffs.length);
        double[] newCoeffsArray = new double[resArrlength];
        for (int i = 0; i < minArrlength; i++) {
            newCoeffsArray[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (resArrlength > minArrlength){
            for (int i = minArrlength; i < resArrlength; i++) {
                newCoeffsArray[i] = (resArrlength == this.coeffs.length)?
                        this.coeffs[i] : right.coeffs[i];
            }
        }


        return new MyPolynomial(newCoeffsArray);
    }

    public MyPolynomial multiply (MyPolynomial right){
        int resArrlength = this.getDegree() + right.getDegree() + 1;
        double[] resultArray = new double[resArrlength];
        for (int i = 0; i < resArrlength; i++) {
            resultArray[i] = 0;
        }

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                resultArray[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        for (int i = 0; i < resArrlength; i++) {
            resultArray[i] = Math.round(resultArray[i] * 100) / 100.0;
        }

        return new MyPolynomial(resultArray);
    }

}
