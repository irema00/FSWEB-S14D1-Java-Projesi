package pool;

import cylinder.Rectangle;

public class Cuboid extends Rectangle {
    private int height;

    public Cuboid(int width, int length, int height) {
        super(width, length);
        this.height = Math.max(height, 0);
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public int getHeight() {
        return height;
    }
}
