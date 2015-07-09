import java.util.ArrayList;
import java.util.List;

public class Sorter {

    List<Integer> sort(List<Integer> list) {
        boolean replacedElement = true;
        while (replacedElement) {
			replacedElement = false;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i) > list.get(i+1)) {
                    int smaller = list.get(i+1);
                    list.set(i+1, list.get(i));
                    list.set(i, smaller);
					replacedElement = true;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(15);
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(100);
        list.add(50);
        list.add(15);
        list.add(20);

        Sorter sorter = new Sorter();
        List<Integer> sortedList = sorter.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Array size: " + sortedList.size());
    }

}
