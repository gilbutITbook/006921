public class Main {
    public static void main(String[] args) {
        LunchSet lunch_a_juice = new LunchSet(LunchType.A, DrinkType.JUICE);
        LunchSet lunch_b_coffee = new LunchSet(LunchType.B, DrinkType.COFFEE);
        System.out.println(lunch_a_juice);
        System.out.println(lunch_b_coffee);
    }
}
