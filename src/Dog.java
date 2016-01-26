public class Dog implements Drawable, Moveable, Runnable {
    private Picture pic;
    private Text name;

    public Dog(int x, int y, String file) {
        pic = new Picture(file);
        pic.translate(x, y);
        name = new Text(x, y + pic.getHeight(),
                file.substring(0, file.indexOf(".")));
    }

    @Override
    public void draw() {
        pic.draw();
        name.draw();
    }

    @Override
    public void run(double distance) {

    }

    @Override
    public void move(int seconds) {

        // 세로로 seconds만큼 움직인다.
        pic.translate(0, seconds);
        name.translate(0, seconds);

    }
}
