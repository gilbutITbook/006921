public class SortSample {
    private final int[] _data;

    public SortSample(int[] data) {
        _data = new int[data.length];
        System.arraycopy(data, 0, _data, 0, data.length);
    }

    public void sort() {
        for (int x = 0; x < _data.length - 1; x++) {
            int m = x;
            for (int y = x + 1; y < _data.length - 1; y++) {
                if (_data[m] > _data[y]) {
                    m = y;
                }
            }
            assert isMin(m, x, _data.length - 1);
            int v = _data[m];
            _data[m] = _data[x];
            _data[x] = v;
            assert isSorted(0, x + 1);
        }
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[ ");
        for (int i = 0; i < _data.length; i++) {
            buffer.append(_data[i]);
            buffer.append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }

    private boolean isMin(int pos, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (_data[pos] > _data[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(int start, int end) {
        for (int i = start; i < end; i++) {
            if (_data[i] > _data[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
