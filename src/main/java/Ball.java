public class Ball {
    private final int speed;
    private int positionX;
    private int positionY;

    public Ball(int speed, int positionX, int positionY) {
        this.speed = speed;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
