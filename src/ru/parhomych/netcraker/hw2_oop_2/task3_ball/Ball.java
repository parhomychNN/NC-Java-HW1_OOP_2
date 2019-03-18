package ru.parhomych.netcraker.hw2_oop_2.task3_ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    /**
     *
     * @param direction degrees of direction (must be between -180 and 180)
     *                  positive direction - counter-clockwise
     * @throws IllegalArgumentException
     */
    public Ball(float x, float y, int radius, int speed, int direction) {
        if (direction < -180 || direction > 180){
            throw new IllegalArgumentException("Direction must be between -180 and 180 degrees");
        }

        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)(speed * Math.cos(direction / (180 / Math.PI)));
        this.yDelta = (float)(-speed * Math.sin(direction / (180 / Math.PI)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        return Float.compare(ball.yDelta, yDelta) == 0 &&
                Float.compare(ball.x, x) == 0 &&
                Float.compare(ball.y, y) == 0 &&
                radius == ball.radius &&
                Float.compare(ball.xDelta, xDelta) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Float.floatToIntBits(x);
        result = 31 * result + Float.floatToIntBits(y);
        result = 31 * result + radius;
        result = 31 * result + Float.floatToIntBits(xDelta);
        result = 31 * result + Float.floatToIntBits(yDelta);
        return result;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0){
            this.radius = radius;
        }
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -xDelta;
    }

    public void reflectVertical(){
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x +
                ", " + y +
                "), speed = (" + xDelta +
                ", " + yDelta +
                ")]";
    }


}
