public class LunchSet {
    public static final int LUNCH_TYPE_A = 0;
    public static final int LUNCH_TYPE_B = 1;
    public static final int LUNCH_TYPE_C = 2;
    public static final int DRINK_TYPE_COFFEE = 0;
    public static final int DRINK_TYPE_JUICE = 1;
    public static final int DRINK_TYPE_TEA = 2;

    private final int _lunchType;
    private final int _drinkType;

    public LunchSet(int lunchType, int drinkType) {
        _lunchType = lunchType;
        _drinkType = drinkType;
    }

    public String toString() {
        String result = "[ LunchSet: ";
        switch (_lunchType) {
        case LUNCH_TYPE_A:
            result += "A";
            break;
        case LUNCH_TYPE_B:
            result += "B";
            break;
        case LUNCH_TYPE_C:
            result += "C";
            break;
        default:
            break;
        }
        result += ", ";
        switch (_drinkType) {
        case DRINK_TYPE_COFFEE:
            result += "COFFEE";
            break;
        case DRINK_TYPE_JUICE:
            result += "JUICE";
            break;
        case DRINK_TYPE_TEA:
            result += "TEA";
            break;
        default:
            break;
        }
        result += " ]";
        return result;
    }

    // ...
}
