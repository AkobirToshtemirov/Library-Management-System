package library.helpers;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }
}

