import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Här ändrar jag någonting för att se vad som händer typ");

    }

    public static List<Integer> iterateByLowestValue (List<Integer> intList){
        List<Integer> newList = new ArrayList<>();
        newList.add(intList.listIterator());
    }
}
