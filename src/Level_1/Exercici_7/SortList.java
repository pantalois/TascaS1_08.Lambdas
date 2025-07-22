package Level_1.Exercici_7;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void sortDescendant(List<Object> list) {

        list.sort(Comparator.comparingInt(obj -> {
            if (obj instanceof String) {
                return -((String) obj).length();
            }
            return -obj.toString().length();
        }));
        System.out.println(list);
    }
}
