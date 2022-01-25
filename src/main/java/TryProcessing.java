import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class TryProcessing extends PApplet {

    private static final int WIDTH = 840;
    private static final int HEIGHT = 680;
    private static final int Diameter = 10;

    private List<Ball> balls;

    public TryProcessing() {
        balls = new ArrayList<>();

        balls.add(new Ball(1, 0, HEIGHT * 1 / 5));
        balls.add(new Ball(2, 0, HEIGHT * 2 / 5));
        balls.add(new Ball(3, 0, HEIGHT * 3 / 5));
        balls.add(new Ball(4, 0, HEIGHT * 4 / 5));
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        updatePositions();
        drawBalls();
    }

    private void updatePositions() {
        for (Ball ball : balls) {
            int newPositionX = ball.getPositionX() + ball.getSpeed();
            ball.setPositionX(newPositionX);
        }
    }

    private void drawBalls() {
        for (Ball ball : balls) {
            drawCircle(ball.getPositionX(), ball.getPositionY());
        }
    }

    private void drawCircle(int positionX, int positionY) {
        ellipse(positionX, positionY, Diameter, Diameter);
    }
}
