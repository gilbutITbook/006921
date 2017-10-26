import java.util.*;

public class Dice extends Random {
    private final Random _random;
    public Dice() {
        super(314159L);
        _random = this;
    }
    public Dice(long seed) {
        super(seed);
        _random = this;
    }
    @Override public int nextInt() {
        return _random.nextInt(6) + 1;
    }
    @Override public void nextBytes(byte[] bytes) {
        throw new UnsupportedOperationException();
    }
    @Override public long nextLong() {
        throw new UnsupportedOperationException();
    }
    @Override public boolean nextBoolean() {
        throw new UnsupportedOperationException();
    }
    @Override public float nextFloat() {
        throw new UnsupportedOperationException();
    }
    @Override public double nextDouble() {
        throw new UnsupportedOperationException();
    }
    @Override public double nextGaussian() {
        throw new UnsupportedOperationException();
    }
}
