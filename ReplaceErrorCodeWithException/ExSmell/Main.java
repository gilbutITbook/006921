public class Main {
    public static void main(String[] args) {
        Something something = new Something();
        if (!something.method1()) {
            System.out.println(something.getErrorMessage());
        } else {
            if (!something.method2()) {
                System.out.println(something.getErrorMessage());
            } else {
                if (!something.method3()) {
                    System.out.println(something.getErrorMessage());
                }
            }
        }
    }
}
