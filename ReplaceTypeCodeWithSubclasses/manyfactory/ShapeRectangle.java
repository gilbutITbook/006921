public class ShapeRectangle extends Shape {
    public ShapeRectangle(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override public String getName() { return "RECTANGLE"; }

    @Override public void draw() { drawRectangle(); }

    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
        // ...
    }
}
