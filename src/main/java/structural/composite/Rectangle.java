package structural.composite;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends BaseShape{

    public int width;
    public int height;

    public Rectangle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, this.getWidth() - 1, this.getHeight() - 1);
    }

}
