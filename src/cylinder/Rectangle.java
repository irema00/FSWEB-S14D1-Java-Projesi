package cylinder;

public class Rectangle {
    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = Math.max(width, 0);
        this.length = Math.max(length, 0);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
