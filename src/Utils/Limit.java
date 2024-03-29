package Utils;

public class Limit {
    private int min;
    private int max;

    public Limit(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public boolean isRange(int value) {
        return (value>=min)&&(value<=max);
    }

    @Override
    public String toString() {
        return "[" +min+","+max+"]";
    }
}
