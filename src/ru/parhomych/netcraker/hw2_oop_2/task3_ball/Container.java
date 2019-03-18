package ru.parhomych.netcraker.hw2_oop_2.task3_ball;

public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = this.x1 + width;
        this.y2 = this.y1 + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    @Override
    public String toString() {
        return "Container[" +
                "(" + x1 +
                "," + y1 +
                "),(" + x2 +
                "," + y2 +
                ")]";
    }

    public boolean collidesWith(Ball ball){
        boolean result = (ball.getX() - ball.getRadius()) > x1
                && (ball.getX() + ball.getRadius()) < x2
                && (ball.getY() - ball.getRadius()) > y1
                && (ball.getY() + ball.getRadius()) < y2;

        return result;
    }
}
