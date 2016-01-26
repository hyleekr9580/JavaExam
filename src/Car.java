/**
 * A car shape that can be positioned anywhere on the screen.
 */
public class Car implements Drawable, Moveable {
    private int xLeft;
    private int yTop;
    private Rectangle body;
    private Ellipse frontTire;
    private Ellipse rearTire;
    private Line frontWindshield;
    private Line roofTop;
    private Line rearWindshield;


    /**
     * Constructs a car with a given top left corner.
     *
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    public Car(int x, int y) {
        xLeft = x;
        yTop = y;

        // 필드로 모두 뺀다.
        body = new Rectangle(xLeft, yTop + 10, 60, 10);
        frontTire = new Ellipse(xLeft + 10, yTop + 20, 10, 10);
        rearTire = new Ellipse(xLeft + 40, yTop + 20, 10, 10);

        frontWindshield = new Line(xLeft + 10, yTop + 10, xLeft + 20, yTop);
        roofTop = new Line(xLeft + 20, yTop, xLeft + 40, yTop);
        rearWindshield = new Line(xLeft + 40, yTop, xLeft + 50, yTop + 10);

    }

    /**
     * Draws this car.
     */
    @Override
    public void draw() {


        // 그리는거 남겨둔다.
        body.draw();
        frontTire.fill();
        rearTire.fill();
        frontWindshield.draw();
        roofTop.draw();
        rearWindshield.draw();
    }

    @Override
    public void move(int seconds) {
        body.translate(seconds * 10, 0);
        frontTire.translate(seconds * 10, 0);
        rearTire.translate(seconds * 10, 0);
        frontWindshield.translate(seconds * 10, 0);
        roofTop.translate(seconds * 10, 0);
        rearWindshield.translate(seconds * 10, 0);

    }

}
