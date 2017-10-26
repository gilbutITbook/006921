public class Main {
    public static void main(String[] args) {
        Shape line = Shape.create(Shape.TYPECODE_LINE, 0, 0, 100, 200);
        Shape rectangle = Shape.create(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40);
        Shape oval = Shape.create(Shape.TYPECODE_OVAL, 100, 200, 300, 400);

        Shape[] shape = {
            line,
            rectangle,
            oval,
        };

        for (Shape s : shape) {
            s.draw();
        }
    }
}
