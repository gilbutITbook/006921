public class Main {
    public static void main(String[] args) {
        Shape line = Shape.createShapeLine(0, 0, 100, 200);
        Shape rectangle = Shape.createShapeRectangle(10, 20, 30, 40);
        Shape oval = Shape.createShapeOval(100, 200, 300, 400);

        Shape[] shape = {
            line, rectangle, oval
        };

        for (Shape s : shape) {
            s.draw();
        }
    }
}
