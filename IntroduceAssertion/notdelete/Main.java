public class Main {
    private static final boolean ASSERT = true; // 어서션을 삭제하려면 false

    public static void main(String[] args) {
        int x = -123;
        if (ASSERT) {
            assert x > 0;
        }
    }
}
