public class ShapeLine extends Shape {
    public ShapeLine(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override public int getTypecode() { return Shape.TYPECODE_LINE; }

    @Override public String getName() { return "LINE"; }

    @Override public void draw() { drawLine(); }

    private void drawLine() {
        System.out.println("drawLine: " + this.toString());
        // ...
    }
}
