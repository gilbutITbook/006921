public class Main {
    public static void main(String[] args) {
        Author          mutable    = new Author("Mr.Mutable", "mutable@example.com");
        ImmutableAuthor immutable  = new Author("Mr.Immutable", "immutable@example.com");

        // mutable.setName("Mr.Mutable Jr.");
        immutable.setName("Mr.Immutable Jr."); // 컴파일 에러!
    }
}
