public class FindInt {
    public static boolean find(int[] data, int target) {
        boolean flag = false;
        for (int i = 0; i < data.length && !flag; i++) {
            if (data[i] == target) {
                flag = true;
            }
        }
        return flag;
    }
}
