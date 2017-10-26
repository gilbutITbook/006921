public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    public static Shape createShape(int typecode, int startx, int starty, int endx, int endy) {
        switch (typecode) {
        case TYPECODE_LINE:
            return new ShapeLine(startx, starty, endx, endy);
        case TYPECODE_RECTANGLE:
            return new ShapeRectangle(startx, starty, endx, endy);
        case TYPECODE_OVAL:
            return new ShapeOval(startx, starty, endx, endy);
        default:
            throw new IllegalArgumentException("typecode = " + typecode);
        }
    }

    public Shape(int startx, int starty, int endx, int endy) {
        _startx = startx;
        _endx = endx;
        _starty = starty;
        _endy = endy;
    }

    public abstract int getTypecode();

    public abstract String getName();

    public String toString() {
        return "[ "
            + getName() + ", "
            + "(" + _startx + ", " + _starty + ")-"
            + "(" + _endx + ", " + _endy + ") ]";
    }

    public abstract void draw();
}
