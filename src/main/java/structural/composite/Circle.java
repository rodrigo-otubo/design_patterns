package structural.composite;

import java.awt.*;

public class Circle extends BaseShape {

    public int radius;

    public Circle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return this.radius * 2;
    }

    @Override
    public int getHeight() {
        return this.radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, this.getWidth() - 1, this.getHeight() - 1);
    }

}
