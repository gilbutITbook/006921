public abstract class Shape {
    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    public static ShapeLine createShapeLine(int startx, int starty, int endx, int endy) {
        return new ShapeLine(startx, starty, endx, endy);
    }

    public static ShapeRectangle createShapeRectangle(int startx, int starty, int endx, int endy) {
        return new ShapeRectangle(startx, starty, endx, endy);
    }

    public static ShapeOval createShapeOval(int startx, int starty, int endx, int endy) {
        return new ShapeOval(startx, starty, endx, endy);
    }

    public Shape(int startx, int starty, int endx, int endy) {
        _startx = startx;
        _endx = endx;
        _starty = starty;
        _endy = endy;
    }

    public abstract String getName();

    public String toString() {
        return "[ "
            + getName() + ", "
            + "(" + _startx + ", " + _starty + ")-"
            + "(" + _endx + ", " + _endy + ") ]";
    }

    public abstract void draw();
}
