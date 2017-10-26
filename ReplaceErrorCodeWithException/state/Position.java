public class Position {
    public int _x;
    public int _y;
    public Position(int x, int y) {
        _x = x;
        _y = y;
    }
    public void relativeMove(int dx, int dy) {
        _x += dx;
        _y += dy;
    }
}
