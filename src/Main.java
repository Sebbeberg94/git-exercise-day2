import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Integer> iterateByLowestValue (List<Integer> intList){
        List<Integer> newList = new ArrayList<>();
        newList.add(intList.listIterator());
    }

    public static List<Integer> decrementList (List<Integer> intList) {
        List<Integer> newList = new ArrayList<>();
        newList.add(Collections.sort(intList));
        return newList;
    }
}
