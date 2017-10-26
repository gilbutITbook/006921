public class Main {
    public static void main(String[] args) {
        Shape line = Shape.createLine(0, 0, 100, 200);
        Shape rectangle = Shape.createRectangle(10, 20, 30, 40);
        Shape oval = Shape.createOval(100, 200, 300, 400);

        Shape[] shape = {
            line,
            rectangle,
            oval
        };

        for (Shape s : shape) {
            s.draw();
        }
    }
}
