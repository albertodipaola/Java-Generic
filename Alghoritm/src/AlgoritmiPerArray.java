public class AlgoritmiPerArray {

    public static<T extends Comparable<T>> T min(T[] values) {
        T min = values[0];
        for (T value : values) {
            if (value.compareTo(min)<0) {
                min = value;
            }
        }
        return min;
    }

        public static<T extends Comparable<T>> T max(T[] values) {
        T max = values[0];
        for (T value : values) {
            if (value.compareTo(max)>0) {
                max = value;
            }
        }
        return max;
    }

}
