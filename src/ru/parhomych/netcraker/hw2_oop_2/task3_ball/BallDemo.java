package ru.parhomych.netcraker.hw2_oop_2.task3_ball;

public class BallDemo {
    public static void main(String[] args) {
        System.out.println("--------------------- Ball & Container ----------------------");

        Ball ball1 = new Ball(3,5, 15, 3, -45);
        System.out.println(ball1);

        Container container = new Container(0,0,200, 100);
        System.out.println(container + " width is " + container.getWidth()
                        + ", height is " + container.getHeight()
                        + ", left upper corner is: "
                        + "(" + container.getX() + ", "
                        + container.getY() + ")");
        System.out.println("-------------------------------------------------------------");
        int step = 0;
        while (!container.collidesWith(ball1)){
            ball1.move();
            System.out.println("Do move(). Ball in container? "
                    + container.collidesWith(ball1)
                    + " Step#" + (++step) + " "
                    + ball1
                    );
        }

        System.out.println("Now my ball in container: " + ball1);
        System.out.println("-------------------------------------------------------------");

        System.out.println("Changed x, y, radius, XDelta, YDelta");

        ball1.setX(100);
        ball1.setY(20);
        ball1.setRadius(30);
        ball1.setXDelta(-3);
        ball1.setYDelta(2);

        System.out.println("Now my ball is: " + ball1);

        step = 0;
        while (!container.collidesWith(ball1)){
            ball1.move();
            System.out.println("Do move(). Ball in container? "
                    + container.collidesWith(ball1)
                    + " Step#" + (++step) + " "
                    + ball1
            );
        }

        System.out.println("-------------------------------------------------------------");

        System.out.println("Lets do the reflectHorizontal()");
        ball1.reflectHorizontal();

        for (int i = 0; i < 5; i++){
            ball1.move();
            System.out.println("Do move(). Ball in container? "
                    + container.collidesWith(ball1)
                    + " Step#" + (i) + " "
                    + ball1
            );
        }

        System.out.println("-------------------------------------------------------------");

        System.out.println("Lets do the reflectHorizontal()");
        ball1.reflectVertical();

        for (int i = 0; i < 5; i++){
            ball1.move();
            System.out.println("Do move(). Ball in container? "
                    + container.collidesWith(ball1)
                    + " Step#" + (i) + " "
                    + ball1
            );
        }
    }
}
