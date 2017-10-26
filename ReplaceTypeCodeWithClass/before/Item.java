public class Item {
    public static final int TYPECODE_BOOK = 0;
    public static final int TYPECODE_DVD = 1;
    public static final int TYPECODE_SOFTWARE = 2;

    private final int _typecode;
    private final String _title;
    private final int _price;

    public Item(int typecode, String title, int price) {
        _typecode = typecode;
        _title = title;
        _price = price;
    }

    public int getTypecode() { return _typecode; }
    public String getTitle() { return _title; }
    public int getPrice() { return _price; }

    public String toString() {
        return "[ "
            + getTypecode() + ", "
            + getTitle() + ", "
            + getPrice() + " ]";
    }
    // ...
}
