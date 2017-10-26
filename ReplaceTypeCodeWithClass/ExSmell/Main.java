public class Main {
    public static void main(String[] args) {
        LunchSet lunch_a_juice = new LunchSet(LunchSet.LUNCH_TYPE_A, LunchSet.DRINK_TYPE_JUICE);
        LunchSet lunch_b_coffee = new LunchSet(LunchSet.LUNCH_TYPE_B, LunchSet.DRINK_TYPE_COFFEE);
        System.out.println(lunch_a_juice);
        System.out.println(lunch_b_coffee);
    }
}
