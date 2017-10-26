import java.util.*;

public class Dice {
    private final Random _random;
    public Dice() {
        this(314159L);
    }
    public Dice(long seed) {
        _random = new Random(seed);
    }
    public int nextInt() {
        return _random.nextInt(6) + 1;
    }
    public void setSeed(long seed) {
        _random.setSeed(seed);
    }
}
