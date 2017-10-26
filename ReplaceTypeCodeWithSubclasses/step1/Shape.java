public class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _typecode;
    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    public static Shape createShape(int typecode, int startx, int starty, int endx, int endy) {
        switch (typecode) {
        case TYPECODE_LINE:
            return new ShapeLine(typecode, startx, starty, endx, endy);
        case TYPECODE_RECTANGLE:
            return new ShapeRectangle(typecode, startx, starty, endx, endy);
        case TYPECODE_OVAL:
            return new ShapeOval(typecode, startx, starty, endx, endy);
        default:
            throw new IllegalArgumentException("typecode = " + typecode);
        }
    }

    public Shape(int typecode, int startx, int starty, int endx, int endy) {
        _typecode = typecode;
        _startx = startx;
        _endx = endx;
        _starty = starty;
        _endy = endy;
    }

    public int getTypecode() { return _typecode; }

    public String getName() {
        switch (getTypecode()) {
        case TYPECODE_LINE:
            return "LINE";
        case TYPECODE_RECTANGLE:
            return "RECTANGLE";
        case TYPECODE_OVAL:
            return "OVAL";
        default:
            return null;
        }
    }

    public String toString() {
        return "[ "
            + getName() + ", "
            + "(" + _startx + ", " + _starty + ")-"
            + "(" + _endx + ", " + _endy + ") ]";
    }

    public void draw() {
        switch (getTypecode()) {
        case TYPECODE_LINE:
            drawLine();
            break;
        case TYPECODE_RECTANGLE:
            drawRectangle();
            break;
        case TYPECODE_OVAL:
            drawOval();
            break;
        default:
            assert false;
        }
    }

    private void drawLine() {
        System.out.println("drawLine: " + this.toString());
        // ...
    }
    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
        // ...
    }
    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
        // ...
    }
}
