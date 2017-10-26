public class Main {
    public static void main(String[] args) {
        Something something = new Something();
        try {
            something.method1();
            something.method2();
            something.method3();
        } catch (SomethingException e) {
            System.out.println(e.getMessage());
        }
    }
}
