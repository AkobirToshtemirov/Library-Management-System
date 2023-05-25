import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        List<Integer> list1 = new LinkedList<>();

        boolean contains = list.contains(1);

        list1.add(12);
        boolean contains1 = list1.contains(12);
    }
}