class LunchType {
    public static final LunchType A = new LunchType("A");
    public static final LunchType B = new LunchType("B");
    public static final LunchType C = new LunchType("C");
    private final String _name;
    private LunchType(String name) {
        _name = name;
    }
    public String toString() {
        return _name;
    }
}

class DrinkType {
    public static final DrinkType COFFEE = new DrinkType("COFFEE");
    public static final DrinkType JUICE = new DrinkType("JUICE");
    public static final DrinkType TEA = new DrinkType("TEA");
    private final String _name;
    private DrinkType(String name) {
        _name = name;
    }
    public String toString() {
        return _name;
    }
}

public class LunchSet {
    private final LunchType _lunchType;
    private final DrinkType _drinkType;

    public LunchSet(LunchType lunchType, DrinkType drinkType) {
        _lunchType = lunchType;
        _drinkType = drinkType;
    }

    public String toString() {
        return "[ LunchSet: " + _lunchType + ", " + _drinkType + " ]";
    }
    // ...
}
