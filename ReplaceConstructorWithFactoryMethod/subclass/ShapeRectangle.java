public class ShapeRectangle extends Shape {
    public ShapeRectangle(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override public String getName() {
        return "RECTANGLE";
    }

    @Override public void draw() {
        System.out.println("drawRectangle: " + this.toString());
        // ...
    }
}
