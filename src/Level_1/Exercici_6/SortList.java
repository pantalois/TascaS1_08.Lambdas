package Level_1.Exercici_6;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void sortAscendant(List<Object> list) {

        list.sort(Comparator.comparingInt(obj -> {
            if (obj instanceof String) {
                return ((String) obj).length();
            }
            return obj.toString().length();
        }));
        System.out.println(list);
    }
}
