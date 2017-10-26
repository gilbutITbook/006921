public class ItemType {
    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    private final int _typecode;

    private ItemType(int typecode) {
        _typecode = typecode;
    }

    public int getTypecode() { return _typecode; }
}
